/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.JobsController;
import dao.DaoJobManagement;
import dao.InterfaceJobManagement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.EntityJob;

/**
 *
 * @author amry4
 */
public class JobsView extends javax.swing.JFrame {

    JobsController Jct;
    List<EntityJob> ListJob;
    InterfaceJobManagement IntrfcJM;
      boolean isClicked = true;
    /**
     * Creates new form JobsManager
     */
    public JobsView() {
        initComponents();
        Jct = new JobsController(this);
        IntrfcJM = new DaoJobManagement();
        ListJob = IntrfcJM.getALL();
        bindingTable(TblJob);
        
    }
    private boolean IsEmptyField() {
        return TxtJobId.getText().trim().equals("");
    }
     public void refresh() {
        clearTable(TblJob);
        bindingTable(TblJob);
        TxtJobId.setText("");
        TxtJobTitle.setText("");
        TxtMinSal.setText("");
        TxtMaxSal.setText("");
        TxtJobId.setEditable(true);
        isClicked = true;
    }
      public void clearTable(JTable table) {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
    }
      public void bindingTable(JTable tabel) {
        ListJob = IntrfcJM.getALL();
        String[] tblHeader = new String[]{"id", "Title", "Min Salary","Max Salary"};
        DefaultTableModel dtm = new DefaultTableModel(null, tblHeader);
        tabel.getModel();
        Object[] row;
        row = new Object[ListJob.size()];
        while (dtm.getRowCount() < ListJob.size()) {
            row[0] = ListJob.get(dtm.getRowCount()).getId();
            row[1] = ListJob.get(dtm.getRowCount()).getTitle();
            row[2] = ListJob.get(dtm.getRowCount()).getMinSalary();
            row[3] = ListJob.get(dtm.getRowCount()).getMaxSalary();
            dtm.addRow(row);
        }
        TblJob.setModel(dtm);

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
        TblJob = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnInsertJob = new javax.swing.JButton();
        btnDeleteJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtJobId = new javax.swing.JTextField();
        TxtJobTitle = new javax.swing.JTextField();
        TxtMinSal = new javax.swing.JTextField();
        TxtMaxSal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TblJob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Id", "Job Title", "Min Salary", "Max Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblJobMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblJob);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnInsertJob.setBackground(new java.awt.Color(51, 204, 255));
        btnInsertJob.setText("SAVE");
        btnInsertJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertJobActionPerformed(evt);
            }
        });

        btnDeleteJob.setBackground(new java.awt.Color(255, 51, 51));
        btnDeleteJob.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteJob.setText("DELETE");
        btnDeleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteJobActionPerformed(evt);
            }
        });

        jLabel1.setText("Job Id");

        jLabel2.setText("Job Title");

        jLabel3.setText("Min Salary");

        jLabel4.setText("Max Salary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertJob, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnDeleteJob, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtMinSal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(TxtMaxSal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(TxtMinSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMaxSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteJob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertJob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("JOBS MANAGEMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel5)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertJobActionPerformed
         if (IsEmptyField()) {
            JOptionPane.showMessageDialog(rootPane, "fill id");
        } else {

            JOptionPane.showMessageDialog(rootPane, Jct.Save(TxtJobId.getText(),
                    TxtJobTitle.getText(), TxtMinSal.getText() , TxtMaxSal.getText(),
                    isClicked));
        }
        refresh();
    }//GEN-LAST:event_btnInsertJobActionPerformed

    private void btnDeleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteJobActionPerformed
       if (!IsEmptyField()) {
            int result = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete this data?", null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, Jct.delete(TxtJobId.getText()));
                refresh();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "fill id");
        }
        bindingTable(TblJob);
    }//GEN-LAST:event_btnDeleteJobActionPerformed

    private void TblJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblJobMouseClicked
     DefaultTableModel dm = (DefaultTableModel) TblJob.getModel();
        int row = TblJob.getSelectedRow();
        TxtJobId.setText(dm.getValueAt(row, 0).toString());
        TxtJobTitle.setText(dm.getValueAt(row, 1).toString());
        TxtMinSal.setText(dm.getValueAt(row, 2).toString());
        TxtMaxSal.setText(dm.getValueAt(row, 3).toString());
        TxtJobId.setEditable(false);
        isClicked = false;
    }//GEN-LAST:event_TblJobMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JobsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JobsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JobsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JobsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JobsView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblJob;
    private javax.swing.JTextField TxtJobId;
    private javax.swing.JTextField TxtJobTitle;
    private javax.swing.JTextField TxtMaxSal;
    private javax.swing.JTextField TxtMinSal;
    private javax.swing.JButton btnDeleteJob;
    private javax.swing.JButton btnInsertJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTable getjTblJob() {
        return TblJob;
    }

    public javax.swing.JTextField getjTxtJobId() {
        return TxtJobId;
    }

    public javax.swing.JTextField getjTxtJobTitle() {
        return TxtJobTitle;
    }

    public javax.swing.JTextField getjTxtMaxSal() {
        return TxtMaxSal;
    }

    public javax.swing.JTextField getjTxtMinSal() {
        return TxtMinSal;
    }

}
