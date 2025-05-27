public class Op_Four{
  public static int I(int b,int c,int d){
    int newval = c^(b|(~d));
    return newval;
  }
}
