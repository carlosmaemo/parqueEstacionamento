
package dao;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Vaga;
import net.proteanit.sql.DbUtils;
import util.Conecxao;

public class VagaDao {

    public boolean verificar_vaga(String nome) throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from vaga where nome='" + nome + "'");
    
            ResultSet rs = ps.executeQuery();

            Vaga vaga = new Vaga();

            while (rs.next()) {
                vaga.setNome(rs.getString("nome"));
            }
            
            if(vaga.getNome()!= null) {
            
            if(vaga.getNome().equals(nome)) {
                return true;
            }
            else {
                return false;
            }
            }else {
                return false;
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar a vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
        
    }
    
    public void salvar(Vaga vaga) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("INSERT INTO `vaga`(`nome`, `localizacao`, `descricao`, `quantidade`) VALUES (?, ?, ?, ?)");

            ps.setString(1, vaga.getNome());
            ps.setString(2, vaga.getLocalizacao());
            ps.setString(3, vaga.getDescricao());
            ps.setString(4, vaga.getQuantidade());

            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Vaga registado com sucesso.", "Registado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar_vagas(JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idVaga as 'ID', nome as 'Nome', localizacao as 'Localização', descricao as 'Descrição', quantidade as 'Lotação' from vaga");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar vagas!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void actualizar_dados_vaga(Vaga vaga) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("update vaga set nome=?, localizacao=?, descricao=?, quantidade=? where idVaga=?");

            ps.setString(1, vaga.getNome());
            ps.setString(2, vaga.getLocalizacao());
            ps.setString(3, vaga.getDescricao());
            ps.setString(4, vaga.getQuantidade());
            ps.setInt(5, vaga.getIdVaga());

            ps.execute();
            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Vaga actualizado com sucesso.", "Actualizado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar dados da vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void deletar(int idVaga) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("delete from vaga where idVaga=?");
            ps.setInt(1, idVaga);
            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Vaga removida com sucesso.", "Removido!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover a vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Vaga carregar_vaga(String idVaga) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idVaga as 'ID', nome as 'Nome', localizacao as 'Localização', descricao as 'Descrição', quantidade as 'Lotação' from vaga where id='" + idVaga + "'");

            ResultSet rs = ps.executeQuery();

            Vaga vaga = new Vaga();

            while (rs.next()) {
                vaga.setIdVaga(rs.getInt("ID"));
                vaga.setNome(rs.getString("Nome"));
                vaga.setLocalizacao(rs.getString("Localização"));
                vaga.setDescricao(rs.getString("Descrição"));
                vaga.setQuantidade(rs.getString("Lotação"));
                
            }

            return vaga;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    
    public void carregar_vaga_filtro(String valor, JTable tbl) throws ErroSistema {

        try {
            
            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select idVaga as 'ID', nome as 'Nome', localizacao as 'Localização', descricao as 'Descrição', quantidade as 'Lotação' from vaga where nome LIKE '" + valor + "%'"
                    + "OR (localizacao LIKE '" + valor + "%')"
                    + "OR (descricao LIKE '" + valor + "%')");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados da vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
