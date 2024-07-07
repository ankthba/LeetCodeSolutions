class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indx = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        indx[0] = i;
                        indx[1] = j;
                        return indx;
                    }
                }
            }
        }
        return indx;
    }
}
