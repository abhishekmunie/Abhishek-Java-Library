/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.security;

/**
 *
 * @author Abhishek
 */
public interface PasswordJDialogActionInterface {

    public void setEnabled(boolean b);

    public boolean isEnabled();

    public String getUsername();

    public String getPassword();

    public void ActionToBePerformed();
    
    public int DefaultCloseOperation();
}
