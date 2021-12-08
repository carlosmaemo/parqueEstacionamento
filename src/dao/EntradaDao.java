package dao;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.Checklist;
import modelo.Cliente;
import modelo.Entrada;
import modelo.Vaga;
import modelo.Veiculo;
import net.proteanit.sql.DbUtils;
import util.Conecxao;

public class EntradaDao {

    public void actualizar_preco(JTextField preco, Veiculo veiculo) throws ErroSistema {

        double precoTotal = 0;

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from preco where tipo=?");

            ps.setString(1, veiculo.getTipo());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                double p_preco = rs.getDouble("preco");
                preco.setText(String.valueOf(p_preco));
                precoTotal = p_preco;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar_data(JTextField data) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String dataActual = dtf.format(now);

        data.setText(dataActual);

    }

    public void actualizar_vagas(JComboBox vaga) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select nome from vaga");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                vaga.addItem(nome);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean verificar_entrada(String matricula) throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from entrada where veiculoMatricula='" + matricula + "' and estado='dentro'");

            ResultSet rs = ps.executeQuery();

            Entrada entrada = new Entrada();

            while (rs.next()) {
                entrada.setVeiculoMatricula(rs.getString("veiculoMatricula"));
            }

            if (entrada.getVeiculoMatricula() != null) {

                if (entrada.getVeiculoMatricula().equals(matricula)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar a entrada do veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return false;

    }

    public boolean verificar_lotacao(String nomeVaga) throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from vaga where nome='" + nomeVaga + "'");

            PreparedStatement ps2 = conexao.prepareStatement("Select * from entrada where vagaNome='" + nomeVaga + "' and estado='dentro'");

            ResultSet rs = ps.executeQuery();
            ResultSet rs2 = ps2.executeQuery();

            Vaga vaga = new Vaga();

            int tamanho = 0;
            
            while (rs.next()) {
                vaga.setQuantidade(rs.getString("quantidade"));
            }
            
            while (rs2.next()) {
                tamanho = tamanho + 1;
            }

            int quantidade = Integer.parseInt(vaga.getQuantidade());

            if (tamanho >= quantidade) {

                return true;
                
            } else {
                
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar a lotação da vaga", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return false;

    }
    
    public void verificar_espaco_disponivel(JLabel texto, String nomeVaga) throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from vaga where nome='" + nomeVaga + "'");

            PreparedStatement ps2 = conexao.prepareStatement("Select * from entrada where vagaNome='" + nomeVaga + "' and estado='dentro'");

            ResultSet rs = ps.executeQuery();
            ResultSet rs2 = ps2.executeQuery();

            Vaga vaga = new Vaga();

            int tamanho = 0;
            
            while (rs.next()) {
                vaga.setQuantidade(rs.getString("quantidade"));
            }
            
            while (rs2.next()) {
                tamanho = tamanho + 1;
            }

            int quantidade = Integer.parseInt(vaga.getQuantidade());

            int espacoDisponivel = quantidade - tamanho;
            
            texto.setText(String.valueOf(espacoDisponivel));
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro espaço da vaga", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar_entradas(JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idEntrada as 'ID Entrada', idVeiculo as 'ID Veiculo', idCliente as 'ID Cliente', preco as 'Preço', precoTotal as 'Preço Total', dataEntrada as 'Data Entrada', dataSaida as 'Data Saida', operador as 'Operador', vagaNome as 'Vaga', veiculoMatricula as 'Matricula', veiculoMarca as 'Marca', veiculoModelo as 'Modelo', veiculoCor as 'Cor', veiculoTipo as 'Tipo', veiculoAno as 'Ano', clienteNome as 'Nome', clienteNrDocumento as 'Nrº Documento', estado as 'Estado' from entrada where estado='dentro'");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar entradas!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar_veiculos(JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idVeiculo as 'ID', matricula as 'Matrícula', marca as 'Marca', modelo as 'Modelo', cor as 'Cor', tipo as 'Tipo', ano as 'Ano', nomeCliente as 'Nome', apelidoCliente as 'Apelido', enderecoCliente as 'Endereço', nrDocumentoCliente as 'Nº Documento' from veiculo");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar veiculos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public String salvar(Entrada entrada, Checklist checklist) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("INSERT INTO `entrada`(`idVeiculo`, `idCliente`, `preco`, `precoTotal`, `dataEntrada`, `dataSaida`, `operador`, `vagaNome`, `veiculoMatricula`, `veiculoMarca`, `veiculoModelo`, `veiculoCor`, `veiculoTipo`, `veiculoAno`, `clienteNome`, `clienteNrDocumento`, `estado`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setInt(1, entrada.getIdVeiculo());
            ps.setInt(2, entrada.getIdCliente());
            ps.setDouble(3, entrada.getPreco());
            ps.setDouble(4, entrada.getPrecoTotal());
            ps.setString(5, entrada.getDataEntrada());
            ps.setString(6, entrada.getDataSaida());
            ps.setString(7, entrada.getOperador());
            ps.setString(8, entrada.getVagaNome());
            ps.setString(9, entrada.getVeiculoMatricula());
            ps.setString(10, entrada.getVeiculoMarca());
            ps.setString(11, entrada.getVeiculoModelo());
            ps.setString(12, entrada.getVeiculoCor());
            ps.setString(13, entrada.getVeiculoTipo());
            ps.setString(14, entrada.getVeiculoAno());
            ps.setString(15, entrada.getClienteNome());
            ps.setString(16, entrada.getClienteNrDocumento());
            ps.setString(17, entrada.getEstado());

            ps.execute();
            
            ResultSet rst = ps.getGeneratedKeys();
            
            PreparedStatement ps2 = conexao.prepareStatement("INSERT INTO `checklist`(`idVeiculo`, `idEntrada`, `luzes`, `carroceria`, `pressao`, `vidros`, `pneu`, `observacao`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            String x = String.valueOf(rst.getInt(1));
            
            ps2.setInt(1, checklist.getIdVeiculo());
            ps2.setInt(2, rst.getInt(1));
            ps2.setString(3, checklist.getLuzes());
            ps2.setString(4, checklist.getCarroceria());
            ps2.setString(5, checklist.getPressao());
            ps2.setString(6, checklist.getVidros());
            ps2.setString(7, checklist.getPneu());
            ps2.setString(8, checklist.getObservacao());

            ps2.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Entrada do veículo registado com sucesso.", "Registado!", JOptionPane.INFORMATION_MESSAGE);

            return x;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao registar a entrada do veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }

    public void actualizar_dados_entrada(Entrada entrada, String nomeUsuario) throws ErroSistema, ParseException {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("update entrada set precoTotal=?, dataSaida=?, operador=?, estado=?, opValor=?, opTroco=?, opDivida=?, opOperador=? where idEntrada=?");

            String data1 = entrada.getDataEntrada();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String data2 = dtf.format(now);

            Date dataEntrada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(data1);
            Date dataActual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(data2);

            long duracaoTempo = dataActual.getTime() - dataEntrada.getTime();
            long duracao = (duracaoTempo / (1000 * 60 * 60)) % 24;

            double preco1 = entrada.getPreco();

            double valorTotal = preco1 * duracao;

            if (valorTotal == 0) {
                valorTotal = preco1;
            }

            ps.setDouble(1, valorTotal);
            ps.setString(2, data2);
            ps.setString(3, nomeUsuario);
            ps.setString(4, "fora");
            ps.setDouble(5, entrada.getOpValor());
            ps.setDouble(6, entrada.getOpTroco());
            ps.setDouble(7, entrada.getOpDivida());
            ps.setString(8, entrada.getOpOperador());
            ps.setInt(9, entrada.getIdEntrada());

            ps.execute();
            Conecxao.fecharConexao();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar_dados_veiculo(Veiculo veiculo) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("update veiculo set idCliente=?, matricula=?, marca=?, modelo=?, cor=?, tipo=?, ano=?, nomeCliente=?, apelidoCliente=?, enderecoCliente=?, nrDocumentoCliente=? where idVeiculo=?");

            ps.setInt(1, veiculo.getIdCliente());
            ps.setString(2, veiculo.getMatricula());
            ps.setString(3, veiculo.getMarca());
            ps.setString(4, veiculo.getModelo());
            ps.setString(5, veiculo.getCor());
            ps.setString(6, veiculo.getTipo());
            ps.setString(7, veiculo.getAno());
            ps.setString(8, veiculo.getNomeCliente());
            ps.setString(9, veiculo.getApelidoCliente());
            ps.setString(10, veiculo.getEnderecoCliente());
            ps.setString(11, veiculo.getNrDocumentoCliente());
            ps.setInt(12, veiculo.getIdVeiculo());

            ps.execute();
            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Veiculo actualizado com sucesso.", "Actualizado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar dados do veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void deletar(int idEntrada) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("delete from entrada where idEntrada=?");
            ps.setInt(1, idEntrada);
            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Entrada do veículo cancelado com sucesso.", "Removido!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cancelar a entrada do veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Veiculo carregar_veiculo(String idVeiculo) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idVeiculo as 'ID Veículo', idCliente as 'ID Cliente', matricula as 'Matrícula', marca as 'Marca', modelo as 'Modelo', cor as 'Cor', tipo as 'Tipo', ano as 'Ano', nomeCliente as 'Nome', apelidoCliente as 'Apelido', enderecoCliente as 'Endereço', nrDocumentoCliente as 'Nº Documento' from veiculo where idVeiculo='" + idVeiculo + "'");

            ResultSet rs = ps.executeQuery();

            Veiculo veiculo = new Veiculo();

            while (rs.next()) {

                veiculo.setIdVeiculo(rs.getInt("ID Veículo"));
                veiculo.setIdCliente(rs.getInt("ID Cliente"));
                veiculo.setMatricula(rs.getString("Matrícula"));
                veiculo.setMarca(rs.getString("Marca"));
                veiculo.setModelo(rs.getString("Modelo"));
                veiculo.setCor(rs.getString("Cor"));
                veiculo.setTipo(rs.getString("Tipo"));
                veiculo.setAno(rs.getString("Ano"));
                veiculo.setNomeCliente(rs.getString("Nome"));
                veiculo.setApelidoCliente(rs.getString("Apelido"));
                veiculo.setEnderecoCliente(rs.getString("Endereço"));
                veiculo.setNrDocumentoCliente(rs.getString("Nº Documento"));

            }

            return veiculo;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    public Entrada carregar_entrada(String idEntrada) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idEntrada as 'ID Entrada', idVeiculo as 'ID Veiculo',"
                    + " idCliente as 'ID Cliente', preco as 'Preço', precoTotal as 'Preço Total',"
                    + " dataEntrada as 'Data Entrada', dataSaida as 'Data Saida', operador as 'Operador',"
                    + " vagaNome as 'Vaga', veiculoMatricula as 'Matricula', veiculoMarca as 'Marca',"
                    + " veiculoModelo as 'Modelo', veiculoCor as 'Cor', veiculoTipo as 'Tipo',"
                    + " veiculoAno as 'Ano', clienteNome as 'Nome', clienteNrDocumento as 'Nrº Documento',"
                    + " estado as 'Estado' from entrada where idEntrada='" + idEntrada + "'");

            ResultSet rs = ps.executeQuery();

            Entrada entrada = new Entrada();

            while (rs.next()) {

                entrada.setIdEntrada(rs.getInt("ID Entrada"));
                entrada.setIdVeiculo(rs.getInt("ID Veiculo"));
                entrada.setIdCliente(rs.getInt("ID Cliente"));
                entrada.setPreco(rs.getDouble("Preço"));
                entrada.setPrecoTotal(rs.getDouble("Preço Total"));
                entrada.setDataEntrada(rs.getString("Data Entrada"));
                entrada.setDataSaida(rs.getString("Data Saida"));
                entrada.setOperador(rs.getString("Operador"));
                entrada.setVagaNome(rs.getString("Vaga"));
                entrada.setVeiculoMatricula(rs.getString("Matricula"));
                entrada.setVeiculoMarca(rs.getString("Marca"));
                entrada.setVeiculoModelo(rs.getString("Modelo"));
                entrada.setVeiculoCor(rs.getString("Cor"));
                entrada.setVeiculoTipo(rs.getString("Tipo"));
                entrada.setVeiculoAno(rs.getString("Ano"));
                entrada.setClienteNome(rs.getString("Nome"));
                entrada.setClienteNrDocumento(rs.getString("Nrº Documento"));
                entrada.setEstado(rs.getString("Estado"));

            }

            return entrada;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    
    
    public Checklist carregar_checklist(String idEntrada) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idChecklist, idVeiculo,"
                    + " idEntrada, luzes, carroceria,"
                    + " pressao, vidros, pneu,"
                    + " observacao from checklist where idEntrada='" + idEntrada + "'");

            ResultSet rs = ps.executeQuery();

            Checklist checklist = new Checklist();

            while (rs.next()) {

                checklist.setIdChecklist(rs.getInt("idChecklist"));
                checklist.setIdVeiculo(rs.getInt("idVeiculo"));
                checklist.setIdEntrada(rs.getInt("idEntrada"));
                checklist.setLuzes(rs.getString("luzes"));
                checklist.setCarroceria(rs.getString("carroceria"));
                checklist.setPressao(rs.getString("pressao"));
                checklist.setVidros(rs.getString("vidros"));
                checklist.setPneu(rs.getString("pneu"));
                checklist.setObservacao(rs.getString("observacao"));

            }

            return checklist;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    

    public void carregar_entrada_filtro(String valor, JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select idEntrada as 'ID Entrada', idVeiculo as 'ID Veiculo', idCliente as 'ID Cliente', preco as 'Preço', precoTotal as 'Preço Total', dataEntrada as 'Data Entrada', dataSaida as 'Data Saida', operador as 'Operador', vagaNome as 'Vaga', veiculoMatricula as 'Matricula', veiculoMarca as 'Marca', veiculoModelo as 'Modelo', veiculoCor as 'Cor', veiculoTipo as 'Tipo', veiculoAno as 'Ano', clienteNome as 'Nome', clienteNrDocumento as 'Nrº Documento', estado as 'Estado' from entrada where matricula LIKE '" + valor + "%' and estado='dentro'");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados da entrada do veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void carregar_veiculo_filtro(String valor, JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select idVeiculo as 'ID Veículo', idCliente as 'ID Cliente', matricula as 'Matrícula', marca as 'Marca', modelo as 'Modelo', cor as 'Cor', tipo as 'Tipo', ano as 'Ano', nomeCliente as 'Nome', apelidoCliente as 'Apelido', enderecoCliente as 'Endereço', nrDocumentoCliente as 'Nº Documento' from veiculo where matricula LIKE '" + valor + "%'"
                    + "OR (marca LIKE '" + valor + "%')"
                    + "OR (modelo LIKE '" + valor + "%')");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
