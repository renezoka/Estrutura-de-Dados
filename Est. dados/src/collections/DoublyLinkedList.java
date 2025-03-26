package collections;

import exceptions.EmptyListException;

public class DoublyLinkedList<E> extends DynamicList<E> {

    @Override
    public void add(E value) {
        Node newNode = new Node(value);      
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }


    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(E value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;

    }

    private Node getNodeFromTail(int index) {
        Node auxNode = tail;
        for (int i = size - 1; i > index; i--) {
            auxNode = auxNode.prev;
        }
        return auxNode;
    }

    @Override
    public void insert(int index, E value) {
        if (index <= 0) {
            insert(value);
        } else if (index >= size) {
            add(value);
        } else {
            Node newNode = new Node(value);
            Node auxNode = (index > (size / 2)) ? getNodeFromTail(index) : getNodeByIndex(index);
            newNode.next = auxNode;
            newNode.prev = auxNode.prev;
            auxNode.prev.next = newNode;
            auxNode.prev = newNode;
            size++;
        }
    }

   

   

    @Override
    public E removeByIndex(int index) throws EmptyListException {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public E removeFirst() throws EmptyListException {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public E removeLast() throws EmptyListException {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void set(int index, E value) {
        // TODO Auto-generated method stub

    }

    public String printReverse() {
        String dataString = "[";
        Node auxNode = tail;
        while (auxNode != null) {
            dataString += auxNode.value;
            if (auxNode.prev != null) {
                dataString += " <=> ";
            }
            auxNode = auxNode.prev;
        }
        return dataString + "]";
    }

    @Override
    public String toString() {
        String dataString = "[";
        Node auxNode = head;
        while (auxNode != null) {
            dataString += auxNode.value;
            if (auxNode.next != null) {
                dataString += " <=> ";
            }

            auxNode = auxNode.next;
        }
        return dataString + "]";
    }

}
