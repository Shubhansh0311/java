import javax.security.auth.callback.TextOutputCallback;

public class CallGuest {
    public static int guest(int n){
        if(n<=1){return 1;}
        int ways=guest(n-1);
        int way_1=guest(n-2)*(n-1);
    return ways+way_1;   }
    public static void main(String[] args) {
        int n=4;
        int totalways=guest(n);
        System.out.println(totalways);
    }
}
