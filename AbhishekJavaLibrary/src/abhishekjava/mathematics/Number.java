package abhishekjava.mathematics;

/**
 *
 * @author Abhishek
 */
public class Number {

	 public static String toWords(int num) {
			return toWords10(num);
	 }

	 private static String toWords10(long num) {
			if (num < 1000000000) {
				 return toWords9((int) num);
			} else {
				 return toWords1((int) num / 1000000000) + " Billion " + toWords9((int) num % 1000000000);
			}
	 }

	 private static String toWords9(int num) {
			if (num < 100000000) {
				 return toWords8(num);
			} else {
				 return toWords3(num / 1000000) + " Million " + toWords6(num % 1000000);
			}
	 }

	 private static String toWords8(int num) {
			if (num < 10000000) {
				 return toWords7(num);
			} else {
				 return toWords2(num / 1000000) + " Million " + toWords6(num % 1000000);
			}
	 }

	 private static String toWords7(int num) {
			if (num < 1000000) {
				 return toWords6(num);
			} else {
				 return toWords1(num / 1000000) + " Million " + toWords6(num % 1000000);
			}
	 }

	 private static String toWords6(int num) {
			if (num < 100000) {
				 return toWords5(num);
			} else {
				 return toWords3(num / 1000) + " Thousand " + toWords3(num % 1000);
			}
	 }

	 private static String toWords5(int num) {
			if (num < 10000) {
				 return toWords4(num);
			} else {
				 return toWords2(num / 1000) + " Thousand " + toWords3(num % 1000);
			}
	 }

	 private static String toWords4(int num) {
			if (num < 1000) {
				 return toWords3(num);
			} else {
				 return toWords1(num / 1000) + " Thousand " + toWords3(num % 1000);
			}
	 }

	 private static String toWords3(int num) {
			if (num < 100) {
				 return toWords2(num);
			} else {
				 return toWords1(num / 100) + " Hundred " + toWords2(num % 100);
			}
	 }

	 private static String toWords2(int num) {
			if (num < 10) {
				 return toWords1(num);
			} else if (num < 20) {
				 switch (num) {
						case 10:
							 return "Ten";
						case 11:
							 return "Eleven";
						case 12:
							 return "Twelve";
						case 13:
							 return "Thirteen";
						case 14:
							 return toWords1(num / 10) + "teen";
						case 15:
							 return "Fifteen";
						case 16:
							 return toWords1(num / 10) + "teen";
						case 17:
							 return toWords1(num / 10) + "teen";
						case 18:
							 return toWords1(num / 10) + "teen";
						case 19:
							 return toWords1(num / 10) + "teen";
				 }
			} else if (num == 20) {
				 return "Twenty";
			} else if (num < 30) {
				 return "Twenty " + toWords1(num % 10);
			} else if (num == 30) {
				 return "Thirty";
			} else if (num < 40) {
				 return "Thirty " + toWords1(num % 10);
			} else if (num == 40) {
				 return "Fourty";
			} else if (num < 50) {
				 return "Fourty " + toWords1(num % 10);
			} else if (num == 50) {
				 return "Fifty";
			} else if (num < 60) {
				 return "Fifty " + toWords1(num % 10);
			} else if (num == 60) {
				 return "Sixty";
			} else if (num < 70) {
				 return "Sixty " + toWords1(num % 10);
			} else if (num == 70) {
				 return "Seventy";
			} else if (num < 80) {
				 return "Seventy " + toWords1(num % 10);
			} else if (num == 80) {
				 return "Eighty";
			} else if (num < 90) {
				 return "Eighty " + toWords1(num % 10);
			} else if (num == 90) {
				 return "Ninty";
			} else if (num < 100) {
				 return "Ninty " + toWords1(num % 10);
			}
			return "";
	 }

	 private static String toWords1(int num) {
			switch (num) {
				 case 0:
						return "Zero";
				 case 1:
						return "One";
				 case 2:
						return "Two";
				 case 3:
						return "Three";
				 case 4:
						return "Four";
				 case 5:
						return "Five";
				 case 6:
						return "Six";
				 case 7:
						return "Seven";
				 case 8:
						return "Eight";
				 case 9:
						return "Nine";
			}
			return "";
	 }
}
