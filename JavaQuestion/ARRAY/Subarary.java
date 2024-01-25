package ARRAY;

import java.util.*;

public class Subarary {

    public static boolean subsetOrNot(int arr1[],int arr2[]){

         Set<Integer> set = new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
     if(set.contains(arr2[i])){
        return true;
     }
    }
        return false;
    }
  public static void main(String[] args) {
    int arr1[] = { 11, 10, 13, 21, 30, 70 };
    int arr2[] = { 1, 830, 770, 110 };
   System.out.println(subsetOrNot(arr1, arr2));
  }
}
