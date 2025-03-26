

import collections.List;
import collections.StaticList;
import collections.ArrayList;
import collections.DoublyLinkedList;
import collections.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList<Integer> myDLL = new DoublyLinkedList<>();
        myDLL.add(7);
        myDLL.add(2);
        myDLL.add(3);
        myDLL.insert(99);
        myDLL.insert(15);
        myDLL.insert(33);
        myDLL.insert(5, 125);
        System.out.println(myDLL);
        System.out.println(myDLL.printReverse());
        
    }
}
