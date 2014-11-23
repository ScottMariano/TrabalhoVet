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
public class CargoFuncionarioVO {
    private int idCargo;
    private String Descricao;
    
    public CargoFuncionarioVO() {
        
        
    }
    
    public CargoFuncionarioVO(int idCargo, String Descricao) {
        this.setDescricao(Descricao);
        this.setIdCargo(idCargo);
        
    }

    /**
     * @return the idCargo
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
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
