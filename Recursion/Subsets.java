import java.sql.Array;
import java.util.ArrayList;

public class Subsets {
    public static void subset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.err.print(subset.get(i)+" ");
        }
    System.out.println();
    }
    public static void printsubset(int n ,ArrayList<Integer> subset)
{if(n==0){
    subset(subset);
    return;
}
    //want to add
    subset.add(n);
    printsubset(n-1, subset);
    //not add
    subset.remove(subset.size()-1);
    printsubset(n-1, subset);

}
public static void main(String[] args) {
    int n=3;
    ArrayList<Integer> subset=new ArrayList<>();
    printsubset(n, subset);
}}
