package abhishekjava.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HPDivision {

	 static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	 public static void main(String[] args) throws IOException {
			for (;;) {
				 System.out.print("Enter the number: ");
				 int num = Integer.parseInt(BR.readLine());
				 System.out.print("Enter the divisor: ");
				 int div = Integer.parseInt(BR.readLine());
				 System.out.print("Enter the decimal place until where you want the answer: ");
				 int deci = Integer.parseInt(BR.readLine());
				 System.out.println();
				 System.out.println("Using Integer: ");
				 divide(num, div, deci);
				 System.out.println();
				 System.out.println("Using BigInteger: ");
				 divide(BigInteger.valueOf(num), BigInteger.valueOf(div), BigInteger.valueOf(deci));
				 System.out.println();
				 for (;;) {
						System.out.println();
						System.out.println("Do you want to continue?(yes/no)");
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

	 public static void divide(long dividend, long divisor, long decimalPlace) {
			long a, b, c, d;
			boolean h = false;
			boolean r = false;
			long f = 1;
			System.out.println(dividend + " divided by " + divisor + " to " + decimalPlace + " decimal place is:");
			for (;;) {
				 if (dividend < divisor) {
						if (!r) {
							 System.out.print("O.");
						} else {
							 System.out.print("0");
							 dividend = dividend * 10;
							 h = r = true;
						}
				 } else {
						break;
				 }
			}
			a = dividend / divisor;
			if (!h) {
				 System.out.print(a + ".");
			} else {
				 System.out.print(a);
			}
			b = dividend % divisor;
			while (f <= decimalPlace) {
				 c = b * 10;
				 for (;;) {
						if ((c < divisor) && (f < decimalPlace)) {
							 c = c * 10;
							 System.out.print("0");
							 f++;
						} else {
							 break;
						}
				 }
				 d = c / divisor;
				 System.out.print(d);
				 b = c % divisor;
				 f++;
			}
	 }

	 public static void divide(BigInteger dividend, BigInteger divisor, BigInteger decimalPlace) {
			BigInteger a, b, c, d;
			boolean h = false;
			boolean r = false;
			BigInteger f = BigInteger.ONE;
			System.out.println(dividend + " divided by " + divisor + " to " + decimalPlace + " decimal place is:");
			for (;;) {
				 if (dividend.compareTo(divisor) <= -1) {
						if (!r) {
							 System.out.print("O.");
						} else {
							 System.out.print("0");
							 dividend = dividend.multiply(BigInteger.TEN);
							 h = r = true;
						}
				 } else {
						break;
				 }
			}
			a = dividend.divide(divisor);
			if (!h) {
				 System.out.print(a + ".");
			} else {
				 System.out.print(a);
			}
			b = dividend.remainder(divisor);
			while (f.compareTo(decimalPlace) <= 0) {
				 c = b.multiply(BigInteger.TEN);
				 for (;;) {
						if ((c.compareTo(divisor) < 0) && (f.compareTo(decimalPlace) < 0)) {
							 c = c.multiply(BigInteger.TEN);
							 System.out.print("0");
							 f = f.add(BigInteger.ONE);
						} else {
							 break;
						}
				 }
				 d = c.divide(divisor);
				 System.out.print(d);
				 b = c.remainder(divisor);
				 f = f.add(BigInteger.ONE);
			}
	 }
}
