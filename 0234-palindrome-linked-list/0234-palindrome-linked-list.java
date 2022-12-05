/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int n = getLength(head);
        int arr[] = getArray(head);
        //taking two pointers to check palindrome
        int start = 0;
        int end = n-1;
        while(start<=end){
            if(arr[start]!=arr[end]){ //checking if start or end element doesen't match
                return false;
            }
            start++;
            end--;
        }
        return true;
        
        
    }
    public int getLength(ListNode head){
        int len = 0;
        ListNode curr = head;
        while(curr!=null){// finding the length with each iteration
            curr = curr.next;
            len++;
        }
        return len;
    }
    public int[] getArray(ListNode head){ // get the Node values in array
        int n = getLength(head);
        int arr[] = new int[n];
        ListNode curr = head;
        for(int i = 0;i<n;i++){
            arr[i] = curr.val;
            curr = curr.next;
        }
        return arr;
    }
}