/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import excepcao.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Conecxao;

public class EstatisticasDao {

    public Integer total_funcionarios() throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from usuario");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar usuários!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_pacientes()throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from paciente");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar pacientes!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_agendamentos()throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from agenda");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_obitos() throws ErroSistema{
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from paciente where obito ='1'");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_vivos() throws ErroSistema{
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from paciente where obito ='0'");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_travs()throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from travs");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_travs_suspensos()throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from travs where suspender ='1'");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_travs_abandonados()throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from travs where abandonar ='1'");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_travs_seguimento()throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from travs where suspender ='0' and abandonar ='0'");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_negativos()throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from paciente where resultado ='Negativo'");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_positivos() throws ErroSistema{
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from paciente where resultado ='Positivo'");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

}
