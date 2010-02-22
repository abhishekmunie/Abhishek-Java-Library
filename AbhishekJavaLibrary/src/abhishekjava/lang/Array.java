/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.lang;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Abhishek
 */
public class Array
{
//				extends java.util.Arrays {

	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~ Methods for Displaying Arrays ~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
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

	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~ Methods for Deleating an Element from Arrays ~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 public static Object[] delete(Object[] ARR, int POS) throws IOException {
			while (POS < (ARR.length - 1)) {
				 ARR[POS] = ARR[POS + 1];
				 POS++;
			}
			return Arrays.copyOfRange(ARR, 0, (ARR.length - 1));
	 }

	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~ Methods for Inserting an Element from Arrays ~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
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

	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~ Methods for Mearging Arrays ~~~~~~~~~~*/
	 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	 public static byte[] merge(byte[] A, byte[] B) {
			byte[] Merged = new byte[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static short[] merge(short[] A, short[] B) {
			short[] Merged = new short[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static int[] merge(int[] A, int[] B) {
			int[] Merged = new int[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static long[] merge(long[] A, long[] B) {
			long[] Merged = new long[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static float[] merge(float[] A, float[] B) {
			float[] Merged = new float[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static double[] merge(double[] A, double[] B) {
			double[] Merged = new double[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static char[] merge(char[] A, char[] B) {
			char[] Merged = new char[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
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

	 public static String[] merge(String[] A, String[] B) {
			String[] Merged = new String[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 Merged[i] = A[i];
			}
			for (int i = A.length; i < Merged.length; i++) {
				 Merged[i] = B[i - A.length];
			}
			return Merged;
	 }

	 public static void main(String[] args) {
	 }
}
