import java.math.BigInteger;

public class Op_Three {
    public static BigInteger H(BigInteger b, BigInteger c, BigInteger d) {
        return b.xor(c).xor(d).and(Op_One.mask32);
    }

    public static void opThree(BigInteger a, BigInteger b, BigInteger c, BigInteger d, int hexStrInt, int kConstAndSInt) {
        BigInteger H1 = H(b, c, d);
        int gindex = (3*hexStrInt+5)%16;
        
        BigInteger MofG = Padding.hexStrings[gindex];
        BigInteger KofI = new BigInteger(Utils.KConstants[kConstAndSInt-1],16);
        int SofI = Utils.SValues[kConstAndSInt - 1];

        // adding all tgt
        BigInteger temp = Op_One.modularAddition(a, H1, MofG, KofI);

        // rotation
        BigInteger rotation = Op_One.leftRotate(temp, SofI);

        // new b
        BigInteger Bnew = b.add(rotation).and(Op_One.mask32);

        Op_One.A = d;
        Op_One.B = Bnew;
        Op_One.C = b;
        Op_One.D = c;
    }

}
