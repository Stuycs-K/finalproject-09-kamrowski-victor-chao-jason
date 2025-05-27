public class Op_Four{
  public static int I(int b,int c,int d){
    int newval = c^(b|(~d));
    return newval;
  }

  public static void opFour(int a,int b,int c, int d,int hexStrInt,int kConstAndSInt){
    int I1 = I(b,c,d);
    int MA1 = modularAddition(a, I1,100000000);
    int MA2 = modularAddition(Padding.hexStrings[hexStrInt], MA1, 100000000);
    int MA3 = modularAddition(Utils.KConstants[kConstAndSInt-1], MA2, 100000000);
    //left bit shift
    String binStr = Integer.toBinaryString(MA3);
    binStr = Padding.zerosPad(-1, 32, binStr);
    String newBin = "" + binStr.substring(Utils.SValues[kConstAndSInt-1]) + binStr.substring(0,Utils.SValues[kConstAndSInt-1]);
    int afterShift = Padding.binaryStringtoInt(newBin);
    int MA4 = modularAddition(b, afterShift, 100000000);
    A = d;
    B = MA4;
    C = b;
    D = c;
  }
}
