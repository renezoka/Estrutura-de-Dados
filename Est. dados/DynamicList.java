public class DynamicList<E> implements List<E>{
    class Node{
        E value;
        Node next;
        Node prev;
        
        public Node(E value){
            this.value = value;
        }
    }

    protected int size;
    protected Node head;
    protected Node tail;

    protected Node getNodeByIndex(int index){
        Node auxNode = head;
        for(int i = 0; i < index; i++){
            auxNode = auxNode.next;
        }
        return auxNode;
    }
    @Override
    public void clear(){
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }
   
}