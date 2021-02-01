package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Usuario;
import modelo.gerenciamentoCargos;

/**
 * @author Breno
 */
public class gerenciamentoCargosDAO {
     private Connection connection;
     
     String nome;
     int id;
    
     public gerenciamentoCargosDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    
    public void adiciona(gerenciamentoCargos cargos){ 
        String sql = "INSERT INTO gerenciamentoCargos(nome) VALUES(?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cargos.getnome());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }  
  
    public void alterar(gerenciamentoCargos cargos){ 
        String sql = "UPDATE gerenciamentoCargos set nome=? where id=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cargos.getnome());
            stmt.setInt(2, cargos.getid());
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }       
        
    } 
    
    
    public void excluir(gerenciamentoCargos cargos){ 
        String sql = "delete from gerenciamentoCargos where nome=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cargos.getnome());
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    
    
}
