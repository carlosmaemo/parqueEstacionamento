
package dao;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Cliente;
import net.proteanit.sql.DbUtils;
import util.Conecxao;

public class VagaDao {

    public boolean verificar_cliente(Integer idCliente) throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from cliente where idCliente='" + idCliente + "'");
    
            ResultSet rs = ps.executeQuery();

            Cliente cliente = new Cliente();

            while (rs.next()) {
                cliente.setIdCliente(rs.getInt("idCliente"));
            }
            
            if(cliente.getIdCliente()!= null) {
            
            if(cliente.getIdCliente().equals(idCliente)) {
                return true;
            }
            else {
                return false;
            }
            }else {
                return false;
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar o cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
        
    }
    
    public void salvar(Cliente cliente) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("INSERT INTO `cliente`(`nome`, `apelido`, `endereco`, `sexo`, `contacto`, `tipoDocumento`, `nrDocumento`) VALUES (?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getApelido());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getSexo());
            ps.setString(5, cliente.getContacto());
            ps.setString(6, cliente.getTipoDocumento());
            ps.setString(7, cliente.getNrDocumento());

            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Cliente registado com sucesso.", "Registado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
    
    public void actualizar_dados_cliente(Cliente cliente) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("update cliente set nome=?, apelido=?, sexo=?, contacto=?, endereco=?, tipoDocumento=?, nrDocumento=? where idCliente=?");

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getApelido());
            ps.setString(3, cliente.getSexo());
            ps.setString(4, cliente.getContacto());
            ps.setString(5, cliente.getEndereco());
            ps.setString(6, cliente.getTipoDocumento());
            ps.setString(7, cliente.getNrDocumento());
            ps.setInt(8, cliente.getIdCliente());

            ps.execute();
            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Cliente actualizado com sucesso.", "Actualizado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar dados do cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void deletar(int idCliente) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("delete from cliente where idCliente=?");
            ps.setInt(1, idCliente);
            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso.", "Removido!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
