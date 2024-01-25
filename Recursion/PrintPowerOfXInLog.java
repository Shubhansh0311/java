public class PrintPowerOfXInLog {
public static int PrintPower(int x,int n){
    if(n==0){return 1;}
    if(x==0){return 0;}
    if(n%2==0){
        return PrintPower(x, n/2)* PrintPower(x, n/2);
    }else{
        return  PrintPower(x, n/2)* PrintPower(x, n/2)*x;
    }
    }

    public static void main(String[] args) {
        int x=2,n=4;
        int ans=PrintPower(x,n);
        System.out.println(ans);
    }
}
