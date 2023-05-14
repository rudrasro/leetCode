//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.is_StrongNumber(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int getfact(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int min = n-1;
        int ans = 1;
        while(min>0){
           ans = ans+(ans*min);
           min--;
        }
        return ans;
    }
    
    public int is_StrongNumber(int n)
    {
        // Code here
         int temp = n;
        int sum = 0;
        while(temp>0){
            int t = temp%10;
            sum = sum+ getfact(t);
            temp = temp/10;
        }
        if(sum == n){
            return 1;
        }else{
            return 0;
        }
    }
}