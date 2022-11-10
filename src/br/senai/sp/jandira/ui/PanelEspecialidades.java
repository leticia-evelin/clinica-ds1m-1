/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelEspecialidades extends javax.swing.JPanel {

    int linha;
    
    public PanelEspecialidades() {
        initComponents();
        criarTabelaEspecialidades();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonAlterarEspecialidades = new javax.swing.JButton();
        buttonAdicionarEspecialidades = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Especialidades");
        add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 24);

        tabelaEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaEspecialidades);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 910, 240);

        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(700, 294, 70, 60);

        buttonAlterarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonAlterarEspecialidades.setToolTipText("Editar especialidade selecionada");
        buttonAlterarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonAlterarEspecialidades);
        buttonAlterarEspecialidades.setBounds(780, 294, 70, 60);

        buttonAdicionarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        buttonAdicionarEspecialidades.setToolTipText("Adicionar especialidades");
        buttonAdicionarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidades);
        buttonAdicionarEspecialidades.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed
        
        // índice da linha selecionada na tabela
        linha = tabelaEspecialidades.getSelectedRow();
        
        // -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja excluir.",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

    private void buttonAdicionarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadesActionPerformed
       
        DialogEspecialidades dialogEspecialidades = 
                (new DialogEspecialidades(
                null,
                true, 
                TipoOperacao.ADICIONAR,
                null));
        dialogEspecialidades.setVisible(true);
        criarTabelaEspecialidades();
    }//GEN-LAST:event_buttonAdicionarEspecialidadesActionPerformed

    private void buttonAlterarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadesActionPerformed
       
        linha = tabelaEspecialidades.getSelectedRow();
        
        if(linha != -1) {
            alterar();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione uma especialidade para alterar.",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarEspecialidadesActionPerformed

    private void alterar() {
        
        Especialidade especialidade = EspecialidadesDAO.getEspecialidade(getCodigo());
        DialogEspecialidades dialogEspecialidades = 
                new DialogEspecialidades(
                null,
                true,
                TipoOperacao.ALTERAR,
                especialidade);
        dialogEspecialidades.setVisible(true);
        criarTabelaEspecialidades();
    }
   
     private void excluir() {
        
         int resposta = JOptionPane.showConfirmDialog(this,
                 "Você confirma a exclusão da especialidade selecionada?",
                 "Especialidade",
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE);
         
         if (resposta == 0) {
             
             EspecialidadesDAO.excluir(getCodigo());
             criarTabelaEspecialidades();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tabelaEspecialidades.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidades;
    private javax.swing.JButton buttonAlterarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEspecialidades;
    // End of variables declaration//GEN-END:variables
 
    private void criarTabelaEspecialidades() {
        tabelaEspecialidades.setModel(EspecialidadesDAO.getTableModel());
    
        
        tabelaEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        // largura das colunas
        tabelaEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(350);
        tabelaEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(350);
        
        // bloquear movimentação das colunas
        tabelaEspecialidades.getTableHeader().setReorderingAllowed(false);
         
        // bloquear edição 
        tabelaEspecialidades.setDefaultEditor(Object.class, null);
    }      
}
