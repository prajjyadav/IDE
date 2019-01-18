/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ide;

/**
 *
 * @author prajjwal-ubuntu
 */
public class FindReplace extends javax.swing.JFrame {

    /**
     * Creates new form FindReplace
     * @param parent
     */
    public FindReplace(MainIDE parent) {
        initComponents();
        setTitle("Find and Replace");
        this.parent=parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnReplace = new javax.swing.JButton();
        txtInputFind = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInputReplace = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();
        btnReplaceAll = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtMessage = new javax.swing.JLabel();

        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Find");

        btnReplace.setText("Replace");
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });

        txtInputFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputFindActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Replace");

        checkBox.setText("  Math case");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        btnReplaceAll.setText("Replace All");
        btnReplaceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceAllActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtMessage.setForeground(new java.awt.Color(255, 0, 0));
        txtMessage.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInputFind, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInputReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBox)
                        .addGap(31, 31, 31)
                        .addComponent(txtMessage))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReplace)
                        .addGap(18, 18, 18)
                        .addComponent(btnReplaceAll)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInputFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInputReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBox)
                    .addComponent(txtMessage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReplace)
                    .addComponent(btnReplaceAll)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(346, 216));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputFindActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:
        caseSensitive=checkBox.isSelected();
    }//GEN-LAST:event_checkBoxActionPerformed

    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed
        // TODO add your handling code here:
        all=false;
        replace();
    }//GEN-LAST:event_btnReplaceActionPerformed

    private void btnReplaceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceAllActionPerformed
        // TODO add your handling code here:
        all=true;
        replace();
    }//GEN-LAST:event_btnReplaceAllActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        end();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void end() {
        this.setVisible(false);
    }
    
    private void replace() {
        String findText = txtInputFind.getText();
        String replaceText = txtInputReplace.getText();
        if (findText.equals("")) {
            txtMessage.setText("Wrong Input !");
            return;
        }
        txtMessage.setText("");
        parent.findText=findText;
        parent.replaceText=replaceText;
        end();
        parent.replace(all,caseSensitive);
    }
    
    private MainIDE parent;
    private boolean caseSensitive;
    private boolean all;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReplace;
    private javax.swing.JButton btnReplaceAll;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtInputFind;
    private javax.swing.JTextField txtInputReplace;
    private javax.swing.JLabel txtMessage;
    // End of variables declaration//GEN-END:variables
}
