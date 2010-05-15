/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewPanel.java
 *
 * Created on May 13, 2010, 11:01:03 PM
 */

package View.BuildMode;

import Model.Map.Map;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author user
 */
public class NewPanel extends javax.swing.JPanel {

    /** Creates new form NewPanel */
    public NewPanel(BuildMap parent) {
        initComponents();

        /* Set default , max, min and step value for spinner */
        heightSpinner.setModel(new SpinnerNumberModel(Map.MIN_HEIGHT, Map.MIN_HEIGHT, Map.MAX_HEIGHT, 1));
        widthSpinner.setModel(new SpinnerNumberModel(Map.MIN_WIDTH, Map.MIN_WIDTH, Map.MAX_WIDTH, 1));

        /* Save parent Object's reference */
        this.parent = parent;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        heightLabel = new javax.swing.JLabel();
        heightSpinner = new javax.swing.JSpinner();
        widthLabel = new javax.swing.JLabel();
        widthSpinner = new javax.swing.JSpinner();

        okButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        heightLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heightLabel.setText("Height : ");

        heightSpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        widthLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        widthLabel.setText("Width  : ");

        widthSpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(heightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(widthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(widthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightLabel)
                            .addComponent(heightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(widthLabel)
                            .addComponent(widthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(okButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        /* Get new Size from Spinner */
        int height = (Integer)heightSpinner.getValue();
        int width = (Integer)widthSpinner.getValue();

        /* Send New Map to parent */
        Map map = new Map(height, width);
        parent.SetMap(map);

        /* Repaint Map */
        parent.paintMap();

        /* Close this windows*/
//        parent.getScroll().setVisible(true);
//        parent.getChangeterrainPanel().setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_okButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heightLabel;
    private javax.swing.JSpinner heightSpinner;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JSpinner widthSpinner;
    // End of variables declaration//GEN-END:variables

    BuildMap parent;
}