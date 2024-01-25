public class TrappingRainwater {

  public static int MaxTrappedWater(int height[]) {
    // max left boundary =  max(leftmax,current height)
    int n = height.length;
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }
    // max right boundary = max(rightmax,current height)
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1]; //starting from the right side
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    }
    // loop

    int trappedwater = 0;
    // water level=min(maxleft,maxright)
    for (int i = 0; i < n; i++) {
      int waterlevel = Math.min(leftMax[i], rightMax[i]);
      // trappedwater=waterlevel-height
      trappedwater += waterlevel - height[i];
    }
    return trappedwater;
  }

  public static void main(String[] args) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(MaxTrappedWater(height));
  }
}
