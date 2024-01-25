package ARRAY;

public class FirstHalfInAsc_SecondInDes {

  public static void main(String[] args) {
    int arr[] = { 3, 2, 4, 1, 10, 30, 40, 20 };
    int left = arr[0];
    int right = arr[(arr.length - 1) / 2];

    for (int i = 0; i < arr.length/2; i++) {
      for (int j = 0; j < arr.length / 2; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }}
      }
      for (int i = arr.length/2; i < arr.length; i++) {
        
      
      for (int j = arr.length / 2; j < arr.length; j++) {
         if (arr[i] <arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
