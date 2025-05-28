import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        if (args.length < 1) {
            System.out.println("no args provided. Use make input ARGS='<input>'");
            return;
        }
        for(int x = 0;x < args.length; x++) {
            Padding.input = Padding.input + args[x] + " ";
        }
        Padding.input = Padding.input.substring(0,Padding.input.length()-1);
        //System.out.println(Padding.input);
        String paddedStr = Padding.pad(Padding.input);
        //System.out.println(paddedStr);
        for (int x = 0; x < 16; x++) {
            Padding.hexStrings[x] = Padding.binaryStringtoInt(paddedStr.substring(32*x,32*(x+1)));
            //System.out.println(Padding.hexStrings[x]);
        }
        for(int x = 0; x < 16; x++) {
            Op_One.opOne(Op_One.A,Op_One.B,Op_One.C,Op_One.D,x,x+1);
            System.out.println(Op_One.A + " " + Op_One.B + " " + Op_One.C + " " + Op_One.D);
        }

        System.out.println(Op_One.A + " " + Op_One.B + " " + Op_One.C + " " + Op_One.D);
    }
}
