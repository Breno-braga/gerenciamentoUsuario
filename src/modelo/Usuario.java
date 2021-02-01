package modelo;


import javax.swing.table.DefaultTableModel;

/**
 * @author Breno
 */
public class Usuario {

    public static DefaultTableModel getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object getColumnModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getColumnModel(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String cpf;
    String nome; 
    String sexo;
    String dataNascimento;       
    String nomeCargo;
    String listaPerfis;
    
    
    public String getcpf() { 
        return cpf;
    } 
    public void setcpf(String cpf) { 
        this.cpf = cpf;
    }  
    
       public String getnome() { 
        return nome;
    } 
    public void setnome(String nome) { 
        this.nome = nome;
    } 
    
     public String getsexo() { 
        return sexo;
    } 
    public void setsexo(String sexo) { 
        this.sexo = sexo;
    } 
    
      public String getdataNascimento() { 
        return dataNascimento;
    } 
    public void setdataNascimento(String dataNascimento) { 
        this.dataNascimento = dataNascimento;
    }
    
     public String getnomeCargo() { 
        return nomeCargo;
    } 
    public void setnomeCargo(String nomeCargo) { 
        this.nomeCargo = nomeCargo;
    } 
    
     public String getlistaPerfis() { 
        return listaPerfis;
    } 
    public void setlistaPerfis(String listaPerfis) { 
        this.listaPerfis = listaPerfis;
    } 

    public void setdata(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
