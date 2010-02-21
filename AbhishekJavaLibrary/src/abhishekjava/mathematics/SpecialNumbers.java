/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Contains meathods which can be use be use to check weather the number is one of these special number
 *
 * @author Abhishek
 */
public class SpecialNumbers {

			/**
			 * Checks that ihe number passed to it is a Armstrong Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Armstrong Number if the sum of cubes of its digts is equal to the number.<tr>
			 * Example: 153.
			 * @param num - The number to be checked
			 * @return
			 */
			public static boolean isArmstrong(int num) {
						int n = num;
						int sum = 0;
						while (n >= 1) {
									sum += Math.pow(n % 10, 3);
									n /= 10;
						}
						if (num == sum) {
									return true;
						} else {
									return false;
						}
			}

			/**
			 * Check weather the no. is a Automorphic Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is an Automorphic number if the square of the number has the number at its end<tr>
			 * Example: 5; 6.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is automorphic or not
			 */
			public static boolean isAutomorphic(int n) {
						return (Math.pow(n, 2) % 10 == n);
			}

			/**
			 * Check weather the no. is a Buzz Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Buzz Number, when the number
			 * is either divisible by 7 or its last digit is 7.<tr>
			 * Example: 7; 77; 56.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is buzz or not
			 */
			public static boolean isBuzz(int n) {
						return ((n % 7 == 0) || (n % 10 == 7));
			}

			/**
			 * Checks that ihe number passed to it is a Composite Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is prime if it has any factor other than 1 and itself.<tr>
			 * Example: 8; 18;
			 * @param n
			 * @return
			 */
			public static boolean isComposite(int n) {
						for (int i = 2; i < n; i++) {
									if (n % i == 0) {
												return true;
									}
						}
						return false;
			}

