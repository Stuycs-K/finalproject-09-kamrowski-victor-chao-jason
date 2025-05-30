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
        BigInteger MofG = Padding.hexStrings[hexStrInt];
        BigInteger KofI = new BigInteger(Utils.KConstants[kConstAndSInt-1],16);
        int SofI = Utils.SValues[kConstAndSInt-1];

        //adding all tgt
        BigInteger temp = modularAddition(a,F1,MofG,KofI);

        //rotation
        BigInteger rotation = leftRotate(temp, SofI);

        //new b
        BigInteger Bnew = b.add(rotated).and(mask32);
        
        A = d;
        B = Bnew;
        C = b;
        D = c;
    }
}
