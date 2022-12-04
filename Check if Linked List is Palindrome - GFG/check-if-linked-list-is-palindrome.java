//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        // Step 1: find the middle Node
        Node mid = getMid(head);
        // Step 2: reverse second half
        Node secHalfRev = reverseList(mid);
        // Step 3: compare first half and second half
        Node first = head;
        while(secHalfRev != null){
            if(first.data!=secHalfRev.data){
                return false;
            }
            first = first.next;
            secHalfRev = secHalfRev.next;
        }
        return true;
    }    
    Node getMid(Node head){ // get the middle node
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    Node reverseList(Node head){ // reversing the list
        if(head==null){
            return null;
        }
        Node prev = null;
        Node curr = head;
        while(curr!=null){ // swaping until list is reversed
            Node nextOfCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextOfCurr;
        }
        head = prev;
        return head;
    }
}

