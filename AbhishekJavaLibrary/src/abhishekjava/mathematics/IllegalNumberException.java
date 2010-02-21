/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class IllegalNumberException extends Exception {

    /**
     * Creates a new instance of <code>IllegalNumberException</code> without detail message.
     */
    public IllegalNumberException() {
    }


    /**
     * Constructs an instance of <code>IllegalNumberException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public IllegalNumberException(String msg) {
        super(msg);
    }
}
