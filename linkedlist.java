public class linkedlist {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
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
        // f.next = null;

        // System.out.println(b);
        // System.out.println(a.next);
        // System.out.println(b.data);
        // System.out.println(a.data);

        // System.out.println(f.next);
        
    }
    
}
 