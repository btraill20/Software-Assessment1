package priorityqueue;

import java.util.Comparator;
/**
 * @param <T> The type of things being stored.
 */
public class BinaryHeapQueue<T>  implements PriorityQueue<T> {

    private Object[] storage;
    private int capacity;
    private int tailIndex;
    Comparator comp;
    
    public BinaryHeapQueue(int size)
    {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    
    protected int parent(int i) {
        return (i-1) / 2;
    }
    
    
    protected int left(int i) {
        return i * 2 + 1;
    }
    
    protected int right(int i) {
        return i * 2 + 2;
    }
    
    protected void swap(int index1, int index2) {
        Object tmp = storage[index1];
        storage[index1] = storage[index2];
        storage[index2] = tmp;        
    }
    
    public void sort(Object[] storage) 
    { 
        int n = storage.length; 
        for (int i = 1; i < n; ++i) { 
            Object key = storage[i]; 
            int j = i - 1; 
  
            // Move elements of storage that are greater than key
            while(j >= 0){
                if(comp.compare(storage[j],key) >= 0){
                storage[j + 1] = storage[j]; 
                j = j - 1; 
                }
            } 
            storage[j + 1] = key; 
        } 
    } 
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            /* Scan backwards looking for insertion point */
            int i = tailIndex;
            storage[i] = new PriorityItem<>(item, priority);
            sort(storage);
            }
        }

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return ((PriorityItem<T>) storage[0]).getItem();
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {

        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            for (int i = 0; i < tailIndex; i++) {
                storage[i] = storage[i + 1];
            }
            tailIndex = tailIndex - 1;
        }
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
}