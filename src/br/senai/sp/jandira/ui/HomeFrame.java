package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import java.io.IOException;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() throws IOException {
        initComponents();
        PlanoDeSaudeDAO.getListaPlanosDeSaude(); // Plano de saúde
        EspecialidadesDAO.getListaEspecialidades(); // Especialidades
        MedicoDAO.getListaDeMedicos(); // Médicos
        initPanels();
        
    }
    
    // Atributos da classe
    PanelPlanosDeSaude panelPlanosDeSaude;
    PanelEspecialidades panelEspecialidades;
    PanelMedicos panelMedicos;
    
    // Constantes da classe
    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 180;
    private final int POSICAO_LARGURA = 945;
    private final int POSICAO_ALTURA = 370;
   

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
        panelHome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendar (2).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setBackground(new java.awt.Color(204, 204, 204));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(845, 100, 80, 60);

        buttonAgenda.setBackground(new java.awt.Color(204, 204, 204));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendar (1).png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(90, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(204, 204, 204));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-card.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(450, 100, 80, 60);

        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/list.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(360, 100, 80, 60);

        buttonPacientes.setBackground(new java.awt.Color(204, 204, 204));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/patient.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(180, 100, 80, 60);

        buttonMedicos.setBackground(new java.awt.Color(204, 204, 204));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medical-team (1).png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(270, 100, 80, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("SISACON");
        panelHome.add(jLabel4);
        jLabel4.setBounds(10, 60, 600, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel3);
        jLabel3.setBounds(10, 110, 340, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Dados para contato:");
        panelHome.add(jLabel5);
        jLabel5.setBounds(10, 210, 180, 25);

        jLabel6.setText("E-mail suporte@sisacon.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(10, 250, 190, 16);

        jLabel7.setText("Telefone (11) 95555-5555");
        panelHome.add(jLabel7);
        jLabel7.setBounds(10, 270, 160, 16);

        jLabel8.setText("Site www.sisacon.com.br");
        panelHome.add(jLabel8);
        jLabel8.setBounds(10, 290, 180, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 180, 950, 370);

        buttonHome.setBackground(new java.awt.Color(204, 204, 204));
        buttonHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/house.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 100, 60, 60);

        setBounds(0, 0, 985, 601);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
         panelHome.setVisible(false);
         panelMedicos.setVisible(true);
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed
        panelHome.setVisible(false);
        panelPlanosDeSaude.setVisible(true);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(153,255,153));
        buttonHome.setBackground(new java.awt.Color(204,204,204));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(153,255,153));
        buttonEspecialidades.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(true);
        buttonEspecialidades.setBackground(new java.awt.Color(153,255,153));
        buttonHome.setBackground(new java.awt.Color(204,204,204));
        buttonEspecialidades.setBackground(new java.awt.Color(153,255,153));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelHome.setVisible(true);
        panelPlanosDeSaude.setVisible(false);
        buttonHome.setBackground(new java.awt.Color(153,255,153));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(204,204,204));
        buttonEspecialidades.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
       dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        // painel planos de saúde
        panelPlanosDeSaude = new PanelPlanosDeSaude();
        panelPlanosDeSaude.setBounds(
                POSICAO_X, 
                POSICAO_Y, 
                POSICAO_LARGURA, 
                POSICAO_ALTURA);
        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setVisible(false);
        
        // painel especialidades
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POSICAO_X,
                POSICAO_Y,
                POSICAO_LARGURA,
                POSICAO_ALTURA);
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        // painel médicos
        panelMedicos = new PanelMedicos();
        panelMedicos.setBounds(
                POSICAO_X,
                POSICAO_Y,
                POSICAO_LARGURA,
                POSICAO_ALTURA);
        getContentPane().add(panelMedicos);
        panelMedicos.setVisible(false);
        
        
    }

    
  
}
