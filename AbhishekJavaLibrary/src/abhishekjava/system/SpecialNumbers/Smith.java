package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Smith {

			static int num;
			static int sum;
			static int counter;
			static int[] PrimeFactors;
			static int sumOfDigits;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									getPrimeFactors();
									display();
									for (;;) {
												System.out.println();
												System.out.println("Do you want to continue? (yes/no)");
												String c = BR.readLine();
												if (c.equalsIgnoreCase("yes")) {
															break;
												} else if (c.equalsIgnoreCase("no")) {
															System.exit(0);
												} else {
															System.out.println("Invalid Entry.\n");
															continue;
												}
												System.out.println();
									}
						}
			}

			private static void getPrimeFactors() {
						int n = num;
						sum = 0;
						counter = 0;
						PrimeFactors = new int[num / 2];
						while (n > 1) {
									for (int i = 2; i <= n; i++) {
												if (n % i == 0) {
															PrimeFactors[counter] = i;
															counter++;
															n /= i;
															break;
												}
									}
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number: ");
						num = Integer.parseInt(BR.readLine());
						PrimeFactors = new int[num / 2];
			}

			static void display() {
						System.out.println();
						System.out.println("The Prime Factors of the number are:");
						for (int i = 0; i < counter; i++) {
									System.out.print(PrimeFactors[i]);
									if (i < (counter - 1)) {
												System.out.print(", ");
									}
						}
						System.out.println();
						System.out.println("The sun of digits of Prime Factors of the number is:");
						for (int i = 0; i < counter; i++) {
									int pfn = PrimeFactors[i];
									while (pfn >= 1) {
												System.out.print(pfn % 10);
												sum += (pfn % 10);
												if ((i < (counter - 1)) || (pfn >= 10)) {
															System.out.print(" + ");
												}
												pfn /= 10;
									}
						}
						System.out.println(" = " + sum);
						System.out.println("The sun of digits of the number is:");
						int n = num;
						while (n >= 1) {
									System.out.print(n % 10);
									sumOfDigits += (n % 10);
									if (n >= 10) {
												System.out.print(" + ");
									}
									n /= 10;
						}
						System.out.println(" = " + sumOfDigits);
						System.out.println();
						if (sum == sumOfDigits) {
									System.out.println("The number is a smith number.");
						} else {
									System.out.println("The number is not a smith number.");
						}
						System.out.println();
			}
}
