//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
        System.out.println(); 
    }
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Node head = null;
            for(int i=0; i<n; i++)
            {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                Solution ob = new Solution();
                if(indicator == 0)
                    head = ob.insertAtBeginning(head, value);
                else
                    head = ob.insertAtEnd(head, value);
            }
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node nn = new Node(x); //create a new node
        if(head == null){
            head = nn; // if head is null then assign head to nn
            return head; // an return head
        }
        nn.next = head; // if head is not null then shift head to the next node;
        head = nn; // and assign nn as head
        return head; // return head
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node nn = new Node(x); //create new node
        if(head == null){
            head = nn; // if head is null then assign nn as head
            return head; // then return head
        }
        Node temp = head; // if head is not null then create a node temp and traverse
        while(temp.next != null){
            temp = temp.next; // reach out to the last node
        }
        temp.next = nn; // assign nn to the next of last node
        return head; // then return the head
    }
}