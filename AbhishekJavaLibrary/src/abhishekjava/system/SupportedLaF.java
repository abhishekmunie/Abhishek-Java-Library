/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.system;

import javax.swing.LookAndFeel;

/**
 *
 * @author Abhishek
 */
class SupportedLaF {

    String name;
    javax.swing.LookAndFeel laf;

    SupportedLaF(String name, LookAndFeel laf) {
        this.name = name;
        this.laf = laf;
    }

    @Override
    public String toString() {
        return name;
    }
}
