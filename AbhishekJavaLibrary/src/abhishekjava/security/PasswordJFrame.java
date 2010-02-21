/*
 * PasswordJFrame.java
 *
 * Created on August 29, 2008, 10:35 PM
 */
package abhishekjava.security;

import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Control;
import javax.sound.sampled.Control.Type;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;

/**
 *
 * @author  Abhishek
 */
public class PasswordJFrame extends javax.swing.JFrame {

	 private static final long serialVersionUID = 4131426524620330388L;
	 private static boolean UserAccess = false;
	 private static boolean PassAccess = false;
	 private static boolean AdvUserAccess = false;
	 private static boolean AdvPassAccess = false;
	 private static String Username;
	 private static String Password;
	 private static String AdvUsername;
	 private static String AdvPassword;
	 javax.swing.KeyStroke AccKeyStr = javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0);
	 PasswordJDialogActionInterface GoButtonActionInterface;
	 PasswordJDialogActionInterface AdvavceSettingActionInterface;
	 ImageIcon KeySymbol = new javax.swing.ImageIcon(getClass().getResource("Key Symbol.png"));
	 ImageIcon LockSymbolInactive = new javax.swing.ImageIcon(getClass().getResource("Main_img5[1].png"));
	 ImageIcon LockSymbolActive = new javax.swing.ImageIcon(getClass().getResource("Main_img5[1]large.png"));
	 ImageIcon GoSymbolInactive = new javax.swing.ImageIcon(getClass().getResource("05[1].jpg"));
	 ImageIcon GoSymbolActive = new javax.swing.ImageIcon(getClass().getResource("05a[1].jpg"));
	 // <editor-fold defaultstate="collapsed" desc="InputVerifier InpVeri">
	 boolean first = true;
	 javax.swing.InputVerifier InpVeri = new javax.swing.InputVerifier() {

			@Override
			public boolean verify(javax.swing.JComponent input) {
				 char[] passc = PassPasswordField.getPassword();
				 String passs = "";
				 for (int i = 0; i < passc.length; i++) {
						passs += passc[i];
				 }
				 if (UserTextField.getText().equals(Username)) {
						UserErrorLabel.setForeground(new java.awt.Color(0, 255, 0));
						UserErrorLabel.setText("Correct Username");
						UserAccess = true;
						AdvUserAccess = false;
				 } else if (UserTextField.getText().equals(AdvUsername)) {
						UserErrorLabel.setForeground(new java.awt.Color(0, 255, 0));
						UserErrorLabel.setText("Correct Username");
						UserAccess = false;
						AdvUserAccess = true;
				 } else if (UserTextField.getText().equals("")) {
						UserErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						UserAccess = false;
						AdvUserAccess = false;
						if (first) {
							 UserErrorLabel.setText("");
							 first = false;
						} else {
							 UserErrorLabel.setText("Empty Username Field");
						}
				 } else {
						UserErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						UserErrorLabel.setText("Incorrect Username");
						UserAccess = false;
						AdvUserAccess = false;
				 }
				 if (passs.equals(Password)) {
						PassErrorLabel.setForeground(new java.awt.Color(0, 255, 0));
						PassErrorLabel.setText("Correct Password");
						PassAccess = true;
						AdvPassAccess = false;
				 } else if (passs.equals(AdvPassword)) {
						PassErrorLabel.setForeground(new java.awt.Color(0, 255, 0));
						PassErrorLabel.setText("Correct Password");
						PassAccess = false;
						AdvPassAccess = true;
				 } else if (passs.equals("")) {
						PassErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						PassAccess = false;
						AdvPassAccess = false;
						if (first) {
							 PassErrorLabel.setText("");
							 first = false;
						} else {
							 PassErrorLabel.setText("Empty Password Field");
						}
				 } else {
						PassErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						PassErrorLabel.setText("Incorrect Password");
						PassAccess = false;
						AdvPassAccess = false;
				 }
				 return true;
			}
	 };
	 // </editor-fold>

	 /**
	  * Creates new form PasswordJFrame and sets action to be performed by its button
	  */
	 public PasswordJFrame() {
			init();
	 }

	 /**
	  * Creates new form PasswordJFrame and sets action to be performed by its button
	  * @param goactioninterface
	  * @param advsttactioninterface
	  */
	 public PasswordJFrame(PasswordJDialogActionInterface goactioninterface, PasswordJDialogActionInterface advsttactioninterface) {
			Username = goactioninterface.getUsername();
			Password = goactioninterface.getPassword();
			GoButtonActionInterface = goactioninterface;
			AdvUsername = advsttactioninterface.getUsername();
			AdvPassword = advsttactioninterface.getPassword();
			AdvavceSettingActionInterface = advsttactioninterface;
			init();
	 }

	 public void init() {
			initComponents();
			setTitle("Enter Password");
			setResizable(false);
			setAlwaysOnTop(true);
			setIconImage(KeySymbol.getImage());
			java.awt.Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((dim.width - 500) / 2, (dim.height - 330) / 2);
			GoButton.setIcon(GoSymbolInactive);
			AdvSettButton.setIcon(LockSymbolInactive);
			GoButton.addMouseListener(new java.awt.event.MouseAdapter() {

				 @Override
				 public void mouseClicked(java.awt.event.MouseEvent e) {
						GoButtonActionPerformed();
				 }

				 @Override
				 public void mousePressed(java.awt.event.MouseEvent e) {
				 }

				 @Override
				 public void mouseEntered(java.awt.event.MouseEvent e) {
						GoButton.setIcon(GoSymbolActive);
				 }

				 @Override
				 public void mouseExited(java.awt.event.MouseEvent e) {
						GoButton.setIcon(GoSymbolInactive);
				 }

				 @Override
				 public void mouseMoved(java.awt.event.MouseEvent e) {
						// <editor-fold defaultstate="collapsed" desc="GoClip...">
						javax.sound.sampled.Clip GoClip = new Clip() {

							 public void open(AudioFormat format, byte[] data, int offset, int bufferSize) throws LineUnavailableException {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void open(AudioInputStream stream) throws LineUnavailableException, java.io.IOException {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public int getFrameLength() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public long getMicrosecondLength() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void setFramePosition(int frames) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void setMicrosecondPosition(long microseconds) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void setLoopPoints(int start, int end) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void loop(int count) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void drain() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void flush() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void start() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void stop() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public boolean isRunning() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public boolean isActive() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public AudioFormat getFormat() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public int getBufferSize() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public int available() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public int getFramePosition() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public long getLongFramePosition() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public long getMicrosecondPosition() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public float getLevel() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public Info getLineInfo() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void open() throws LineUnavailableException {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void close() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public boolean isOpen() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public Control[] getControls() {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public boolean isControlSupported(Type control) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public Control getControl(Type control) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void addLineListener(LineListener listener) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }

							 public void removeLineListener(LineListener listener) {
									throw new UnsupportedOperationException("Not supported yet.");
							 }
						};
						GoClip.start();
						if (!GoClip.isRunning()) {
							 GoClip.stop();
						}
						// </editor-fold>
				 }
			});
			AdvSettButton.addMouseListener(new java.awt.event.MouseAdapter() {

				 @Override
				 public void mouseClicked(java.awt.event.MouseEvent e) {
						AdvSettActionPerformed();
				 }

				 @Override
				 public void mousePressed(java.awt.event.MouseEvent e) {
				 }

				 @Override
				 public void mouseReleased(java.awt.event.MouseEvent e) {
				 }

				 @Override
				 public void mouseEntered(java.awt.event.MouseEvent e) {
						AdvSettButton.setIcon(LockSymbolActive);
				 }

				 @Override
				 public void mouseExited(java.awt.event.MouseEvent e) {
						AdvSettButton.setIcon(LockSymbolInactive);
				 }

				 @Override
				 public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
				 }

				 @Override
				 public void mouseDragged(java.awt.event.MouseEvent e) {
				 }

				 @Override
				 public void mouseMoved(java.awt.event.MouseEvent e) {
				 }
			});
			PassPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {

				 @Override
				 public void keyTyped(java.awt.event.KeyEvent evt) {
						System.out.println("OKt");
						if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
							 GoButtonActionPerformed();
						}
				 }
			});
	 }

	 public void setAction(PasswordJDialogActionInterface goactioninterface) {
			Username = goactioninterface.getUsername();
			Password = goactioninterface.getPassword();
			GoButtonActionInterface = goactioninterface;
	 }

	 public void setAdvSttAction(PasswordJDialogActionInterface advsttactioninterface) {
			AdvUsername = advsttactioninterface.getUsername();
			AdvPassword = advsttactioninterface.getPassword();
			AdvavceSettingActionInterface = advsttactioninterface;
	 }

	 public static void main(String[] args) throws IOException {
			java.awt.EventQueue.invokeLater(new Runnable() {

				 public void run() {
						PasswordJFrame dialog = new PasswordJFrame(
										new abhishekjava.security.PasswordJDialogActionInterface() {

											 boolean state = true;

											 public void ActionToBePerformed() {
													System.out.println("go pressed");
											 }

											 public void setEnabled(boolean b) {
													state = b;
											 }

											 public boolean isEnabled() {
													return state;
											 }

											 public String getUsername() {
													return "abhishekmunie";
											 }

											 public String getPassword() {
													return "pass";
											 }

											 public int DefaultCloseOperation() {
													return javax.swing.JFrame.EXIT_ON_CLOSE;
											 }
										},
										new abhishekjava.security.PasswordJDialogActionInterface() {

											 boolean state = true;

											 public void ActionToBePerformed() {
													System.out.println("advsett pressed");
											 }

											 public void setEnabled(boolean b) {
													state = b;
											 }

											 public boolean isEnabled() {
													return state;
											 }

											 public String getUsername() {
													return "Abhishek Munie";
											 }

											 public String getPassword() {
													return "AuthPass";
											 }

											 public int DefaultCloseOperation() {
													return javax.swing.JFrame.EXIT_ON_CLOSE;
											 }
										});
						dialog.addWindowListener(new java.awt.event.WindowAdapter() {

							 @Override
							 public void windowClosing(java.awt.event.WindowEvent e) {
									System.exit(0);
							 }
						});
						dialog.setVisible(true);
				 }
			});
	 }

	 /** This method is called from within the constructor to
	  * initialize the form.
	  * WARNING: Do NOT modify this code. The content of this method is
	  * always regenerated by the Form Editor.
	  */
	 @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      AdvSettButton = new javax.swing.JButton();
      UserErrorLabel = new javax.swing.JLabel();
      UserLabel = new javax.swing.JLabel();
      UserTextField = new javax.swing.JTextField();
      PassErrorLabel = new javax.swing.JLabel();
      PassPasswordField = new javax.swing.JPasswordField();
      PassLabel = new javax.swing.JLabel();
      ErrorLabel = new javax.swing.JLabel();
      GoButton = new javax.swing.JButton();

      AdvSettButton.setName("AdvSettButton"); // NOI18N

      UserErrorLabel.setFont(new java.awt.Font("Elephant", 1, 12));
      UserErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
      UserErrorLabel.setName("UserErrorLabel"); // NOI18N

      UserLabel.setFont(new java.awt.Font("Modern No. 20", 1, 12));
      UserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      UserLabel.setText("Username:"); // NOI18N
      UserLabel.setName("UserLabel"); // NOI18N

      UserTextField.setFont(new java.awt.Font("Times New Roman", 0, 12));
      UserTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      UserTextField.setInputVerifier(InpVeri);
      UserTextField.setName("UserTextField"); // NOI18N

      PassErrorLabel.setFont(new java.awt.Font("Elephant", 1, 12));
      PassErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
      PassErrorLabel.setName("PassErrorLabel"); // NOI18N

      PassPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 12));
      PassPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      PassPasswordField.setInputVerifier(InpVeri);
      PassPasswordField.setName("PassPasswordField"); // NOI18N

      PassLabel.setFont(new java.awt.Font("Modern No. 20", 1, 12));
      PassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      PassLabel.setText("Password:"); // NOI18N
      PassLabel.setName("PassLabel"); // NOI18N

      ErrorLabel.setFont(new java.awt.Font("Elephant", 1, 12));
      ErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
      ErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      ErrorLabel.setName("ErrorLabel"); // NOI18N

      GoButton.setName("GoButton"); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
               .addComponent(ErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(PassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                  .addGap(10, 10, 10)
                  .addComponent(PassPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
               .addComponent(PassErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                  .addGap(10, 10, 10)
                  .addComponent(UserTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
               .addComponent(UserErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
               .addComponent(AdvSettButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(GoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(AdvSettButton, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(UserErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(UserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(PassErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
               .addComponent(PassPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
               .addComponent(PassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(GoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {PassLabel, PassPasswordField, UserLabel, UserTextField});

      pack();
   }// </editor-fold>//GEN-END:initComponents
	 // <editor-fold defaultstate="collapsed" desc="java.awt.Color[] AccessGrantedColor">
	 final java.awt.Color[] AccessGrantedColor = {new java.awt.Color(0, 0, 0),
			new java.awt.Color(6, 0, 0),
			new java.awt.Color(18, 0, 0),
			new java.awt.Color(19, 0, 0),
			new java.awt.Color(92, 0, 0),
			new java.awt.Color(106, 0, 0),
			new java.awt.Color(118, 0, 0),
			new java.awt.Color(119, 0, 0),
			new java.awt.Color(192, 0, 0),
			new java.awt.Color(255, 0, 0),
			new java.awt.Color(255, 6, 0),
			new java.awt.Color(255, 18, 0),
			new java.awt.Color(255, 19, 0),
			new java.awt.Color(255, 92, 0),
			new java.awt.Color(255, 106, 0),
			new java.awt.Color(255, 118, 0),
			new java.awt.Color(255, 119, 0),
			new java.awt.Color(255, 192, 0),
			new java.awt.Color(255, 255, 0),
			new java.awt.Color(192, 255, 0),
			new java.awt.Color(119, 255, 0),
			new java.awt.Color(118, 255, 0),
			new java.awt.Color(106, 255, 0),
			new java.awt.Color(92, 255, 0),
			new java.awt.Color(19, 255, 0),
			new java.awt.Color(18, 255, 0),
			new java.awt.Color(6, 255, 0),
			new java.awt.Color(0, 255, 0),
			new java.awt.Color(0, 255, 6),
			new java.awt.Color(0, 255, 18),
			new java.awt.Color(0, 255, 19),
			new java.awt.Color(0, 255, 92),
			new java.awt.Color(0, 255, 106),
			new java.awt.Color(0, 255, 118),
			new java.awt.Color(0, 255, 119),
			new java.awt.Color(0, 255, 192),
			new java.awt.Color(0, 255, 255),
			new java.awt.Color(0, 192, 255),
			new java.awt.Color(0, 119, 255),
			new java.awt.Color(0, 118, 255),
			new java.awt.Color(0, 106, 255),
			new java.awt.Color(0, 92, 255),
			new java.awt.Color(0, 19, 255),
			new java.awt.Color(0, 18, 255),
			new java.awt.Color(0, 6, 255),
			new java.awt.Color(0, 0, 255),
			new java.awt.Color(6, 6, 6),
			new java.awt.Color(18, 18, 18),
			new java.awt.Color(19, 19, 19),
			new java.awt.Color(92, 92, 92),
			new java.awt.Color(106, 106, 106),
			new java.awt.Color(118, 118, 118),
			new java.awt.Color(119, 119, 119),
			new java.awt.Color(192, 192, 192),
			new java.awt.Color(255, 255, 255),};
	 // </editor-fold>
	 // <editor-fold defaultstate="collapsed" desc="SpecialAccessGranted Special Efects">
	 int c = 1;
	 private javax.swing.Timer SpecialAccessGrantedTimer = new javax.swing.Timer(92, new java.awt.event.ActionListener() {

			int ccc = 0;

			public void actionPerformed(java.awt.event.ActionEvent e) {
				 ErrorLabel.setForeground(AccessGrantedColor[c]);
				 c = (c + 1) % AccessGrantedColor.length;
				 if (ccc == 90) {
						AdvavceSettingActionInterface.ActionToBePerformed();
						System.exit(AdvavceSettingActionInterface.DefaultCloseOperation());
				 }
				 ccc++;
			}
	 });
	 // </editor-fold>
	 // <editor-fold defaultstate="collapsed" desc="AccessGranted Special Efects">
	 int d = 1;
	 private javax.swing.Timer AccessGrantedTimer = new javax.swing.Timer(92, new java.awt.event.ActionListener() {

			int ccc = 0;

			public void actionPerformed(java.awt.event.ActionEvent e) {
				 ErrorLabel.setForeground(AccessGrantedColor[c]);
				 c = (c + 1) % AccessGrantedColor.length;
				 if (ccc == 90) {
						GoButtonActionInterface.ActionToBePerformed();
						System.exit(GoButtonActionInterface.DefaultCloseOperation());
				 }
				 ccc++;
			}
	 });
	 // </editor-fold>

	 // <editor-fold defaultstate="collapsed" desc="Actions">
	 /**
	  * Performs action when advance setting button is pressed
	  */
	 public void AdvSettActionPerformed() {
			ErrorLabel.setText("");

			String users = UserTextField.getText();
			char[] passc = PassPasswordField.getPassword();
			String passs = "";
			for (int i = 0; i < passc.length; i++) {
				 passs += passc[i];
			}

			if (AdvUserAccess && AdvPassAccess) {
				 ErrorLabel.setForeground(new java.awt.Color(0, 255, 0));
				 ErrorLabel.setText("Special Access Granted");
				 SpecialAccessGrantedTimer.start();
				 setBackground(java.awt.Color.GREEN);
				 setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
			} else if ((AdvUserAccess == false) && (AdvPassAccess == false)) {
				 if (users.equals("")) {
						UserErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						UserErrorLabel.setText("Empty Username Field");
				 } else {
						UserErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						UserErrorLabel.setText("Incorrect Username");
				 }
				 if (passs.equals("")) {
						PassErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						PassErrorLabel.setText("Empty Password Field");
				 } else {
						PassErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						PassErrorLabel.setText("Incorrect Password");
				 }
				 ErrorLabel.setText("Access Denied");
			} else if (AdvUserAccess == false) {
				 if (users.equals("")) {
						UserErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						UserErrorLabel.setText("Empty Username Field");
				 } else {
						UserErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						UserErrorLabel.setText("Incorrect Username");
				 }
				 ErrorLabel.setText("Access Denied");
			} else if (AdvPassAccess == false) {
				 if (passs.equals("")) {
						PassErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						PassErrorLabel.setText("Empty Password Field");
				 } else {
						PassErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
						PassErrorLabel.setText("Incorrect Password");
				 }
				 ErrorLabel.setText("Access Denied");
			} else {
				 ErrorLabel.setText("Access Denied");
			}
	 }

	 /**
	  * Performs action when Go button is pressed
	  */
	 public void GoButtonActionPerformed() {
			ErrorLabel.setText("");
			GoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("05a[1].jpg")));

			String users = UserTextField.getText();
			char[] passc = PassPasswordField.getPassword();
			String passs = "";
			for (int i = 0; i < passc.length; i++) {
				 passs += passc[i];
			}

			if (UserAccess && PassAccess) {
				 ErrorLabel.setForeground(new java.awt.Color(0, 255, 0));
				 ErrorLabel.setText("Access Granted");
				 AccessGrantedTimer.start();
				 setBackground(java.awt.Color.GREEN);
				 setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
			} else if ((UserAccess == false) && (PassAccess == false)) {
				 if (users.equals("")) {
						UserErrorLabel.setText("Empty Username Field");
				 } else {
						UserErrorLabel.setText("Incorrect Username");
				 }
				 if (passs.equals("")) {
						PassErrorLabel.setText("Empty Password Field");
				 } else {
						PassErrorLabel.setText("Incorrect Password");
				 }
				 ErrorLabel.setText("Access Denied");
				 GoButton.setIcon(GoSymbolInactive);
			} else if (UserAccess == false) {
				 if (users.equals("")) {
						UserErrorLabel.setText("Empty Username Field");
				 } else {
						UserErrorLabel.setText("Incorrect Username");
				 }
				 ErrorLabel.setText("Access Denied");
				 GoButton.setIcon(GoSymbolInactive);
			} else if (PassAccess == false) {
				 if (passs.equals("")) {
						PassErrorLabel.setText("Empty Username Field");
				 } else {
						PassErrorLabel.setText("Incorrect Password");
				 }
				 ErrorLabel.setText("Access Denied");
				 GoButton.setIcon(GoSymbolInactive);
			} else {
				 ErrorLabel.setText("Access Denied");
				 GoButton.setIcon(GoSymbolInactive);
			}
	 }
	 // </editor-fold>
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton AdvSettButton;
   private javax.swing.JLabel ErrorLabel;
   private javax.swing.JButton GoButton;
   private javax.swing.JLabel PassErrorLabel;
   private javax.swing.JLabel PassLabel;
   private javax.swing.JPasswordField PassPasswordField;
   private javax.swing.JLabel UserErrorLabel;
   private javax.swing.JLabel UserLabel;
   private javax.swing.JTextField UserTextField;
   // End of variables declaration//GEN-END:variables
}
