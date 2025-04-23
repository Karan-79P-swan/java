public class insertSinglyAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static  class Linked{
        Node head = null;
        Node tail = null;

        void insert(int val)
        {
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;

        }
        void Display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static  void main(String[] args) {
        Linked A1 = new Linked();
        A1.insert(0); 
        A1.insert(1);
        A1.insert(3);
        A1.Display();
        System.out.println();
        // System.out.println(A1.size());
        A1.insert(6);
        A1.insert(8);
        A1.Display();
    }
    
}