/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class MathematicalException extends Exception {
   private static final long serialVersionUID = 8683712534671186815L;

    /**
     * Creates a new instance of <code>MathematicalException</code> without detail message.
     */
    public MathematicalException() {
    }


    /**
     * Constructs an instance of <code>MathematicalException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public MathematicalException(String msg) {
        super(msg);
    }
}
