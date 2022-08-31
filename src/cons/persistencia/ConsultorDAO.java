/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cons.persistencia;
import cons.modelos.Consultor;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author LucasKaosu
 */
public class ConsultorDAO implements IConsultorCRUD{
    private Connection conexao = null;
        
        public ConsultorDAO() throws Exception{
            try {
                conexao = ConexaoDB.getConexao();
            } catch (Exception erro) {
                throw erro;
            }
        }
        
    //Override Consultor
    @Override
    public void incluirConsultor(Consultor objConsultor) throws Exception {
        try {
            String sql = null;
            sql =   "insert into consultor(nome_consultor, telefone_consultor, telefone_consultor2, telefone_consultor3,"
                    + "email_consultor, email_consultor2, email_consultor3)"
                    + "values(?,?,?,?,?,?,?);";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, objConsultor.getNome_Consultor());
            preparedStatement.setString(2, objConsultor.getTelefone_Consultor_1());
            preparedStatement.setString(3, objConsultor.getTelefone_Consultor_2());
            preparedStatement.setString(4, objConsultor.getTelefone_Consultor_3());
            preparedStatement.setString(5, objConsultor.getEmail_Consultor_1());
            preparedStatement.setString(6, objConsultor.getEmail_Consultor_2());
            preparedStatement.setString(7, objConsultor.getEmail_Consultor_3());
            preparedStatement.executeUpdate();
        }catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Incluir: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public Consultor consultarConsultor(int id) throws Exception {
        Consultor consultor = null;
        try {
            String sql = null;
            sql = "select * from consultor where id_consultor =  ?";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                consultor = getConsultorResultSet(resultSet);
            }
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Incluir: "+ erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        
        return consultor;
    }
    
    private Consultor getConsultorResultSet(ResultSet resultSet) throws Exception {
        Consultor consultor = new Consultor();
        
        consultor.setId_Consultor(resultSet.getInt("id_consultor"));
        consultor.setNome_Consultor(resultSet.getString("nome_consultor"));
        consultor.setTelefone_Consultor_1(resultSet.getString("telefone_consultor"));
        consultor.setTelefone_Consultor_2(resultSet.getString("telefone_consultor2"));
        consultor.setTelefone_Consultor_3(resultSet.getString("telefone_consultor3"));
        consultor.setEmail_Consultor_1(resultSet.getString("email_consultor"));
        consultor.setEmail_Consultor_2(resultSet.getString("email_consultor2"));
        consultor.setEmail_Consultor_3(resultSet.getString("email_consultor3"));
        return consultor;
    }
    
    @Override
    public void alterarConsultor(Consultor objConsultor) throws Exception {
        try {
            String sql = null;
            sql =   "update consultor set nome_consultor = ?, telefone_consultor = ?, telefone_consultor2 = ?, telefone_consultor3 = ?"
                    + ", email_consultor =?, email_consultor2 =?, email_consultor3 =?  where id_consultor =? ";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, objConsultor.getNome_Consultor());
            preparedStatement.setString(2, objConsultor.getTelefone_Consultor_1());
            preparedStatement.setString(3, objConsultor.getTelefone_Consultor_2());
            preparedStatement.setString(4, objConsultor.getTelefone_Consultor_3());
            preparedStatement.setString(5, objConsultor.getEmail_Consultor_1());
            preparedStatement.setString(6, objConsultor.getEmail_Consultor_2());
            preparedStatement.setString(7, objConsultor.getEmail_Consultor_3());
            preparedStatement.setInt(8, objConsultor.getId_Consultor());
            preparedStatement.executeUpdate();
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Alterar: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public void excluirConsultor(int id) throws Exception {
        try {
            String sql = null;
            sql = "delete from consultor where id_consultor = ?";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Incluir: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public ArrayList<Consultor> listagemDeConsultores() throws Exception {
        ArrayList<Consultor> listaConsultor = new ArrayList<>();
        Consultor consultor = null;
        try {
            String sql = null;
            sql = "select * from consultor;";
            Statement statement = null;
            statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {    
                consultor = getConsultorResultSet(resultSet);
                listaConsultor.add(consultor);
            }
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Listar: "+ erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        
        return listaConsultor;
    }
    
}

