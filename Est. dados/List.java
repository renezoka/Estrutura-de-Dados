public interface List<E>{
    int size();
    
    void add(E value);
    void insert(E value);
    void insert(int index, E value);
    
    void set(int index, E value);
    E get();
    
    E remove(int index);
    E removeFirst();
    E removeLast();
    
    void clear();
    boolean isFull();
    boolean isEmpty();

}