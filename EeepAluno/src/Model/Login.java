/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class Login {

    private int idLogin;

    private String usuarioLogin;

    private String senhaLogin;


    public Login(String usuarioLogin, String senhaLogin){
        this.usuarioLogin = usuarioLogin;
        this.senhaLogin = senhaLogin;
    }
    
    public int getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    /**
     * @return the usuarioLogin
     */
    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    /**
     * @param usuarioLogin the usuarioLogin to set
     */
    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    /**
     * @return the senhaLogin
     */
    public String getSenhaLogin() {
        return senhaLogin;
    }

    /**
     * @param senhaLogin the senhaLogin to set
     */
    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }
    
    

}
