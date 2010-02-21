/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class MatrixException extends RuntimeMathematicalException {

    Matrix[] matrix;

    /**
     * Creates a new instance of <code>MatrixException</code> without detail message.
     */
    public MatrixException() {
    }

    /**
     * Constructs an instance of <code>MatrixException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public MatrixException(String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of <code>MatrixException</code> with the specified detail message and the <code>Matrix</code> causing it.
     * @param msg the detail message.
     * @param matrix 
     */
    public MatrixException(String msg, Matrix... matrix) {
        super(msg);
        this.matrix = matrix;
    }

    /**
     * Returns the array of matrix which had caused the exception.
     * @return Returns the matrix causing the exception
     */
    public Matrix[] getMatrixs() {
        return matrix;
    }
}
