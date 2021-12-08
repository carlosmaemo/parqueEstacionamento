package dao;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Cliente;
import modelo.Veiculo;
import net.proteanit.sql.DbUtils;
import util.Conecxao;

public class VeiculoDao {

    public boolean verificar_veiculo(String matricula) throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from veiculo where matricula='" + matricula + "'");

            ResultSet rs = ps.executeQuery();

            Veiculo veiculo = new Veiculo();

            while (rs.next()) {
                veiculo.setMatricula(rs.getString("matricula"));
            }

            if (veiculo.getMatricula() != null) {

                if (veiculo.getMatricula().equals(matricula)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar o veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return false;

    }

    public void actualizar_clientes(JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idCliente as 'ID', nome as 'Nome', apelido as 'Apelido', sexo as 'Sexo', contacto as 'Contacto', endereco as 'Endereço', tipoDocumento as 'Tipo Documento', nrDocumento as 'Nrº Documento' from cliente");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar clientes!", "Erro", JOptionPane.ERROR_MESSAGE);
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

    public void salvar(Veiculo veiculo) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("INSERT INTO `veiculo`(`idCliente`, `matricula`, `marca`, `modelo`, `cor`, `tipo`, `ano`, `nomeCliente`, `apelidoCliente`, `enderecoCliente`, `nrDocumentoCliente`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

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

            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Veiculo registado com sucesso.", "Registado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o veículo", "Erro", JOptionPane.ERROR_MESSAGE);
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

    public void deletar(int idVeiculo) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("delete from veiculo where idVeiculo=?");
            ps.setInt(1, idVeiculo);
            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Veiculo removida com sucesso.", "Removido!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o veículo", "Erro", JOptionPane.ERROR_MESSAGE);
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

    public Cliente carregar_cliente(String idCliente) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idCliente as 'ID', nome as 'Nome', apelido as 'Apelido', sexo as 'Sexo', contacto as 'Contacto', endereco as 'Endereço', tipoDocumento as 'Tipo Documento', nrDocumento as 'Nrº Documento' from cliente where id='" + idCliente + "'");

            ResultSet rs = ps.executeQuery();

            Cliente cliente = new Cliente();

            while (rs.next()) {
                cliente.setIdCliente(rs.getInt("ID"));
                cliente.setNome(rs.getString("Nome"));
                cliente.setApelido(rs.getString("Apelido"));
                cliente.setSexo(rs.getString("Sexo"));
                cliente.setContacto(rs.getString("Contacto"));
                cliente.setEndereco(rs.getString("Endereço"));                
                cliente.setTipoDocumento(rs.getString("Tipo Documento"));
                cliente.setNrDocumento(rs.getString("Nrº Documento"));
            }

            return cliente;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
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
    
    public void carregar_cliente_filtro(String valor, JTable tbl) throws ErroSistema {

        try {
            
            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select idCliente as 'ID', nome as 'Nome', apelido as 'Apelido', sexo as 'Sexo', contacto as 'Contacto', endereco as 'Endereço', tipoDocumento as 'Tipo Documento', nrDocumento as 'Nrº Documento' from cliente where nome LIKE '" + valor + "%'"
                    + "OR (apelido LIKE '" + valor + "%')"
                    + "OR (contacto LIKE '" + valor + "%')");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
