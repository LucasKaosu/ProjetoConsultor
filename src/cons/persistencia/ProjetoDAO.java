/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cons.persistencia;
import cons.modelos.Projeto;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author LucasKaosu
 */
public class ProjetoDAO implements IProjetoCRUD{
    private Connection conexao = null;
        
        public ProjetoDAO() throws Exception{
            try {
                conexao = ConexaoDB.getConexao();
            } catch (Exception erro) {
                throw erro;
            }
        }

    //Override Projeto
    @Override
    public void incluirProjeto(Projeto objProjeto) throws Exception {
        try {
            String sql = null;
            sql =   "insert into projeto(nome_projeto, orcamento_projeto, endereco_projeto, id_consultor)"
                    + "values(?,?,?,?);";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, objProjeto.getNome_Projeto());
            preparedStatement.setString(2, objProjeto.getOrcamento_Projeto());
            preparedStatement.setString(3, objProjeto.getEndereco_Projeto());
            preparedStatement.setInt   (4, objProjeto.getId_Projeto());
            preparedStatement.executeUpdate();
        }catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Incluir: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public Projeto consultarProjeto(int id) throws Exception {
       Projeto projeto = null;
        try {
            String sql = null;
            sql = "select * from projeto where id_projeto =  ?";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                projeto = getProjetoResultSet(resultSet);
            }
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Consultar: "+ erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        
        return projeto;
    }
    
    private Projeto getProjetoResultSet(ResultSet resultSet) throws Exception {
        Projeto projeto = new Projeto();
        
        projeto.setId_Projeto(resultSet.getInt("id_projeto"));
        projeto.setNome_Projeto(resultSet.getString("nome_projeto"));
        projeto.setOrcamento_Projeto(resultSet.getString("orcamento_projeto"));
        projeto.setEndereco_Projeto(resultSet.getString("endereco_projeto"));
        projeto.setId_Projeto(resultSet.getInt("id_consultor"));
        return projeto;
    }

    @Override
    public void alterarProjeto(Projeto objProjeto) throws Exception {
        try {
            String sql = null;
            sql =   "update projeto set nome_projeto = ?, orcamento_projeto = ?, endereco_projeto = ?, id_consultor = ? where id_projeto =? ";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, objProjeto.getNome_Projeto());
            preparedStatement.setString(2, objProjeto.getOrcamento_Projeto());
            preparedStatement.setString(3, objProjeto.getEndereco_Projeto());
            preparedStatement.setInt(4, objProjeto.getId_Consultor());
            preparedStatement.setInt(5, objProjeto.getId_Projeto());
            preparedStatement.executeUpdate();
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Alterar: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public void excluirProjeto(int id) throws Exception {
        try {
            String sql = null;
            sql = "delete from projeto where id_projeto = ?";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Excluir: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public ArrayList<Projeto> listagemDeProjetos() throws Exception {
        ArrayList<Projeto> listaprojeto = new ArrayList<>();
        Projeto projeto = null;
        try {
            String sql = null;
            sql = "select * from projeto";
            Statement statement = null;
            statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {    
                projeto = getProjetoResultSet(resultSet);
                listaprojeto.add(projeto);
            }
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Listar: "+ erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        
        return listaprojeto;
    }

    @Override
    public ArrayList<Projeto> consultaListaProjetoIDP(int idProjeto) throws Exception {
        ArrayList<Projeto> listaProjeto = new ArrayList<>();
        Projeto projeto = null;
        try {
            String sql = null;
            sql = "select * from projeto where id_projeto = ?";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, idProjeto);
            ResultSet resultSet = preparedStatement.executeQuery();            
            while (resultSet.next()) {    
                projeto = getProjetoResultSet(resultSet);
                listaProjeto.add(projeto);
            }
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Listar: "+ erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        
        return listaProjeto;
    }

    @Override
    public ArrayList<Projeto> consultaListaProjetoIDC(int idConsultor) throws Exception {
        ArrayList<Projeto> listaProjeto = new ArrayList<>();
        Projeto projeto = null;
        try {
            String sql = null;
            sql = "select * from projeto where id_consultor = ?";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, idConsultor);
            ResultSet resultSet = preparedStatement.executeQuery();            
            while (resultSet.next()) {    
                projeto = getProjetoResultSet(resultSet);
                listaProjeto.add(projeto);
            }
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Listar: "+ erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        
        return listaProjeto;
    }

    @Override
    public ArrayList<Projeto> consultaListaProjetoDescricao(Projeto objProjeto) throws Exception {
        ArrayList<Projeto> listaProjeto = new ArrayList<>();
        Projeto projeto = null;
        try {
            String sql = null;
            sql = "select * from projeto where nome_projeto = ?";
            PreparedStatement preparedStatement = null;
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, objProjeto.getNome_Projeto());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {    
                projeto = getProjetoResultSet(resultSet);
                listaProjeto.add(projeto);
            }
            
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro Listar: "+ erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        
        return listaProjeto;
    }
    
}

