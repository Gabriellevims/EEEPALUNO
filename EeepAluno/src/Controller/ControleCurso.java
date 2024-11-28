/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DAO.ConexaoDAO;
import Model.Curso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class ControleCurso {

    // variaveis globais 
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Curso> lista = new ArrayList<>();

    public void cadastrarCurso(Curso objCurso) {
        String sql = "insert into curso(nomeCurso,statusCurso) values (?,?)";
        conn = new ConexaoDAO().conectaBD();
        //criando a exceção
        try {
            pstm = conn.prepareStatement(sql);
            // passamos as informações atraves do set 
            //o get pega os valores da variável 
            // 1º parameto do curso
            pstm.setString(1, objCurso.getNomeCurso());
            // 2º parameto do curso
            pstm.setString(2, objCurso.getStatusCurso());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastra, verifique a classe ControleCurso no metado CadastrarCurso" + erro);
        }
    }

    public ArrayList<Curso> consultarCurso() {
        String sql = "Select * from curso";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            // isto é para quando quiser vizualizar os dados da tabela
            //laço de repetição
            while (rs.next()) {
                Curso objCurso = new Curso(0, sql, sql);//alteramos para o que a máquina pediu!!!
                objCurso.setIdCurso(rs.getInt("idCurso"));
                objCurso.setNomeCurso(rs.getString("nomeCurso"));
                objCurso.setStatusCurso(rs.getString("statusCurso"));
                lista.add(objCurso);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao consultar curso" + erro);
        }
        return lista;
    }

    public void alterarCurso(Curso objCurso) {
        String sql = "update curso set nomecurso = ?, statusCurso = ? where idCurso = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCurso.getNomeCurso());
            pstm.setString(2, objCurso.getStatusCurso());
            pstm.setInt(3, objCurso.getIdCurso());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "Erro na classe ControleCurso ao alterar os dados do curso" + erro);
        }
    }

    public void excluirCurso(Curso objCurso) {
        String sql = "DELETE FROM curso where idCurso = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objCurso.getIdCurso());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "Erro ao excluir a curso" + erro.getMessage());
        }
    }
}
