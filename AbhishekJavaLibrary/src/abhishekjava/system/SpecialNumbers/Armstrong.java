package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Armstrong {

	 static int num;
	 static int sum = 0;
	 static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			for (;;) {
				 input();
				 isArmstrong();
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
			System.out.print("Enter the no. to be checked: ");
			num = Integer.parseInt(BR.readLine());
	 }

	 static void isArmstrong() {
			int n = num;
			while (n > 0) {
				 sum += Math.pow(n % 10, 3);
				 n /= 10;
			}
			if (sum == num) {
				 System.out.println("The no. is an Armstrong no.");
			} else {
				 System.out.println("The no. is not an Armstrong no.");
			}
	 }
}
