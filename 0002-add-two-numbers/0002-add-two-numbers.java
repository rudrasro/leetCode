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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // create dummy list
        ListNode curr = dummy; // create a pointer and assign it dummy
        int carry = 0;
        while(l1!=null || l2!=null || carry==1){ //iterate to get two number sums
            int sum = 0;
            if(l1!=null){ 
                sum += l1.val; //add l1 to sum
                l1 = l1.next; // move to next node of l1
            }
            if(l2!=null){
                sum += l2.val; // add l2 to sum after adding l1 value
                l2 = l2.next; // move to next node of l2
            }
            sum += carry; // if contains carry then add it to sum
            carry = sum/10; //divide by 10 to get the carry if there any
            ListNode node = new ListNode(sum%10); //the value we'll get by moduloing it, will become as new node so. add it to our list
            curr.next = node; // if we get new node, then point curr to node
            curr = curr.next; // update curr
        }
        return dummy.next;
        
    }
}