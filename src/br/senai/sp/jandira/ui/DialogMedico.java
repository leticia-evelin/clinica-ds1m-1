/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class DialogMedico extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
   
    public DialogMedico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        
        // Preencher os campos, se o tipo de operação for ALTERAR
        if(tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        
        }
    }

    private void preencherFormulario() {
        labelTitulo.setText("Médico -" + tipoOperacao);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/list.png")));
        textCodigo.setText(medico.getCodigo().toString());
        textCrm.setText(medico.getCrm());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textEmail.setText(medico.getEmail());
        textDataNascimento.setText(medico.getDataNascimento().toString());
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
        textTelefone = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textCrm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textNomeDoMedico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textDataNascimento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneListaDeEspecialidades = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneEspecialidadesDoMedico = new javax.swing.JTextPane();
        buttonVoltarEspecialidades = new javax.swing.JButton();
        buttonMoverEspecialidades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/list.png"))); // NOI18N
        labelTitulo.setText("  Médico - ADICIONAR");
        jPanel2.add(labelTitulo);
        labelTitulo.setBounds(29, 36, 530, 33);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 650, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Detalhes do(a) médico(a)");
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
        textCodigo.setBounds(20, 72, 95, 25);

        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 60, 16);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(textTelefone);
        textTelefone.setBounds(20, 130, 160, 25);

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

        jLabel1.setText("CRM:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 50, 29, 16);

        textCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCrmActionPerformed(evt);
            }
        });
        jPanel1.add(textCrm);
        textCrm.setBounds(140, 72, 95, 25);

        jLabel5.setText("Nome do(a) médico(a)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 50, 130, 16);
        jPanel1.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(260, 72, 340, 25);

        jLabel6.setText("E-mail:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 110, 50, 16);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel1.add(textEmail);
        textEmail.setBounds(200, 130, 260, 25);

        jLabel7.setText("Data Nascimento:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 110, 110, 16);
        jPanel1.add(textDataNascimento);
        textDataNascimento.setBounds(470, 130, 140, 25);

        jLabel8.setText("Lista de especialidades:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 180, 130, 16);

        jScrollPane1.setViewportView(jTextPaneListaDeEspecialidades);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 210, 140, 130);

        jLabel9.setText("Especialidades do médico:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(260, 180, 150, 16);

        jScrollPane3.setViewportView(jTextPaneEspecialidadesDoMedico);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(260, 210, 140, 130);

        buttonVoltarEspecialidades.setBackground(new java.awt.Color(255, 0, 51));
        buttonVoltarEspecialidades.setFont(new java.awt.Font("Segoe UI Semibold", 1, 28)); // NOI18N
        buttonVoltarEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltarEspecialidades.setText("<");
        buttonVoltarEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        buttonVoltarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarEspecialidadesActionPerformed(evt);
            }
        });
        jPanel1.add(buttonVoltarEspecialidades);
        buttonVoltarEspecialidades.setBounds(185, 280, 40, 40);

        buttonMoverEspecialidades.setBackground(new java.awt.Color(0, 255, 0));
        buttonMoverEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        buttonMoverEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonMoverEspecialidades.setText(">");
        buttonMoverEspecialidades.setToolTipText("");
        buttonMoverEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        buttonMoverEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverEspecialidadesActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMoverEspecialidades);
        buttonMoverEspecialidades.setBounds(185, 225, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 110, 620, 360);

        setBounds(0, 0, 663, 522);
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if(tipoOperacao == TipoOperacao.ADICIONAR) {

            gravar();
        }else{
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCrmActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void buttonMoverEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMoverEspecialidadesActionPerformed

    private void buttonVoltarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarEspecialidadesActionPerformed
   
    private void atualizar() {
        medico.setCrm(textCrm.getText());
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(LocalDate.MIN);
        
        if(validarCadastro()) {
            MedicoDAO.atualizar(medico);
                    
            JOptionPane.showMessageDialog(
                    null,
                    "Médico atualizado com sucesso",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        
    }
    
    private void gravar() {
        Medico medico = new Medico();
        medico.setCrm(textCrm.getText());
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setDataNascimento(LocalDate.MIN);
        
        
        if(validarCadastro()) {
            MedicoDAO.gravar(medico);
            JOptionPane.showMessageDialog(
                    this,
                    "Médico atualizado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }
        
    }
    
    private boolean validarCadastro() {
        
        if(textCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o CRM!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textCrm.requestFocus();
            return false;
        }
        
        if(textNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o nome do(a) médico(a)!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textNomeDoMedico.requestFocus();
            return false;
        }
        
        if(textTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o número do telefone!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textTelefone.requestFocus();
            return false;
        }
        
        if(textEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o e-mail!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textEmail.requestFocus();
            return false;
        }
        
        if(textDataNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha a data de nascimento!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textDataNascimento.requestFocus();
            return false;
        }
        
         return true;
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonMoverEspecialidades;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonVoltarEspecialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPaneEspecialidadesDoMedico;
    private javax.swing.JTextPane jTextPaneListaDeEspecialidades;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
