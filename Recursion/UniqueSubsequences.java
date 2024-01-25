import java.util.HashSet;

public class UniqueSubsequences {
public static void printUniqueSubsequences(String str,int index,String combination,HashSet<String>set){
if(index==str.length()){if(set.contains(combination)){return;}
else
{System.out.println(combination);
set.add(combination);return;}}
char current=str.charAt(index);
printUniqueSubsequences(str, index+1, combination+current, set);
printUniqueSubsequences(str, index+1, combination, set);
}   
public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        printUniqueSubsequences(str,0," ",set);
    }
    
}
