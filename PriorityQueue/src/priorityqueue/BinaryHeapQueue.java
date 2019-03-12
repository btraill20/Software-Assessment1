package priorityqueue;
/**
 * @param <T> The type of things being stored.
 */
public class BinaryHeapQueue<T>  implements PriorityQueue<T> {
        
    private static final int DEFAULT_CAPACITY = 10;
    protected T[] array;
    protected int size;
    
    
    public BinaryHeapQueue()
    {
        array = (T[])new Comparable[DEFAULT_CAPACITY];  
        size = 0;
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        if (size >= array.length - 1) {
        }        
        
        // place element into heap at bottom
        size++;
        int index = size;
        

    }

    @Override
    public T head() throws QueueUnderflowException {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        }
        
        return array[1];
    }

    @Override
    public void remove() throws QueueUnderflowException {
        T result = head();
    	
    	// get rid of the last leaf/decrement
    	array[1] = array[size];
    	array[size] = null;
    	size--;
    	


    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString(){
        return null;
    }

    
    protected boolean hasParent(int i) {
        return i > 1;
    }
    
    
    protected int leftIndex(int i) {
        return i * 2;
    }
    
    
    protected int rightIndex(int i) {
        return i * 2 + 1;
    }
    
    
    protected boolean hasLeftChild(int i) {
        return leftIndex(i) <= size;
    }
    
    
    protected boolean hasRightChild(int i) {
        return rightIndex(i) <= size;
    }
    
    
    protected T parent(int i) {
        return array[parentIndex(i)];
    }
    
    
    protected int parentIndex(int i) {
        return i / 2;
    }    
    
    protected void swap(int index1, int index2) {
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;        
    }
}
