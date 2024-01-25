package DEQUE.Problems;

// import java.util.Deque;
// import java.util.LinkedList;
// import javax.management.relation.RoleStatus;

// class Solution {

// //   public static int[] rotate(int[] nums, int k) {
//     // Deque<Integer> d= new LinkedList<>();
//     int arr[] = new int[nums.length];
//     int size=k;
//     int j=0;
//     for (int i = nums.length - 1; i > size; i--) {
//       arr[j] = nums[k+1];
//       j++;k++;
//     }
//     for (int i = 0; i<=size; i++) {
//       arr[j] = nums[i];
//       j++;
//     }
//     return arr;
//   }

//   public static void main(String[] args) {
//     int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//     int k = 3;
//     int ans[] = rotate(arr, k);
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(ans[i] + " ");
//     }
//   }
// }/
class Solution {

  public static void rotate(int[] nums, int k) {
    // Deque<Integer> d= new LinkedList<>();
    int arr[] = new int[nums.length];
    int size=k;
    int j=0;
    for (int i = nums.length - 1; i > size; i--) {
      arr[j] = nums[k+1];
      j++;k++;
    }
    for (int i = 0; i<=size; i++) {
      arr[j] = nums[i];
      j++;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
     rotate(arr, k);
   
  }
}

