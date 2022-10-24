/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class DialogEspecialidades extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;
    
    public DialogEspecialidades(
            java.awt.Frame parent, 
            boolean modal,
            TipoOperacao tipoOperacao,
            Especialidade especialidade) {
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;
        
        
         // Preencher os campos, se o tipo de operação for ALTERAR
        if(tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    
    private void preencherFormulario() {
        labelTitulo.setText("Especialidades -" + tipoOperacao);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/list.png")));
        textCodigo.setText(especialidade.getCodigo().toString());
        textNomeDaEspecialidade.setText(especialidade.getNome());
        textDescricaoDaEspecialidade.setText(especialidade.getDescricao());
       
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
        textNomeDaEspecialidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textDescricaoDaEspecialidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/list.png"))); // NOI18N
        labelTitulo.setText("  Especialidades - ADICIONAR");
        jPanel2.add(labelTitulo);
        labelTitulo.setBounds(29, 36, 530, 33);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 650, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Detalhes da Especialidade");
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

        jLabel4.setText("Nome da Especialidade:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 180, 16);

        textNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel1.add(textNomeDaEspecialidade);
        textNomeDaEspecialidade.setBounds(20, 130, 580, 30);

        jLabel6.setText("Descrição da Especialidade");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 170, 210, 16);
        jPanel1.add(textDescricaoDaEspecialidade);
        textDescricaoDaEspecialidade.setBounds(20, 190, 580, 30);

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

    private void textNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDaEspecialidadeActionPerformed

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

    private void atualizar() {
        
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricaoDaEspecialidade.getText());
        
        if(validarCadastro()) {
            EspecialidadesDAO.atualizar(especialidade);
                    
            JOptionPane.showMessageDialog(
                    null,
                    "Especialidade atualizada com sucesso",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    
    private void gravar() {
        // objeto especialidade
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricaoDaEspecialidade.getText());
        
        if(validarCadastro()) {
            EspecialidadesDAO.gravar(especialidade);
            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade atualizada com sucesso!",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }
    }   
 
    
    private boolean validarCadastro() {
       
        if(textNomeDaEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o nome da especialidade!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            
            textNomeDaEspecialidade.requestFocus();
            return false;
        }
        
        if(textDescricaoDaEspecialidade.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha a descrição da especialidade!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            
            textDescricaoDaEspecialidade.requestFocus();
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
    private javax.swing.JTextField textDescricaoDaEspecialidade;
    private javax.swing.JTextField textNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
