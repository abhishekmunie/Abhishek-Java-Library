/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class RuntimeMathematicalException extends RuntimeException {

    /**
     * Creates a new instance of <code>RuntimeMathematicalException</code> without detail message.
     */
    public RuntimeMathematicalException() {
    }


    /**
     * Constructs an instance of <code>RuntimeMathematicalException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public RuntimeMathematicalException(String msg) {
        super(msg);
    }
}
