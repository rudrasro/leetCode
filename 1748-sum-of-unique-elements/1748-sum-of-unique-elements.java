class Solution {
    public int sumOfUnique(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
		for(int i = 0;i<n;i++){
		    if(nums[i] >max){
		        max = nums[i];
		    }
		}
		
		int []count = new int[max+1];
		for(int i = 0;i<n;i++){
		    count[nums[i]]++;
		}
		
		int sum = 0;
		for(int i = 0;i<count.length;i++){
		    if(count[i] == 1){
		        sum+=i;
		    }
		}
        return sum;
    }
}