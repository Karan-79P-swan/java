
// import java.util.Collections;
public class singlyLinkedList {

    public static void Display(Node head){
        
        // Length of Linked List
        
        // Recusrsivly
        if(head == null) return;
        System.out.println(head.data);
        Display(head.next);
        
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // public static int length(Node head){
    //        int count = 0;
    //        while(head!=null){
    //         count++;
    //         head = head.next;
    //        }

    //        return count;
    // }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) 
    {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        
        
        // System.out.println(length(a));
        // Display(a);
        Node temp = a; 
        while(temp != null){
            System.out.println("  "+temp.next+" ");
            System.out.println();
            temp = temp.next;
        }

    }
}
