package gui;

import dao.UsuarioDAO;
import modelo.Usuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static javax.swing.UIManager.get;

/**
 *
 * @author Breno
 */
public class Novo_UsuarioGUI extends javax.swing.JFrame {
 public Connection connection;
    private static void dispose(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


    public Novo_UsuarioGUI() {
        initComponents();
        carregaComboBox();
        carregaComboBox2();
        jComboBox2.setSelectedItem(null);
        jComboBox1.setSelectedItem(null); 
        carregartabela();
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            jTextField7 = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuário");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo usuário"));

        jLabel2.setText("CPF:");

        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            jTextField1 = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }

        jLabel3.setText("Nome:");

        jLabel5.setText("Sexo:");

        jLabel4.setText("Data de Nascimento:");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome do Cargo:");

        jLabel7.setText("Lista de Perfis:");

        jButton1.setText("Salvar Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Sexo", "Data de Nascimento", "Cargo", "Perfil"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Salvar Edição");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Excluir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jButton1)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Usuario usuarios = new Usuario();
        usuarios.setcpf(jTextField1.getText());
        usuarios.setnome(jTextField2.getText());
        usuarios.setsexo(jTextField3.getText());
        usuarios.setdataNascimento(jTextField7.getText());
   
        usuarios.setnomeCargo(jComboBox2.getSelectedItem().toString());
        usuarios.setlistaPerfis(jComboBox1.getSelectedItem().toString());
   

        if ((jTextField1.getText().isEmpty()) ||
            (jTextField2.getText().isEmpty()) ||
            (jTextField3.getText().isEmpty()) ||
            (jTextField7.getText().isEmpty()) ||
            (jComboBox2.getSelectedItem().toString().isEmpty()) ||
            (jComboBox1.getSelectedItem().toString().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }
        else {
            UsuarioDAO dao = new UsuarioDAO();
            dao.adiciona(usuarios); 
            JOptionPane.showMessageDialog(null, "Usuário "+jTextField2.getText()+" inserido com sucesso! ");
        }

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField7.setText("");
        jComboBox2.setSelectedItem(null);
        jComboBox1.setSelectedItem(null);      
        
        carregartabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void carregaComboBox(){
    this.connection = new ConnectionFactory().getConnection();
    String sql ="select nome from perfisUsuario;";
     try
            {
             PreparedStatement stmt = connection.prepareStatement(sql);
           

             ResultSet resultado = stmt.executeQuery(sql);
           
            while(resultado.next())  
            { 
           
                jComboBox1.addItem(resultado.getString("nome"));  
            }  
             stmt.close();
            
        }  
        catch(Exception e)  
        {  
            JOptionPane.showMessageDialog(null,   
                    "Ocorreu erro ao carregar a Combo Box", "Erro",  
                    JOptionPane.ERROR_MESSAGE);  
     }       
 
}  
    
    public void carregaComboBox2(){
     this.connection = new ConnectionFactory().getConnection();
    String sql ="select nome from gerenciamentoCargos;";
     try
            {
             PreparedStatement stmt = connection.prepareStatement(sql);
           
             ResultSet resultado = stmt.executeQuery(sql);
           
            while(resultado.next())  
            { 
           
                jComboBox2.addItem(resultado.getString("nome"));  
            }  
             stmt.close();
             
        }  
        catch(Exception e)  
        {  
            JOptionPane.showMessageDialog(null,   
                    "Ocorreu erro ao carregar a Combo Box", "Erro",  
                    JOptionPane.ERROR_MESSAGE);  
     }       
 
}  
    

    private void carregartabela(){
       this.connection = new ConnectionFactory().getConnection();
       String sql ="select * from usuario;";
     try
            {
             PreparedStatement stmt = connection.prepareStatement(sql);
           
             stmt.execute(); 

             ResultSet resultado = stmt.executeQuery(sql);

             DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
             model.setNumRows(0);
             
             while(resultado.next())
             {
                 model.addRow(new Object[] 
                 { 

                      resultado.getString("cpf"),
                      resultado.getString("nome"),
                      resultado.getString("sexo"),
                      resultado.getString("dataNascimento"),
                      resultado.getString("nomeCargo"),
                      resultado.getString("listaPerfis")
                 }); 
             
            } 
                stmt.close();       
            }
             
        catch (SQLException ex)
        {
           System.out.println("o erro foi " +ex);
         }   
      
         
   } 

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        Usuario usuarios = new Usuario();
        usuarios.setcpf(jTextField1.getText());
        usuarios.setnome(jTextField2.getText());
        usuarios.setsexo(jTextField3.getText());
        usuarios.setdataNascimento(jTextField7.getText());
        usuarios.setnomeCargo(jComboBox2.getSelectedItem().toString());
        usuarios.setlistaPerfis(jComboBox1.getSelectedItem().toString());
       
        if ((jTextField1.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }
        else {
            UsuarioDAO dao = new UsuarioDAO();
            dao.alterar(usuarios); 
            JOptionPane.showMessageDialog(null, "Usuário "+jTextField2.getText()+" inserido com sucesso! ");
        }

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField7.setText("");
        jComboBox2.setSelectedItem(null);
        jComboBox1.setSelectedItem(null); 
        carregartabela();
    

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow(); 

        jTextField1.setText(jTable1.getValueAt(linha,0).toString());
        jTextField2.setText(jTable1.getValueAt(linha,1).toString()); 
        jTextField3.setText(jTable1.getValueAt(linha,2).toString()); 
        jTextField7.setText(jTable1.getValueAt(linha,3).toString()); 
        jComboBox2.setSelectedItem(jTable1.getValueAt(linha,4).toString()); 
        jComboBox1.setSelectedItem(jTable1.getValueAt(linha,5).toString()); 
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        Usuario usuarios = new Usuario();
        usuarios.setcpf(jTextField1.getText());
   
        if ((jTextField1.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }
        else {
            UsuarioDAO dao = new UsuarioDAO();
            dao.excluir(usuarios); 
            JOptionPane.showMessageDialog(null, "Usuário "+jTextField2.getText()+" excluido com sucesso! ");
        }

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField7.setText("");
        jComboBox2.setSelectedItem(null);
        jComboBox1.setSelectedItem(null); 
        carregartabela();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
      
    }//GEN-LAST:event_jTextField7ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
