/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.telas;

import br.com.sistema.dal.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Rafael Di Bonito
 */
public class TelaRelatorioCbo extends javax.swing.JInternalFrame {

    // Usando variavel conexão do dal
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    // Usando a classe ExportarRelatorios e criando a váriavel excel
    ExportarRelatorios excel;
    
    /**
     * Creates new form TelaRelatorioCbo
     */
    public TelaRelatorioCbo() {
        initComponents();
        conexao = ModuloConexao.conector();
        listarCbo(); // Chama o método listarCbo()
    }
    
    // Criando o método de listar dados do Mysql
    private void listarCbo() {
        String sql = "select * From cbo order by setor ";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela cbo
            tabelaCbo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCbo = new javax.swing.JTable();
        txtCboId = new javax.swing.JLabel();
        btnGerarExcel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Relatório CBO");
        setPreferredSize(new java.awt.Dimension(690, 650));

        tabelaCbo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabelaCbo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SETOR", "NÚMERO CBO", "FUNÇÃO CBO", "FUNÇÃO EMPRESA"
            }
        ));
        tabelaCbo.setFocusable(false);
        tabelaCbo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaCbo);

        txtCboId.setForeground(new java.awt.Color(240, 240, 240));

        btnGerarExcel.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnGerarExcel.setForeground(new java.awt.Color(0, 102, 204));
        btnGerarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/icones/iconExcel.png"))); // NOI18N
        btnGerarExcel.setText("Gerar Relatório");
        btnGerarExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGerarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarExcelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Funções CBO x Funções Empresa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtCboId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGerarExcel)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtCboId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(btnGerarExcel)
                .addGap(15, 15, 15))
        );

        setBounds(0, 0, 830, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarExcelActionPerformed

        try {
            // Chama a classe ExportarRelatorios
            excel = new ExportarRelatorios();
            // Chama o método exportarExcel que se encontrar na classe ExportarRelatorios
            excel.exportarExcel(tabelaCbo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnGerarExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCbo;
    private javax.swing.JLabel txtCboId;
    // End of variables declaration//GEN-END:variables
}
