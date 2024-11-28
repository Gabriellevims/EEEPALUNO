/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class AdmDAO {

    //variavel global fora do metado//
    Connection conn;
    //acessar os objetos então trago todos os objetos para ca//

    public ResultSet autententicarLogin(Login objLogin) {
        //acessando minha clase de conexão
        //com o nosso metado conectaBD
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from login where usuarioLogin =? and senhaLogin=?";
            // prepara o objeto pstm a conexão e chamar a variável SQL
            PreparedStatement pstm = conn.prepareStatement(sql);
            //usamos o objeto pstm p/ compara
            // o que o usuário digite e definir o paramentro 
            pstm.setString(1, objLogin.getUsuarioLogin());
            pstm.setString(2, objLogin.getSenhaLogin());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro na Classe AdmDAO" + erro.getMessage());
            return null;
        }
    }
}
