/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Play.java
 *
 * Created on May 7, 2010, 7:50:57 PM
 */

package View.PlayMode;

import View.MainMenu;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsDevice;

/**
 *
 * @author user
 */
public class Play2 extends javax.swing.JFrame {

    /** Creates new form Play */
    public Play2(MainMenu parent, GraphicsDevice device) {
        super(device.getDefaultConfiguration());
        this.device = device;
        this.parent = parent; /* Pointed parent Window */
        initComponents();
        ShowWindow();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerpane = new javax.swing.JLayeredPane();
        scrollPane = new javax.swing.JScrollPane();
        mapLayerPane = new javax.swing.JLayeredPane();
        menuPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        info_and_menuPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        barrackButton = new javax.swing.JButton();
        bcButton = new javax.swing.JButton();
        endTurnButton = new javax.swing.JButton();
        surrenderButton = new javax.swing.JButton();
        listPlayerPanel = new javax.swing.JPanel();
        playerComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listcharacterTextArea = new javax.swing.JTextArea();
        listButton = new javax.swing.JButton();
        actioncharacterPanel = new javax.swing.JPanel();
        attackButton = new javax.swing.JButton();
        moveButton = new javax.swing.JButton();
        specialButton = new javax.swing.JButton();
        waitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        upgradecharacterPanel = new javax.swing.JPanel();
        upgradejobButton = new javax.swing.JButton();
        upgradestatusButton = new javax.swing.JButton();
        buildingactionPanel = new javax.swing.JPanel();
        summonCharacterButton = new javax.swing.JButton();
        upgradeBuldingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dunno");
        setResizable(false);

        layerpane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        scrollPane.setViewportView(mapLayerPane);

        scrollPane.setBounds(0, 10, 940, 670);
        layerpane.add(scrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Save Game");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Exit");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        menuPanel.setBounds(0, 0, 256, 46);
        layerpane.add(menuPanel, new Integer(1));

        info_and_menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        info_and_menuPanel.setAlignmentX(0.0F);
        info_and_menuPanel.setAlignmentY(0.0F);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        jScrollPane2.setViewportView(infoTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Build"));

        barrackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        barrackButton.setText("B");

        bcButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bcButton.setText("BC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barrackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcButton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(barrackButton)
                .addComponent(bcButton))
        );

        endTurnButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        endTurnButton.setText("End Turn");

        surrenderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        surrenderButton.setText("Surrender");

        javax.swing.GroupLayout info_and_menuPanelLayout = new javax.swing.GroupLayout(info_and_menuPanel);
        info_and_menuPanel.setLayout(info_and_menuPanelLayout);
        info_and_menuPanelLayout.setHorizontalGroup(
            info_and_menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(info_and_menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_and_menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(endTurnButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(surrenderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        info_and_menuPanelLayout.setVerticalGroup(
            info_and_menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_and_menuPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endTurnButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surrenderButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        info_and_menuPanel.setBounds(10, 360, 182, 306);
        layerpane.add(info_and_menuPanel, new Integer(1));

        listPlayerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        playerComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        playerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerComboBoxActionPerformed(evt);
            }
        });

        listcharacterTextArea.setColumns(20);
        listcharacterTextArea.setRows(5);
        jScrollPane1.setViewportView(listcharacterTextArea);

        listButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listButton.setText("L");

        javax.swing.GroupLayout listPlayerPanelLayout = new javax.swing.GroupLayout(listPlayerPanel);
        listPlayerPanel.setLayout(listPlayerPanelLayout);
        listPlayerPanelLayout.setHorizontalGroup(
            listPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPlayerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 177, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        listPlayerPanelLayout.setVerticalGroup(
            listPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPlayerPanelLayout.createSequentialGroup()
                .addComponent(listButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        listPlayerPanel.setBounds(760, 0, 191, 325);
        layerpane.add(listPlayerPanel, new Integer(1));

        actioncharacterPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        attackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        attackButton.setText("Attack");

        moveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        moveButton.setText("Move");

        specialButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        specialButton.setText("Special");

        waitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        waitButton.setText("Wait");
        waitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");

        javax.swing.GroupLayout actioncharacterPanelLayout = new javax.swing.GroupLayout(actioncharacterPanel);
        actioncharacterPanel.setLayout(actioncharacterPanelLayout);
        actioncharacterPanelLayout.setHorizontalGroup(
            actioncharacterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actioncharacterPanelLayout.createSequentialGroup()
                .addComponent(specialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actioncharacterPanelLayout.createSequentialGroup()
                .addGroup(actioncharacterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actioncharacterPanelLayout.createSequentialGroup()
                .addGroup(actioncharacterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(attackButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        actioncharacterPanelLayout.setVerticalGroup(
            actioncharacterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actioncharacterPanelLayout.createSequentialGroup()
                .addComponent(attackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(moveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specialButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(12, 12, 12))
        );

        actioncharacterPanel.setBounds(830, 490, 121, 181);
        layerpane.add(actioncharacterPanel, new Integer(1));

        upgradecharacterPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        upgradejobButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upgradejobButton.setText("Upgrade Job");
        upgradejobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgradejobButtonActionPerformed(evt);
            }
        });

        upgradestatusButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upgradestatusButton.setText("Upgrade Status");

        javax.swing.GroupLayout upgradecharacterPanelLayout = new javax.swing.GroupLayout(upgradecharacterPanel);
        upgradecharacterPanel.setLayout(upgradecharacterPanelLayout);
        upgradecharacterPanelLayout.setHorizontalGroup(
            upgradecharacterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upgradecharacterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(upgradejobButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(upgradestatusButton, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        upgradecharacterPanelLayout.setVerticalGroup(
            upgradecharacterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upgradecharacterPanelLayout.createSequentialGroup()
                .addComponent(upgradejobButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upgradestatusButton))
        );

        upgradecharacterPanel.setBounds(670, 600, 157, 72);
        layerpane.add(upgradecharacterPanel, new Integer(1));

        buildingactionPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        summonCharacterButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        summonCharacterButton.setText("Summon Character");

        upgradeBuldingButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upgradeBuldingButton.setText("Upgrade Building");

        javax.swing.GroupLayout buildingactionPanelLayout = new javax.swing.GroupLayout(buildingactionPanel);
        buildingactionPanel.setLayout(buildingactionPanelLayout);
        buildingactionPanelLayout.setHorizontalGroup(
            buildingactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upgradeBuldingButton, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
            .addComponent(summonCharacterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buildingactionPanelLayout.setVerticalGroup(
            buildingactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buildingactionPanelLayout.createSequentialGroup()
                .addComponent(summonCharacterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upgradeBuldingButton))
        );

        buildingactionPanel.setBounds(480, 600, 187, 72);
        layerpane.add(buildingactionPanel, new Integer(1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(layerpane, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(layerpane, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void waitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waitButtonActionPerformed

    private void upgradejobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgradejobButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upgradejobButtonActionPerformed

    private void playerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerComboBoxActionPerformed

    private void ShowWindow()
    {
        Container pane = getContentPane();
        int x, y, width, height;
        int border = BORDER_MAIN_LAYER_PANE;
        
        boolean isFullScreen;
        isFullScreen = device.isFullScreenSupported();
        setUndecorated(isFullScreen);
        setResizable(!isFullScreen);

        if (isFullScreen) {
            /* Full-screen mode */
            device.setFullScreenWindow(this);
            validate();
        } else {
            /* Windowed mode */
            pack();
            setVisible(true);
        }

        pane.setBackground(Color.BLACK);

        /* add layerpane to Frame */
        pane.removeAll();
        pane.setLayout(null);
        pane.add(layerpane);
        layerpane.setBounds(border, border, getWidth()-2*border, getHeight()-2*border);

        /* set layerpane's layout to null */
        layerpane.setLayout(null);

        /* set bounds  scrollpane */
        width = layerpane.getWidth();
        height = layerpane.getHeight();
        scrollPane.setBounds(0, 0, width, height);

        /* set bounds menuPanel */
        width = menuPanel.getWidth();
        height = menuPanel.getHeight();
        menuPanel.setBounds(0, 0, width, height);

        /* set bounds listPlayePanel */
        width = listPlayerPanel.getWidth();
        height = listPlayerPanel.getHeight();
        x = layerpane.getWidth()-width;
        y = 0;
        listPlayerPanel.setBounds(x, y, width, height);

        /* set bounds info_and_mainPanel */
        width = info_and_menuPanel.getWidth();
        height = info_and_menuPanel.getHeight();
        x = 0;
        y = layerpane.getHeight()-height;
        info_and_menuPanel.setBounds(x, y, width, height);

        /* set bounds actioncharacterpanel */
        width = actioncharacterPanel.getWidth();
        height = actioncharacterPanel.getHeight();
        x = layerpane.getWidth()- width;
        y = layerpane.getHeight() - height;
        actioncharacterPanel.setBounds(x, y, width, height);

        /* set bounds updgradecharacterpanel */
        width = upgradecharacterPanel.getWidth();
        height = upgradecharacterPanel.getHeight();
        x = actioncharacterPanel.getX() - width;
        y = actioncharacterPanel.getY() - height;

        /* set bounds */
        //width

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actioncharacterPanel;
    private javax.swing.JButton attackButton;
    private javax.swing.JButton barrackButton;
    private javax.swing.JButton bcButton;
    private javax.swing.JPanel buildingactionPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton endTurnButton;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JPanel info_and_menuPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLayeredPane layerpane;
    private javax.swing.JButton listButton;
    private javax.swing.JPanel listPlayerPanel;
    private javax.swing.JTextArea listcharacterTextArea;
    private javax.swing.JLayeredPane mapLayerPane;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton moveButton;
    private javax.swing.JComboBox playerComboBox;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton specialButton;
    private javax.swing.JButton summonCharacterButton;
    private javax.swing.JButton surrenderButton;
    private javax.swing.JButton upgradeBuldingButton;
    private javax.swing.JPanel upgradecharacterPanel;
    private javax.swing.JButton upgradejobButton;
    private javax.swing.JButton upgradestatusButton;
    private javax.swing.JButton waitButton;
    // End of variables declaration//GEN-END:variables
    private GraphicsDevice device;
    private MainMenu parent;
    public static final int BORDER_MAIN_LAYER_PANE = 5;
}
