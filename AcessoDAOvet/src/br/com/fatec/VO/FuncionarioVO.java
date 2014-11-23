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
public class FuncionarioVO {
    private int idFuncionario, Numero;
    private String Nome, CPF, Telefone, Email, Endereco;
    private CargoFuncionarioVO Cargo;

    public FuncionarioVO() {
        
    }
    
    public FuncionarioVO(int idFuncionario, int Numero, String Nome, String CPF, String Telefone, String Email, String Endereco, CargoFuncionarioVO Cargo) {
        this.setCPF(CPF);
        this.setCargo(Cargo);
        this.setEmail(Email);
        this.setEndereco(Endereco);
        this.setIdFuncionario(idFuncionario);
        this.setNome(Nome);
        this.setNumero(Numero);
        this.setTelefone(Telefone);
    }
    
    
    /**
     * @return the idFuncionario
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Cargo
     */
    public CargoFuncionarioVO getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(CargoFuncionarioVO Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
