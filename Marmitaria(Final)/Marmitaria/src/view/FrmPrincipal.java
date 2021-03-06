
package view;
import java.util.logging.Logger;
import java.io.IOException;
/**
 *
 * @author Kamila Monaris
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    public FrmPrincipal(int status){
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        if(status ==1){
        //menuAdUsuario.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        itemMenuCadPedido = new javax.swing.JMenuItem();
        itemMenuCadAlimento = new javax.swing.JMenuItem();
        itemMenuCadBebida = new javax.swing.JMenuItem();
        itemMenuCadUsuario = new javax.swing.JMenuItem();
        menuUtilidade = new javax.swing.JMenu();
        menuCalculadora = new javax.swing.JMenuItem();
        menuBlocoDeNotas = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        menuCadastrar.setText("Cadastrar");

        itemMenuCadPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuCadPedido.setForeground(new java.awt.Color(255, 51, 0));
        itemMenuCadPedido.setText("Pedido");
        itemMenuCadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadPedidoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuCadPedido);

        itemMenuCadAlimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuCadAlimento.setForeground(new java.awt.Color(255, 51, 0));
        itemMenuCadAlimento.setText("Alimento");
        itemMenuCadAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadAlimentoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuCadAlimento);

        itemMenuCadBebida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuCadBebida.setForeground(new java.awt.Color(255, 51, 0));
        itemMenuCadBebida.setText("Bebida");
        itemMenuCadBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadBebidaActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuCadBebida);

        itemMenuCadUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuCadUsuario.setBackground(new java.awt.Color(244, 244, 244));
        itemMenuCadUsuario.setForeground(new java.awt.Color(255, 51, 0));
        itemMenuCadUsuario.setText("Usu??rio");
        itemMenuCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadUsuarioActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuCadUsuario);

        menuPrincipal.add(menuCadastrar);

        menuUtilidade.setText("Utilidade");

        menuCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuCalculadora.setForeground(new java.awt.Color(255, 51, 0));
        menuCalculadora.setText("Calculadora");
        menuCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalculadoraActionPerformed(evt);
            }
        });
        menuUtilidade.add(menuCalculadora);

        menuBlocoDeNotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuBlocoDeNotas.setForeground(new java.awt.Color(255, 51, 0));
        menuBlocoDeNotas.setText("Bloco de notas");
        menuBlocoDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBlocoDeNotasActionPerformed(evt);
            }
        });
        menuUtilidade.add(menuBlocoDeNotas);

        menuPrincipal.add(menuUtilidade);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuPrincipal.add(menuSair);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadUsuarioActionPerformed
       FrmCadUsuario cadpedi = new FrmCadUsuario();
       Desktop.add(cadpedi);
       cadpedi.setVisible(true);
    }//GEN-LAST:event_itemMenuCadUsuarioActionPerformed

    private void itemMenuCadAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadAlimentoActionPerformed
       FrmCadAlimento cadpedi = new FrmCadAlimento();
       Desktop.add(cadpedi);
       cadpedi.setVisible(true);
    }//GEN-LAST:event_itemMenuCadAlimentoActionPerformed

    private void itemMenuCadBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadBebidaActionPerformed
       FrmCadBebida cadpedi = new FrmCadBebida();
       Desktop.add(cadpedi);
       cadpedi.setVisible(true);
    }//GEN-LAST:event_itemMenuCadBebidaActionPerformed

    private void itemMenuCadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadPedidoActionPerformed
        FrmCadPedido cadpedi = new FrmCadPedido();
        Desktop.add(cadpedi);
        cadpedi.setVisible(true);
    }//GEN-LAST:event_itemMenuCadPedidoActionPerformed

    private void menuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalculadoraActionPerformed
        Runtime run=Runtime.getRuntime();
        try{
        Process pro=run.exec("c:\\Windows\\System32\\calc.exe");
        } catch(Exception e){
        Logger.getLogger("Erro, tente de novo!!");
        }
    }//GEN-LAST:event_menuCalculadoraActionPerformed

    private void menuBlocoDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBlocoDeNotasActionPerformed
         Runtime run=Runtime.getRuntime();
        try{
        Process pro=run.exec("c:\\Windows\\System32\\Notepad.exe");
        } catch(Exception e){
        Logger.getLogger("Erro, tente de novo!!");
        }
    }//GEN-LAST:event_menuBlocoDeNotasActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
         System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem itemMenuCadAlimento;
    private javax.swing.JMenuItem itemMenuCadBebida;
    private javax.swing.JMenuItem itemMenuCadPedido;
    private javax.swing.JMenuItem itemMenuCadUsuario;
    private javax.swing.JMenuItem menuBlocoDeNotas;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuCalculadora;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuUtilidade;
    // End of variables declaration//GEN-END:variables
}
