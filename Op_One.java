import java.math.BigInteger;

public class Op_One {

    public static BigInteger A = new BigInteger("67452301", 16);
    public static BigInteger B = new BigInteger("efcdab89", 16);
    public static BigInteger C = new BigInteger("98badcfe", 16);
    public static BigInteger D = new BigInteger("10325476", 16);

    public static final BigInteger mod32 = new BigInteger("100000000", 16);
    public static final int mask32 = new BigInteger("FFFFFFFF",16);

    public static BigInteger F(BigInteger b, BigInteger c, BigInteger d) {
        BigInteger bAndC = b.and(c);
        BigInteger notB = b.not().and(mask32);
        BigInteger notBAndD = notB.and(d);
        return bAndC.or(notBAndD).and(mask32);
    }

    public static BigInteger modularAddition(BigInteger... values) {
        BigInteger sum = BigInteger.ZERO;
        for(BigInteger value : values){
            sum = sum.add(value);
        }
        return sum.and(mask32);
    }

    public static BigInteger leftRotate(BigInteger val, int shift){
        shift %= 32;
        BigInteger left = value.shiftLeft(shift);
        BigInteger right = value.shiftRight(32-shift);
        return left.or(right).and(mask32);
    }

    public static void opOne(BigInteger a, BigInteger b, BigInteger c, BigInteger d, int hexStrInt, int kConstAndSInt) {
        BigInteger F1 = F(b, c, d);
        System.out.println(F1);
        BigInteger MA1 = modularAddition(a, F1, mod32);
        System.out.println(MA1);
        BigInteger MA2 = modularAddition(Padding.hexStrings[hexStrInt], 
                                         MA1, mod32);
        System.out.println(MA2);
        BigInteger MA3 = modularAddition(new BigInteger(Utils.KConstants[kConstAndSInt - 1], 16), 
                                         MA2, mod32);
        System.out.println(MA3);
        
        // left bit shift
        String binStr = MA3.toString(2);
        System.out.println(binStr);
        binStr = Padding.zerosPad(-1, 32, binStr);
        String newBin = "" + binStr.substring(Utils.SValues[kConstAndSInt - 1]) + binStr.substring(0, Utils.SValues[kConstAndSInt - 1]);
        BigInteger afterShift = Padding.binaryStringtoInt(newBin);
        BigInteger MA4 = modularAddition(b, afterShift, mod32);

        A = d;
        B = MA4;
        C = b;
        D = c;
    }
}
