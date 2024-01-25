

public class TotalPaths {
    public static int calculatepath(int i,int j,int m,int n){
        if(m==0||n==0){return 0;}
        if(i==n-1||j==m-1){
            return 1;
        }
int downpath=calculatepath(i+1, j, m, n);
int rightpath=calculatepath(i, j+1, m, n);
return  downpath+rightpath;
    }
public static void main(String[] args) {
    int m=4,n=4;
   int TotalPaths= calculatepath(0,0,m,n);
   System.out.println(TotalPaths);
}}