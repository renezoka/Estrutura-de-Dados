package collections;

import exceptions.EmptyListException;
import exceptions.FullListException;

public class StaticList<E> implements List<E> {
    
    protected int size;
    protected E[] list;

    private final int MAX_SIZE = 10;

// Michael Goodrich
    @SuppressWarnings("unchecked")
    public StaticList(){    
        list = (E[])new Object[MAX_SIZE];
    }



    @SuppressWarnings("unchecked")
    public StaticList(int maxSize){
        if(maxSize<0)
            maxSize *=-1;
        list = (E[])new Object[maxSize];
        
    }

    @Override
    public void add(E value) { //O(1)
        if(isFull()) throw new FullListException("Static List is Full!");
        list[size] = value;
        size++;
    }
    
    @Override
    public E get(int index) {
        if(isEmpty()) throw new EmptyListException("Static List is Empty");
        checkIndex(index);
        
        return list[index];
    }
    
    @Override
    public void insert(E value) {
        if(isFull()) throw new FullListException("Static List is Full!");
        
        for(int i = size; i > 0; i--){
            list[i] = list[i-1];
        }
        list[0] = value;
        size++;

    }

    @Override
    public void insert(int index, E value) {
        if(index<=0){
            insert(value);
        }else if(index>=size){
            add(value);
        }else{
            if(isFull()) throw new FullListException("Static List is Full!");
            for(int i = size; i > index; i--){
                list[i] = list[i-1];
            }
            list[index] = value;
            size++;
        }

        
    }
    

    @Override
    public void clear() {
        size = 0;        
    }



    @Override
    public boolean isEmpty() {
        
        return size == 0;
    }

    public boolean isFull(){
        return size == list.length;   
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("Available indexes are [0 ~ "+(size-1)+"]");
    }

    @Override
    public E removeByIndex(int index) throws EmptyListException,IndexOutOfBoundsException {
        if(isEmpty()) throw new EmptyListException("Static List is Empty");
        checkIndex(index);
        E value = list[index];
        size--;
        for(int i = index; i < size; i++){
            list[i] = list[i+1];
        }
        return value;
    }

    @Override
    public E removeFirst() throws EmptyListException {    
        return removeByIndex(0);
    }

    @Override
    public E removeLast() throws EmptyListException {
        if(isEmpty()) throw new EmptyListException("Static List is Empty");
        return list[--size];
    }

    @Override
    public void set(int index, E value) {
        if(isEmpty()) throw new EmptyListException("Static List is Empty");
        checkIndex(index);
        list[index] = value;
        
    }

    @Override
    public int size() {
        
        return size;
    }



    @Override
    public String toString() {
        String dataList = "[";
        for(int i = 0; i < size; i++){
            dataList += list[i];
            if(i < size - 1){
                dataList += ", ";
            }
        }
        return dataList + "]";
    }

    
    
}
