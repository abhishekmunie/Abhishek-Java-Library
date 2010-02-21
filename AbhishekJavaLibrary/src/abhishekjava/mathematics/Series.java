/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class Series {

	 /**
	  * <tr>
	  * Example:
	  * @param num
	  * @return
	  */
	 public static int[] getLuckySeries(int num) {
			int count;
			int[] numSeries, luckySeries;
			numSeries = new int[num];
			for (int i = 0; i < numSeries.length; i++) {
				 numSeries[i] = i + 1;
			}
			int n = 2;
			int c = 0;
			luckySeries = numSeries;
			for (count = numSeries.length; count >= n; n++) {
				 c = 0;
				 for (int i = 0; i < count; i++) {
						if (((i + 1) % n) != 0) {
							 luckySeries[c] = numSeries[i];
							 c++;
						}
				 }
				 count = c;
				 numSeries = luckySeries;
			}
			return luckySeries;
	 }

	 /**
	  *
	  * @param num
	  * @return
	  */
	 public static int[] getFibonacciSeries(int num) {
			int n;
			int n1 = 0;
			int n2 = 1;
			int[] FS = new int[3];
			if (num >= 1) {
				 return new int[]{n1};
			}
			if (num >= 2) {
				 System.out.print(", " + n2);
			}
			for (int i = 3; i <= num; i++) {
				 n = n1 + n2;
				 System.out.print(", " + n);
				 n1 = n2;
				 n2 = n;
			}
			return FS;
	 }

	 /**
	  * Main Method
	  * @param args the command line arguments
	  */
	 public static void main(String[] args) {
			// TODO code application logic here
	 }
}
