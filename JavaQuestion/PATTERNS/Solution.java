package PATTERNS;

public class Solution {

  public static void main(String[] args) {
    int n = 5;
    // Q1
    System.out.println("Question 1");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Question 2");
    // Q2
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Question 3");

    for (int i = 0; i < n; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Question 4");

    for (int i = 0; i < n; i++) {
      for (int k = 0; k < i; k++) {
        System.out.print(" ");
      }
      for (int j = 5; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Question 5");

    for (int i = 0; i < n; i++) {
      for (int k = 4; k > i; k--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int m = 0; m < i; m++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Question 6");
    for (int i = 0; i < 4; i++) {
      for (int k = 0; k < i; k++) {
        System.out.print(" ");
      }
      for (int j = 4; j > i; j--) {
        System.out.print("*");
      }
      for (int m = 3; m > i; m--) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Question 7");
    for (int i = 0; i < 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 8");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 9");
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 10");
    for (int i = 0; i < 3; i++) {
      for (char c = 'a'; c <= 'c'; c++) {
        // char c=(char)j;
        System.out.print(c + " ");
      }
      System.out.println();
    }
    System.out.println("Question 11");
    for (int i = 97; i <= 101; i++) {
      for (int j = 97; j <= i; j++) {
        System.out.print((char) j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 12");
    for (int i = 101; i >= 97; i--) {
      for (int j = 97; j <= i; j++) {
        System.out.print((char) j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 13");
    for (int i = 0; i < 3; i++) {
      for (int j = 65; j <= 67; j++) {
        System.out.print((char) j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 14");
    for (int i = 65; i <= 69; i++) {
      for (int j = 65; j <= i; j++) {
        System.out.print((char) j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 15");
    for (int i = 65; i <= 69; i++) {
      for (int j = 69; j >= i; j--) {
        System.out.print((char) i + " ");
      }
      System.out.println();
    }
    System.out.println("Question 16");
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    System.out.println("Question 17");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    System.out.println("Question 18");
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    System.out.println("Question 19");
    int k = 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print((k++) + " ");
      }
      System.out.println();
    }
    // floyd
    System.out.println("Question 20");
    k = 1;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((k++) + " ");
      }
      System.out.println();
    }
    System.out.println("Question 21");
    k = 1;
    for (int i = 4; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print((k++) + " ");
      }
      System.out.println();
    }
    System.out.println("Question 22");

    char c = 'a';
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print((c++) + " ");
      }
      System.out.println();
    }
    System.out.println("Question 23");
    c = 'a';
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((c++) + " ");
      }
      System.out.println();
    }

    System.out.println("Question 24");
    for (int i = 1; i <= 4; i++) {
      for (int j = 4; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= 3; i++) {
      for (int m = 1; m <= i; m++) {
        System.out.print(" ");
      }
      for (int j = 3; j >= i; j--) {
        System.out.print("*");
      }
      for (int j = 3; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Question 25");
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j < (2 * i); j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    for (int i = 3; i >= 1; i--) {
      for (int j = 1; j < 2 * i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 26");
    char ch = 96;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j < 2 * i; j++) {
        System.out.print((char) (ch + j) + " ");
      }
      System.out.println();
    }
    for (int i = 3; i >= 1; i--) {
      for (int j = 1; j < 2 * i; j++) {
        System.out.print((char) (ch + j) + " ");
      }
      System.out.println();
    }
    System.out.println("Question 27");

    String str = "Hello Everybody!";
    for (int i = str.length(); i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(str.charAt(j));
      }
      System.out.println();
    }

    System.out.println("Question 28");
    for (int i = 0; i < 6; i++) {
      for (int m = 7; m > i; m--) {
        System.out.print(" ");
      }
      int num = 1;
      for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num = num * (i - j) / (j + 1);
      }
      System.out.println();
    }
    System.out.println("Question 29");

    for (int i = 1; i <= 5; i++) {
      for (int j = i; j <= (2 * i) - 1; j++) {
        System.out.print((j) + " ");
      }
      for (int j = (i * 2 - 2); j >= i; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("Question 30");
    int num = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j < i * 2; j++) {
        System.out.print((num * num) + " ");
        num++;
      }
      System.out.println();
    }
    System.out.println("Question 31");
     num=10;
     System.out.println(0);
   for (int i=10;i>=1;i--) {
for(int j=i-1;j<=num;j++){
    if(j==num){
        System.out.print(0);
    }
    else {System.out.print(j+"");}
}

for(int j=num-1;j>=i-1;j--){
    System.out.print(j+"");
}
System.out.println();
    
   }
   System.out.println("Question 32");
   for(int i=71;i>=65;i--){
    for(int j=65;j<=i;j++){
        System.out.print((char)j+" ");
    }
    for( k=71;k>i;k--){
        System.out.print("- ");
    }
  
   
    for( k=70;k>i;k--){
        System.out.print("- ");
    }
    System.out.println();
    
   }
  }
}
