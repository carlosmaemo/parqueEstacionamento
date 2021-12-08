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

    public Integer total_pacientes() throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from cliente");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar clientes!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public Integer total_veiculos() throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from veiculo");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                total++;
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar veículos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer total_vagas() throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from vaga");
            PreparedStatement ps2 = conexao.prepareStatement("Select * from entrada where estado ='dentro'");
            ResultSet rs = ps.executeQuery();
            ResultSet rs2 = ps2.executeQuery();

            int total = 0;
            while (rs.next()) {
                
                total = total + Integer.parseInt(rs.getString("quantidade"));
                
            }
            
            while (rs2.next()) {
                
                total++;
                
            }
            
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public Integer total_vagasOcupadas() throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from entrada where estado ='dentro'");
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
    
       public Integer total_vagasDisponiveis() throws ErroSistema {
        try {
            Connection conexao = Conecxao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from vaga");
            ResultSet rs = ps.executeQuery();

            int total = 0;
            while (rs.next()) {
                
                total = total + Integer.parseInt(rs.getString("quantidade"));
                
            }
            return total;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
}
