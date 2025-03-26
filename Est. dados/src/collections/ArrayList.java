package collections;

import exceptions.FullListException;

public class ArrayList<E> extends StaticList<E> {

    public ArrayList(int maxSize){
        super(maxSize);
    }

    private void recreateArray(){
        E[] newList = (E[]) new Object[list.length*2];
        for(int i = 0; i < size; i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    @Override
    public void add(E value) {
        if(isFull()) recreateArray();
        list[size] = value;
        size++;
    }

    @Override
    public void insert(E value) {
        // TODO Auto-generated method stub
        super.insert(value);
    }

    @Override
    public void insert(int index, E value) {
        // TODO Auto-generated method stub
        super.insert(index, value);
    }

    

}
