/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.security;

/**
 * Contains functions required to encrypt or decrypt information for security purpose.
 *
 * @author Abhishek
 */
public class Encryption {

    /**
     *
     * @param ToBeEncrypted
     * @param KeyCode
     * @param oper1
     * @param oper2
     * @param oper3
     * @return
     * @throws abhishekjava.Security.EncryptionException
     */
    public static final String[] Encrypt(String[] ToBeEncrypted, String KeyCode, char oper1, char oper2, char oper3) throws EncryptionException {
        String[] encryptedString = new String[ToBeEncrypted.length];
        for (int i = 0; i < ToBeEncrypted.length; i++) {
            encryptedString[i] = Encrypt(ToBeEncrypted[i], KeyCode, oper1, oper2, oper3);

        }
        return encryptedString;
    }

    /**
     *
     * @param ToBeEncrypted
     * @param KeyCode
     * @param oper1
     * @param oper2
     * @param oper3
     * @return
     * @throws abhishekjava.Security.EncryptionException
     */
    public static final String Encrypt(String ToBeEncrypted, String KeyCode, char oper1, char oper2, char oper3) throws EncryptionException {
        String encryptedString = new String();
        for (java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(ToBeEncrypted); stringTokenizer.hasMoreTokens();) {
            encryptedString = encryptedString + encode(stringTokenizer.nextToken(), KeyCode, oper1, oper2, oper3) + ";";
        }
        return encryptedString;
    }

    /**
     *
     * @param ToBeDecrypted
     * @param KeyCode
     * @param oper1
     * @param oper2
     * @param oper3
     * @return
     * @throws abhishekjava.Security.EncryptionException
     */
    public static final String[] Decrypt(String[] ToBeDecrypted, String KeyCode, char oper1, char oper2, char oper3) throws EncryptionException {
        String[] decryptedString = new String[ToBeDecrypted.length];
        for (int i = 0; i < ToBeDecrypted.length; i++) {
            decryptedString[i] = Decrypt(ToBeDecrypted[i], KeyCode, oper1, oper2, oper3);

        }
        return decryptedString;
    }

    /**
     *
     * @param ToBeDecrypted
     * @param KeyCode
     * @param oper1
     * @param oper2
     * @param oper3
     * @return
     * @throws abhishekjava.Security.EncryptionException
     */
    public static final String Decrypt(String ToBeDecrypted, String KeyCode, char oper1, char oper2, char oper3) throws EncryptionException {
        String decryptedString = new String();
        for (java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(ToBeDecrypted, ";"); stringTokenizer.hasMoreTokens();) {
            decryptedString = decryptedString + decode(stringTokenizer.nextToken(), KeyCode, oper1, oper2, oper3) + ";";

        }
        return decryptedString;
    }

    /**
     *
     * @param ToBeEncoded
     * @param KeyCode
     * @param oper1
     * @param oper2
     * @param oper3
     * @return
     * @throws abhishekjava.Security.EncryptionException
     */
    private static final String encode(String ToBeEncoded, String KeyCode, char oper1, char oper2, char oper3) throws EncryptionException {

        String sen = new String();
        String key = new String(KeyCode);

        long len1;
        long len2;
        long len3;
        if (KeyCode.length() == 9) {
            len1 = Long.parseLong(key.substring(0, 3));
            len2 = Long.parseLong(key.substring(3, 6));
            len3 = Long.parseLong(key.substring(6, 9));
        } else if (KeyCode.length() == 18) {

            len1 = Long.parseLong(key.substring(0, 6));
            len2 = Long.parseLong(key.substring(6, 12));
            len3 = Long.parseLong(key.substring(12, 18));
        } else {
            throw new abhishekjava.security.EncryptionException("The LENGTH of the key no. used for encoding is of unsupported length.");
        }

        char c[] = ToBeEncoded.toCharArray();
        long dnreturn = 0;
        long adns2;
        String enbi = "";

        for (int i = 0; i < ToBeEncoded.length(); i++) {
            long cl = (long) c[i];
            String dnr;
            switch (oper1) {
                case '+':
                    dnr = Long.toString(cl + len1);
                    break;
                case '-':
                    dnr = Long.toString(cl - len1);
                    break;
                case '*':
                    dnr = Long.toString(cl * len1);
                    break;
                default:
                    throw new abhishekjava.security.EncryptionException("The FIRST operator use for encoding is of unsupported type.");
            }

            //dnreturn = Long.parseLong(abhishekjava.Computer.NumberSystem.D_N(dnr));
            dnreturn = Long.parseLong(dnr);

            switch (oper2) {
                case '+':
                    adns2 = dnreturn + len2;
                    break;
                case '-':
                    adns2 = dnreturn - len2;
                    break;
                case '*':
                    adns2 = dnreturn * len2;
                    break;
                default:
                    throw new abhishekjava.security.EncryptionException("The SECOND operator use for encoding is of unsupported type.");
            }

            switch (oper3) {
                case '+':
                    enbi = Long.toString(adns2 + len3);
                    break;
                case '-':
                    enbi = Long.toString(adns2 - len3);
                    break;
                case '*':
                    enbi = Long.toString(adns2 * len3);
                    break;
                default:
                    throw new abhishekjava.security.EncryptionException("The THIRD operator use for encoding is of unsupported type.");
            }

            //sen = sen.concat(abhishekjava.Computer.NumberSystem.D_B(enbi).concat(" "));
            sen = sen.concat(enbi).concat(" ");
        }
        sen = sen.trim();
        return sen;
    }

