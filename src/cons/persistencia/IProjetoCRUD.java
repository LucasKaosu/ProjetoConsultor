/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cons.persistencia;
import cons.modelos.Projeto;
import java.util.ArrayList;
/**
 *
 * @author LucasKaosu
 */
public interface IProjetoCRUD {
    //Métodos para Projetos
    public void incluirProjeto(Projeto objProjeto) throws Exception;
    public Projeto consultarProjeto(int id) throws Exception;
    public void alterarProjeto (Projeto objProjeto) throws Exception;
    public void excluirProjeto (int id) throws Exception;
    public ArrayList<Projeto> listagemDeProjetos() throws Exception;
    public ArrayList<Projeto> consultaListaProjetoIDP(int idProjeto) throws Exception;
    public ArrayList<Projeto> consultaListaProjetoIDC(int idConsultor) throws Exception;
    public ArrayList<Projeto> consultaListaProjetoDescricao(Projeto objProjeto) throws Exception;
}
