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
public class RacaVO {
    private int idRaca;
    private String Raca, Descricao, Porte;
    private TipoAnimalVO TipoAnimal;
    
    public RacaVO()
    {
        
        
    }   
    
    public RacaVO(int idRaca, String Raca, String Descricao, String Porte, TipoAnimalVO TipoAnimal)
    {
        this.setDescricao(Descricao);
        this.setIdRaca(idRaca);
        this.setPorte(Porte);
        this.setRaca(Raca);
        this.setTipoAnimal(TipoAnimal);
        
    }

    /**
     * @return the idRaca
     */
    public int getIdRaca() {
        return idRaca;
    }

    /**
     * @param idRaca the idRaca to set
     */
    public void setIdRaca(int idRaca) {
        this.idRaca = idRaca;
    }

    /**
     * @return the Raca
     */
    public String getRaca() {
        return Raca;
    }

    /**
     * @param Raca the Raca to set
     */
    public void setRaca(String Raca) {
        this.Raca = Raca;
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

    /**
     * @return the Porte
     */
    public String getPorte() {
        return Porte;
    }

    /**
     * @param Porte the Porte to set
     */
    public void setPorte(String Porte) {
        this.Porte = Porte;
    }

    /**
     * @return the TipoAnimal
     */
    public TipoAnimalVO getTipoAnimal() {
        return TipoAnimal;
    }

    /**
     * @param TipoAnimal the TipoAnimal to set
     */
    public void setTipoAnimal(TipoAnimalVO TipoAnimal) {
        this.TipoAnimal = TipoAnimal;
    }
    
    
    
    
}
