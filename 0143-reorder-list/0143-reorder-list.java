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
    public void reorderList(ListNode head) {
        //step 1: get the mid
        ListNode mid = middleNode(head);
        //step 2: break into two parts
        ListNode head2 = mid.next;
        mid.next = null;
        //step 3: reverse the second list
        head2 = reverseList(head2);
        //step 4: connect the alternatives
        merge(head,head2);
    }
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode p1 = head1;
        ListNode p2 = head2;
        ListNode curr = dummy;
        
        while(p1!=null && p2!=null){
            ListNode nextOfp1 = p1.next;
            p1.next = null;
            ListNode nextOfp2 = p2.next;
            p2.next = null;
            
            // first add p1
            curr.next = p1;
            p1 = nextOfp1;
            curr = curr.next;
            
            //then add p2
            curr.next = p2;
            p2 = nextOfp2;
            curr = curr.next;
            
        }
        if(p1==null){
                curr.next = p2;
        }
        if(p2==null){
            curr.next = p1;
        }
        return dummy.next;
    }
    
    public ListNode middleNode(ListNode head) { // get the middle node
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverseList(ListNode head) { // reverse list
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            // save next pointer 
            ListNode nextOfCurr = curr.next;
            
            // reverse pointer
            curr.next = prev;
            
            // move pointers to the next 2 nodes
            prev = curr;
            curr = nextOfCurr;
        }
        // head is now at prev
        head = prev;
        
        return head;
    }
}