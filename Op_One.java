import java.math.BigInteger;

public class Op_One {

    // public static long A = 0x01234567;
    // public static long B = 0x89ABCDEF;
    // public static long C = 0xFEDCBA98;
    // public static long D = 0x76543210;
    public static void main(String[] args) {
        F(B, C, D);
    }

    public static BigInteger A = new BigInteger("67452301", 16);
    public static BigInteger B = new BigInteger("efcdab89", 16);
    public static BigInteger C = new BigInteger("98badcfe", 16);
    public static BigInteger D = new BigInteger("10325476", 16);
    public static BigInteger intForModAdd = new BigInteger("100000000", 16);
    public static BigInteger mask32 = new BigInteger("FFFFFFFF",16);

    public static BigInteger F(BigInteger b, BigInteger c, BigInteger d) {
        // System.out.println(b.and(c));
        // long newval = (b&c)|((~b)&d);
        BigInteger bAndC = b.and(c);
        BigInteger notB = b.not().and(mask32);
        BigInteger notBAndD = notB.and(d);
        BigInteger result = bAndC.or(notBAndD).and(mask32);

        // System.out.println("for b and c: " + bAndC);
        // System.out.println("for b not: " + notB);
        // System.out.println("for b not and d: " + notBAndD);
        //         System.out.println("full " + result);
        // System.out.println(newval);
        return result;
    }

    public static BigInteger modularAddition(BigInteger X, BigInteger Y, BigInteger Z) {
        BigInteger XPlusY = X.add(Y);
       // System.out.println("x plus y " + XPlusY);
        BigInteger result = XPlusY.mod(Z);
        // System.out.println("full " + result);
        return result;
    }

    public static void opOne(BigInteger a, BigInteger b, BigInteger c, BigInteger d, int hexStrInt, int kConstAndSInt) {
        BigInteger F1 = F(b, c, d);
        F1.add(a).add(Padding.hexStrings[hexStrInt]).add(new BigInteger(Utils.KConstants[kConstAndSInt - 1], 16));
        // System.out.println(F1);
        // BigInteger MA1 = modularAddition(a, F1, intForModAdd);
        // System.out.println(MA1);
        // BigInteger MA2 = modularAddition(Padding.hexStrings[hexStrInt],
        //                                  MA1, intForModAdd);
        // System.out.println(MA2);
        // BigInteger MA3 = modularAddition(new BigInteger(Utils.KConstants[kConstAndSInt - 1], 16),
                                         // MA2, intForModAdd);
        // System.out.println(MA3);

        // left bit shift
        String binStr = F1.toString(2);
        // System.out.println(binStr);
        binStr = Padding.zerosPad(-1, 32, binStr);
        String newBin = "" + binStr.substring(Utils.SValues[kConstAndSInt - 1]) + binStr.substring(0, Utils.SValues[kConstAndSInt - 1]);
        BigInteger afterShift = Padding.binaryStringtoInt(newBin);
        // BigInteger MA4 = modularAddition(b, afterShift, intForModAdd);

        A = d;
        B = b.add(afterShift);
        C = b;
        D = c;
    }
}
