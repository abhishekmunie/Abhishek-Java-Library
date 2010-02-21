package abhishekjava.computer.array;

import java.io.*;

/**
 * @author Abhishek
 */
public class Sort {

			static int[] Unsorted, Sorted;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			public static void main(String[] args) throws IOException {
						Outer:
						for (;;) {
									input();
									sortTech();
									output();
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
						Unsorted = new int[n];
						Sorted = new int[n];
						System.out.println("Enter the Elements of the Array:");
						for (int i = 0; i < Unsorted.length; i++) {
									Unsorted[i] = Integer.parseInt(BR.readLine());
						}
			}

			static void sortTech() throws IOException {
						Outer:
						for (;;) {
									System.out.println("The Array can be sorted in Two Ways:");
									System.out.println("\t1: Selection Sort");
									System.out.println("\t2: Bubble Sort");
									System.out.println("Select the way you want to use?");

									switch (Integer.parseInt(BR.readLine())) {
												case 1:
															SelectionSort();
															break Outer;
												case 2:
															BubbleSort();
															break Outer;
												default:
															System.out.println("Wrong choice.");
															continue Outer;
									}
						}

			}

			static void BubbleSort() {
						Sorted = Unsorted;
						int temp;
						for (int i = 0; i < Sorted.length; i++) {
									for (int j = 0; j < Sorted.length - 1 - i; j++) {
												if (Sorted[j] > Sorted[j + 1]) {
															temp = Sorted[j];
															Sorted[j] = Sorted[j + 1];
															Sorted[j + 1] = temp;
												}
									}
						}
			}

			static void SelectionSort() {
						Sorted = Unsorted;
						int minP, temp;
						for (int i = 0; i < Sorted.length; i++) {
									minP = i;
									for (int j = i + 1; j < Sorted.length; j++) {
												if (Sorted[j] < Sorted[minP]) {
															minP = j;
												}
									}
									temp = Sorted[i];
									Sorted[i] = Sorted[minP];
									Sorted[minP] = temp;
						}
			}

			static void output() {
						for (int i = 0; i < Sorted.length; i++) {
									System.out.print(Sorted[i] + "\t");
						}
						System.out.println();
			}
}
