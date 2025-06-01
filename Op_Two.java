import java.math.BigInteger;

public class Op_Two {

    public static BigInteger G(BigInteger b, BigInteger c, BigInteger d) {
        BigInteger newval = (b.and(d)).or(c.and(d.not()));
        return newval;
    }

    public static void opTwo(BigInteger a, BigInteger b, BigInteger c, BigInteger d, int hexStrInt, int kConstAndSInt) {
        BigInteger G1 = G(b, c, d);
        BigInteger MA1 = Op_One.modularAddition(a, G1, Op_One.mod32);
        BigInteger MA2 = Op_One.modularAddition(Padding.hexStrings[(hexStrInt * 5 + 1) % 16],
                                                MA1, Op_One.mod32);
        BigInteger MA3 = Op_One.modularAddition(new BigInteger(Utils.KConstants[kConstAndSInt - 1], 16),
                                                MA2, Op_One.mod32);
        // left bit shift
        String binStr = MA3.toString(2);
        binStr = Padding.pad(binStr);
        String newBin = "" + binStr.substring(Utils.SValues[kConstAndSInt - 1]) + binStr.substring(0, Utils.SValues[kConstAndSInt - 1]);
        BigInteger afterShift = Padding.binaryStringtoInt(newBin);
        BigInteger MA4 = Op_One.modularAddition(b, afterShift, Op_One.mod32);

        Op_One.A = d;
        Op_One.B = MA4;
        Op_One.C = b;
        Op_One.D = c;
    }
}
