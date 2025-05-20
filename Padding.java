public class Padding{

public static String input = "";
public static String[64] binaryStrings; //for 512 bit strings there will be 64 bytes. each value will be a string of 8 0/1s.

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
  
}


}
