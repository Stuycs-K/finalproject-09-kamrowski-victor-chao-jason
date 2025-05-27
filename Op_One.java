public class Op_One{

public static int A = 0x01234567;
public static int B = 0x89abcdef;
public static int C = 0xfedcba98;
public static int D = 0x76543210;

  public static int F(int b,int c, int d){
    int newval = (b&c)|((~b)&d);
    return newval;
  }

  public static int modularAddition(int X,int Y,int Z){
    return (X+Y)%Z;
  }

  public static void opOne(int a,int b,int c, int d,int hexStrInt,int kConstAndSInt){
    int F1 = F(b,c,d);
    int MA1 = modularAddition(a, F1,100000000);
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