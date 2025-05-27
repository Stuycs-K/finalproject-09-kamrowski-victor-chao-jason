public class Op_Three{
  public static int H(int b,int c,int d){
    int newval = b^c^d;
    return newval;
  }

  public static void opThree(int a,int b,int c, int d,int hexStrInt,int kConstAndSInt){
    int H1 = H(b,c,d);
    int MA1 = modularAddition(a, H1,100000000);
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
