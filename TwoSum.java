class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int numToFind = target - nums[i];
      for (int j =i+1; j < nums.length; j++) {
        if (nums[j] == numToFind) {
          return new int[] { i, j };
        }
      }
    }
    return new int[0];
  }
// test code with the main method
  public static void main(String[] args) {
    int[] nums = { 3, 2, 4 };
    int target = 6;
    int[] result = twoSum(nums, target);
    for (int num : result) {
      System.out.println(num);
    }
  }
}
