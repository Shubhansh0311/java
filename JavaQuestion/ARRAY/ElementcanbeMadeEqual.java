package ARRAY;

public class ElementcanbeMadeEqual {

  public static boolean MadeEqual(int arr[]) {
    if (arr.length == 0) {
      return true;
    }
    for (int i = 0; i < arr.length; i++) {
      // for the even case
      while (arr[i] % 2 == 0) {
        arr[i] /= 2;
      }
      //   for the odd case
      while (arr[i] % 3 == 0) {
        arr[i] /= 3;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr[0]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    // Java program to determine can all numbers of an array be made equal
    int arr[] = { 500, 500, 250 };
    System.out.println(MadeEqual(arr));
  }
}
