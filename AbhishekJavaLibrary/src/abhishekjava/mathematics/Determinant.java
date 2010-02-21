/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class Determinant {

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~Member Variable & Method~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    int[][] elements;

    public Determinant(int[][] elements) {
        if(elements.length != elements[0].length)
            throw new DeterminantException("The no. of rows of the Determinant is not equal to the no. of columns of the Determinant");
        this.elements = elements;
    }

    public Determinant(int size) {
        this.elements = new int[size][size];
    }

    public Determinant get() {
        return this;
    }

    public void set(Matrix m) {
        this.setElements(m.getElements());
    }

    public int[][] getElements() {
        return elements;
    }

    public void setElements(int[][] elements) {
        this.elements = elements;
    }

    public void setElementAt(int rowNo, int columnNo, int value) {
        this.elements[rowNo][columnNo] = value;
    }

    public int getElementAt(int rowNo, int columnNo) {
        return this.elements[rowNo][columnNo];
    }

    public int getSize() {
        return elements.length;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
