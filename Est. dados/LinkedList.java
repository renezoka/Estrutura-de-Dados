public class LinkedList<E> extends DynamicList<E> {
    @Override
    public void add(E value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode = tail.next;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void insert(E value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode = head.prev;
        }
        head = newNode;
        size++;
    }

    @Override
    public void insert(int index, E value){
        if(index <= 0){
            insert(value);
        }else if(index >= size){
            add(value);
        }else{
            Node newNode = new Node(value);
            Node auxNode = getNodeByIndex(index-1);
            newNode.next = auxNode.next;
            auxNode.next = newNode;
    }

    @Override
    public void set(int index, E value){
        
    }

}
}
