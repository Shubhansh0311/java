public class SumOfNaturalNumber {
public static void printSum(int n,int m,int sum){
    if(n==m){sum=sum+n;
        System.out.println(sum);
        return;}
sum =sum+n;
printSum(n+1,m,sum);}
    public static void main(String[] args) {
    printSum(1,5,0);
    }
}
