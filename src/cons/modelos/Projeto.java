/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cons.modelos;
/**
 *
 * @author LucasKaosu
 */
public class Projeto{
    //Atributos
    private int id_Projeto = 0;
    private String nome_Projeto = "";
    private String orcamento_Projeto = "";
    private String endereco_Projeto = "";
    private int id_Consultor = 0;
    
    //Métodos

    public Projeto() {
    }
    
    public Projeto(int id_Projeto,
                    String nome_Projeto,
                    String orcamento_Projeto,
                    String endereco_Projeto,
                    int id_Consultor) {
        this.id_Projeto = id_Projeto;
        this.nome_Projeto = nome_Projeto;
        this.orcamento_Projeto = orcamento_Projeto;
        this.endereco_Projeto = endereco_Projeto;
        this.id_Consultor = id_Consultor;
    }

    public int getId_Projeto() {
        return id_Projeto;
    }

    public void setId_Projeto(int id_Projeto) {
        this.id_Projeto = id_Projeto;
    }

    public String getNome_Projeto() {
        return nome_Projeto;
    }

    public void setNome_Projeto(String nome_Projeto) {
        this.nome_Projeto = nome_Projeto;
    }

    public String getOrcamento_Projeto() {
        return orcamento_Projeto;
    }

    public void setOrcamento_Projeto(String orcamento_Projeto) {
        this.orcamento_Projeto = orcamento_Projeto;
    }

    public String getEndereco_Projeto() {
        return endereco_Projeto;
    }

    public void setEndereco_Projeto(String endereco_Projeto) {
        this.endereco_Projeto = endereco_Projeto;
    }
    
    public int getId_Consultor() {
        return id_Consultor;
    }

    public void setId_Consultor(int id_Consultor) {
        this.id_Consultor = id_Consultor;
    }

    @Override
    public String toString() {
        return "Projeto{" + "id_Projeto=" + id_Projeto + 
                ", nome_Projeto=" + nome_Projeto + 
                ", orcamento_Projeto=" + orcamento_Projeto + 
                ", endereco_Projeto=" + endereco_Projeto +
                ", id_Consultor=" + id_Consultor +'}';
    }
    
    
}
