public class Padding{

public static String input = "";
public static int[] hexStrings = new int[16]; //for 512 bit strings there will be 64 bytes. there will be 16 hex vals.

public static void main(String[] args){
  if(args.length<1){
    System.out.println("no args provided. Use make input ARGS='<input>'");
    return;
  }
  for(int x = 0;x<args.length;x++){
    input = input + args[x];
  }
  String paddedStr = pad(input);
  for(int x = 0;x<16;x++){
    hexStrings[x] = binaryStringtoInt(paddedStr.substring(32*x,32*(x+1)));
    //System.out.println(hexStrings[x]);
  }

}

public static String pad(String inputStr){
  StringBuilder binary = new StringBuilder();
  for(int x = 0;x<inputStr.length();x++){
    int forbin = Integer.valueOf(inputStr.charAt(x));
    String str = "";
    str = intToBinary(forbin);
    binary.append(str);
  } // AT THIS POINT BINARY HAS THE MESSAGE IN BINARY
  int lengthpad = binary.length();
  String lengthBin = intToBinary(lengthpad);
String end64bits = zerosPad(-1, 64, lengthBin); // FOR LAST 64 BITS
binary.append("1");
binary = new StringBuilder(zerosPad(1,448,binary.toString()));
binary.append(end64bits);
return binary.toString();
}

public static String intToBinary(int int1){
  String str = "";
  int forbin = int1;
    for(int bin = 128;bin>=1;bin=bin/2){
      if(forbin/bin>0){
        str = str + "1";
        forbin = forbin - bin;
      }else{
        str = str + "0";
      }
    }
    return str;
}

public static int binaryStringtoInt(String str){
  return Integer.parseInt(str,2);
}

public static String zerosPad(int location,int endlength,String initStr){
  if(location==0){
    System.out.println("location has to be pos. or neg. not zero");
    return "";
  } // location cannot equal 0
  StringBuilder addzeros = new StringBuilder(); //location negative -> pad before string. location positive -> pad after string
  if(location<0){
    for(int x = 0;x<endlength-initStr.length();x++){
      addzeros.append("0");
    }
    addzeros.append(initStr);
  }else{
    addzeros.append(initStr);
    for(int x = 0;x<endlength-initStr.length();x++){
      addzeros.append("0");
    }
  }
  return addzeros.toString();
}


}
