package ARRAYLIST;

import java.util.ArrayList;

class MostFrequent {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(100);
    arr.add(200);
    arr.add(1);
    arr.add(100);
    System.out.println(arr);
    int key=1;
    int res[]=new int[1000];
    for (int i = 0; i < arr.size()-1; i++) {
        if(arr.get(i)==key){
            res[arr.get(i+1)-1]++;
            System.out.println(res[99]+" "+i);


        }
        
    }
    int max=Integer.MIN_VALUE;
    System.out.println(max);
    int ans=0;
    for (int i = 0; i < 1000; i++) {
        if(res[i]>max){
            max=res[i];
            System.out.println(max);
            System.out.println("=:"+i);
            ans=i+1;
        }
    }
  }
}
