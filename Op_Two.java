public class Op_Two{

  public static int G(int b,int c,int d){
    int newval = (b&d)|(c&(~d));
    return newval;
  }
}
