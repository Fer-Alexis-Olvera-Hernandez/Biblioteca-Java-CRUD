/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bibliotecaAdministrador.Estado;
import bibliotecaAdministrador.ConexionBD;
import bibliotecaAdministrador.PaginaPrincipalAdministrador;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author g
 */
public class Estados extends javax.swing.JFrame {
    
    /**
     * Creates new form Estados
     */
    ConexionBD conecta;
    ResultSet res;
    public Estados() {
        initComponents();
        txtId.setVisible(false);
        tablaE();
        this.setLocationRelativeTo(null);
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

        panelE = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEstados = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ESTADOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion");

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnGuardar.setText("NUEVO");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnActualizar.setText("EDITAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jtEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEstadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEstados);

        javax.swing.GroupLayout panelELayout = new javax.swing.GroupLayout(panelE);
        panelE.setLayout(panelELayout);
        panelELayout.setHorizontalGroup(
            panelELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(panelELayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(panelELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelELayout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelELayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(panelELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        panelELayout.setVerticalGroup(
            panelELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelELayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnBorrar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        /*conecta = new ConexionBD();
        String sqlalta = "INSERT INTO estados VALUES(null, '"+txtDesc.getText()+"')";
        System.out.println(sqlalta);
        try{
            conecta.operacionesAMB(sqlalta);
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        }catch(SQLException ex){
            System.out.println("Error al insertar estado error sql"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro en estados error sql: "+ex.getMessage());
        }
        catch(Exception e){
            System.out.println("Error al insertar estado"+e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro");
        }finally{
            conecta.cerrar();
        }
        panelE.remove(jtEstados);  
        tablaE();
        repaint();
        txtDesc.setText("");*/
        Guardar gua = new Guardar();
        gua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        /*String id = txtDesc.getText();
        String where="";
        if(!"".equals(id)){
            where = "WHERE descripcion = '" + id + "'";
        }
        String sqlconsulta = "SELECT id_estado, descripcion FROM estados "+where;
        conecta = new ConexionBD();
        System.out.println(sqlconsulta);
        res = conecta.consultar(sqlconsulta);
        try{
            while(res.next()){
                txtDesc.setText(res.getString("descripcion"));
            }
        }catch(Exception e){
            System.out.println("Error al buscar estado"+e.getMessage());
            JOptionPane.showMessageDialog(null, "Estado no encontrado");
        }finally{
            conecta.cerrar();
        }*/
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            conecta = new ConexionBD();
            jtEstados.setModel(modelo);
            String sql="SELECT id_estado, descripcion FROM estados WHERE descripcion='"+txtDesc.getText()+"'";
            res = conecta.consultar(sql);
            ResultSetMetaData rsMd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("descripcion");
            
            int []anchos = {20, 150};
            for(int i=0;i<jtEstados.getColumnCount();i++){
                jtEstados.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (res.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = res.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        }catch(SQLException ex){
            System.out.println("error sql tabla libros: "+ex.getMessage());
        }
        catch(Exception e){
            System.out.println("Error al mostrar datos de la tabla de libros: "+e.getMessage());
        }
        finally{
            conecta.cerrar();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        /*conecta = new ConexionBD();
        String sqlactualiza = "UPDATE estados set descripcion='"+txtDesc.getText()+"' where id_estado='"+txtId.getText()+"'";
        System.out.println(sqlactualiza);
        try{
            conecta.operacionesAMB(sqlactualiza);
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            txtDesc.setText("");
        }catch(SQLException ex){
            System.out.println("Error al actualizar estado error sql"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro en estados error sql: "+ex.getMessage());
        }
        catch (Exception e){
            System.out.println("Error al actualizar estado"+e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al actualizar al estado");
        }finally{
            conecta.cerrar();
        }
        panelE.remove(jtEstados);  
        tablaE();
        repaint();*/
        if(!txtId.getText().equals("")){
            Actualizar act = new Actualizar();
            act.setNombre(txtId.getText());
            act.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor seleccione un registro de la tabla");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        conecta = new ConexionBD();
        try{
            String sqldelete = "DELETE FROM estados where id_estado='"+txtId.getText()+"'";
            conecta.operacionesAMB(sqldelete);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            txtId.setText("");
        }catch(SQLException ex){
            System.out.println("Error al borrar estado error sql"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo borrar el registro en estados error sql: "+ex.getMessage());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar al estado");
            System.out.println("Error al eliminar al estado "+e.getMessage());
        }finally{
            conecta.cerrar();
        }
        panelE.remove(jtEstados);  
        tablaE();
        repaint();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        PaginaPrincipalAdministrador prin = new PaginaPrincipalAdministrador();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void jtEstadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEstadosMouseClicked
        // TODO add your handling code here:
        conecta = new ConexionBD();
        ResultSet res;
        try{
            int Fila = jtEstados.getSelectedRow();
            String id = jtEstados.getValueAt(Fila, 0).toString();
            String sqlConsulta = "SELECT id_estado, descripcion FROM estados WHERE id_estado="+Integer.parseInt(id);
            res = conecta.consultar(sqlConsulta);
            while(res.next()){
                txtId.setText(res.getString("id_estado"));
            }
        }catch (Exception e){
            System.out.println("error al cargar datos de la tabla a los campos en los estados: "+e.getMessage());
            
        }finally{
            conecta.cerrar();
        }
    }//GEN-LAST:event_jtEstadosMouseClicked

    void tablaE(){
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            conecta = new ConexionBD();
            jtEstados.setModel(modelo);
            String sql = "SELECT id_estado, descripcion FROM estados ORDER BY id_estado";
            res = conecta.consultar(sql);

            ResultSetMetaData rsMd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Descripcion");
            
            int []anchos = {50, 200};
            for(int i=0;i<jtEstados.getColumnCount();i++){
                jtEstados.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (res.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = res.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        }catch(Exception e){
            System.out.println("Error al mostrar datos en la tabla estados");
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
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
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
                new Estados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtEstados;
    private javax.swing.JPanel panelE;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
