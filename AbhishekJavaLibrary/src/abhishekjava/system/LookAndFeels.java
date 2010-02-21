/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abhishekjava.system;

import java.awt.Component;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Abhishek
 */    
public class LookAndFeels {

    static java.util.Vector<SupportedLaF> supportedLaFs = new java.util.Vector();
    
    /**
     * Returns the available LookAndFeels.
     * @return
     */
    public static java.util.Vector<SupportedLaF> getLookAndFeels(){
        @SuppressWarnings("unchecked")
        javax.swing.UIManager.LookAndFeelInfo[] installedLafs = javax.swing.UIManager.getInstalledLookAndFeels();
        for (javax.swing.UIManager.LookAndFeelInfo lafInfo : installedLafs) {
            try {
                Class lnfClass = Class.forName(lafInfo.getClassName());
                javax.swing.LookAndFeel laf = (javax.swing.LookAndFeel) (lnfClass.newInstance());
                if (laf.isSupportedLookAndFeel()) {
                    String name = lafInfo.getName();
                    supportedLaFs.add(new SupportedLaF(name, laf));
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
    public static void setLookAndFeel(SupportedLaF supportedLaF, Component c) throws UnsupportedLookAndFeelException{
        LookAndFeel laf = supportedLaF.laf;
        UIManager.setLookAndFeel(laf);
        SwingUtilities.updateComponentTreeUI(c);
    }
}
