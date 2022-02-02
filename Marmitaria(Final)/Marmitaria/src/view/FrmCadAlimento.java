
package view;
import model.Alimento;
import dao.DaoAlimentoImp;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import controller.ControllerAlimento;

/**
 *
 * @author Kamila Monaris
 */
public class FrmCadAlimento extends javax.swing.JInternalFrame {
    DaoAlimentoImp dao = new DaoAlimentoImp();
    List<Alimento> alimento = new ArrayList<Alimento>();
    
    
    int id= 0;
    int indice = 0;
    Alimento ali;
     
    public void mostrarDados(){
        txtId.setText(""+alimento.get(indice).getId());
        txtDescricao.setText(alimento.get(indice).getDescricao());
    } 
    public FrmCadAlimento() {
        initComponents();
        txtId.setEnabled(false);
        //alimento = control.atualizarListaAlimento();
        
        if(alimento.isEmpty()){
            JOptionPane.showMessageDialog(null, "não exite alimento cadastrados");
        
        }
        else{
        mostrarDados();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelAlimento = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        PainelAlimento.setBackground(new java.awt.Color(255, 204, 153));
        PainelAlimento.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblTitulo.setText("Cadastrar Alimento");

        lblId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblId.setText("Id:");

        lblDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDescricao.setText("Descrição:");

        txtId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelAlimentoLayout = new javax.swing.GroupLayout(PainelAlimento);
        PainelAlimento.setLayout(PainelAlimentoLayout);
        PainelAlimentoLayout.setHorizontalGroup(
            PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlimentoLayout.createSequentialGroup()
                .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlimentoLayout.createSequentialGroup()
                        .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelAlimentoLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lblDescricao)))
                            .addGroup(PainelAlimentoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnNovo)))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAlimentoLayout.createSequentialGroup()
                        .addComponent(btnPrimeiro)
                        .addGap(18, 18, 18)))
                .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PainelAlimentoLayout.createSequentialGroup()
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 111, Short.MAX_VALUE))
                        .addGroup(PainelAlimentoLayout.createSequentialGroup()
                            .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAnterior)
                                .addComponent(btnSalvar))
                            .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PainelAlimentoLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditar)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnExcluir)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(PainelAlimentoLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProximo)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnUltimo)
                                    .addGap(69, 69, 69)))))
                    .addGroup(PainelAlimentoLayout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PainelAlimentoLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblTitulo)
                .addContainerGap())
        );
        PainelAlimentoLayout.setVerticalGroup(
            PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlimentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiro)
                            .addComponent(btnAnterior)
                            .addComponent(btnProximo)
                            .addComponent(btnUltimo))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAlimentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnSalvar)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir))
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        if(alimento.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existe alimento cadastrados");    
        }
        else{
        indice = 0;
        txtId.setText(""+alimento.get(indice).getId());
        txtDescricao.setText(alimento.get(indice).getDescricao());
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(alimento.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não existe alimento cadastrados");
        }
        else{
            indice--;
        }
        if(indice<0){
            indice++;
            JOptionPane.showMessageDialog(null, "Você já esta no primeiro registro");
        }
        mostrarDados();
        btnProximo.setEnabled(true); 
        
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if(alimento.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não existe alimentos cadastrados");
        }
        else{
            indice++;
        }
        if(indice>alimento.size()-1){
            indice--;
            JOptionPane.showMessageDialog(null, "Você ja esta no ultimo registro");
        }
        mostrarDados();
        
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if(alimento.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existe alimentos cadastrados");    
        }
        else{
        indice=alimento.size()-1;
        mostrarDados();
        btnProximo.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        if(alimento.isEmpty()){
            id = 1;
        }
        else{
            id = alimento.get(alimento.size()-1).getId()+1;
        }
        txtId.setText(""+id);
        txtDescricao.setText("");
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ali = new Alimento();
        ali.setId(Integer.parseInt(txtId.getText()));
        ali.setDescricao(txtDescricao.getText());
        
        dao.SalvarAlimento(ali);
        alimento = dao.getAlimento();
        indice = alimento.size()-1;
        mostrarDados();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       dao.ExcluirAlimento(Integer.parseInt(txtId.getText()));
       if(alimento.isEmpty()){
           txtId.setText(""+id);
           txtDescricao.setText("");
       }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         dao.ExcluirAlimento(id);
         mostrarDados();
        
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAlimento;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
