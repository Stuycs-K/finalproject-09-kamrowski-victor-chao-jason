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

        Padding.input = Padding.input.trim();
        String paddedStr = Padding.pad(Padding.input);
        Padding.bitSchedule(paddedStr);

        Op_One.A = new BigInteger("67452301",16);
        Op_One.B = new BigInteger("efcdab89",16);
        Op_One.C = new BigInteger("98badcfe",16);
        Op_One.D = new BigInteger("10325476",16);


        for (int x = 0; x < 16; x++) {
            Op_One.opOne(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x, x + 1);

            //if (x == 14 || x == 15) {
              //  System.out.println("----- i=" + x + " -----");
               // System.out.println(Op_One.A.toString(16) + " " +
                //                    Op_One.B.toString(16) + " " +
                //                    Op_One.C.toString(16) + " " +
                  //                  Op_One.D.toString(16) + "\n");
           // }
        }
       // System.out.println(Op_One.A.toString(16) + " " + Op_One.B.toString(16) + " " + Op_One.C.toString(16) + " " + Op_One.D.toString(16));

         for (int x = 16; x < 32; x++) {
             System.out.println("----- i=" + x + " -----");
             Op_Two.opTwo(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x - 16, x + 1);
             System.out.println("A: " + Op_One.A.toString(16) + " " +
                                "B: " + Op_One.B.toString(16) + " " +
                                "C: " + Op_One.C.toString(16) + " " +
                                "D: " + Op_One.D.toString(16) + "\n");
         }
        // for (int x = 32; x < 48; x++) {
        //     Op_Three.opThree(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x - 32, x + 1);
        // }
        // for (int x = 48; x < 64; x++) {
        //     Op_Four.opFour(Op_One.A, Op_One.B, Op_One.C, Op_One.D, x - 48, x + 1);
        // }
        // Op_Final.opFinal(Op_One.A, Op_One.B, Op_One.C, Op_One.D);
    }
}
