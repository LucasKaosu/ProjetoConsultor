/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cons.modelos;

/**
 *
 * @author LucasKaosu
 */
public class Consultor {
    //Atributos
    private int id_Consultor = 0;
    private String nome_Consultor = "";
    private String telefone_Consultor_1 = "";
    private String telefone_Consultor_2 = "";
    private String telefone_Consultor_3 = "";
    private String email_Consultor_1 = "";
    private String email_Consultor_2 = "";
    private String email_Consultor_3= "";

    //Métodos

    public Consultor() {
    }
    
    public Consultor(int id_Consultor,
                    String nome_Consultor,
                    String telefone_Consultor_1,
                    String telefone_Consultor_2,
                    String telefone_Consultor_3,
                    String email_Consultor_1,
                    String email_Consultor_2,
                    String email_Consultor_3) {
        this.id_Consultor = id_Consultor;
        this.nome_Consultor = nome_Consultor;
        this.telefone_Consultor_1 = telefone_Consultor_1;
        this.telefone_Consultor_2 = telefone_Consultor_2;
        this.telefone_Consultor_3 = telefone_Consultor_3;
        this.email_Consultor_1 = email_Consultor_1;
        this.email_Consultor_2 = email_Consultor_2;
        this.email_Consultor_3 = email_Consultor_3;
    }

    public int getId_Consultor() {
        return id_Consultor;
    }

    public void setId_Consultor(int id_Consultor) {
        this.id_Consultor = id_Consultor;
    }

    public String getNome_Consultor() {
        return nome_Consultor;
    }

    public void setNome_Consultor(String nome_Consultor) {
        this.nome_Consultor = nome_Consultor;
    }

    public String getTelefone_Consultor_1() {
        return telefone_Consultor_1;
    }

    public void setTelefone_Consultor_1(String telefone_Consultor_1) {
        this.telefone_Consultor_1 = telefone_Consultor_1;
    }

    public String getTelefone_Consultor_2() {
        return telefone_Consultor_2;
    }

    public void setTelefone_Consultor_2(String telefone_Consultor_2) {
        this.telefone_Consultor_2 = telefone_Consultor_2;
    }

    public String getTelefone_Consultor_3() {
        return telefone_Consultor_3;
    }

    public void setTelefone_Consultor_3(String telefone_Consultor_3) {
        this.telefone_Consultor_3 = telefone_Consultor_3;
    }

    public String getEmail_Consultor_1() {
        return email_Consultor_1;
    }

    public void setEmail_Consultor_1(String email_Consultor_1) {
        this.email_Consultor_1 = email_Consultor_1;
    }

    public String getEmail_Consultor_2() {
        return email_Consultor_2;
    }

    public void setEmail_Consultor_2(String email_Consultor_2) {
        this.email_Consultor_2 = email_Consultor_2;
    }

    public String getEmail_Consultor_3() {
        return email_Consultor_3;
    }

    public void setEmail_Consultor_3(String email_Consultor_3) {
        this.email_Consultor_3 = email_Consultor_3;
    }

    @Override
    public String toString() {
        return "Consultor{" + "id_Consultor=" + id_Consultor + ", nome_Consultor=" + nome_Consultor + 
                ", telefone_Consultor_1=" + telefone_Consultor_1 + 
                ", telefone_Consultor_2=" + telefone_Consultor_2 + 
                ", telefone_Consultor_3=" + telefone_Consultor_3 + 
                ", email_Consultor_1=" + email_Consultor_1 + 
                ", email_Consultor_2=" + email_Consultor_2 + 
                ", email_Consultor_3=" + email_Consultor_3 + '}';
    }

    
    
    
}
