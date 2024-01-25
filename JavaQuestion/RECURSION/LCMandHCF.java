package RECURSION;

public class LCMandHCF {

    public static int getHCF(int a,int b){
        return b==0? a:getHCF(b,a%b);
    }
  public static int getLCM(int a, int b) {
    int hcf = getHCF(a, b);
    int lcm = (a * b) / hcf;
    return lcm;
  }

  public static void main(String[] args) {
    int a = 24, b = 48;
    System.out.println("LCM : " + getLCM(a, b));
    System.out.println("HCF : " + getHCF(a, b));
  }
}
