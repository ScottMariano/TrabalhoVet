/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.VO;

/**
 *
 * @author Neko13
 */
public class LoginVO {
    private FuncionarioVO Funcionario;
    private String Login, Senha;

    public LoginVO() {
        
    }

    public LoginVO(FuncionarioVO Funcionario, String Login, String Senha) {
        this.setFuncionario(Funcionario);
        this.setLogin(Login);
        this.setSenha(Senha);
    }
    
    
    /**
     * @return the Funcionario
     */
    public FuncionarioVO getFuncionario() {
        return Funcionario;
    }

    /**
     * @param Funcionario the Funcionario to set
     */
    public void setFuncionario(FuncionarioVO Funcionario) {
        this.Funcionario = Funcionario;
    }

    /**
     * @return the Login
     */
    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
    
}
