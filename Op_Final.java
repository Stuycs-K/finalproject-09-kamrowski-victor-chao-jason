import java.math.BigInteger;

public class Op_Final {
    public static void opFinal() {
        Op_One.AA = Op_One.AA.add(Op_One.A).and(Op_One.mask32);
        Op_One.BB = Op_One.BB.add(Op_One.B).and(Op_One.mask32);
        Op_One.CC = Op_One.CC.add(Op_One.C).and(Op_One.mask32);
        Op_One.DD = Op_One.DD.add(Op_One.D).and(Op_One.mask32);
        
        System.out.println("Final A: " + Op_One.AA.toString(16));
        System.out.println("Final B: " + Op_One.BB.toString(16));
        System.out.println("Final C: " + Op_One.CC.toString(16));
        System.out.println("Final D: " + Op_One.DD.toString(16));
        System.out.println("Final Hash: " + Op_One.AA.toString(16) + Op_One.BB.toString(16) + 
                           Op_One.CC.toString(16) + Op_One.DD.toString(16));
    }
}
