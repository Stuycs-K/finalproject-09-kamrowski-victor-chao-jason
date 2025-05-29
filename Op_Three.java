import java.math.BigInteger;

public class Op_Three {
    public static BigInteger H(BigInteger b, BigInteger c, BigInteger d) {
        BigInteger newval = (b.xor(c).xor(d));
        return newval;
    }

    public static void opThree(BigInteger a, BigInteger b, BigInteger c, BigInteger d, int hexStrInt, int kConstAndSInt) {
        BigInteger H1 = H(b, c, d);
        BigInteger MA1 = Op_One.modularAddition(a, H1, Op_One.intForModAdd);
        BigInteger MA2 = Op_One.modularAddition(Padding.hexStrings[hexStrInt], 
                                                MA1, Op_One.intForModAdd);
        BigInteger MA3 = Op_One.modularAddition(new BigInteger(Utils.KConstants[kConstAndSInt - 1], 16), 
                                                MA2, Op_One.intForModAdd);
        // left bit shift
        String binStr = MA3.toString(2);
        binStr = Padding.zerosPad(-1, 32, binStr);
        String newBin = "" + binStr.substring(Utils.SValues[kConstAndSInt - 1]) + binStr.substring(0, Utils.SValues[kConstAndSInt - 1]);
        BigInteger afterShift = Padding.binaryStringtoInt(newBin);
        BigInteger MA4 = Op_One.modularAddition(b, afterShift, Op_One.intForModAdd);

        Op_One.A = d;
        Op_One.B = MA4;
        Op_One.C = b;
        Op_One.D = c;
    }

}
