/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;
import util.Conecxao;

/**
 *
 * @author cmaemo
 */
public class UsuarioBean {
    
    
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
            throw new ErroSistema("Erro ao iniciar a sessão!", ex);
        }

    }
   
}