			/**
			 * <tr>
			 * Example:
			 * @param num
			 * @return
			 */
			public static int[] isLucky(int num) {
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
			 * Checks that ihe number passed to it is a Magic Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is a magic number if on successive addition of digit
			 * the final result is 1 (or number on dividing by 9 gives 1 as remainder)<tr>
			 * Example: 91; 55.
			 * @param num
			 * @return
			 */
			public static boolean isMagic(int num) {
						int n = num;
						int sum = 0;
						while (n >= 10) {
									sum = 0;
									while (n >= 1) {
												sum += n % 10;
												n /= 10;
									}
									n = sum;
						}
						if (sum == 1) {
									return true;
						} else {
									return false;
						}
			}

			/**
			 * Checks that ihe number passed to it is a Perfect Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is perfect if the sum of its factors is equal to the number.<tr>
			 * Example:
			 * @param num - The number to be checked
			 * @return
			 */
			public static boolean isPerfect(int num) {
						int sum = 1;
						for (int i = 2; i <= (num / 2); i++) {
									if ((num % i) == 0) {
												sum += i;
									}
						}
						if (num == sum) {
									return true;
						} else {
									return false;
						}
			}

			/**
			 * Checks that ihe number passed to it is a Prime Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is prime if it has 1 and itself as its only factors.<tr>
			 * Example: 7; 9.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is prime or not
			 */
			public static boolean isPrime(int n) {
						if (n <= 1) {
									return false;
						}
						if (n == 2) {
									return true;
						}
						double limit = Math.ceil(Math.sqrt(n)) + 1;
						int j = 2;
						while (j < limit) {
									if (n % j == 0) {
												return false;
									}
									j++;
						}
						return true;
			}

			/**
			 * Check weather the no. is a Palindrome Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Palindrome Number, when the number
			 * remains unchanged on reversing its digits.<tr>
			 * Example: 131; 1221.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is palindrome or not
			 */
			public static boolean isPalindrome(int n) {
						int Palindrome = 0, d;
						while (n > 0) {
									d = n % 10;
									Palindrome = Palindrome * 10 + d;
									n /= 10;
						}
						if (Palindrome == n) {
									return true;
						} else {
									return false;
						}
			}

			/**
			 * Check weather the String is a Palindrome or not
			 * and returns the corresponding boolean value.<tr>
			 * A String is a Palindrome, when the String remains
			 * unchanged on reversing its character.<tr>
			 * Example: "mom".
			 * @param nS - The String to be checked
			 * @return boolean value i.e. the no. is palindrome or not
			 */
			public static boolean isPalindrome(String nS) {
						return new StringBuffer(nS).reverse().toString().equals(nS);
			}

			/**
			 * Check weather the number is a Smith number or not
			 * and returns the corresponding boolean value.<tr>
			 * Smith number is a number who's sum of digits is equal
			 * to the sun of digits of Prime Factors of the number.<tr>
			 * Example: 666.
			 * @param n
			 * @return
			 */
			public static boolean isSmith(int n) {
						int[] PrimeFactors;
						try {
									PrimeFactors = MathematicalFunction.getPrimeFactors(n);
						} catch (IllegalNumberException ex) {
									System.out.println("Error: " + ex.getMessage());
									return false;
						}
						int sum = 0;
						int sumOfDigits = 0;
						for (int i = 0; i < PrimeFactors.length; i++) {
									int pfn = PrimeFactors[i];
									while (pfn >= 1) {
												sum += (pfn % 10);
												pfn /= 10;
									}
						}
						int num = n;
						while (num >= 1) {
									sumOfDigits += (num % 10);
									num /= 10;
						}
						return (sum == sumOfDigits);
			}

			/**
			 * Check weather the no. is a Special Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Special Number, when
				* sum of getFactorial of its digits is equal to the number.<tr>
			 * Example: 145.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is special or not
			 */
			public static boolean isSpecial(int n) {
						int[] digitA = MathematicalFunction.getDigitArray(n);
						int sum = 0;
						for (int i = 0; i < digitA.length; i++) {
									try {
												sum += MathematicalFunction.getFactorial(digitA[i]);
									} catch (IllegalNumberException ex) {
												System.out.println("Error: " + ex.getMessage());
												return false;
									}
						}
						if (sum == n) {
									return true;
						} else {
									return false;
						}
			}

			/**
			 * Check weather the no. is a Unique Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Unique Number, if any digit is not repeated in it.
			 * @param n - The number to be checked<tr>
			 * Example: 134625798.
			 * @return boolean value i.e. the no. is unique or not
			 */
			public static boolean isUnique(int n) {
						int digCount = 0;
						for (int i = 0; i <= 9; i++) {
									digCount = 0;
									int num = n;
									while (num >= 1) {
												if (i == (num % 10)) {
															digCount++;
															if (digCount > 1) {
																		return false;
															}
												}
												num /= 10;
									}
						}
						return true;
			}

			public static void main(String[] args) throws IOException {
						System.out.println("************************");
						System.out.println("*****Special Number*****");
						System.out.println("************************");
						for (;;) {
									System.out.println();
									System.out.println("Select the type of special number for which you want to test the number:");
									System.out.println(
																	"0 - All\n" +
																	"1 - Armstrong\n" +
																	"2 - Automorphic\n" +
																	"3 - Composite\n" +
																	"4 - Magic\n" +
																	"5 - Palindrome" +
																	"6 - Perfect\n" +
																	"7 - Prime\n" +
																	"8 - Special\n" +
																	"9 - Smith");
									System.out.println("Enter a number.");
									int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
									switch (n) {
												case 0:
															System.out.println("Armstrong Number: " + isArmstrong(n));
															System.out.println("Automorphic Number: " + isAutomorphic(n));
															System.out.println("Composite Number: " + isComposite(n));
															System.out.println("Magic Number: " + isMagic(n));
															System.out.println("Perfect Number: " + isPerfect(n));
															System.out.println("Prime Number: " + isPrime(n));
															System.out.println("Palindrome Number: " + isPalindrome(n));
															System.out.println("Special Number: " + isSpecial(n));
															System.out.println("Smith Number: " + isSmith(n));
															break;
												case 1:
															System.out.println("Armstrong Number: " + isArmstrong(n));
															break;
												case 2:
															System.out.println("Automorphic Number: " + isAutomorphic(n));
															break;
												case 3:
															System.out.println("Composite Number: " + isComposite(n));
															break;
												case 4:
															System.out.println("Magic Number: " + isMagic(n));
															break;
												case 5:
															System.out.println("Perfect Number: " + isPerfect(n));
															break;
												case 6:
															System.out.println("Prime Number: " + isPrime(n));
															break;
												case 7:
															System.out.println("Palindrome Number: " + isPalindrome(n));
															break;
												case 8:
															System.out.println("Special Number: " + isSpecial(n));
															break;
												case 9:
															System.out.println("Smith Number: " + isSmith(n));
															break;
												default:
									}
						}
			}
}
