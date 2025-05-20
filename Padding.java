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
  for(int x = 0;x<inputStr.length();x++){
    StringBuilder binary = new StringBuilder();
    int asciival = Integer.valueOf(inputStr.charAt(x));
  }
}


}
