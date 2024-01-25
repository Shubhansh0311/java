import java.net.Inet4Address;

public class StringReverse {
  public static  void PrintString(String s,int index){
     if(index==0){
       System.out.print(s.charAt(index)+" ");
       return;
     }System.out.print(s.charAt(index)+" ");
     PrintString(s, index-1);

  }  
  public static void main(String[] args) {
      int x=2,n=4;
      String s="shubhansh";
      PrintString(s, s.length()-1);
    

  }
}
