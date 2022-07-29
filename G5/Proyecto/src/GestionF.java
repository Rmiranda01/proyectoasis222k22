/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50231
 */
public class GestionF extends javax.swing.JFrame {

    /**
     * Creates new form GestionF
     */
    public GestionF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Inpelicula = new javax.swing.JMenuItem();
        ICartelera = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Modificar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        eliminarcart = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        BuscarCart = new javax.swing.JMenuItem();
        buscarpeli = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jMenu1.setText("Ingresar");

        Inpelicula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Inpelicula.setText("Pelicula");
        Inpelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpeliculaActionPerformed(evt);
            }
        });
        jMenu1.add(Inpelicula);

        ICartelera.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ICartelera.setText("Cartelera");
        ICartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICarteleraActionPerformed(evt);
            }
        });
        jMenu1.add(ICartelera);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modificar");

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jMenu2.add(Modificar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Eliminar");

        eliminarcart.setText("Eliminar Cartelera");
        eliminarcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarcartActionPerformed(evt);
            }
        });
        jMenu3.add(eliminarcart);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Buscar");

        BuscarCart.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        BuscarCart.setText("Buscar Cartelera");
        BuscarCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCartActionPerformed(evt);
            }
        });
        jMenu4.add(BuscarCart);

        buscarpeli.setText("Buscar Pelicula");
        buscarpeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpeliActionPerformed(evt);
            }
        });
        jMenu4.add(buscarpeli);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InpeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpeliculaActionPerformed
        IngresoPeli form=new IngresoPeli();
        escritorio.add(form);
        form.show();
    }//GEN-LAST:event_InpeliculaActionPerformed

    private void ICarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICarteleraActionPerformed
       IngresoCart form=new IngresoCart();
        escritorio.add(form);
        form.show();
    }//GEN-LAST:event_ICarteleraActionPerformed

    private void BuscarCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCartActionPerformed
        Buscar form=new Buscar();
        escritorio.add(form);
        form.show();
    }//GEN-LAST:event_BuscarCartActionPerformed

    private void buscarpeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpeliActionPerformed
        BuscarPeli form=new BuscarPeli();
        escritorio.add(form);
        form.show();
    }//GEN-LAST:event_buscarpeliActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        ModificarCart form=new ModificarCart();
        escritorio.add(form);
        form.show();
    }//GEN-LAST:event_ModificarActionPerformed

    private void eliminarcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarcartActionPerformed
        BorrarCart form=new BorrarCart();
        escritorio.add(form);
        form.show();
    }//GEN-LAST:event_eliminarcartActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarCart;
    private javax.swing.JMenuItem ICartelera;
    private javax.swing.JMenuItem Inpelicula;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem buscarpeli;
    private javax.swing.JMenuItem eliminarcart;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
