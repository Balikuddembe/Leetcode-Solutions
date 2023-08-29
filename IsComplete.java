class IsComplete {
    public static boolean isComplete(int[]nums) {
        if(nums.length==0) return false;
        int maxEven = nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < 0) return false;
            if(nums[i]%2==0 && nums[i] > maxEven) {
                maxEven=nums[i];
            }
        }
        // check if all even numbers from 2 to maxEven are present in the array
        for(int j=2;j<=maxEven;j+=2) {
            boolean found = false;
            for(int num:nums) {
                if(num == j) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return false; // an even number is missing
            }
        }
        return true; //all conditions satisfied
    }
    public static void main(String[]args) {
        int[]nums = {};
        boolean res = isComplete(nums);
        System.out.println(res);
    }
}