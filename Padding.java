public class Padding{

public static String input = "";
public static String[16] hexStrings; //for 512 bit strings there will be 64 bytes. there will be 16 hex vals.

public static void main(String[] args){
  if(args.length<1){
    System.out.println("no args provided. Use make input ARGS='<input>'");
    return;
  }
  for(int x = 0;x<args.length;x++){
    input = input + args[x];
  }
  pad(input);
}

public static void pad(String inputStr){
  StringBuilder binary = new StringBuilder();
  for(int x = 0;x<inputStr.length();x++){
    int forbin = Integer.valueOf(inputStr.charAt(x));
    String str = "";
    for(int bin = 128;x>=1;x=x/2){
      if(forbin/bin>0){
        str = str + "1";
        forbin = forbin - bin;
      }else{
        str = str + "0";
      }
    }
  }
  
}


}
