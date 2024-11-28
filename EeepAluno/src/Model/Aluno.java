/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.ControleAdministrador;
import java.util.Date;

/**
 *
 * @author ALUNO
 */
public class Aluno {

    private int idAluno;

    private String matriculaAluno;

    private String nomeAluno;

    private String cpfAluno;

    private String rgAluno;

    private Date dataNascAluno;

    private int idadeAluno;

    private String enderecoAluno;

    private Curso curso;

    private ControleAdministrador controleAdministrador;

    /**
     * @return the idAluno
     */
    public int getIdAluno() {
        return idAluno;
    }

    /**
     * @param idAluno the idAluno to set
     */
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    /**
     * @return the matriculaAluno
     */
    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    /**
     * @param matriculaAluno the matriculaAluno to set
     */
    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the cpfAluno
     */
    public String getCpfAluno() {
        return cpfAluno;
    }

    /**
     * @param cpfAluno the cpfAluno to set
     */
    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    /**
     * @return the rgAluno
     */
    public String getRgAluno() {
        return rgAluno;
    }

    /**
     * @param rgAluno the rgAluno to set
     */
    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    /**
     * @return the dataNascAluno
     */
    public Date getDataNascAluno() {
        return dataNascAluno;
    }

    /**
     * @param dataNascAluno the dataNascAluno to set
     */
    public void setDataNascAluno(Date dataNascAluno) {
        this.dataNascAluno = dataNascAluno;
    }

    /**
     * @return the idadeAluno
     */
    public int getIdadeAluno() {
        return idadeAluno;
    }

    /**
     * @param idadeAluno the idadeAluno to set
     */
    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    /**
     * @return the enderecoAluno
     */
    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    /**
     * @param enderecoAluno the enderecoAluno to set
     */
    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }
    

}
