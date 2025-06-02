import java.math.BigInteger;

public class Op_Two {

    public static BigInteger G(BigInteger b, BigInteger c, BigInteger d) {
        BigInteger bAndD = d.and(b);
        BigInteger notD = d.not().and(Op_One.mask32);
        BigInteger cAndNotD = c.and(notD);
        return bAndD.or(cAndNotD).and(Op_One.mask32);
    }

    public static void opTwo(BigInteger a, BigInteger b, BigInteger c, BigInteger d, int hexStrInt, int kConstAndSInt) {
        BigInteger G1 = G(b, c, d);
        int gindex = (5*hexStrInt+1)%16;
        
        BigInteger MofG = Padding.hexStrings[gindex];
        BigInteger KofI = new BigInteger(Utils.KConstants[kConstAndSInt-1],16);
        int SofI = Utils.SValues[kConstAndSInt - 1];

        // adding all tgt
        BigInteger temp = Op_One.modularAddition(a, G1, MofG, KofI);

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
