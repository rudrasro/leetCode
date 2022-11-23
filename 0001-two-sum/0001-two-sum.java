class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++){ // fix the i then iterate
            for(int j = i+1;j<n;j++){ // interate j loop i+1 to n
                if(nums[i] + nums[j] == target){ // compare if target is equal to 2sum
                    return new int[]{i,j}; // if target found then store index value in array and return
                }
            }
        }
        return new int[]{}; // return the array
    }
}