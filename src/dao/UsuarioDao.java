package dao;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Usuario;
import net.proteanit.sql.DbUtils;
import util.Conecxao;

public class UsuarioDao {

    public Boolean entrar(Usuario usuario) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from usuario where username=? and password=?");
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Conecxao.fecharConexao();
                return true;
            } else {
                Conecxao.fecharConexao();
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao iniciar a sessão!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    public String verificar_nome(Usuario usuario) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select * from usuario where username=? and password=?");

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String x = rs.getString("nome_usuario") + " " + rs.getString("apelido_usuario");

                Conecxao.fecharConexao();
                return x;

            }

            Conecxao.fecharConexao();
            return null;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }
    
    public String verificar_user(Usuario usuario) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select * from usuario where username=? and password=?");

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String x = rs.getString("acesso");

                Conecxao.fecharConexao();
                return x;

            }

            Conecxao.fecharConexao();
            return null;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }
    
    public String verificar_username(Usuario usuario) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select * from usuario where username=? and password=?");

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String x = rs.getString("username");

                Conecxao.fecharConexao();
                return x;

            }

            Conecxao.fecharConexao();
            return null;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }
    
    public Integer verificar_id(Usuario usuario) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();

            PreparedStatement ps = conexao.prepareStatement("Select * from usuario where username=? and password=?");

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int x = rs.getInt("idUsuario");

                Conecxao.fecharConexao();
                return x;

            }

            Conecxao.fecharConexao();
            return null;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }

    public void salvar(Usuario usuario) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("INSERT INTO `usuario`(`nome_usuario`, `username`, `password`, `acesso`, `sexo_usuario`, `apelido_usuario`, `email`) VALUES (?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getUsername());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getAcesso());
            ps.setString(5, usuario.getSexo());
            ps.setString(6, usuario.getApelido());
            ps.setString(7, usuario.getEmail());
            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Usuário registado com sucesso.", "Registado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar_funcionarios(JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select idUsuario as 'ID', nome_usuario as 'Nome', apelido_usuario as 'Apelido', sexo_usuario as 'Sexo', email as 'Email', acesso as 'Acesso', username as 'Username' from usuario");

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregas usuários!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar_dados_funcionario(Usuario usuario) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("update usuario set nome_usuario=?, username=?, password=?, apelido_usuario=?, email=?, sexo_usuario=?, acesso=? where idUsuario=?");

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getUsername());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getApelido());
            ps.setString(5, usuario.getEmail());
            ps.setString(6, usuario.getSexo());
            ps.setString(7, usuario.getAcesso());
            ps.setInt(8, usuario.getIdUsuario());

            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Usuário actualizado com sucesso.", "Actualizado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar dados do usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void deletar(int idUsuario) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("delete from usuario where idUsuario=?");
            ps.setInt(1, idUsuario);
            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso.", "Removido!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Usuario carregar_funcionario(String id_funcionario) throws ErroSistema {

        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from usuario where idUsuario='" + id_funcionario + "'");

            ResultSet rs = ps.executeQuery();

            Usuario usuario = new Usuario();

            while (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome_usuario"));
                usuario.setApelido(rs.getString("apelido_usuario"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setAcesso(rs.getString("acesso"));
                usuario.setSexo(rs.getString("sexo_usuario"));
                usuario.setEmail(rs.getString("email"));

            }

            return usuario;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao dados do usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    public void salvar_senha(Usuario usuario) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps;

            ps = conexao.prepareStatement("update usuario set password=? where username=? and password=?");

            ps.setString(1, usuario.getPassword_nova());
            ps.setString(2, usuario.getUsername());
            ps.setString(3, usuario.getPassword());

            ps.execute();

            Conecxao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Senha actualizado com sucesso.", "Actualizado!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar a senha!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar_previlegios(String user, JComboBox acesso, JTable tbl) throws ErroSistema {

        try {

            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select previlegio as 'Previlegio' from controle_previlegio where tipo = ? and para = ?");

            if (acesso.getSelectedIndex() == 0) {
                ps.setString(1, "criacao");
            }
            else if (acesso.getSelectedIndex() == 1) {
                ps.setString(1, "alteracao");
            }
            else if (acesso.getSelectedIndex() == 2) {
                ps.setString(1, "remocao");
            }
            else if (acesso.getSelectedIndex() == 3) {
                ps.setString(1, "pesquisa");
            }

            ps.setString(2, user);

            ResultSet rs = ps.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregas usuários!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
