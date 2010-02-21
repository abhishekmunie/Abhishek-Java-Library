package abhishekjava.lang;

import java.util.StringTokenizer;

/**
 *
 * @author Abhishek
 */
public class StringFunction {

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

	 public static String sortCharacter(String str) {
			String s = "";
			char[] c = str.toCharArray();
			int minP;
			char temp;
			for (int i = 0; i < str.length(); i++) {
				 minP = i;
				 for (int j = i + 1; j < str.length(); j++) {
						if (c[j] < c[minP]) {
							 minP = j;
						}
				 }
				 temp = c[i];
				 c[i] = c[minP];
				 c[minP] = temp;
			}
			return new String(c);
	 }

	 public static String toggleCase(String s) {
			String strToggled = "";
			for(char ch : s.toCharArray()){
				 if ((ch >= 65) && (ch <= 90)) {
						ch = Character.toLowerCase(ch);
				 }
				 if ((ch >= 97) && (ch <= 122)) {
						ch = Character.toUpperCase(ch);
				 }
				 strToggled += ch;
			}
			return strToggled;
	 }

	 /**
	  * Captalizes the first character of the string passed.
	  * @param s String whose first character is to be captalized.
	  * @return String with first character captalized
	  */
	 public static String captalizeFirstCharacter(String s) {
			return s.toLowerCase().replaceFirst(Character.toString(s.charAt(0)), Character.toString(s.toUpperCase().charAt(0)));
	 }

	 public static String toggleCaseOfVowel(String str) {
			String strT = "";
			for (int i = 0; i < str.length(); i++) {
				 char c = str.charAt(i);
				 if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
						c = Character.toUpperCase(c);
				 } else if ((c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
						c = Character.toLowerCase(c);
				 }
				 strT += c;
			}
			return strT;
	 }

	 /**
	  * Converts the sentance toBeTokanized into an array of tokens.
	  * @param toBeTokanized sentance to be tokanized.
	  * @return Array of base type String storing the array of tokens.
	  */
	 public static String[] createTokenArray(String toBeTokanized) {
			StringTokenizer tokenizer = new StringTokenizer(toBeTokanized, " .");
			String[] wordArray = new String[tokenizer.countTokens()];
			for (int i = 0; tokenizer.hasMoreTokens(); i++) {
				 wordArray[i] = tokenizer.nextToken();
			}
			return wordArray;
	 }

	 /**
	  * Main Method
	  * @param args the command line arguments
	  */
	 public static void main(String[] args) {
			// TODO code application logic here
	 }
}
