/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoadMapPanel.java
 *
 * Created on May 13, 2010, 9:50:38 PM
 */

package View.BuildMode;

import Model.Map.Map;
import Support.FileSupport;
import Support.IOObject;
import javax.swing.DefaultListModel;

/**
 *
 * @author  Rezan Achmad
 *          13508104
 */
public class LoadMapPanel extends javax.swing.JPanel {

    /** Creates new form LoadMapPanel */
    public LoadMapPanel(BuildMap parent) {
        this.parent = parent;
        initComponents();
        listfile = FileSupport.GetListFile(".", ".map");
        listmodel = new DefaultListModel();
        for (int i=0;i<listfile.length;++i) {
            listmodel.addElement(listfile[i]);
        }
        listFile.setModel(listmodel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listFile = new javax.swing.JList();
        selectButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        listFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(listFile);

        selectButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        selectButton.setText("Select");
        selectButton.setAlignmentY(0.0F);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        String s = (String)listFile.getSelectedValue();
        if (s==null)
            return;
        /* Set Map's name */
        BuildMap par = parent;
        String mapName = new String((String)listFile.getSelectedValue());
        par.SetMapName(mapName);

        /* Load Map */
        Map mapLogic = (Map)IOObject.Load(mapName);
        par.SetMap(mapLogic);

        /* Repaint Map */
        par.paintMap();

        /* Close this windows & enable parent window */
//        parent.getScroll().setVisible(true);
//        parent.getChangeterrainPanel().setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_selectButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JList listFile;
    protected javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables

    private BuildMap parent;
    private String[] listfile;
    private DefaultListModel listmodel;
}
