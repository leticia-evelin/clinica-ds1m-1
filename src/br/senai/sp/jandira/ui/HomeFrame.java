package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        criarTabelaPlanosDeSaude();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelPlanosDeSaude = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonAlterarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.setToolTipText("Sair do sistema");
        getContentPane().add(buttonSair);
        buttonSair.setBounds(845, 100, 110, 60);

        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda32.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(10, 100, 130, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(0, 204, 0));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-card.png"))); // NOI18N
        buttonPlanosDeSaude.setText("Plano de Saúde");
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(620, 100, 170, 60);

        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialidades32.png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(450, 100, 160, 60);

        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick32.png"))); // NOI18N
        buttonPacientes.setText("Paciente");
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(150, 100, 140, 60);

        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor32.png"))); // NOI18N
        buttonMedicos.setText("Médico");
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(300, 100, 140, 60);

        panelPlanosDeSaude.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPlanosDeSaude.setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Planos de saúde");
        panelPlanosDeSaude.add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTablePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        panelPlanosDeSaude.add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(20, 40, 905, 240);

        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde selecionado");
        panelPlanosDeSaude.add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(700, 294, 70, 60);

        buttonAlterarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/caneta.png"))); // NOI18N
        buttonAlterarPlanoDeSaude.setToolTipText("Editar plano de saúde selecionado");
        panelPlanosDeSaude.add(buttonAlterarPlanoDeSaude);
        buttonAlterarPlanoDeSaude.setBounds(780, 294, 70, 60);

        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar plano de saúde");
        panelPlanosDeSaude.add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(860, 294, 70, 60);

        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(10, 180, 945, 370);

        setBounds(0, 0, 983, 601);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonAlterarPlanoDeSaude;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {
        
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());
        
        // Desativar o redimensionamento da JTable
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       
       // Definir a largura de cada coluna
       tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(300);
       tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
       tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(300);
       
       // Impedir/bloquear a movimentação das colunas
       tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);
       
       // Bloquear a edição das células
       tablePlanosDeSaude.setDefaultEditor(Object.class, null);
    }
    
  
}
