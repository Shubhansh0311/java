public class Fibonacci {
public static  void fibo(int a1,int a2,int n){
if(n==0){return;}
int c=a1+a2;
System.out.print(c+" ");
fibo(a2, c, n-1);

}    public static void main(String[] args) {
        int a=0,b=1,n=8;
        System.out.print(a+" ");
        System.out.print(b+" ");
    fibo(a, b, n);
    }
}
