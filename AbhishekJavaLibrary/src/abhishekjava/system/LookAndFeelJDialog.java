/*
 * LookAndFeelJDialog.java
 *
 * Created on September 6, 2008, 9:18 PM
 */
package abhishekjava.system;

import java.awt.Component;

/**
 *
 * @author  Abhishek
 */
public class LookAndFeelJDialog extends javax.swing.JDialog {

    private static final long serialVersionUID = -1719565266573162863L;
    java.util.Vector<SupportedLaF> supportedLaFs = LookAndFeels.getLookAndFeels();
    Component[] c;

    /** Creates new form LookAndFeelJDialog
     * @param parent
     * @param modal
     * @param c - components to be upd
     */
    public LookAndFeelJDialog(java.awt.Frame parent, boolean modal, Component... c) {
        super(parent, modal);
        this.c = c;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(343, 108));
        setTitle("Look and Feel");
        initComponents();
        LaFComboBox.setModel(new javax.swing.DefaultComboBoxModel(supportedLaFs));
        LaFComboBox.setEditable(false);
        SelectButton.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                action();
            }
        });
        LaFInfoLabel.setText("Select a Look and Feel, which will set the display type of application");
        SelectButton.setText("Select");
    }

    void action() {
        SupportedLaF supportedLaF = ((SupportedLaF) LaFComboBox.getSelectedItem());
        try {
            LookAndFeels.setLookAndFeel(supportedLaF, this);
            for (int i = 0; i < c.length; i++) {
                LookAndFeels.setLookAndFeel(supportedLaF, c[i]);
            }
            this.pack();
        } catch (javax.swing.UnsupportedLookAndFeelException exc) {
            // This should not happen because we already checked
            ((javax.swing.DefaultComboBoxModel) LaFComboBox.getModel()).removeElement(supportedLaF);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LaFComboBox = new javax.swing.JComboBox();
        LaFInfoLabel = new javax.swing.JLabel();
        SelectButton = new javax.swing.JButton();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LaFInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(LaFComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LaFInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LaFComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        LookAndFeelJDialog LAFD = new LookAndFeelJDialog(null, true);
        LAFD.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox LaFComboBox;
    private javax.swing.JLabel LaFInfoLabel;
    private javax.swing.JButton SelectButton;
    // End of variables declaration//GEN-END:variables
}
