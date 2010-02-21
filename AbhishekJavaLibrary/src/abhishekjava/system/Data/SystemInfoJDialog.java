/*
 * SystemInfoJDialog.java
 *
 * Created on August 29, 2008, 10:01 PM
 */
package abhishekjava.system.Data;

import java.util.Enumeration;
import javax.swing.event.TableModelListener;

/**
 *
 * @author  Abhishek
 */
public class SystemInfoJDialog extends javax.swing.JDialog {

	 private static final long serialVersionUID = -6117093571305284779L;
	 private String[][] proterties = new String[][]{
			{"Operating system name", SystemInfo.OsName},
			{"Operating system version", SystemInfo.OsVersion},
			{"Operating system architecture", SystemInfo.OsArch},
			{"Java Runtime Environment version", SystemInfo.JavaVersion},
			{"Java Runtime Environment vendor", SystemInfo.JavaVendor},
			{"Java vendor URL", SystemInfo.JavaVendorUrl},
			{"Java installation directory", SystemInfo.JavaHome},
			{"Path of extension directory or directories", SystemInfo.JavaExtDirs},
			{"Default temp file path", SystemInfo.JavaIoTmpdir},
			{"List of paths to search when loading libraries", SystemInfo.JavaLibraryPath},
			{"Java Runtime Environment specification name", SystemInfo.JavaSpecificationName},
			{"ava Runtime Environment specification version", SystemInfo.JavaSpecificationVersion},
			{"Java Runtime Environment specification vendor", SystemInfo.JavaSpecificationVendor},
			{"Java Virtual Machine implementation name", SystemInfo.JavaVmName},
			{"Java Virtual Machine implementation version", SystemInfo.JavaVmVersion},
			{"Java Runtime Environment specification vendor", SystemInfo.JavaVmVendor},
			{"Java Virtual Machine specification name", SystemInfo.JavaVmSpecificationName},
			{"Java Virtual Machine specification version", SystemInfo.JavaVmSpecificationVersion},
			{"Java Virtual Machine specification vendor", SystemInfo.JavaVmSpecificationVendor},
			{"Name of JIT compiler to use", SystemInfo.JavaCompiler},
			{"Java class format version number", SystemInfo.JavaClassVersion},
			{"Java class path", SystemInfo.JavaClassPath},
			{"User's account name", SystemInfo.UserName},
			{"User's home directory", SystemInfo.UserHome},
			{"User's current working directory", SystemInfo.UserDir},
			{"File separator (“/” on UNIX)", SystemInfo.FileSeparator},
			{"Line separator (“" + (char) 92 + "n” on UNIX)", SystemInfo.LineSeparator},
			{"Path separator (“:” on UNIX)", SystemInfo.PathSeparator}
	 };
	 private final javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(proterties,
					 new String[]{"Property", "Value"}) {

			Class[] types = new Class[]{
				 java.lang.String.class, java.lang.String.class
			};
			boolean[] canEdit = new boolean[]{false, false};

			@Override
			public Class getColumnClass(int columnIndex) {
				 return types[columnIndex];
			}

			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				 return canEdit[columnIndex];
			}
	 };

	 /**
	  * Creates new form SystemInfoJDialog
	  */
	 public SystemInfoJDialog() {
			init();
	 }

	 /**
	  * Creates new form SystemInfoJDialog
	  * @param parent
	  */
	 public SystemInfoJDialog(java.awt.Frame parent) {
			super(parent);
			init();
	 }

	 /**
	  * Creates new form SystemInfoJDialog
	  * @param parent
	  * @param modal
	  */
	 public SystemInfoJDialog(java.awt.Frame parent, boolean modal) {
			super(parent, modal);
			init();
	 }

	 /**
	  * Creates new form SystemInfoJDialog
	  */
	 public void init() {
			initComponents();
			setIconImage(new javax.swing.ImageIcon(getClass().getResource("HPTouchSmart.jpg")).getImage());
			setSize(1000, 700);
			InfoTable.setAutoCreateRowSorter(true);
			InfoTable.setBackground(new java.awt.Color(0, 0, 0, 0));
			InfoTable.setModel(model);
			InfoTable.setAutoscrolls(true);
			InfoTable.setColumnSelectionAllowed(true);
			InfoTable.setRowHeight(21);
			InfoTable.getTableHeader().setReorderingAllowed(false);
			ScrollPane.setViewportView(InfoTable);
			InfoTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//			for (Enumeration e = SystemInfo.SystemProperties.keys(); e.hasMoreElements();) {
//				 Object k = e.nextElement();
//				 model.addRow(new String[]{k.toString(), SystemInfo.SystemProperties.getProperty(k.toString())});
//			}
	 }

	 /** This method is called from within the constructor to
	  * initialize the form.
	  * WARNING: Do NOT modify this code. The content of this method is
	  * always regenerated by the Form Editor.
	  */
	 @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      ScrollPane = new javax.swing.JScrollPane();
      InfoTable = new javax.swing.JTable();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("System Information");
      setAlwaysOnTop(true);
      setResizable(false);

      ScrollPane.setViewportView(InfoTable);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

	 public static void main(String[] args) {
			java.awt.EventQueue.invokeLater(new Runnable() {

				 public void run() {
						SystemInfoJDialog dialog = new SystemInfoJDialog(new java.awt.Frame());
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
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTable InfoTable;
   private javax.swing.JScrollPane ScrollPane;
   // End of variables declaration//GEN-END:variables
}
