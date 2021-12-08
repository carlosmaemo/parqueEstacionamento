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

public class SaidaDao {

    public void actualizar_saidas(JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idEntrada as 'ID Entrada', idVeiculo as 'ID Veiculo',"
                    + " idCliente as 'ID Cliente', preco as 'Preço', precoTotal as 'Preço Total', dataEntrada as 'Data Entrada',"
                    + " dataSaida as 'Data Saida', operador as 'Operador', vagaNome as 'Vaga', veiculoMatricula as 'Matricula',"
                    + " veiculoMarca as 'Marca', veiculoModelo as 'Modelo', veiculoCor as 'Cor', veiculoTipo as 'Tipo',"
                    + " veiculoAno as 'Ano', clienteNome as 'Nome', clienteNrDocumento as 'Nrº Documento', estado as 'Estado',"
                    + " opValor as 'Valor', opTroco as 'Troco', opDivida as 'Divida',"
                    + " opOperador as 'Operador Final' from entrada where estado='fora'");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar saídas!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public Entrada carregar_saida(String idEntrada) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idEntrada as 'ID Entrada', idVeiculo as 'ID Veiculo',"
                    + " idCliente as 'ID Cliente', preco as 'Preço', precoTotal as 'Preço Total', dataEntrada as 'Data Entrada',"
                    + " dataSaida as 'Data Saida', operador as 'Operador', vagaNome as 'Vaga', veiculoMatricula as 'Matricula',"
                    + " veiculoMarca as 'Marca', veiculoModelo as 'Modelo', veiculoCor as 'Cor', veiculoTipo as 'Tipo',"
                    + " veiculoAno as 'Ano', clienteNome as 'Nome', clienteNrDocumento as 'Nrº Documento', estado as 'Estado',"
                    + " opValor as 'Valor', opTroco as 'Troco', opDivida as 'Divida',"
                    + " opOperador as 'Operador Final' from entrada where idEntrada='" + idEntrada + "' and estado='fora'");

            ResultSet rs = ps.executeQuery();

            Entrada saida = new Entrada();

            while (rs.next()) {

                saida.setIdEntrada(rs.getInt("ID Entrada"));
                saida.setIdVeiculo(rs.getInt("ID Veiculo"));
                saida.setIdCliente(rs.getInt("ID Cliente"));
                saida.setPreco(rs.getDouble("Preço"));
                saida.setPrecoTotal(rs.getDouble("Preço Total"));
                saida.setDataEntrada(rs.getString("Data Entrada"));
                saida.setDataSaida(rs.getString("Data Saida"));
                saida.setOperador(rs.getString("Operador"));
                saida.setVagaNome(rs.getString("Vaga"));
                saida.setVeiculoMatricula(rs.getString("Matricula"));
                saida.setVeiculoMarca(rs.getString("Marca"));
                saida.setVeiculoModelo(rs.getString("Modelo"));
                saida.setVeiculoCor(rs.getString("Cor"));
                saida.setVeiculoTipo(rs.getString("Tipo"));
                saida.setVeiculoAno(rs.getString("Ano"));
                saida.setClienteNome(rs.getString("Nome"));
                saida.setClienteNrDocumento(rs.getString("Nrº Documento"));
                saida.setEstado(rs.getString("Estado"));
                saida.setOpValor(rs.getDouble("Valor"));
                saida.setOpTroco(rs.getDouble("Troco"));
                saida.setOpDivida(rs.getDouble("Divida"));
                saida.setOpOperador(rs.getString("Operador Final"));

            }

            return saida;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    
    public Checklist carregar_checklist(String idEntrada) throws ErroSistema {
            
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idChecklist, idVeiculo, idEntrada, luzes, "
                    + "carroceria, pressao, vidros, pneu, "
                    + "observacao from checklist where idEntrada=?");

            ps.setString(1, idEntrada);
            
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

            PreparedStatement ps = conexao.prepareStatement("Select idEntrada as 'ID Entrada', idVeiculo as 'ID Veiculo', idCliente as 'ID Cliente', preco as 'Preço', precoTotal as 'Preço Total', dataEntrada as 'Data Entrada', dataSaida as 'Data Saida', operador as 'Operador', vagaNome as 'Vaga', veiculoMatricula as 'Matricula', veiculoMarca as 'Marca', veiculoModelo as 'Modelo', veiculoCor as 'Cor', veiculoTipo as 'Tipo', veiculoAno as 'Ano', clienteNome as 'Nome', clienteNrDocumento as 'Nrº Documento', estado as 'Estado' from entrada where matricula LIKE '" + valor + "%' and estado='fora'");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados da saída do veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
