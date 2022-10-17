/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;


public class DialogPlanosDeSaude extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;
    
    public DialogPlanosDeSaude(
            java.awt.Frame parent, 
            boolean modal, 
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;
        
        // Preencher os campos, caso o tip ode operação for ALTERAR
        if(tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {
        labelTitulo.setText("Planos de Saúde -" + tipoOperacao);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png")));
        textCodigo.setText(planoDeSaude.getCodigo().toString());
        textNomeDaOperadora.setText(planoDeSaude.getOperadora());
        textTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNomeDaOperadora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTipoDoPlano = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        labelTitulo.setText("  Planos de Saúde - ADICIONAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 650, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Detalhes do Plano de Saúde");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 190, 20);

        jLabel3.setText("Código:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 50, 70, 16);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(textCodigo);
        textCodigo.setBounds(20, 72, 90, 30);

        jLabel4.setText("Nome da operadora:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 130, 16);

        textNomeDaOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDaOperadoraActionPerformed(evt);
            }
        });
        jPanel1.add(textNomeDaOperadora);
        textNomeDaOperadora.setBounds(20, 130, 580, 30);

        jLabel6.setText("Tipo do Plano:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 170, 110, 16);
        jPanel1.add(textTipoDoPlano);
        textTipoDoPlano.setBounds(20, 190, 580, 30);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/floppy-disk.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalvar);
        buttonSalvar.setBounds(530, 290, 70, 60);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Deletar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancelar);
        buttonCancelar.setBounds(450, 290, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 110, 620, 360);

        setBounds(0, 0, 663, 522);
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
        
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textNomeDaOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDaOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDaOperadoraActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
      
        if(tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        }else{
            atualizar(); 
        }
        
     
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void atualizar() {
        
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        JOptionPane.showMessageDialog(null,
                "Plano de Saúde atualizado com sucesso",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void gravar() {
        // Criar um objeto Plano de Sáude
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());
        
        if(validarCadastro()){
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(this,
                    "Plano de Saúde gravado com sucesso!", 
                    "Plano de Saúde", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }
    }
    
    private boolean validarCadastro() {
        
    if (textNomeDaOperadora.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Por favor preencha o nome da operadora!", 
                "Plano de Saúde", 
                JOptionPane.ERROR_MESSAGE);
        
        textNomeDaOperadora.requestFocus();
        
    return false;
    }
    
    if (textTipoDoPlano.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, 
                "Por favor preencha o tipo do plano!", 
                "Plano de Saúde", 
                JOptionPane.ERROR_MESSAGE);
        
        textTipoDoPlano.requestFocus();
        
        return false;
    }
    
    return true;
    
}     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textNomeDaOperadora;
    private javax.swing.JTextField textTipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
