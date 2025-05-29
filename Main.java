import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("no args provided. Use make input ARGS='<input>'");
            return;
        }
        for (int x = 0; x < args.length; x++) {
            Padding.input = Padding.input + args[x] + " ";
        }
        Padding.input = Padding.input.substring(0, Padding.input.length() - 1);
        // System.out.println(Padding.input);
        String paddedStr = Padding.pad(Padding.input);
        // System.out.println(paddedStr);
        for (int x = 0; x < 16; x++) {
            Padding.hexStrings[x] = Padding.binaryStringtoInt(paddedStr.substring(32 * x, 32 * (x + 1)));
            // System.out.println(Padding.hexStrings[x]);
        }
        for (int x = 0; x < 16; x++) {
            System.out.println("=== Round " + (x + 1) + " ===");
            Op_One.opOne(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x, x + 1);
            System.out.println("A: " + Op_One.A.toString(16) + " " +
                               "B: " + Op_One.B.toString(16) + " " +
                               "C: " + Op_One.C.toString(16) + " " +
                               "D: " + Op_One.D.toString(16) + "\n");
        }
        System.out.println(Op_One.A.toString(16) + " " + Op_One.B.toString(16) + " " + Op_One.C.toString(16) + " " + Op_One.D.toString(16));


        // for (int x = 16; x < 32; x++) {
        //     Op_Two.opTwo(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x - 16, x + 1);
        // }
        // for (int x = 32; x < 48; x++) {
        //     Op_Three.opThree(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x - 32, x + 1);
        // }
        // for (int x = 48; x < 64; x++) {
        //     Op_Four.opFour(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x - 48, x + 1);
        // }
        // System.out.println("===== FINAL ABCD =====");
        // System.out.println(Op_One.A.toString(16) + " " + Op_One.B.toString(16) + " " + Op_One.C.toString(16) + " " + Op_One.D.toString(16));
    }
}
