package abhishekjava.mathematics;

public class CalculationsString {

    /**
     * Method Calculations
     *
     *
     */
    public CalculationsString() {
        // TODO: Add your code here
    }

    /**
     * Method Addition
     * @param a
     * @param b
     * @return
     */
    public static String Addition(String a, String b) {
        String rs = "";
    /*if (Abhishek_Software_PackageFrame.HighPrecision) {
    double an = Double.parseDouble(a);
    double bn = Double.parseDouble(b);
    double rn = an + bn;
    rs = Double.toString(rn);
    return rs;
    } else {
    
    }*/return rs;
    }

    /**
     * Method Subtraction
     * @param a
     * @param b
     * @return
     */
    public static String Subtraction(String a, String b) {
        double an = Double.parseDouble(a);
        double bn = Double.parseDouble(b);
        double rn = an - bn;
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method Multiplication
     * @param a
     * @param b
     * @return
     */
    public static String Multiplication(String a, String b) {
        double an = Double.parseDouble(a);
        double bn = Double.parseDouble(b);
        double rn = an * bn;
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method Division
     * @param a
     * @param b
     * @return
     */
    public static String Division(String a, String b) {
        double an = Double.parseDouble(a);
        double bn = Double.parseDouble(b);
        double rn = an / bn;
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method Remainder
     * @param a
     * @param b
     * @param c 
     * @return
     */
    public static String Remainder(String a, String b, char c) {
        double an = Double.parseDouble(a);
        double bn = Double.parseDouble(b);
        String rs = "";

        switch (c) {
            case 'r':
                double rnr = an % bn;
                rs = Double.toString(rnr);
                break;
            case 'q':
                long rnq = (long) (an / bn);
                rs = Long.toString(rnq);
                break;
        }
        return rs;
    }

    /**
     * Method Power
     * @param a
     * @param b
     * @return
     *
     */
    public static String Power(String a, String b) {
        double an = Double.parseDouble(a);
        double bn = Double.parseDouble(b);
        double rn = Math.pow(an, bn);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method sin
     * @param a
     * @return
     */
    public static String sin(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.sin(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method cos
     * @param a
     * @return
     */
    public static String cos(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.cos(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method tan
     * @param a
     * @return
     */
    public static String tan(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.tan(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method cot
     * @param a
     * @return
     */
    public static String cot(String a) {
        double an = Double.parseDouble(a);
        double rn = Double.parseDouble(Division("1", Double.toString(Math.tan(an))));
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method sec
     * @param a
     * @return
     */
    public static String sec(String a) {
        double an = Double.parseDouble(a);
        double rn = Double.parseDouble(Division("1", Double.toString(Math.cos(an))));
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method cosec
     * @param a
     * @return
     */
    public static String cosec(String a) {
        double an = Double.parseDouble(a);
        double rn = Double.parseDouble(Division("1", Double.toString(Math.sin(an))));
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method asin
     * @param a
     * @return
     */
    public static String asin(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.asin(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method acos
     * @param a
     * @return
     */
    public static String acos(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.acos(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method atan
     * @param a
     * @return
     */
    public static String atan(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.atan(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method acot
     * @param a
     * @return
     */
    public static String acot(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.atan(Double.parseDouble(Division("1", Double.toString(an))));
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method asec
     * @param a
     * @return
     */
    public static String asec(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.acos(Double.parseDouble(Division("1", Double.toString(an))));
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method acosec
     * @param a
     * @return
     */
    public static String acosec(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.asin(Double.parseDouble(Division("1", Double.toString(an))));
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method log
     * @param a
     * @return
     */
    public static String log(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.log10(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method antilog
     * @param a
     * @return
     */
    public static String antilog(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.pow(10, an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method ln
     * @param a
     * @return
     */
    public static String ln(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.log(an);
        String rs = Double.toString(rn);
        return rs;
    }

    /**
     * Method antiln
     * @param a
     * @return
     */
    public static String antiln(String a) {
        double an = Double.parseDouble(a);
        double rn = Math.exp(an);
        String rs = Double.toString(rn);
        return rs;
    }
}
