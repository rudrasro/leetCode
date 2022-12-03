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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;// pointer for reversing
        ListNode curr = head;
        
        // shifting the curr.next to previous pointer continious for reversing
        while(curr!=null){
            ListNode nextOfCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextOfCurr;
        }
        head = prev;
        return head;
    }
}