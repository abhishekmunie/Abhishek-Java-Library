package abhishekjava.computer;

//import abhishekjava.Mathematics.CalculationsString;

public class NumberSystemString {
//
//    /**
//     * Method NumberSystem
//     *
//     *
//     */
//    public NumberSystemString() {
//        // TODO: Add your code here
//    }
//
//    /**
//     * Method D_B
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String DecimalToBinary(String a) {
//        // TODO: Add your code here
//        String rs = "";
//        for (;;) {
//            rs = (CalculationsString.Remainder(a, "2", 'r')) + rs;
//            a = CalculationsString.Remainder(a, "2", 'q');
//            if ((a.equals("0")) || (a.equals("1"))) {
//                break;
//            }
//        }
//        return rs;
//    }
//
//    /**
//     * Method D_O
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String DecimalToOctagonal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//        for (;;) {
//            rs = (CalculationsString.Remainder(a, "8", 'r')) + rs;
//            a = CalculationsString.Remainder(a, "8", 'q');
//            if ((a.equals("0")) || (a.equals("1")) || (a.equals("3")) || (a.equals("4")) || (a.equals("5")) || (a.equals("6")) || (a.equals("7"))) {
//                break;
//            }
//        }
//        return rs;
//    }
//
//    /**
//     * Method D_H
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String DecimalToHexadecimal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//        String rsa = CalculationsString.Remainder(a, "16", 'r');
//        String rsar;
//
//        if (rsa.equals("10")) {
//            rsar = "A";
//        } else if (rsa.equals("11")) {
//            rsar = "B";
//        } else if (rsa.equals("12")) {
//            rsar = "C";
//        } else if (rsa.equals("13")) {
//            rsar = "D";
//        } else if (rsa.equals("14")) {
//            rsar = "E";
//        } else if (rsa.equals("15")) {
//            rsar = "F";
//        } else {
//            rsar = rsa;
//        }
//        for (;;) {
//            rs = rsar + rs;
//            a = CalculationsString.Remainder(a, "16", 'q');
//            if ((a.equals("0")) || (a.equals("1")) || (a.equals("3")) || (a.equals("4")) || (a.equals("5")) || (a.equals("6")) || (a.equals("7")) || (a.equals("8")) || (a.equals("9")) || (a.equals("A")) || (a.equals("B")) || (a.equals("C")) || (a.equals("D")) || (a.equals("E")) || (a.equals("F"))) {
//                break;
//            }
//        }
//        return rs;
//    }
//
//    /**
//     * Method B_D
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String BinaryToDecimal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//        char c[] = a.toCharArray();
//        long sum = 0;
//        for (int i = 0; i < c.length; i++) {
//            sum += Long.parseLong(CalculationsString.Multiplication(Character.toString(c[i]), (CalculationsString.Power("2", Integer.toString(i)))));
//        }
//        rs = Long.toString(sum);
//        return rs;
//    }
//
//    /**
//     * Method B_O
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String BinaryToOctagonal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method B_H
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String BinaryToHexadecimal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method O_D
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String OctagonalToDecimal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method O_B
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String OctagonalToBinary(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method O_H
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String OctagonalToHexadecimal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method H_D
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String HexadecimalToDecimal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method H_B
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String HexadecimalToBinary(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method H_O
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static String HexadecimalToOctagonal(String a) {
//        // TODO: Add your code here
//        String rs = "";
//
//        return rs;
//    }
//
//    /**
//     * Method D_N
//     *
//     *
//     * @param a
//     *
//     * @return
//     *
//     */
//    public static final String D_N(String a) {
//        // TODO: Add your code here
//        long l = Long.parseLong(a);
//        String rs = "";
//        for (;;) {
//            rs = Long.toString(1 + (l % 9)) + rs;
//            l = l / 9;
//            if (l <= 9) {
//                break;
//            }
//        }
//        return rs;
//    }
//
//    public static final String N_D(String a) {
//
//        // TODO: Add your code here
//        String rs = "";
//        char c[] = a.toCharArray();
//        long sum = 0;
//        for (int i = 0; i < c.length; i++) {
//            sum += Long.parseLong(CalculationsString.Multiplication(Long.toString(((long) c[i]) - 1), (CalculationsString.Power("9", Integer.toString(i)))));
//        }
//        rs = Long.toString(sum);
//        return rs;
//    }
}
