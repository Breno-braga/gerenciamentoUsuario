package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.gerenciamentoCargos;
import modelo.perfisUsuario;

/**
 * @author Breno
 */
public class perfisUsuarioDAO {
    
    private Connection connection;
     
     String nome;
     int id;
    
     public perfisUsuarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    
    public void adiciona(perfisUsuario perfil){ 
        String sql = "INSERT INTO perfisUsuario(nome) VALUES(?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, perfil.getnome());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }  
  
    public void alterar(perfisUsuario perfil){ 
        String sql = "UPDATE perfisUsuario set nome=? where id=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, perfil.getnome());
            stmt.setInt(2, perfil.getid());
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }       
        
    } 
    
    
    public void excluir(perfisUsuario perfil){ 
        String sql = "delete from perfisUsuario where nome=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, perfil.getnome());
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    
    
}
