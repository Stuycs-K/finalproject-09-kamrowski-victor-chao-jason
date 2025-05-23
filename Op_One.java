public class Op_One{

public static int A = 0x01234567;
public static int B = 0x89abcdef;
public static int C = 0xfedcba98;
public static int D = 0x76543210;

  public static int F(int b,int c, int d){
    int newval = (b&c)|((~b)&d);
    return newval;
  }

  
}
