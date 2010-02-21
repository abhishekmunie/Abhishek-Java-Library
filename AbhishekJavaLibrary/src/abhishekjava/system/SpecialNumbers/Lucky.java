package abhishekjava.system.SpecialNumbers;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Lucky {

			static int count;
			static int[] numSeries, luckySeries;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									computeLucky();
									System.out.println();
									printLucky();
									for (;;) {
												System.out.println();
												System.out.println("Do you want to continue? (yes/no)");
												String c = BR.readLine();
												System.out.println();
												if (c.equalsIgnoreCase("yes")) {
															break;
												} else if (c.equalsIgnoreCase("no")) {
															System.exit(0);
												} else {
															System.out.println("Invalid Entry.\n");
															continue;
												}
									}
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number until where you want to check for Buzz number: ");
						numSeries = new int[Integer.parseInt(BR.readLine())];
						for (int i = 0; i < numSeries.length; i++) {
									numSeries[i] = i + 1;
						}
			}

			static void computeLucky() {
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
			}

			static void printLucky() {
						System.out.println("Lucky Numbers: ");
						System.out.print(luckySeries[0]);
						for (int i = 1; i < count; i++) {
									System.out.print(", " + luckySeries[i]);
						}
						System.out.println();
			}
}
