/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.swing.LookandFeel;

import java.awt.Component;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Abhishek Munie
 */
public class LookAndFeel {

	 String name;
	 javax.swing.LookAndFeel laf;

	 LookAndFeel(String name, javax.swing.LookAndFeel laf) {
			this.name = name;
			this.laf = laf;
	 }

	 @Override
	 public String toString() {
			return name;
	 }
	 static java.util.Vector<LookAndFeel> supportedLaFs = new java.util.Vector<LookAndFeel>();

	 /**
	  * Gives a vector of available, supported LookAndFeel.
	  * @return a vector of available, supported LookAndFeel.
	  */
	 public static java.util.Vector<LookAndFeel> getLookAndFeels() {
			supportedLaFs = new java.util.Vector<LookAndFeel>();
			@SuppressWarnings("unchecked")
			javax.swing.UIManager.LookAndFeelInfo[] installedLafs = javax.swing.UIManager.getInstalledLookAndFeels();
			for (javax.swing.UIManager.LookAndFeelInfo lafInfo : installedLafs) {
				 try {
						Class lnfClass = Class.forName(lafInfo.getClassName());
						javax.swing.LookAndFeel laf = (javax.swing.LookAndFeel) (lnfClass.newInstance());
						if (laf.isSupportedLookAndFeel()) {
							 String name = lafInfo.getName();
							 supportedLaFs.add(new LookAndFeel(name, laf));
						}
				 } catch (Exception e) { // If ANYTHING weird happens, don't add it
						continue;
				 }
			}
			return supportedLaFs;
	 }

	 /**
	  * Applies a LookAndFeel to a Component.
	  * @param supportedLaF
	  * @param c - Component on which LookAndFeel is to be applied.
	  * @throws UnsupportedLookAndFeelException
	  */
	 public static void setLookAndFeel(LookAndFeel supportedLaF, Component c) throws UnsupportedLookAndFeelException {
			javax.swing.LookAndFeel laf = supportedLaF.laf;
			UIManager.setLookAndFeel(laf);
			SwingUtilities.updateComponentTreeUI(c);
	 }
}
