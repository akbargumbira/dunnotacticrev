/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoadMapPanel.java
 *
 * Created on May 13, 2010, 9:50:38 PM
 */

package View;

import Model.Game;
import Support.FileSupport;
import Support.IOObject;
import View.PlayMode.Play;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class LoadGame extends javax.swing.JPanel {

    /** Creates new form LoadMapPanel */
    public LoadGame(JFrame parent) {
        this.parent = parent;
        initComponents();
    }

    public void initListFile(){
        listfile = FileSupport.GetListFile(".", ".game");
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

        listFile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(listFile);

        selectButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectButton.setText("Select");
        selectButton.setAlignmentY(0.0F);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        String s = (String)listFile.getSelectedValue();
        if (s==null)
            return;
        /* Set get game's name */
        MainMenu par = (MainMenu)parent;
        String gameName = new String((String)listFile.getSelectedValue());
        //par.SetMapName(mapName);

        /* Load game */
        Game game = (Game)IOObject.Load(gameName);
        par.setGame(game);

        /* Close this windows & enable parent window */
//        parent.getScroll().setVisible(true);
//        parent.getChangeterrainPanel().setVisible(true);
        this.setVisible(false);

        /* call play window */
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] devices = env.getScreenDevices();
        Play p = new Play(par, devices[0], game.getMap(), game.getVrace(), game);
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

    private JFrame parent;
    private String[] listfile;
    private DefaultListModel listmodel;
}
