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
public class TipoAnimalVO {
    private int idTipoAnimal;
    private String Tipo, Descricao;
    
    public TipoAnimalVO()
    {

    }
    
    public TipoAnimalVO(int idTipoAnimal, String tipo, String Descricao)
    {
        this.setIdTipoAnimal(idTipoAnimal);
        this.setTipo(Tipo);
        this.setDescricao(Descricao);
        
    }

    /**
     * @return the idTipoAnimal
     */
    public int getIdTipoAnimal() {
        return idTipoAnimal;
    }

    /**
     * @param idTipoAnimal the idTipoAnimal to set
     */
    public void setIdTipoAnimal(int idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
