/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bibliotecaUsuario;

import bibliotecaAdministrador.Login;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author g
 */
public class PaginaPrincipalUsuario extends javax.swing.JFrame {
   //Login user;
    /**
     * Creates new form PaginaPrincipalUsuario
     */
  /* public PaginaPrincipalUsuario(Login user){
        this.user=user;
    }*/
   private String nombre;
   private String id;
   String use="";
    public void setNombre(String nombre, String id){
        this.nombre=nombre;
        this.id=id;
        lbluser.setText(nombre);
        lblId.setText(id);
    }
    public PaginaPrincipalUsuario() {
        initComponents();
        lblId.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salirPrincipal1 = new javax.swing.JButton();
        lbluser = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Yo = new javax.swing.JMenu();
        miPerfil = new javax.swing.JMenuItem();
        libros = new javax.swing.JMenu();
        consultarLibros = new javax.swing.JMenuItem();
        prestamos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 48)); // NOI18N
        jLabel1.setText("BIENVENIDO(A)");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\g\\Downloads\\Libraries2.jpg")); // NOI18N

        salirPrincipal1.setBackground(new java.awt.Color(255, 51, 51));
        salirPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        salirPrincipal1.setText("SALIR");
        salirPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirPrincipal1ActionPerformed(evt);
            }
        });

        lbluser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(147, 147, 147)
                        .addComponent(salirPrincipal1)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(554, 554, 554)
                .addComponent(salirPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(64, 64, 64))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        Yo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/persona.png"))); // NOI18N
        Yo.setText("Yo");

        miPerfil.setText("Mi perfil");
        miPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerfilActionPerformed(evt);
            }
        });
        Yo.add(miPerfil);

        jMenuBar1.add(Yo);

        libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/books.png"))); // NOI18N
        libros.setText("Libros");

        consultarLibros.setText("Consultar Libros");
        consultarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarLibrosActionPerformed(evt);
            }
        });
        libros.add(consultarLibros);

        prestamos.setText("Mis Prestamos");
        prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosActionPerformed(evt);
            }
        });
        libros.add(prestamos);

        jMenuBar1.add(libros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPrincipal1ActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirPrincipal1ActionPerformed

    private void consultarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarLibrosActionPerformed
        // TODO add your handling code here:
        consultarLibros con = new consultarLibros();
        con.setNombre(nombre, id);
        con.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consultarLibrosActionPerformed

    private void prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosActionPerformed
        // TODO add your handling code here:
        PrestamosUsuario pres = new PrestamosUsuario();
        use = lbluser.getText();
        System.out.println(use);
        pres.setNombre(nombre, id);
        pres.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_prestamosActionPerformed

    private void miPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerfilActionPerformed
        // TODO add your handling code here:
        miPerfil yo = new miPerfil();
        yo.setNombre(id, nombre);
        yo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miPerfilActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PaginaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PaginaPrincipalUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Yo;
    private javax.swing.JMenuItem consultarLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    public javax.swing.JLabel lbluser;
    private javax.swing.JMenu libros;
    private javax.swing.JMenuItem miPerfil;
    private javax.swing.JMenuItem prestamos;
    private javax.swing.JButton salirPrincipal1;
    // End of variables declaration//GEN-END:variables
}
