/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        desktop = new javax.swing.JDesktopPane();
        lblData = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnLogoff = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        menFun = new javax.swing.JMenu();
        menuRh = new javax.swing.JMenu();
        subMenuRhFun = new javax.swing.JMenu();
        subMenuRhCad = new javax.swing.JMenuItem();
        subMenuRhVisu = new javax.swing.JMenuItem();
        subMenuRhEdit = new javax.swing.JMenuItem();
        subMenuRhExc = new javax.swing.JMenuItem();
        subMenuRhCbo = new javax.swing.JMenu();
        subMenuRhCadCbo = new javax.swing.JMenuItem();
        subMenuRhVisuCbo = new javax.swing.JMenuItem();
        subMenuRhEditCbo = new javax.swing.JMenuItem();
        subMenuRhExcCbo = new javax.swing.JMenuItem();
        subMenuRhRel = new javax.swing.JMenu();
        subMenuRhRelFun = new javax.swing.JMenuItem();
        subMenuRhRelCbo = new javax.swing.JMenuItem();
        menuSegTrab = new javax.swing.JMenu();
        subMenuSegTrabEpi = new javax.swing.JMenu();
        menuAlmox = new javax.swing.JMenu();
        subMenuAlmoxEstoque = new javax.swing.JMenu();
        menuEngenharia = new javax.swing.JMenu();
        subMenuEngenhariaPcp = new javax.swing.JMenu();
        menuSistema = new javax.swing.JMenu();
        menuSistemaUser = new javax.swing.JMenuItem();
        menAjda = new javax.swing.JMenu();
        menAjdaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setBackground(new java.awt.Color(204, 204, 204));
        desktop.setPreferredSize(new java.awt.Dimension(690, 650));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        lblData.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblData.setText("Data");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/icones/logoff.png"))); // NOI18N
        btnLogoff.setToolTipText("Sair");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        Menu.setPreferredSize(new java.awt.Dimension(491, 40));

        menFun.setText("Módulos");
        menFun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuRh.setText("Recursos Humanos");
        menuRh.setEnabled(false);
        menuRh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuRhFun.setText("Funcionários");
        subMenuRhFun.setEnabled(false);
        subMenuRhFun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuRhCad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        subMenuRhCad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhCad.setText("Cadastrar");
        subMenuRhCad.setEnabled(false);
        subMenuRhCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhCadActionPerformed(evt);
            }
        });
        subMenuRhFun.add(subMenuRhCad);

        subMenuRhVisu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        subMenuRhVisu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhVisu.setText("Visualizar");
        subMenuRhVisu.setEnabled(false);
        subMenuRhVisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhVisuActionPerformed(evt);
            }
        });
        subMenuRhFun.add(subMenuRhVisu);

        subMenuRhEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        subMenuRhEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhEdit.setText("Editar");
        subMenuRhEdit.setEnabled(false);
        subMenuRhEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhEditActionPerformed(evt);
            }
        });
        subMenuRhFun.add(subMenuRhEdit);

        subMenuRhExc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        subMenuRhExc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhExc.setText("Excluir");
        subMenuRhExc.setEnabled(false);
        subMenuRhExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhExcActionPerformed(evt);
            }
        });
        subMenuRhFun.add(subMenuRhExc);

        menuRh.add(subMenuRhFun);

        subMenuRhCbo.setText("Função Empresa x Função CBO");
        subMenuRhCbo.setEnabled(false);
        subMenuRhCbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuRhCadCbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhCadCbo.setText("Cadastrar");
        subMenuRhCadCbo.setEnabled(false);
        subMenuRhCadCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhCadCboActionPerformed(evt);
            }
        });
        subMenuRhCbo.add(subMenuRhCadCbo);

        subMenuRhVisuCbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhVisuCbo.setText("Visualizar");
        subMenuRhVisuCbo.setEnabled(false);
        subMenuRhVisuCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhVisuCboActionPerformed(evt);
            }
        });
        subMenuRhCbo.add(subMenuRhVisuCbo);

        subMenuRhEditCbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhEditCbo.setText("Editar");
        subMenuRhEditCbo.setEnabled(false);
        subMenuRhEditCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhEditCboActionPerformed(evt);
            }
        });
        subMenuRhCbo.add(subMenuRhEditCbo);

        subMenuRhExcCbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhExcCbo.setText("Excluir");
        subMenuRhExcCbo.setEnabled(false);
        subMenuRhExcCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhExcCboActionPerformed(evt);
            }
        });
        subMenuRhCbo.add(subMenuRhExcCbo);

        menuRh.add(subMenuRhCbo);

        subMenuRhRel.setText("Relatórios");
        subMenuRhRel.setEnabled(false);
        subMenuRhRel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuRhRelFun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        subMenuRhRelFun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhRelFun.setText("Relatório Funcionários");
        subMenuRhRelFun.setEnabled(false);
        subMenuRhRelFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhRelFunActionPerformed(evt);
            }
        });
        subMenuRhRel.add(subMenuRhRelFun);

        subMenuRhRelCbo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        subMenuRhRelCbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuRhRelCbo.setText("Relatório Funções  Krebs x CBO");
        subMenuRhRelCbo.setEnabled(false);
        subMenuRhRelCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRhRelCboActionPerformed(evt);
            }
        });
        subMenuRhRel.add(subMenuRhRelCbo);

        menuRh.add(subMenuRhRel);

        menFun.add(menuRh);

        menuSegTrab.setText("Segurança do Trabalho");
        menuSegTrab.setEnabled(false);
        menuSegTrab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuSegTrabEpi.setText("EPI's");
        subMenuSegTrabEpi.setEnabled(false);
        subMenuSegTrabEpi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuSegTrab.add(subMenuSegTrabEpi);

        menFun.add(menuSegTrab);

        menuAlmox.setText("Almoxarifado");
        menuAlmox.setEnabled(false);
        menuAlmox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuAlmoxEstoque.setText("Estoque");
        subMenuAlmoxEstoque.setEnabled(false);
        subMenuAlmoxEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAlmox.add(subMenuAlmoxEstoque);

        menFun.add(menuAlmox);

        menuEngenharia.setText("Engenharia");
        menuEngenharia.setEnabled(false);
        menuEngenharia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuEngenhariaPcp.setText("PCP");
        subMenuEngenhariaPcp.setEnabled(false);
        subMenuEngenhariaPcp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuEngenharia.add(subMenuEngenhariaPcp);

        menFun.add(menuEngenharia);

        Menu.add(menFun);

        menuSistema.setText("Sistema");
        menuSistema.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuSistemaUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuSistemaUser.setText("Usuários do Sistema");
        menuSistemaUser.setEnabled(false);
        menuSistemaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSistemaUserActionPerformed(evt);
            }
        });
        menuSistema.add(menuSistemaUser);

        Menu.add(menuSistema);

        menAjda.setText("Ajuda");
        menAjda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menAjdaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menAjdaSobre.setText("Sobre");
        menAjdaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjdaSobreActionPerformed(evt);
            }
        });
        menAjda.add(menAjdaSobre);

        Menu.add(menAjda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btnLogoff)
                    .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogoff)
                .addGap(18, 18, 18)
                .addComponent(lblData)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addContainerGap(537, Short.MAX_VALUE))
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuRhCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhCadActionPerformed
        // Chamando a TelaCadastroFuncionario
        TelaCadastroFuncionario cadastrofun = new TelaCadastroFuncionario();
        cadastrofun.setVisible(true);
        desktop.add(cadastrofun);
    }//GEN-LAST:event_subMenuRhCadActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // As linhas abaixo substituem a label lblData pela data do sistema
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);// formata a data
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void subMenuRhEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhEditActionPerformed
        // Chama a TelaEditarFuncionario
        TelaEditarFuncionario editfun = new TelaEditarFuncionario();
        editfun.setVisible(true);
        desktop.add(editfun);
    }//GEN-LAST:event_subMenuRhEditActionPerformed

    private void menuSistemaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSistemaUserActionPerformed
        // Chama o Form TelaUsuario dentro do Desktop Pane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menuSistemaUserActionPerformed

    private void subMenuRhVisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhVisuActionPerformed
        // Chama a TelaVisualizarFuncionario
        TelaVisualizarFuncionario verfun = new TelaVisualizarFuncionario();
        verfun.setVisible(true);
        desktop.add(verfun);
    }//GEN-LAST:event_subMenuRhVisuActionPerformed

    private void subMenuRhExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhExcActionPerformed
        // Chama a TelaExcluirFuncionario
        TelaExcluirFuncionario excfun = new TelaExcluirFuncionario();
        excfun.setVisible(true);
        desktop.add(excfun);
    }//GEN-LAST:event_subMenuRhExcActionPerformed

    private void subMenuRhCadCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhCadCboActionPerformed
        // Chamando a TelaCadastroCbo
        TelaCadastroCbo cbo = new TelaCadastroCbo();
        cbo.setVisible(true);
        desktop.add(cbo);
    }//GEN-LAST:event_subMenuRhCadCboActionPerformed

    private void menAjdaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjdaSobreActionPerformed
        // Chamando a TelaSobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menAjdaSobreActionPerformed

    private void subMenuRhRelCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhRelCboActionPerformed
        // Chamando a TelaRelatorioCbo
        TelaRelatorioCbo relcbo = new TelaRelatorioCbo();
        relcbo.setVisible(true);
        desktop.add(relcbo);
    }//GEN-LAST:event_subMenuRhRelCboActionPerformed

    private void subMenuRhRelFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhRelFunActionPerformed
        // Chamando a TelaRelatorioFuncionarios
        TelaRelatorioFuncionarios relfun = new TelaRelatorioFuncionarios();
        relfun.setVisible(true);
        desktop.add(relfun);
    }//GEN-LAST:event_subMenuRhRelFunActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        // Exibe uma caixa de diálogo perguntando se deseja fechar o programa
        int sair = JOptionPane.showConfirmDialog(null, "Deseja fazer Logoff ?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            // Chama a TelaLogin
            TelaLogin logoff = new TelaLogin();
            logoff.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void subMenuRhEditCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhEditCboActionPerformed
        // Chamando a TelaEditarCbo
        TelaEditarCbo editcbo = new TelaEditarCbo();
        editcbo.setVisible(true);
        desktop.add(editcbo);
    }//GEN-LAST:event_subMenuRhEditCboActionPerformed

    private void subMenuRhVisuCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhVisuCboActionPerformed
        // Chamando a TelaVisualizarCbo
        TelaVisualizarCbo vercbo = new TelaVisualizarCbo();
        vercbo.setVisible(true);
        desktop.add(vercbo);
    }//GEN-LAST:event_subMenuRhVisuCboActionPerformed

    private void subMenuRhExcCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRhExcCboActionPerformed
        // Chamando a TelaExcluirCbo
        TelaExcluirCbo exccbo = new TelaExcluirCbo();
        exccbo.setVisible(true);
        desktop.add(exccbo);
    }//GEN-LAST:event_subMenuRhExcCboActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menAjda;
    private javax.swing.JMenuItem menAjdaSobre;
    private javax.swing.JMenu menFun;
    public static javax.swing.JMenu menuAlmox;
    public static javax.swing.JMenu menuEngenharia;
    public static javax.swing.JMenu menuRh;
    public static javax.swing.JMenu menuSegTrab;
    private javax.swing.JMenu menuSistema;
    public static javax.swing.JMenuItem menuSistemaUser;
    public static javax.swing.JMenu subMenuAlmoxEstoque;
    public static javax.swing.JMenu subMenuEngenhariaPcp;
    public static javax.swing.JMenuItem subMenuRhCad;
    public static javax.swing.JMenuItem subMenuRhCadCbo;
    public static javax.swing.JMenu subMenuRhCbo;
    public static javax.swing.JMenuItem subMenuRhEdit;
    public static javax.swing.JMenuItem subMenuRhEditCbo;
    public static javax.swing.JMenuItem subMenuRhExc;
    public static javax.swing.JMenuItem subMenuRhExcCbo;
    public static javax.swing.JMenu subMenuRhFun;
    public static javax.swing.JMenu subMenuRhRel;
    public static javax.swing.JMenuItem subMenuRhRelCbo;
    public static javax.swing.JMenuItem subMenuRhRelFun;
    public static javax.swing.JMenuItem subMenuRhVisu;
    public static javax.swing.JMenuItem subMenuRhVisuCbo;
    public static javax.swing.JMenu subMenuSegTrabEpi;
    // End of variables declaration//GEN-END:variables
}
