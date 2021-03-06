/*
 * LookAndFeelJDialog.java
 *
 * Created on September 6, 2008, 9:18 PM
 */
package abhishekjava.swing.LookandFeel;

import java.awt.Component;
import javax.swing.JFrame;

/**
 *
 * @author  Abhishek
 */
public class LookAndFeelJDialog extends javax.swing.JDialog {

	 private static final long serialVersionUID = -1719565266573162863L;
	 private java.util.Vector<LookAndFeel> supportedLaFs = LookAndFeel.getLookAndFeels();
	 boolean changeOnSelect;
	 Component[] c;

	 /** Creates new form LookAndFeelJDialog
	  * @param parent
	  * @param modal
	  * @param changeOnSelect
	  * @param c - components to be upd
	  */
	 public LookAndFeelJDialog(java.awt.Frame parent, boolean modal, boolean changeOnSelect, Component... c) {
			super(parent, modal);
			this.changeOnSelect = changeOnSelect;
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
			if (changeOnSelect) {
				 SelectButton.setVisible(false);
			} else {
				 SelectButton.setText("Select");
			}
	 }

	 private void LaFComboBoxAction() {
			LookAndFeel supportedLaF = ((LookAndFeel) LaFComboBox.getSelectedItem());
			try {
				 LookAndFeel.setLookAndFeel(supportedLaF, this);
			} catch (javax.swing.UnsupportedLookAndFeelException exc) {
				 // This should not happen because we already checked
				 ((javax.swing.DefaultComboBoxModel) LaFComboBox.getModel()).removeElement(supportedLaF);
			}
			if (changeOnSelect) {
				 action();
			}
	 }

	 void action() {
			LookAndFeel supportedLaF = ((LookAndFeel) LaFComboBox.getSelectedItem());
			try {
				 for (int i = 0; i < c.length; i++) {
						LookAndFeel.setLookAndFeel(supportedLaF, c[i]);
				 }
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

      LaFComboBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            LaFComboBoxActionPerformed(evt);
         }
      });

      LaFInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
               .addComponent(LaFInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
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

		private void LaFComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaFComboBoxActionPerformed
			 LaFComboBoxAction();
		}//GEN-LAST:event_LaFComboBoxActionPerformed

	 public static void main(String[] args) {
			abhishekjava.system.Data.SystemInfoJDialog dialog = new abhishekjava.system.Data.SystemInfoJDialog(new java.awt.Frame());
			dialog.addWindowListener(new java.awt.event.WindowAdapter() {

				 @Override
				 public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
				 }
			});
			dialog.setVisible(true);
			LookAndFeelJDialog LAFD = new LookAndFeelJDialog(null, true, true, dialog);
			LAFD.setVisible(true);
//			System.
	 }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox LaFComboBox;
   private javax.swing.JLabel LaFInfoLabel;
   private javax.swing.JButton SelectButton;
   // End of variables declaration//GEN-END:variables
}
