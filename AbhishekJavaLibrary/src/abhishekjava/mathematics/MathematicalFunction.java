/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.mathematics;

import java.math.BigInteger;

/**
 * Contains some mathematical functions (i.e. getFactors, primerFactors, getFactorial
 *
 * @author Abhishek
 */
public class MathematicalFunction {

    /**
     * Return the individual digit of the number.
     * @param num
     * @return
     */
    public static int[] getDigitArray(int num) {
        int[] digitIs = new int[Double.toString(num).length()];
        for (int i = 0; i < digitIs.length; i++) {
            digitIs[i] = num % 10;
            num /= 10;
        }
        return digitIs;
    }

    /**
     * Returns the getFactors of the number in form of an int Array.
     * @param num
     * @return int[] of getFactors
     */
    public static int[] getFactors(int num) {
        if (num < 0) {
        }
        int counter = 1;
        int b = num / 2;
        int[] factors = new int[b];
        factors[0] = 1;
        for (int i = 1; i < b; i++) {
            if ((num % i) == 0) {
                factors[counter] = i;
                counter++;
            }
        }
        factors[counter] = num;
        return java.util.Arrays.copyOf(factors, (counter + 1));
    }

    /**
     * Returns the prime getFactors of the number in form of an int Array.
     * @param num
     * @return int[] of prime getFactors
     * @throws IllegalNumberException
     */
    public static int[] getPrimeFactors(int num) throws IllegalNumberException {
        if (num < 0) {
            throw new IllegalNumberException("The no. whose prime factors have to be found should not be less than one.");
        }
        int c = 0;
        int[] primeFactors = new int[num / 2];
        while (num > 1) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    primeFactors[c] = i;
                    c++;
                    num /= i;
                    break;
                }
            }
        }
        return java.util.Arrays.copyOf(primeFactors, c);
    }

//    /**
//     * Returns the prime getFactors of the number in form of an int Array.
//     * @param num
//     * @param code
//     * @return int[] of prime getFactors
//     * @throws MathematicalException
//     */
//    public static int[] primerFactors(int num) throws MathematicalException {
//        if (num <) {
//            int[] pF
//        }
//        =  new pF[1];
//
//        int j;
//        double limit;
//        int numprimes = 1; //2 is prime
//        int i = 3;
//        while (i <= num) {
//            boolean isPrime = true;
//            limit = Math.ceil(Math.sqrt(i)) + 1;
//
//            j = 3;
//            while (j < limit) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//                j += 2;
//            }
//            i += 2;
//            if (!isPrime) {
//                continue;
//            }
//            if (isPrime) {
//                numprimes++;
//            }
//        }
//
//        int[] A = null;
//        int b = num / 2;
//        A[0] = 1;
//        for (int i = 2; i < b; i++) {
//            if (SpecialNumbers.isPrime(i)) {
//                for (int j = 0; j < num; j++) {
//                    if ((num % i) == 0) {
//                        A[A.length] = i;
//                        num = num / i;
//                    } else {
//                        break;
//                    }
//                }
//            }
//
//        }
//        return A;
//    }
    /**
     * Returns the factorial of the number.
     * @param num
     * @return int of getFactorial
     * @throws IllegalNumberException
     */
    public static long getFactorial(long num) throws IllegalNumberException {
        if (num < 0) {
            throw new IllegalNumberException("The no. whose factorial has to be found sould not be less than one.");
        }
        if (num == 0) {
            return 1;
        }
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f.longValue();
    }
}
