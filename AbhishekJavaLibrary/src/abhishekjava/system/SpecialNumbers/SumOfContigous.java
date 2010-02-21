package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class SumOfContigous {

			static int num;
			static int s;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									compute(num);
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
						System.out.print("Enter the number: ");
						num = Integer.parseInt(BR.readLine());
			}

			public static void compute(int n) {
						for (int i = 1; i < n; i++) {
									s = 0;
									for (int j = i; j < n; j++) {
												s += j;
												if (s == n) {
															for (int k = i; k <= j; k++) {
																		System.out.print(k);
																		if (k < j) {
																					System.out.print(" + ");
																		} else {
																					System.out.println(" = " + n);
																		}
															}
												}
									}
						}
			}
}
