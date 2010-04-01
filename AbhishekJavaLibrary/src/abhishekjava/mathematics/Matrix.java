package abhishekjava.mathematics;

/**
 * This class provide a numbel of general Matrix Operations.
 * The object of this class represents a Matrix.
 * @author Abhishek Munie
 */
public class Matrix implements Comparable<Matrix> {

	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~Member Variable & Method~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 int[][] elements;

	 public Matrix(int[][] elements) {
			this.elements = elements;
	 }

	 public Matrix(int rows, int column) {
			this.elements = new int[rows][column];
	 }

	 public Matrix get() {
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

	 public int getNumberOfRows() {
			return elements.length;
	 }

	 public int getNumberOfColumns() {
			return elements[0].length;
	 }

	 public void add(Matrix M) throws MatrixException {
			set(add(this, M));
	 }

	 public void substract(Matrix M) throws MatrixException {
			set(substract(this, M));
	 }

	 public void multiply(Matrix M) {
			set(multiply(this, M));
	 }

	 public void transpose() {
			set(transpose(this));
	 }

	 public int[] getLeftDiagonal() {
			return getLeftDiagonal(this);
	 }

	 public int[] getRightDiagonal() {
			return getRightDiagonal(this);
	 }

	 public void printLeftDiagonal() {
			printLeftDiagonal(this);
	 }

	 public void printRightDiagonal() {
			printRightDiagonal(this);
	 }

	 public int sumLeftDiagonal() {
			return sumLeftDiagonal(this);
	 }

	 public int sumRightDiagonal() {
			return sumRightDiagonal(this);
	 }

	 public int getBorderLenght() {
			return getBorderLenght(this);
	 }

	 void sortBorder() {
			sortBorder(this);
	 }

	 int getBorderElement(int pos) {
			return getBorderElement(this, pos);
	 }

	 void setBorderElement(int num, int pos) {
			setBorderElement(this, num, pos);
	 }

	 void printBorderElement() {
			printBorderElement(this);
	 }

	 void printInnerElement() {
			printInnerElement(this);
	 }

	 boolean isBorderElement(int i, int j) {
			return isBorderElement(this, i, j);
	 }

	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~Static Variable & Method~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 public static Matrix add(Matrix A, Matrix B) throws MatrixException {
			if (A.getNumberOfRows() != B.getNumberOfRows()) {
				 throw new MatrixException("No. of rows of the Matrix to be added is not equal.", A, B);
			}
			if (A.getNumberOfColumns() != B.getNumberOfColumns()) {
				 throw new MatrixException("No. of columns of the Matrix to be added is not equal.", A, B);
			}
			Matrix Sum = new Matrix(A.getNumberOfRows(), A.getNumberOfColumns());
			for (int i = 0; i < Sum.getNumberOfRows(); i++) {
				 for (int j = 0; j < Sum.getNumberOfColumns(); j++) {
						Sum.setElementAt(i, j, (A.getElementAt(i, j) + B.getElementAt(i, j)));
				 }
			}
			return Sum;
	 }

	 public static Matrix substract(Matrix A, Matrix B) throws MatrixException {
			if (A.getNumberOfRows() != B.getNumberOfRows()) {
				 throw new MatrixException("No. of rows of the Matrix to be substracted is not equal.", A, B);
			}
			if (A.getNumberOfColumns() != B.getNumberOfColumns()) {
				 throw new MatrixException("No. of columns of the Matrix to be substracted is not equal.", A, B);
			}
			Matrix Diff = new Matrix(A.getNumberOfRows(), A.getNumberOfColumns());
			for (int i = 0; i < Diff.getNumberOfRows(); i++) {
				 for (int j = 0; j < Diff.getNumberOfColumns(); j++) {
						Diff.setElementAt(i, j, (A.getElementAt(i, j) - B.getElementAt(i, j)));
				 }
			}
			return Diff;
	 }

	 public static Matrix multiply(Matrix A, Matrix B) {
			if (A.getNumberOfColumns() != B.getNumberOfRows()) {
				 throw new MatrixException("No. of columns of the First Matrix and No. of rows of the Second Matrix to be multiplied is not equal.", A, B);
			}
			Matrix Product = new Matrix(A.getNumberOfRows(), B.getNumberOfColumns());
			for (int i = 0; i < Product.getNumberOfRows(); i++) {
				 for (int j = 0; j < Product.getNumberOfColumns(); j++) {
						int pro = 0;
						for (int k = 0; k < A.getNumberOfColumns(); k++) {
							 pro += A.getElementAt(i, k) * B.getElementAt(k, j);
						}
						Product.setElementAt(i, j, pro);
				 }
			}
			return Product;
	 }

	 public static Matrix transpose(Matrix matrix) {
			Matrix T = new Matrix(matrix.getNumberOfColumns(), matrix.getNumberOfRows());
			for (int i = 0; i < T.getNumberOfRows(); i++) {
				 for (int j = 0; j < T.getNumberOfColumns(); j++) {
						T.setElementAt(i, j, matrix.getElementAt(j, i));
				 }
			}
			return T;
	 }

	 public static int[] getLeftDiagonal(Matrix matrix) {
			int[] lD = new int[matrix.getNumberOfRows()];
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 lD[i] = (matrix.getElementAt(i, i));
			}
			return lD;
	 }

