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
public class ExameVO {
    private int idExame;
    private String Descricao, Observacao;
    private Calendar DataRetorno;
    private AnimalVO Animal;
    private ConsultaVO Consulta; 

    public ExameVO() {
        
    }
    
    public ExameVO(int idExame, String Descricao, String Observacao, Calendar DataRetorno, AnimalVO Animal, ConsultaVO Consulta) {
        this.setAnimal(Animal);
        this.setConsulta(Consulta);
        this.setDataRetorno(DataRetorno);
        this.setDescricao(Descricao);
        this.setIdExame(idExame);
        this.setObservacao(Observacao);
        
    }
    
    
    /**
     * @return the idExame
     */
    public int getIdExame() {
        return idExame;
    }

    /**
     * @param idExame the idExame to set
     */
    public void setIdExame(int idExame) {
        this.idExame = idExame;
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
     * @return the DataRetorno
     */
    public Calendar getDataRetorno() {
        return DataRetorno;
    }

    /**
     * @param DataRetorno the DataRetorno to set
     */
    public void setDataRetorno(Calendar DataRetorno) {
        this.DataRetorno = DataRetorno;
    }

    /**
     * @return the Animal
     */
    public AnimalVO getAnimal() {
        return Animal;
    }

    /**
     * @param Animal the Animal to set
     */
    public void setAnimal(AnimalVO Animal) {
        this.Animal = Animal;
    }

    /**
     * @return the Consulta
     */
    public ConsultaVO getConsulta() {
        return Consulta;
    }

    /**
     * @param Consulta the Consulta to set
     */
    public void setConsulta(ConsultaVO Consulta) {
        this.Consulta = Consulta;
    }
}
