
package dao;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
            
            if(veiculo.getMatricula()!= null) {
            
            if(veiculo.getMatricula().equals(matricula)) {
                return true;
            }
            else {
                return false;
            }
            }else {
                return false;
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar o veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
        
    }
    
    public void salvar(Veiculo veiculo) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("INSERT INTO `veiculo`(`idCliente`, `matricula`, `marca`, `modelo`, `cor`, `tipo`, `ano`, `nomeCliente`, `apelidoCliente`, `enderecoCliente`, `nrDocumentoCliente`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, veiculo.getNome());
            ps.setString(2, veiculo.getLocalizacao());
            ps.setString(3, veiculo.getDescricao());

            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Veiculo registado com sucesso.", "Registado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar_veiculos(JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idVeiculo as 'ID', nome as 'Nome', localizacao as 'Localização', descricao as 'Descrição' from veiculo");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar veiculos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void actualizar_dados_veiculo(Veiculo veiculo) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("update veiculo set nome=?, localizacao=?, descricao=? where idVeiculo=?");

            ps.setString(1, veiculo.getNome());
            ps.setString(2, veiculo.getLocalizacao());
            ps.setString(3, veiculo.getDescricao());
            ps.setInt(4, veiculo.getIdVeiculo());

            ps.execute();
            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Veiculo actualizado com sucesso.", "Actualizado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar dados da veículo", "Erro", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Erro ao remover a veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Veiculo carregar_veiculo(String idVeiculo) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idVeiculo as 'ID', nome as 'Nome', localizacao as 'Localização', descricao as 'Descrição' from veiculo where id='" + idVeiculo + "'");

            ResultSet rs = ps.executeQuery();

            Veiculo veiculo = new Veiculo();

            while (rs.next()) {
                veiculo.setIdVeiculo(rs.getInt("ID"));
                veiculo.setNome(rs.getString("Nome"));
                veiculo.setLocalizacao(rs.getString("Localização"));
                veiculo.setDescricao(rs.getString("Descrição"));
                
            }

            return veiculo;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    
    public void carregar_veiculo_filtro(String valor, JTable tbl) throws ErroSistema {

        try {
            
            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select idVeiculo as 'ID', nome as 'Nome', localizacao as 'Localização', descricao as 'Descrição' from veiculo where nome LIKE '" + valor + "%'"
                    + "OR (localizacao LIKE '" + valor + "%')"
                    + "OR (descricao LIKE '" + valor + "%')");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados da veículo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
