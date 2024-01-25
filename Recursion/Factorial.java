public class Factorial {
    public static int printfact(int n){
        if(n==0||n==1){
            return 1;
        }int fact_n=printfact(n-1);
        int fact=fact_n*n;
        return fact;


    }
    public static void main(String[] args) {
        int n=5;
        int ans =printfact(n);
        System.out.println(ans);

    }
}