	 public static int[] getRightDiagonal(Matrix matrix) {
			int[] rD = new int[matrix.getNumberOfRows()];
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 rD[i] = (matrix.getElementAt(i, matrix.getNumberOfRows() - 1 - i));
			}
			return rD;
	 }

	 public static void printLeftDiagonal(Matrix matrix) {
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 for (int j = 0; j < i; j++) {
						System.out.print("\t");
				 }
				 System.out.println(matrix.getElementAt(i, i));
			}
	 }

	 public static void printRightDiagonal(Matrix matrix) {
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 for (int j = 0; j < (matrix.getNumberOfRows() - 1 - i); j++) {
						System.out.print("\t");
				 }
				 System.out.println(matrix.getElementAt(i, matrix.getNumberOfRows() - 1 - i));
			}
	 }

	 public static int sumLeftDiagonal(Matrix matrix) {
			int sum = 0;
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 sum += matrix.getElementAt(i, i);
			}
			return sum;
	 }

	 public static int sumRightDiagonal(Matrix matrix) {
			int sum = 0;
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 sum += matrix.getElementAt(i, (matrix.getNumberOfRows() - 1 - i));
			}
			return sum;
	 }

	 /**
	  * Returns the length of the border of matrix.
	  * @param matrix matrix
	  * @return The length of the border of matrix.
	  */
	 static int getBorderLenght(Matrix matrix) {
			return ((matrix.getNumberOfRows() * 2) + (matrix.getNumberOfColumns() * 2) - 4);
	 }

	 /**
	  * Sorts the border elements of the matrix.
	  */
	 static void sortBorder(Matrix matrix) {
			int minP, temp;
			for (int i = 0; i < getBorderLenght(matrix); i++) {
				 minP = i;
				 for (int j = i + 1; j < getBorderLenght(matrix); j++) {
						if (getBorderElement(matrix, j) < getBorderElement(matrix, minP)) {
							 minP = j;
						}
				 }
				 temp = getBorderElement(matrix, i);
				 setBorderElement(matrix, getBorderElement(matrix, minP), i);
				 setBorderElement(matrix, temp, minP);
			}
	 }

	 /**
	  * Returns the Border Element at position pos while considering
	  * the border to be starting at top left corner and filled clockwise.
	  * @param pos position of Border Element.
	  * @return Border Element at position pos.
	  */
	 static int getBorderElement(Matrix matrix, int pos) {
			if (pos < matrix.getNumberOfColumns()) {
				 return matrix.getElementAt(0, pos);
			} else if ((pos -= (matrix.getNumberOfColumns() - 1)) < matrix.getNumberOfRows()) {
				 return matrix.getElementAt(pos, (matrix.getNumberOfColumns() - 1));
			} else if ((pos -= (matrix.getNumberOfRows() - 1)) < matrix.getNumberOfColumns() - 1) {
				 return matrix.getElementAt((matrix.getNumberOfRows() - 1), (matrix.getNumberOfColumns() - 1 - pos));
			} else if ((pos -= (matrix.getNumberOfColumns() - 1)) <= (matrix.getNumberOfRows() - 1)) {
				 return matrix.getElementAt((matrix.getNumberOfRows() - 1 - (pos)), 0);
			} else {
				 return -1;
			}
	 }

	 /**
	  * Sets the value of Border Element at position pos while considering
	  * the border to be starting at top left corner and filled clockwise.
	  * @param num value to be set.
	  * @param pos position of Border Element.
	  */
	 static void setBorderElement(Matrix matrix, int num, int pos) {
			if (pos < matrix.getNumberOfColumns()) {
				 matrix.setElementAt(0, pos, num);
			} else if ((pos -= (matrix.getNumberOfColumns() - 1)) < matrix.getNumberOfRows()) {
				 matrix.setElementAt(pos, (matrix.getNumberOfColumns() - 1), num);
			} else if ((pos -= (matrix.getNumberOfRows() - 1)) < matrix.getNumberOfColumns() - 1) {
				 matrix.setElementAt((matrix.getNumberOfRows() - 1), (matrix.getNumberOfColumns() - 1 - pos), num);
			} else if ((pos -= (matrix.getNumberOfColumns() - 1)) <= (matrix.getNumberOfRows() - 1)) {
				 matrix.setElementAt((matrix.getNumberOfRows() - 1 - (pos)), 0, num);
			}
	 }

	 /**
	  * Prints the border elements of matrix.
	  */
	 static void printBorderElement(Matrix matrix) {
			System.out.println("Border Elements: ");
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 for (int j = 0; j < matrix.getNumberOfColumns(); j++) {
						if (isBorderElement(matrix, i, j)) {
							 System.out.print(matrix.getElementAt(i, j) + "\t");
						} else {
							 System.out.print(" \t");
						}
				 }
				 System.out.println();
			}
	 }

	 /**
	  * Prints the inner elements of matrix.
	  */
	 static void printInnerElement(Matrix matrix) {
			System.out.println("Inner Elements: ");
			for (int i = 0; i < matrix.getNumberOfRows(); i++) {
				 for (int j = 0; j < matrix.getNumberOfColumns(); j++) {
						if (!isBorderElement(matrix, i, j)) {
							 System.out.print(matrix.getElementAt(i, j) + "\t");
						} else {
							 System.out.print(" \t");
						}
				 }
				 System.out.println();
			}
	 }
  static int[][] matrix;

	 static void TopLeftClockwiseSpiral(){
			int num = 1;
			for (int i = 0; i < Math.ceil(matrix.length / 2.0f); i++) {
				 for (int j = i; j <= matrix[i].length - 1 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i + 1; k <= matrix.length - 1 - i; k++) {
						matrix[k][matrix[i].length - 1 - i] = num++;
				 }
				 for (int l = matrix[matrix.length - 1 - i].length - i - 2; l >= i; l--) {
						matrix[matrix.length - 1 - i][l] = num++;
				 }
				 for (int m = matrix.length - 2 - i; m > i; m--) {
						matrix[m][i] = num++;
				 }
			}
	 }

	 static void TopLeftCounterclockwiseSpiral(){
			int num = 1;
			for (int i = 0; i < matrix.length; i++) {
				 for (int m = i; m <= matrix.length - i - 1; m++) {
						matrix[m][i] = num++;
				 }
				 for (int l = i + 1; l <= matrix[matrix.length - 1 - i].length - 1 - i; l++) {
						matrix[matrix.length - 1 - i][l] = num++;
				 }
				 for (int k = matrix.length - 2 - i; k >= i; k--) {
						matrix[k][matrix.length - 1 - i] = num++;
				 }
				 for (int j = matrix[i].length - 2 - i; j > i; j--) {
						matrix[i][j] = num++;
				 }
			}
	 }

	 static void InToOut() {
			int num = 1;
			for (int i = (int) (Math.ceil(matrix.length / 2.0f) - 1); i >= 0; i--) {
				 for (int j = i; j <= matrix[i].length - 1 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i + 1; k <= matrix.length - 1 - i; k++) {
						matrix[k][matrix[i].length - 1 - i] = num++;
				 }
				 for (int l = matrix[matrix.length - 1 - i].length - i - 2; l >= i; l--) {
						matrix[matrix.length - 1 - i][l] = num++;
				 }
				 for (int m = matrix.length - 2 - i; m > i; m--) {
						matrix[m][i] = num++;
				 }
			}
	 }

	 static void InToOutTop() {
			int num = 1;
			for (int i = (int) (Math.ceil(matrix.length / 2.0f) - 1); i >= 0; i--) {
				 for (int j = i + 1; j <= matrix[i].length - 2 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i; k <= matrix.length - 1 - i; k++) {
						matrix[k][matrix[i].length - 1 - i] = num++;
				 }
				 for (int l = matrix[matrix.length - 1 - i].length - 2 - i; l >= i; l--) {
						matrix[matrix.length - 1 - i][l] = num++;
				 }
				 for (int m = matrix.length - 2 - i; m >= i; m--) {
						matrix[m][i] = num++;
				 }
			}
	 }

	 static void InToOutRight() {
			int num = 1;
			for (int i = (int) (Math.ceil(matrix.length / 2.0f) - 1); i >= 0; i--) {
				 for (int k = i + 1; k <= matrix.length - 2 - i; k++) {
						matrix[k][matrix[i].length - 1 - i] = num++;
				 }
				 for (int l = matrix[matrix.length - 1 - i].length - 1 - i; l >= i; l--) {
						matrix[matrix.length - 1 - i][l] = num++;
				 }
				 for (int m = matrix.length - 2 - i; m >= i; m--) {
						matrix[m][i] = num++;
				 }
				 for (int j = i + 1; j <= matrix[i].length - 1 - i; j++) {
						matrix[i][j] = num++;
				 }
			}
	 }

	 static void InToOutBottom() {
			int num = 1;
			for (int i = (int) (Math.ceil(matrix.length / 2.0f) - 1); i >= 0; i--) {
				 for (int l = matrix[matrix.length - 1 - i].length - 2 - i; l >= i; l--) {
						matrix[matrix.length - 1 - i][l] = num++;
				 }
				 for (int m = matrix.length - 2 - i; m >= i; m--) {
						matrix[m][i] = num++;
				 }
				 for (int j = i + 1; j <= matrix[i].length - 2 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i; k <= matrix.length - 1 - i; k++) {
						matrix[k][matrix[i].length - 1 - i] = num++;
				 }
			}
	 }

	 /**
	  * Checks if the element is a border element or not.
	  * @param i row no. of element
	  * @param j column no. of element
	  * @return
	  */
	 static boolean isBorderElement(Matrix matrix, int i, int j) {
			return ((i == 0) || (i == (matrix.getNumberOfRows() - 1)) || (j == 0) || (j == (matrix.getNumberOfColumns() - 1)));
	 }

	 public static void main(String[] args) {
			// TODO code application logic here
	 }

	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~Core Variable & Method~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 @Override
	 public String toString() {
			String st = "";
			for (int i = 0; i < elements.length; i++) {
				 st += java.util.Arrays.toString(elements[i]) + "\n";
			}
			return st;
	 }

	 public int compareTo(Matrix o) {
			int c = 0;
			for (int i = 0; i < this.getNumberOfRows(); i++) {
				 for (int j = 0; j < this.getNumberOfColumns(); j++) {
						if (this.getElementAt(i, j) != o.getElementAt(i, j)) {
							 c = -1;
						}
				 }
			}
			return c;
	 }
}
