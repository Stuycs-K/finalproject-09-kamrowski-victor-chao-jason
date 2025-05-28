public class Op_One{

public static long A = 0x01234567;
public static long B = 0x89ABCDEF;
public static long C = 0xFEDCBA98;
public static long D = 0x76543210;

  public static long F(long b,long c, long d){
    System.out.println(b&c);
    long newval = (b&c)|((~b)&d);
    return newval;
  }

  public static long modularAddition(long X,long Y,long Z){
    return (X+Y)%Z;
  }

  public static void opOne(long a,long b,long c, long d,int hexStrInt,int kConstAndSInt){
    long F1 = F(b,c,d);
    System.out.println(F1);
    long MA1 = modularAddition(a, F1,100000000);
    System.out.println(MA1);
    long MA2 = modularAddition(Padding.hexStrings[hexStrInt], MA1, 100000000);
    System.out.println(MA2);
    long MA3 = modularAddition(Utils.KConstants[kConstAndSInt-1], MA2, 100000000);
    System.out.println(MA3);
    //left bit shift
    String binStr = Long.toBinaryString(MA3);
    System.out.println(binStr);
    binStr = Padding.zerosPad(-1, 32, binStr);
    String newBin = "" + binStr.substring(Utils.SValues[kConstAndSInt-1]) + binStr.substring(0,Utils.SValues[kConstAndSInt-1]);
    long afterShift = Padding.binaryStringtoInt(newBin);
    long MA4 = modularAddition(b, afterShift, 100000000);
    A = d;
    B = MA4;
    C = b;
    D = c;
  }
}