package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Abhishek
 */
public class Automorphic {

	 static int num;
	 static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			for (;;) {
				 input();
				 if (isAutomorphic()) {
						System.out.println("The number is an Automorphic number.");
				 } else {
						System.out.println("The number is not an Automorphic number.");
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
	  * Check weather the no. is a Automorphic Number or not
	  * and returns the corresponding boolean value.<tr>
	  * @return boolean value i.e. the no. is Automorphic or not
	  */
	 public static boolean isAutomorphic() {
			int auto = (int) Math.pow(num, 2);
			while (num >= 1) {
				 if ((num % 10) != (auto % 10)) {
						return false;
				 }
				 num /= 10;
				 auto /= 10;
			}
			return true;
	 }
}
