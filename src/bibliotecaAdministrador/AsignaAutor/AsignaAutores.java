/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bibliotecaAdministrador.AsignaAutor;

import bibliotecaAdministrador.ConexionBD;
import bibliotecaAdministrador.PaginaPrincipalAdministrador;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author g
 */
public class AsignaAutores extends javax.swing.JFrame {

    /**
     * Creates new form AsignaAutores
     */
    ConexionBD conecta;
    ResultSet res;
    public AsignaAutores() {
        initComponents();
        tablaAsigna();
        txtIdAsigna.setVisible(false);
        this.setLocationRelativeTo(null);
        // mUsuarios.addActionListener(this);
        this.setTitle("BIBLIOTECA");
        this.setIconImage(getIconImage());
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/library.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        panelAsigna = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAsigna = new javax.swing.JTable();
        txtIdAsigna = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ASIGNA AUTORES A LIBROS");

        jLabel2.setText("CODIGO DEL LIBRO");

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnGuardar.setText("NUEVO");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnActualizar.setText("EDITAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        jButton5.setText("REGRESAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton1.setText("Buscar Libro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtAsigna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jtAsigna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAsignaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAsigna);

        javax.swing.GroupLayout panelAsignaLayout = new javax.swing.GroupLayout(panelAsigna);
        panelAsigna.setLayout(panelAsignaLayout);
        panelAsignaLayout.setHorizontalGroup(
            panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAsignaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAsignaLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAsignaLayout.createSequentialGroup()
                        .addGroup(panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAsignaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel2))
                        .addGap(267, 267, 267))))
            .addGroup(panelAsignaLayout.createSequentialGroup()
                .addGroup(panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAsignaLayout.createSequentialGroup()
                        .addGroup(panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAsignaLayout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(jLabel1))
                            .addGroup(panelAsignaLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(txtIdAsigna, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelAsignaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1))))
                .addContainerGap())
            .addGroup(panelAsignaLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );
        panelAsignaLayout.setVerticalGroup(
            panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdAsigna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelAsignaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(borrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnGuardar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAsigna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAsigna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*conecta = new ConexionBD();
        if(!txtcodigo.getText().equals("")){
            String sql="SELECT l.titulo, g.descripcion from libros l INNER JOIN generos g on l.id_genero=g.id_genero where id_libro="+Integer.parseInt(txtcodigo.getText());
            try {
                res = conecta.consultar(sql);
                if(res.next()){
                    txttitulo.setText(res.getString("titulo"));
                    txtGenero.setText(res.getString("descripcion"));
                    JOptionPane.showMessageDialog(null, "Libro encontrado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Libro no encontrado, intente de nuevo");
                    txtcodigo.setText("");
                }
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Libro no encontrado");
            }finally{
                    conecta.cerrar();
            }
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        /*if(!txtcodigo.getText().equals("") && !txtnomAutor.getText().equals("")){
            conecta = new ConexionBD();
            try {
                String sqlAlta="INSERT INTO asigna_autores VALUES(null,"+Integer.parseInt(txtcodigo.getText())+","+Integer.parseInt(id_autor.getText())+")";
                conecta.operacionesAMB(sqlAlta);
                JOptionPane.showMessageDialog(null, "Registro Existoso");
            }catch(SQLException ex){
                System.out.println("error sql al insertar en asigna: "+ex.getMessage());
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puedo realizar el registro");
                System.out.println("erro al registra en asigna"+e.getMessage());
            }finally{
                conecta.cerrar();
            }
            panelAsigna.remove(jtAsigna);  
            tablaAsigna();
            repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor llena todos los campos");
        }*/
            Guardar gu = new Guardar();
            gu.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtAsignaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAsignaMouseClicked
        // TODO add your handling code here:
        conecta = new ConexionBD();
        ResultSet res;
        try{
            int Fila = jtAsigna.getSelectedRow();
            String id = jtAsigna.getValueAt(Fila, 0).toString();
            //String sqlConsulta = "SELECT aa.id_asigna, l.id_libro, l.titulo, a.id_autor, CONCAT(a.nombre,' ',a.ap,' ',a.am) as autor, g.descripcion FROM asigna_autores aa INNER JOIN libros l on aa.id_libro=l.id_libro INNER JOIN autores a ON aa.id_autor=a.id_autor INNER JOIN generos g ON l.id_genero=g.id_genero where id_asigna="+Integer.parseInt(id);
            String sqlConsulta = "SELECT id_asigna FROM asigna_autores WHERE id_asigna="+Integer.parseInt(id);
            res = conecta.consultar(sqlConsulta);
            while(res.next()){
                txtIdAsigna.setText(res.getString("id_asigna"));
            }
        }catch (Exception e){
            System.out.println("error al cargar datos de la tabla a los campos en los prestamos: "+e.getMessage());
            
        }finally{
            conecta.cerrar();
        }
    }//GEN-LAST:event_jtAsignaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        /*if(!txtIdAsigna.getText().equals("") && !txtcodigo.getText().equals("") && !txtnomAutor.getText().equals("") && !id_autor.getText().equals("")){
            conecta = new ConexionBD();
            String sqlactualiza = "UPDATE asigna_autores set id_libro="+Integer.parseInt(txtcodigo.getText())+", id_autor=" +Integer.parseInt(id_autor.getText())+" where id_asigna="+Integer.parseInt(txtIdAsigna.getText())+"";
            System.out.println(sqlactualiza);
            try{
                conecta.operacionesAMB(sqlactualiza);
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                txtcodigo.setText("");
                txtIdAsigna.setText("");
                txtGenero.setText("");
                txtnomAutor.setText("");
                txttitulo.setText("");
                id_autor.setText("");
            }catch(SQLException ex){
                System.out.println("Error al actualizar asignacion"+ex.getMessage());
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro en asigna error sql: "+ex.getMessage());
            }
            catch (Exception e){
                System.out.println("Error al actualizar asignacion"+e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al actualizar asignacion");
            }finally{
                conecta.cerrar();
            }
            panelAsigna.remove(jtAsigna);  
            tablaAsigna();
            repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor llene todos los campo y compruebe que el autor exista");
        }*/
        if(!txtIdAsigna.getText().equals("")){
            Actualizar act = new Actualizar();
            act.setNombre(txtIdAsigna.getText());
            act.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor seleccione un registro de la tabla");
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
        if(!txtIdAsigna.getText().equals("")){
            conecta = new ConexionBD();
            try{
                String sqldelete = "DELETE FROM asigna_autores where id_asigna='"+txtIdAsigna.getText()+"'";
                conecta.operacionesAMB(sqldelete);
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                txtIdAsigna.setText("");
                txtcodigo.setText("");
                txtIdAsigna.setText("");
            }catch(SQLException ex){
                System.out.println("Error al borrar asigna"+ex.getMessage());
                JOptionPane.showMessageDialog(null, "No se pudo borrar el registro en asigna error sql: "+ex.getMessage());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar asigna");
                System.out.println("Error al eliminar asigna "+e.getMessage());
            }finally{
                conecta.cerrar();
            }
            panelAsigna.remove(jtAsigna);  
            tablaAsigna();
            repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor seleccione un elemento de la tabla");
        }
        
    }//GEN-LAST:event_borrarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        PaginaPrincipalAdministrador prin = new PaginaPrincipalAdministrador();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    
    void tablaAsigna(){
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            conecta = new ConexionBD();
            jtAsigna.setModel(modelo);
            String sql = "SELECT aa.id_asigna, l.titulo, CONCAT(a.nombre,' ',a.ap,' ',a.am) as autor FROM asigna_autores aa inner join libros l on aa.id_libro=l.id_libro INNER JOIN autores a on aa.id_autor=a.id_autor;";
            res = conecta.consultar(sql);

            ResultSetMetaData rsMd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID Asigna");
            modelo.addColumn("Libro");
            modelo.addColumn("Autor");
            
            int []anchos = {50, 200, 200};
            for(int i=0;i<jtAsigna.getColumnCount();i++){
                jtAsigna.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (res.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = res.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        }catch(Exception e){
            System.out.println("Error al mostrar datos en la tabla copias: "+e.getMessage());
        }finally{
            conecta.cerrar();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            //UIManager.setLookAndFeel( new FlatLightLaf() );
            FlatMacLightLaf.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignaAutores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtAsigna;
    private javax.swing.JPanel panelAsigna;
    private javax.swing.JTextField txtIdAsigna;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
