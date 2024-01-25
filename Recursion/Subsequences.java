public class Subsequences {
    public static void PrintSubsequences(String str ,int index,String newstring ){
      if(index==str.length()){
          System.out.println(newstring);
          return;
      }
     char current= str.charAt(index);
        PrintSubsequences(str, index+1, newstring+current);
        PrintSubsequences(str, index+1, newstring);
    }
    public static void main(String[] args) {
        String str="abc";
        PrintSubsequences(str,0,"");
    }
}
