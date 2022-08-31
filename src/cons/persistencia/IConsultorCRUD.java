/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cons.persistencia;
import cons.modelos.Consultor;
import java.util.List;

/**
 *
 * @author LucasKaosu
 */
public interface IConsultorCRUD {
    //Métodos para Consultores
    public void incluirConsultor(Consultor objConsultor) throws Exception;
    public Consultor consultarConsultor(int id) throws Exception;
    public void alterarConsultor (Consultor objConsultor) throws Exception;
    public void excluirConsultor (int id) throws Exception;   
    public List<Consultor> listagemDeConsultores() throws Exception;    
}
