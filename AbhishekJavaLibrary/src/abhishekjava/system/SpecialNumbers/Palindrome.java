package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Palindrome {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isPalindrome()) {
												System.out.println("The number is a Palindrome number.");
									} else {
												System.out.println("The number is not a Palindrome number.");
									}
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

			/**
			 * Check weather the no. is a Palindrome Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Palindrome Number, when the number
			 * remains unchanged on reversing its digits.
			 * @return boolean value i.e. the no. is palindrome or not
			 */
			public static boolean isPalindrome() {
						int Palindrome = 0;
						int n = num;
						while (n > 0) {
									Palindrome = (Palindrome * 10) + (n % 10);
									n /= 10;
						}
						if (Palindrome == num) {
									return true;
						} else {
									return false;
						}
			}
}
