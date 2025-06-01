import java.math.BigInteger;

public class Op_Final {
    public static void opFinal(BigInteger a, BigInteger b, BigInteger c, BigInteger d) {
        Op_One.AA.add(a);
        Op_One.BB.add(b);
        Op_One.CC.add(c);
        Op_One.DD.add(d);
        
        System.out.println("Final A: " + Op_One.AA.toString(16));
        System.out.println("Final B: " + Op_One.BB.toString(16));
        System.out.println("Final C: " + Op_One.CC.toString(16));
        System.out.println("Final D: " + Op_One.DD.toString(16));
        System.out.println("Final Hash: " + Op_One.AA.toString(16) + Op_One.BB.toString(16) + 
                           Op_One.CC.toString(16) + Op_One.DD.toString(16));
    }
}
