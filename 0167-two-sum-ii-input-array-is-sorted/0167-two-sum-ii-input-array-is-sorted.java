class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        
        int i = 0; // create i pointer
        int j = n-1; // creating j pointer
        
        while(i<j)
        {
            int currentSum = numbers[i]+numbers[j]; // store 2sum
            
            if(currentSum == target) // if 2sum = target return indexes array
            {
                return new int[]{i+1,j+1};
            }
            else if(currentSum > target) // if 2sum > target then decrement j
            {
                j--;
             }
            else // if 2sum<target increment i
            {
                i++;
            }
        }
        
        return new int[]{i,j}; // return array
    }
}