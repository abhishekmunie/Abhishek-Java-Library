package abhishekjava.computer.array;

import java.io.*;

/**
 * @author Abhishek
 */
public class Search {

			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
			static int[] A;
			static int toBeSearched;

			public static void main(String[] args) throws IOException {
						Outer:
						for (;;) {
									input();
									searchTech();
									for (;;) {
												System.out.println("Do you want to continue?");
												String ans = BR.readLine();
												if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")) {
															continue Outer;
												} else if (ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")) {
															break Outer;
												} else {
															System.out.println("Wrong choice");
												}
									}
						}
			}

			static void input() throws IOException {
						System.out.println("Enter the Size of the Array:");
						int n = Integer.parseInt(BR.readLine());
						A = new int[n];
						System.out.println("Enter the Elements of the Array:");
						for (int i = 0; i < A.length; i++) {
									A[i] = Integer.parseInt(BR.readLine());
						}
						System.out.println("Enter the number to be Searched:");
						toBeSearched = Integer.parseInt(BR.readLine());
			}

			static void searchTech() throws IOException {
						Outer:
						for (;;) {
									System.out.println("The Array can be Searched in Two Ways:");
									System.out.println("\t1: Linear Search");
									System.out.println("\t2: Binary Search");

									System.out.println("Select the way you want to use?");
									switch (Integer.parseInt(BR.readLine())) {
												case 1:
															LinearSearch();
															break Outer;
												case 2:
															BinarySearch();
															break Outer;
												default:
															System.out.println("Wrong choice.");
															continue Outer;
									}
						}

			}

			private static void BinarySearch() {
						boolean isPresent = false;
						int L = 0;
						int U = A.length - 1;
						int M = (L + U) / 2;
						while ((A[M] != toBeSearched) && (L < U)) {
									if (A[M] > toBeSearched) {
												U = M - 1;
									} else {
												L = M + 1;
									}
									M = (L + U) / 2;
						}
						if (L < U) {
									System.out.println("The element is present.");
						} else {
									System.out.println("The element is not present.");
						}
			}

			private static void LinearSearch() {
						boolean isPresent = false;
						for (int i = 0; i < A.length; i++) {
									if (A[i] == toBeSearched) {
												isPresent = true;
												break;
									}
						}
						if (isPresent) {
									System.out.println("The element is present.");
						} else {
									System.out.println("The element is not present.");
						}
			}
}
