/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.system;

/**
 * Used to set action which has to be performed when a Look & Feel is selected through LookAndFeelJDialog
 *
 * @author Abhishek
 */
public interface LookAndFeelInterface {

    public void setLookAndFeel(javax.swing.LookAndFeel LaF);

    public void ActionToBePerformed();
}
