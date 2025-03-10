/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bibliotecaAdministrador.Devolucion;
import bibliotecaAdministrador.ConexionBD;
import bibliotecaAdministrador.PaginaPrincipalAdministrador;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author g
 */
public class Devoluciones extends javax.swing.JFrame {

    /**
     * Creates new form Devoluciones
     */
    ConexionBD conecta, con;
    ResultSet res, res1;
    String libroAntiguo;
    public Devoluciones() {
        initComponents();
        tablaD();
        txtIdDevolucion.setVisible(false);
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

        panelD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDevoluciones = new javax.swing.JTable();
        btnDevolver = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtIdDevolucion = new javax.swing.JTextField();
        btnBuscarDevolucion = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DEVOLUCIONES DE LIBROS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("No.Control Usuario");

        jtDevoluciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtDevoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDevolucionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDevoluciones);

        btnDevolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnDevolver.setText("NUEVO");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
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

        btnBuscarDevolucion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnBuscarDevolucion.setText("BUSCAR");
        btnBuscarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDevolucionActionPerformed(evt);
            }
        });

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDLayout = new javax.swing.GroupLayout(panelD);
        panelD.setLayout(panelDLayout);
        panelDLayout.setHorizontalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDLayout.createSequentialGroup()
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(txtIdDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(panelDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGap(0, 187, Short.MAX_VALUE)
                        .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDLayout.createSequentialGroup()
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnBuscarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDLayout.createSequentialGroup()
                        .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        panelDLayout.setVerticalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDLayout.createSequentialGroup()
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelDLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addComponent(btnBuscarDevolucion)))
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtIdDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnBorrar)
                    .addComponent(btnDevolver))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        // TODO add your handling code here:
        //conecta = new ConexionBD();
        /*if(!txtUsuario.getText().equals("") && !txtLibro.getText().equals("")){
            //conecta = new ConexionBD();
            conecta = new ConexionBD();
            ResultSet res, resIds;
            //String sqlConsulta="SELECT p.* FROM prestamos p, usuarios u, libros l, estados e WHERE l.titulo='"+txtLibro.getText()+"' and p.id_usuario=u.id_usuario and p.id_libro=l.id_libro and CONCAT(u.nombre,' ',u.ap,' ',u.am)='"+txtUsuario.getText()+"' and p.id_estado=e.id_estado and e.descripcion='Activo'";
            //String sqlConsulta="SELECT p.* FROM prestamos p, usuarios u, copias c, estados e WHERE c.id_copia=(SELECT id_copia from copias where c.codigo_copia='"+txtLibro.getText()+"') and p.id_usuario=u.id_usuario and p.id_copia=c.id_copia and u.id_usuario='"+Integer.parseInt(txtUsuario.getText())+"' and p.id_estado=e.id_estado and e.descripcion='Activo'";
            //String sqlConsulta="SELECT p.id_prestamo FROM prestamos p, usuarios u, copias c, estados e WHERE c.codigo_copia='"+txtLibro.getText()+"' and p.id_usuario=u.id_usuario and p.id_copia=c.id_copia and u.id_usuario='"+Integer.parseInt(txtUsuario.getText())+"' and p.id_estado=e.id_estado and e.descripcion='Activo'";
            String sqlConsulta="SELECT p.id_prestamo\n" +
"FROM prestamos p\n" +
"INNER JOIN usuarios u ON p.id_usuario = u.id_usuario\n" +
"INNER JOIN copias c ON p.id_copia = c.id_copia\n" +
"INNER JOIN estados e ON p.id_estado = e.id_estado\n" +
"WHERE c.codigo_copia = '"+txtLibro.getText()+"' AND u.id_usuario = '"+txtUsuario.getText()+"' AND e.descripcion = 'Activo';";
            System.out.println(sqlConsulta);
            res=conecta.consultar(sqlConsulta);
            try {
                if(res.next()){
                    String idUsuario="", idCopia="", sqlIds="";
                    sqlIds="SELECT u.id_usuario, c.id_copia from usuarios u, copias c where u.id_usuario='"+Integer.parseInt(txtUsuario.getText())+"' and c.codigo_copia='"+txtLibro.getText()+"'";
                    resIds=conecta.consultar(sqlIds);
                    while(resIds.next()){
                        idUsuario=resIds.getString("id_usuario");
                        idCopia=resIds.getString("id_copia");
                    }
                    //String sqlAlta="INSERT INTO devoluciones VALUES(null, "+Integer.parseInt(idUsuario)+", "+Integer.parseInt(idLibro)+", now())";
                    //String sqlUpdate="UPDATE prestamos SET id_estado=(SELECT id_estado FROM estados where descripcion='Finalizado') where id_usuario="+Integer.parseInt(idUsuario)+" and id_libro="+Integer.parseInt(idLibro);
                    //System.out.println(sqlAlta);
                    //conecta.operacionesAMB(sqlAlta);
                    realizarDevolucion(Integer.parseInt(idUsuario), Integer.parseInt(idCopia));
                    //conecta.operacionesAMB(sqlUpdate);
                    JOptionPane.showMessageDialog(null, "Devolucion exitosa");
                    panelD.remove(jtDevoluciones);
                    tablaD();
                    repaint();
                }
                else{
                    JOptionPane.showMessageDialog(null, "No puedes devolver el libro porque no tienes un prestamo con ese libro");
                    txtUsuario.setText("");
                    txtLibro.setText("");
                }
            }catch(SQLException ex){
                System.out.println("Error al insertar devolucion en sqlexception"+ex.getMessage());
                JOptionPane.showMessageDialog(null, "No se pudo realizar el registro en devoluciones error sql: "+ex.getMessage());
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo devolver el libro");
                System.out.println("No se pudo devolver el libro: "+e.getMessage());
            }finally{
                conecta.cerrar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor llena los campos");
        }*/
        /*if(!txtUsuario.getText().equals("") && !txtLibro.getText().equals("")){
            conecta = new ConexionBD();
            String sqlConsulta="SELECT p.id_prestamo, c.id_copia\n" +
            "FROM prestamos p\n" +
            "INNER JOIN usuarios u ON p.id_usuario = u.id_usuario\n" +
            "INNER JOIN copias c ON p.id_copia = c.id_copia\n" +
            "INNER JOIN estados e ON p.id_estado = e.id_estado\n" +
            "WHERE c.codigo_copia = '"+txtLibro.getText()+"' AND u.id_usuario = '"+txtUsuario.getText()+"' AND e.descripcion = 'Activo';";
            res = conecta.consultar(sqlConsulta);
            System.out.println(sqlConsulta);
            try {
                if(res.next()){
                    int idCopia=res.getInt("id_copia");
                    int idUser=Integer.parseInt(txtUsuario.getText());
                    realizarDevolucion(idUser, idCopia);
                    JOptionPane.showMessageDialog(null, "Devolución Exitosa");
                }else{
                    JOptionPane.showMessageDialog(null, "No puedes devolver el libro ya que no tienes un prestamo con ese libro");
                }
            } catch (Exception e) {
            }
        }*/
        Guardar2 gu = new Guardar2();
        gu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void jtDevolucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDevolucionesMouseClicked
        // TODO add your handling code here:
        conecta = new ConexionBD();
        ResultSet res;
        try {
            int Fila = jtDevoluciones.getSelectedRow();
            String id = jtDevoluciones.getValueAt(Fila, 0).toString();
            //String sqlConsulta="SELECT d.id_devolucion, u.id_usuario, CONCAT(u.nombre,' ',u.ap,' ',u.am) as nombre, u.telefono, l.titulo, c.codigo_copia FROM devoluciones d inner join usuarios u on d.id_usuario=u.id_usuario inner join copias c on d.id_copia=c.id_copia inner join libros l on c.id_libro=l.id_libro where id_devolucion="+Integer.parseInt(id);
            String sqlConsulta="SELECT id_devolucion FROM devoluciones WHERE id_devolucion="+Integer.parseInt(id);
            res = conecta.consultar(sqlConsulta);
            while(res.next()){
                txtIdDevolucion.setText(res.getString("id_devolucion"));
                //txtUsuario.setText(res.getString("id_usuario"));
            }
            //libroAntiguo=txtLibro.getText();
        } catch (Exception e) {
            System.out.println("error al cargar datos de la tabla a los campos en las devoluciones: "+e.getMessage());
        }finally{
             conecta.cerrar();
        }
    }//GEN-LAST:event_jtDevolucionesMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if(!txtIdDevolucion.getText().equals("") && !txtUsuario.getText().equals("")){
            conecta= new ConexionBD();
            try{
                String sqlDelete="DELETE FROM devoluciones where id_devolucion="+Integer.parseInt(txtIdDevolucion.getText());
                conecta.operacionesAMB(sqlDelete);
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                txtUsuario.setText("");
                txtIdDevolucion.setText("");
            }catch(SQLException ex){
                System.out.println("Error al borrar devolucion error sql"+ex.getMessage());
                JOptionPane.showMessageDialog(null, "No se pudo borrar el registro en devoluciones error sql: "+ex.getMessage());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al intentar eliminar el registro");
                System.out.println("error al eliminar registro de devoluciones: "+e.getMessage());
            }finally{
                conecta.cerrar();
            }
            panelD.remove(jtDevoluciones);
            tablaD();
            repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Por favor selecciona un registro de la tabla");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        PaginaPrincipalAdministrador prin = new PaginaPrincipalAdministrador();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDevolucionActionPerformed
        // TODO add your handling code here:
        if(!txtUsuario.getText().equals("")){
            DefaultTableModel modelo = new DefaultTableModel();
            conecta = new ConexionBD();
            jtDevoluciones.setModel(modelo);
             String sql = "SELECT d.id_devolucion, CONCAT(u.nombre,' ',u.ap,' ',u.am) AS usuario, l.titulo, d.fecha FROM devoluciones d INNER JOIN usuarios u ON d.id_usuario=u.id_usuario INNER JOIN libros l ON d.id_libro=l.id_libro WHERE u.id_usuario='"+Integer.parseInt(txtUsuario.getText())+"' GROUP BY d.id_devolucion;";
            res = conecta.consultar(sql);
            try {
                    ResultSetMetaData rsMd = (ResultSetMetaData) res.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();

                    modelo.addColumn("ID");
                    modelo.addColumn("Usuario");
                    modelo.addColumn("Titulo");
                    modelo.addColumn("Fecha");
                    int[] anchos = {50, 200,100,80};
                    for (int i = 0; i < jtDevoluciones.getColumnCount(); i++) {
                        jtDevoluciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                    }

                    while (res.next()) {
                        Object[] filas = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                            filas[i] = res.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se encontro ningun registro");
            }finally{
                
            } 
        }
    }//GEN-LAST:event_btnBuscarDevolucionActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    /**
     * @param args the command line arguments
     */
    void tablaD(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            conecta = new ConexionBD();
            jtDevoluciones.setModel(modelo);
            //String sql = "SELECT d.id_devolucion, CONCAT(u.nombre,' ',u.ap,' ',u.am) AS usuario, l.titulo, d.fecha FROM devoluciones d INNER JOIN usuarios u ON d.id_usuario=u.id_usuario INNER JOIN libros l ON d.id_libro=l.id_libro GROUP BY d.id_devolucion;";
            String sql="SELECT d.id_devolucion, CONCAT(u.nombre,' ',u.ap,' ',u.am) AS usuario, l.titulo, c.codigo_copia, d.fecha FROM devoluciones d INNER JOIN usuarios u ON d.id_usuario=u.id_usuario INNER JOIN copias c ON d.id_copia=c.id_copia INNER JOIN libros l ON c.id_libro=l.id_libro GROUP BY d.id_devolucion;";
            res = conecta.consultar(sql);
            
            ResultSetMetaData rsMd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Usuario");
            modelo.addColumn("Libro");
            modelo.addColumn("codigo_copia");
            modelo.addColumn("Fecha de Devolución");
            
            int []anchos = {50, 200,100, 100,80};
            for(int i=0;i<jtDevoluciones.getColumnCount();i++){
                jtDevoluciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (res.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = res.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar datos en la tabla devoluciones: "+e.getMessage());
        }finally{
            conecta.cerrar();
        }
    }
    /*public void realizarDevolucion(int idUsuario, int idCopia) {
        try {
            conecta = new ConexionBD();
            CallableStatement cs = conecta.conn.prepareCall("{call RegistrarDevolucion(?, ?, ?)}");
            cs.setInt(1, idUsuario);
            cs.setInt(2, idCopia);
            cs.registerOutParameter(3, Types.VARCHAR);

            // Ejecutar el procedimiento almacenado
            cs.execute();

            // Obtener el mensaje de la devolución
            String mensaje = cs.getString(3);
            //System.out.println("Mensaje: " + mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            cs.close();
        }catch(SQLException ex){
            System.out.println("Error al insertar devolucion error sql"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro en devoluciones error sql: "+ex.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error al realizar la devolución: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Eror al realizar devolucion.");
        }
        finally{
            conecta.cerrar();
        }
    }*/
    
    public void realizarDevolucion(int idUsuario, int idCopia) {
        try {
            conecta = new ConexionBD();
            CallableStatement cs = conecta.conn.prepareCall("{call devolucion(?, ?, ?)}");
            cs.setInt(1, idUsuario);
            cs.setInt(2, idCopia);
            cs.registerOutParameter(3, Types.VARCHAR);

            // Ejecutar el procedimiento almacenado
            cs.execute();

            // Obtener el mensaje de la devolución
            String mensaje = cs.getString(3);
            //System.out.println("Mensaje: " + mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            cs.close();
        }catch(SQLException ex){
            System.out.println("Error al insertar devolucion error sql"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro en devoluciones error sql: "+ex.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error al realizar la devolución: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Eror al realizar devolucion.");
        }
        /*finally{
            conecta.cerrar();
        }*/
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Devoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscarDevolucion;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtDevoluciones;
    private javax.swing.JPanel panelD;
    private javax.swing.JTextField txtIdDevolucion;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
