/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class DeterminantException extends RuntimeMathematicalException {

    Determinant[] determinant;

    /**
     * Creates a new instance of <code>DeterminantException</code> without detail message.
     */
    public DeterminantException() {
    }

    /**
     * Constructs an instance of <code>DeterminantException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DeterminantException(String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of <code>MatrixException</code> with the specified detail message and the <code>Determinant</code> causing it.
     * @param msg the detail message.
     * @param determinant
     */
    public DeterminantException(String msg, Determinant... determinant) {
        super(msg);
        this.determinant = determinant;
    }

    /**
     * Returns the array of determinant which had caused the exception.
     * @return Returns the determinant causing the exception
     */
    public Determinant[] getDeterminants() {
        return determinant;
    }
}
