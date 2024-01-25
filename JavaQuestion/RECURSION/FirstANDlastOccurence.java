package RECURSION;

public class FirstANDlastOccurence {

  public static void Alloccurence(int arr[], int key, int i) {
    if (i == arr.length - 1 && arr[i] != key) {
      // System.out.print(-1);
      return;
    }

    if (arr[i] == key) {
      System.out.print(i + " ");
    }
    Alloccurence(arr, key, i + 1);
  }

  public static int lastOccurence(int arr[], int key, int i) {
    if (i == arr.length - 1 && arr[i] != key) {
      return -1;
    }
    int isfound = lastOccurence(arr, key, i + 1);
    if (isfound != -1) {
      return isfound;
    }
    if (arr[i] == key) {
      return i;
    }
    return isfound;
  }

  public static int firstOccurence(int arr[], int key, int i) {
    if (i == arr.length - 1 && arr[i] != key) {
      return -1;
    }
    if (arr[i] == key) {
      return i;
    }
    return firstOccurence(arr, key, i + 1);
  }

  public static void main(String[] args) {
    int arr[] = { 8, 2, 3, 4, 5, 6, 78, 9, 6, 10 };
    int key = 6;
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 6) {
        index = i;
      }
    }
    // System.out.println(index);

    System.out.println(
      // key + " is found at the index number " + lastOccurence(arr, key, 0)
    );
    Alloccurence(arr, key, index);
  }
}
