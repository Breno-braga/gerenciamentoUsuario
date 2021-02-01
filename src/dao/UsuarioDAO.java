package dao;
/**
 * @author Breno
 */
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
 private Connection connection;
   
    String cpf;
    String nome; 
    String sexo;
    String dataNascimento;       
    String nomeCargo;
    String listaPerfis;
       
    public UsuarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(cpf,nome,sexo,dataNascimento,nomeCargo,listaPerfis) VALUES(?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getcpf());
            stmt.setString(2, usuario.getnome());
            stmt.setString(3, usuario.getsexo());
            stmt.setString(4, usuario.getdataNascimento());
            stmt.setString(5,usuario.getnomeCargo()) ;
            stmt.setString(6,usuario.getlistaPerfis()) ;
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    public void alterar(Usuario usuario){ 
        String sql = "UPDATE usuario set nome=?, sexo=?, dataNascimento=?, nomeCargo=?, listaPerfis=? where cpf=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getnome());
            stmt.setString(2, usuario.getsexo());
            stmt.setString(3, usuario.getdataNascimento());
            stmt.setString(4,usuario.getnomeCargo()) ;
            stmt.setString(5,usuario.getlistaPerfis()) ;
            stmt.setString(6, usuario.getcpf());
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    public void excluir(Usuario usuario){ 
        String sql = "delete from usuario where cpf=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getcpf());
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    public List<Usuario> listar() throws SQLException {

       List<Usuario> usuarios = new ArrayList<>();
        
       String sql = "select * from usuario;";
       ResultSet rs = null;
       
       try { 
       PreparedStatement stmt = connection.prepareStatement(sql);
       rs = stmt.executeQuery();
       
	while (rs.next()){

       Usuario usuario = new Usuario();

       usuario.setcpf(rs.getString(1));
       usuario.setnome(rs.getString(2));
       usuario.setsexo(rs.getString(3));
       usuario.setdataNascimento(rs.getString(4));
       usuario.setnomeCargo(rs.getString(5));
       usuario.setlistaPerfis(rs.getString(6));

       usuarios.add(usuario);
       
}
       
       
       } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
       
       finally{
           connection.close();
         }
     return usuarios;


}
    
    
}
