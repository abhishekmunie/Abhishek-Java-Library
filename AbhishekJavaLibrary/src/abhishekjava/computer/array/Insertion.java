package abhishekjava.computer.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Insertion {

			static int[] ARR;
			static int COUNT, SIZE, ELE, POS;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						enterArray();
						insert();
						display();
			}

			static void enterArray() throws IOException {
						System.out.print("Enter the size of Array: ");
						SIZE = Integer.parseInt(BR.readLine());
						System.out.println("Enter the elements of Array: ");
						ARR = new int[SIZE + 1];
						for (int i = 0; i < SIZE; i++) {
									ARR[i] = Integer.parseInt(BR.readLine());
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number: ");
						ELE = Integer.parseInt(BR.readLine());
						System.out.print("Enter the Position: ");
						POS = Integer.parseInt(BR.readLine()) - 1;
			}

			static void insert() throws IOException {
						COUNT = SIZE - 1;
						input();
						while (COUNT >= POS) {
									ARR[COUNT + 1] = ARR[COUNT];
									COUNT--;
						}
						ARR[POS] = ELE;
			}

			static void display() {
						for (int i = 0; i < ARR.length; i++) {
									System.out.print(ARR[i]);
									if (i < (ARR.length - 1)) {
												System.out.print(", ");
									}
						}
						System.out.println();
			}
}
