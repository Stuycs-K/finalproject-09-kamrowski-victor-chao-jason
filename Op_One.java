import java.math.BigInteger;
public class Op_One{

//public static long A = 0x01234567;
//public static long B = 0x89ABCDEF;
//public static long C = 0xFEDCBA98;
//public static long D = 0x76543210;
public static void main(String[] args){
  F(B,C,D);
}
public static BigInteger A = new BigInteger("01234567",16);
public static BigInteger B = new BigInteger("89ABCDEF",16);
public static BigInteger C = new BigInteger("FEDCBA98",16);
public static BigInteger D = new BigInteger("76543210",16);
public static BigInteger formod = new BigInteger("100000000",16);

  public static BigInteger F(BigInteger b,BigInteger c, BigInteger d){
   // System.out.println(b.and(c));
    //long newval = (b&c)|((~b)&d);
    BigInteger newval = (b.and(c)).or((b.not().and(d)));
    //System.out.println(newval);
    return newval;
  }

   public static BigInteger modularAddition(BigInteger X,BigInteger Y,BigInteger Z){
    BigInteger newval = (X.add(Y)).mod(Z);
    return newval;
  }

  public static void opOne(BigInteger a,BigInteger b,BigInteger c, BigInteger d,int hexStrInt,int kConstAndSInt){
    BigInteger F1 = F(b,c,d);
    System.out.println(F1);
    BigInteger MA1 = modularAddition(a, F1,formod);
    System.out.println(MA1);
    BigInteger MA2 = modularAddition(Padding.hexStrings[hexStrInt], MA1, formod);
    System.out.println(MA2);
    BigInteger MA3 = modularAddition(new BigInteger(Utils.KConstants[kConstAndSInt-1],16), MA2, formod);
    System.out.println(MA3);
    //left bit shift
    String binStr = MA3.toString(2);
    System.out.println(binStr);
    binStr = Padding.zerosPad(-1, 32, binStr);
    String newBin = "" + binStr.substring(Utils.SValues[kConstAndSInt-1]) + binStr.substring(0,Utils.SValues[kConstAndSInt-1]);
    BigInteger afterShift = Padding.binaryStringtoInt(newBin);
    BigInteger MA4 = modularAddition(b, afterShift, formod);
    A = d;
    B = MA4;
    C = b;
    D = c;
  }
}
