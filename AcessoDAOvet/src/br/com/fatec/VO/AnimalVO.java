/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.VO;
import java.util.Calendar;
/**
 *
 * @author Neko13
 */
public class AnimalVO {
    private int idAnimal;
    private String Nome, Observacao;
    private ClienteVO Cliente;
    private RacaVO Raca;
    private Calendar DataNascimento;

    public AnimalVO() {
        
        
    }
    
    public AnimalVO(int idAnimal, String Nome, String Observacao, ClienteVO Cliente, RacaVO Raca, Calendar DataNascimento){
        this.setCliente(Cliente);
        this.setDataNascimento(DataNascimento);
        this.setIdAnimal(idAnimal);
        this.setNome(Nome);
        this.setObservacao(Observacao);
        this.setRaca(Raca);
        
    }
    
    
    
    /**
     * @return the idAnimal
     */
    public int getIdAnimal() {
        return idAnimal;
    }

    /**
     * @param idAnimal the idAnimal to set
     */
    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
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
     * @return the Observacao
     */
    public String getObservacao() {
        return Observacao;
    }

    /**
     * @param Observacao the Observacao to set
     */
    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    /**
     * @return the Cliente
     */
    public ClienteVO getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(ClienteVO Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the Raca
     */
    public RacaVO getRaca() {
        return Raca;
    }

    /**
     * @param Raca the Raca to set
     */
    public void setRaca(RacaVO Raca) {
        this.Raca = Raca;
    }

    /**
     * @return the DataNascimento
     */
    public Calendar getDataNascimento() {
        return DataNascimento;
    }

    /**
     * @param DataNascimento the DataNascimento to set
     */
    public void setDataNascimento(Calendar DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
    
    
    
            
}
