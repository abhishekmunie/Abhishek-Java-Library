package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Composite {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isComposite()) {
												System.out.println("The no. is a Composite number.");
									} else {
												System.out.println("The no. is not a Composite number.");
									}
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

			static void input() throws IOException {
						System.out.print("Enter the number: ");
						num = Integer.parseInt(BR.readLine());
			}

			static boolean isComposite() {
						for (int i = 2; i < num; i++) {
									if (num % i == 0) {
												return true;
									}
						}
						return false;
			}
}
