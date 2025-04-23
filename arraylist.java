import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // Add Element
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(8);
        list.add(7);
        list.add(6);

        // Get element
        // System.out.println(list.get(0));

        // // To Add element in between
        // list.set(1,4);
        // System.out.println(list);

        // // Delete Element
        // list.remove(2);
        // System.out.println(list);

        // Size 
        // int size = list.size();
        // System.out.println(size);

        //Loop
        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }

        //sorting
        list.set(7,2);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
