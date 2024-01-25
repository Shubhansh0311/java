

public class ProgramTOcountConversion {

  public static void main(String[] args) {
    int arr[] = { 8, 3, 4, 5 };
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          count++;
        }
      }
    }
    System.out.print(count);
  }
}
