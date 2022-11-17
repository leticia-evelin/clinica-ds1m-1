/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelMedicos extends javax.swing.JPanel {

    int linha;
    
    public PanelMedicos() {
        initComponents();
        criarTabelaMedicos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonAlterarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setLayout(null);

        tabelaMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaMedico);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 910, 240);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Médicos");
        add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 24);

        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir médico selecionado");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(700, 294, 70, 60);

        buttonAlterarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonAlterarMedico.setToolTipText("Editar médico selecionado");
        buttonAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarMedicoActionPerformed(evt);
            }
        });
        add(buttonAlterarMedico);
        buttonAlterarMedico.setBounds(780, 294, 70, 60);

        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar médicos");
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed

        // índice da linha selecionada na tabela
        linha = tabelaMedico.getSelectedRow();

        // -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione o médico que você deseja excluir.",
                "Médico",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void buttonAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarMedicoActionPerformed

        linha = tabelaMedico.getSelectedRow();

        if(linha != -1) {
            alterar();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione um médico para alterar.",
                "Médico",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarMedicoActionPerformed

    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed
       
        DialogMedico dialogMedico = new DialogMedico(
                null, 
                true, 
                TipoOperacao.ADICIONAR,
                null);
        dialogMedico.setVisible(true);
        criarTabelaMedicos();
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed

    private void alterar() {
        
        Medico medico = MedicoDAO.getMedico(getCodigo());
        DialogMedico dialogMedico = new DialogMedico(
                null,
                true,
                TipoOperacao.ALTERAR,
                medico);
        dialogMedico.setVisible(true);
        criarTabelaMedicos();
        
    }

    private void excluir() {
        
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão do médico selecionado?",
                "Médico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == 0) {
            
            MedicoDAO.excluir(getCodigo());
            criarTabelaMedicos();
        }
    }
    
    private Integer getCodigo() {
        String codigoStr = tabelaMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonAlterarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMedico;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaMedicos() {
        tabelaMedico.setModel(MedicoDAO.getTableModel());
        
        tabelaMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tabelaMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaMedico.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelaMedico.getColumnModel().getColumn(2).setPreferredWidth(450);
        
        
        // bloquear movimentação das colunas
        tabelaMedico.getTableHeader().setReorderingAllowed(false);
        
        // bloquear edição
        tabelaMedico.setDefaultEditor(Object.class, null);   
    }
}
