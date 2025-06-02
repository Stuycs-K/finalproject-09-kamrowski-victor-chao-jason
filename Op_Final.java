import java.math.BigInteger;

public class Op_Final {

    public static String bigIntToHexLittleEndian(BigInteger x){
        int word = x.intValue(); //basically mod 32 bc only gets 4 bytes
        byte[] bytes = new byte[4]; //for final hex string
        bytes[0] = (byte)((word>>>24)&0xFF);
        bytes[1] = (byte)((word>>>16)&0xFF);
         bytes[2] = (byte)((word>>>8)&0xFF);
          bytes[3] = (byte)((word)&0xFF);
          StringBuilder sb = new StringBuilder(8);
          for(int y = 3;y>=0;y--){
            sb.append(String.format("%02x",bytes[y]&0xFF));
          }
          return sb.toString();

    }


    public static void opFinal() {
        Op_One.AA = Op_One.AA.add(Op_One.A).and(Op_One.mask32);
        Op_One.BB = Op_One.BB.add(Op_One.B).and(Op_One.mask32);
        Op_One.CC = Op_One.CC.add(Op_One.C).and(Op_One.mask32);
        Op_One.DD = Op_One.DD.add(Op_One.D).and(Op_One.mask32);

        String hexA = bigIntToHexLittleEndian(Op_One.AA);
        String hexB = bigIntToHexLittleEndian(Op_One.BB);
        String hexC = bigIntToHexLittleEndian(Op_One.CC);
        String hexD = bigIntToHexLittleEndian(Op_One.DD);
        
        System.out.println("Final A: " + hexA);
        System.out.println("Final B: " + hexB);
        System.out.println("Final C: " + hexC);
        System.out.println("Final D: " + hexD);
        System.out.println("Final Hash: " + hexA + hexB + hexC + hexD);
    }
}