    /**
     * @param ToBeDecoded
     * @param KeyCode
     * @param oper1
     * @param oper2
     * @param oper3 
     * @return
     * @throws EncryptionException
     */
    private static final String decode(String ToBeDecoded, String KeyCode, char oper1, char oper2, char oper3) throws EncryptionException {

        java.util.StringTokenizer st = new java.util.StringTokenizer(ToBeDecoded);
        char[] sbrL = new char[st.countTokens()];
        String key = new String(KeyCode);

        long len1;
        long len2;
        long len3;
        if (KeyCode.length() == 9) {
            len1 = Long.parseLong(key.substring(0, 3));
            len2 = Long.parseLong(key.substring(3, 6));
            len3 = Long.parseLong(key.substring(6, 9));
        } else if (KeyCode.length() == 18) {

            len1 = Long.parseLong(key.substring(0, 6));
            len2 = Long.parseLong(key.substring(6, 12));
            len3 = Long.parseLong(key.substring(12, 18));
        } else {
            throw new abhishekjava.security.EncryptionException("The LENGTH of the key no. used for encoding is of unsupported length.");
        }

        String dnreturn;
        long adns2;
        long enbi;

        for (int i = 0; i < sbrL.length; i++) {
            //String cS = abhishekjava.Computer.NumberSystem.B_D(st.nextToken());
            String cS = st.nextToken();
            switch (oper3) {
                case '+':
                    enbi = (Long.parseLong(cS)) - len3;
                    break;
                case '-':
                    enbi = (Long.parseLong(cS)) + len3;
                    break;
                case '*':
                    enbi = (Long.parseLong(cS)) / len3;
                    break;
                default:
                    throw new abhishekjava.security.EncryptionException("The THIRD operator use for encoding is of unsupported type.");
            }

            switch (oper2) {
                case '+':
                    adns2 = enbi - len2;
                    break;
                case '-':
                    adns2 = enbi + len2;
                    break;
                case '*':
                    adns2 = enbi / len2;
                    break;
                default:
                    throw new abhishekjava.security.EncryptionException("The SECOND operator use for encoding is of unsupported type.");
            }

            //String interM = abhishekjava.Computer.NumberSystem.N_D(Long.toString(adns2));
            String interM = Long.toString(adns2);
            switch (oper1) {
                case '+':
                    dnreturn = Long.toString((Long.parseLong(interM)) - len1);
                    break;
                case '-':
//                    dnreturn = Long.toString((Long.parseLong(abhishekjava.Computer.NumberSystem.N_D(Long.toString(adns2)))) + len1);
                    break;
                case '*':
//                    dnreturn = Long.toString((Long.parseLong(abhishekjava.Computer.NumberSystem.N_D(Long.toString(adns2)))) / len1);
                    break;
                default:
                    throw new abhishekjava.security.EncryptionException("The FIRST operator use for encoding is of unsupported type.");
            }

//            sbrL[i] = (char) Long.parseLong(dnreturn);
        }
        return new String(sbrL);
    }
}
