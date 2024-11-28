/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;// tratamento de exceção//
import javax.swing.JOptionPane;// painel de mensagem //

/**
 *
 * @author ALUNO
 */
public class ConexaoDAO {

    //métado publico conectaBD//
    public Connection conectaBD() {
        // varialvel do tipo connection chamada 
        Connection conn = null;
        try {// faz a verificação para gerar algo//
            //1º paramento se referece ao drive de conexão//
            //2º paramento refere-se onde esta nossa base de dados//
            //3º nome da base de dados//]
            //4º usuario e a senha de acesso ao banco de dados//
            String url = "jdbc:mysql://localhost:3306/eeepaluno?user=root&password=root";
            //5º Amarzenando o Dive de gerenciamneto na variavel//
            //conn usando o metado getConnection//
            conn = DriverManager.getConnection(url);
            //classe de Exception exceção//
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe ConexãoDAO" + erro.getMessage());
        }
        return conn;
    }
}
