public class TowerOfHanoi {
    public static void printTowerOfHanoi(int n,String S,String H ,String D){
if(n==1){System.out.println("transfer disk"+" "+n+" "+"from"+" "+S+" "+"to"+" "+D);return;}
    
    printTowerOfHanoi(n-1,S,D,H);
    System.out.println("transfer disk"+" "+n+" "+"from"+" "+S+" "+"to"+" "+D);
    printTowerOfHanoi(n-1, H, S, D);
}
    public static void main(String[] args) {
        int n=3;
        
        printTowerOfHanoi(n,"S","H","D");

    }
}
