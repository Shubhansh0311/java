import java.net.Inet4Address;

public class KewpadCombination {
    public static String keypad[]={" ","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static void PrintCombination(String str,int index,String newstr){
if(index==str.length()){
    System.out.println(newstr);
    return;}
    char current=str.charAt(index);
String mapping=keypad[current-'0'];
for(int i=0;i<mapping.length();i++){
    PrintCombination(str, index+1, newstr+mapping.charAt(i));
}

}
    public static void main(String[] args) {
     String str="3415";
     PrintCombination(str,0,"");
 }   
}
