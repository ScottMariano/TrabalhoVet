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
public class ConsultaVO {
    private int idConsulta;
    private FuncionarioVO Funcionario;
    private ClienteVO Cliente;
    private AnimalVO Animal;
    private Calendar Data;
    private ConsultaVO ConsultaRetorno;

    public ConsultaVO() {
        
    }
    
    public ConsultaVO(int idConsulta, FuncionarioVO Funcionario, ClienteVO Cliente, AnimalVO Animal, Calendar Data, ConsultaVO ConsultaRetorno) {
        this.setAnimal(Animal);
        this.setCliente(Cliente);
        this.setConsultaRetorno(ConsultaRetorno);
        this.setData(Data);
        this.setFuncionario(Funcionario);
        this.setIdConsulta(idConsulta);
    }
    
    
    /**
     * @return the idConsulta
     */
    public int getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param idConsulta the idConsulta to set
     */
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
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
     * @return the Data
     */
    public Calendar getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(Calendar Data) {
        this.Data = Data;
    }

    /**
     * @return the ConsultaRetorno
     */
    public ConsultaVO getConsultaRetorno() {
        return ConsultaRetorno;
    }

    /**
     * @param ConsultaRetorno the ConsultaRetorno to set
     */
    public void setConsultaRetorno(ConsultaVO ConsultaRetorno) {
        this.ConsultaRetorno = ConsultaRetorno;
    }
    
    
}
