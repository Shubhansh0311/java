public class TowerOfHanoi {

  public static void towerofHanoi(
    int disk,
    String src,
    String helper,
    String dest
  ) {
    if (disk == 1) {
      System.out.println(disk + " is send from " + src + " to " + dest);
      return;
    }
    towerofHanoi(disk - 1, src, dest, helper);
    System.out.println(disk + " is send from " + src + " to " + dest);

    towerofHanoi(disk - 1, helper, src, dest);
  }

  public static void main(String[] args) {
    int disk = 4;
    towerofHanoi(disk, "A", "B", "C");
  }
}
