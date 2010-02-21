/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.mathematics;

import java.io.*;
import java.util.Arrays;
/**
 *
 * @author Abhishek
 */
public class Array {
//				extends java.util.Array {

	 public static int[] getArrayFromStandardInputStream() throws IOException {
			BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the size of Array: ");
			int SIZE = Integer.parseInt(BR.readLine());
			System.out.println("Enter the elements of Array: ");
			int[] ARR = new int[SIZE];
			for (int i = 0; i < SIZE; i++) {
				 ARR[i] = Integer.parseInt(BR.readLine());
			}
			return ARR;
	 }

	 public static Object[] delete(Object[] ARR, int POS) throws IOException {
			while (POS < (ARR.length - 1)) {
				 ARR[POS] = ARR[POS + 1];
				 POS++;
			}
			return Arrays.copyOfRange(ARR, 0, (ARR.length - 1));
	 }

	 public static Object[] insert(Object[] ARR, int POS, int ELE) throws IOException {
			int COUNT = ARR.length;
			ARR = Arrays.copyOf(ARR, ARR.length + 1);
			while (COUNT >= POS) {
				 ARR[COUNT + 1] = ARR[COUNT];
				 COUNT--;
			}
			ARR[POS] = ELE;
			return ARR;
	 }

	 public static Object[] merge(Object[] A, Object[] B) {
			Object[] Merged = new Object[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static void display(Object[] ARR) {
			for (int i = 0; i < (ARR.length - 1); i++) {
				 System.out.print(ARR[i]);
				 if (i < (ARR.length - 2)) {
						System.out.print(", ");
				 }
			}
			System.out.println();
	 }
}
