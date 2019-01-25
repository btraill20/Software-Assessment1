package priorityqueue;

/**
 * @param <T> The type of things being stored.
 */
public class BinaryHeapQueue<T>  implements PriorityQueue<T> {
    private int[] Heap;
    private int size;
    private int element;
    private int maxsize; 
  
    private static final int FRONT = 1;
        
    public BinaryHeapQueue(int maxsize) {
        this.maxsize = maxsize; 
        this.size = 0; 
        Heap = new int[this.maxsize + 1]; 
        Heap[0] = Integer.MIN_VALUE; 
    }

    private int parent(int pos){
    return pos / 2;
    }
    
    private int leftChild(int pos) 
    { 
        return (2 * pos); 
    } 

    private int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
    
    private boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
  
    private void swap(int fpos, int spos) 
    { 
        int tmp; 
        tmp = Heap[fpos]; 
        Heap[fpos] = Heap[spos]; 
        Heap[spos] = tmp; 
    } 
    
    // Function to heapify the node at pos 
    private void minHeapify(int pos) 
    { 
  
        // If the node is a non-leaf node and greater 
        // than any of its child 
        if (!isLeaf(pos)) { 
            if (Heap[pos] > Heap[leftChild(pos)] 
                || Heap[pos] > Heap[rightChild(pos)]) { 
  
                // Swap with the left child and heapify 
                // the left child 
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) { 
                    swap(pos, leftChild(pos)); 
                    minHeapify(leftChild(pos)); 
                } 
  
                // Swap with the right child and heapify  
                // the right child 
                else { 
                    swap(pos, rightChild(pos)); 
                    minHeapify(rightChild(pos)); 
                } 
            } 
        } 
    } 
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        
        Heap[++size] = element; 
        int current = size; 
  
        while (Heap[current] < Heap[parent(current)]) { 
            swap(current, parent(current)); 
            current = parent(current); 
        }
    }

    public void minHeap() 
    { 
        for (int pos = (size / 2); pos >= 1; pos--) { 
            minHeapify(pos); 
        } 
    } 
    
    @Override
    public T head() throws QueueUnderflowException {
        int popped = Heap[FRONT]; 
        Heap[FRONT] = Heap[size--]; 
        minHeapify(FRONT);
        return null;
    }

    @Override
    public void remove() throws QueueUnderflowException {
        int popped = Heap[FRONT]; 
        Heap[FRONT] = Heap[size--]; 
        minHeapify(FRONT); 
    }

    @Override
    public boolean isEmpty() {
        return FRONT < 0;
    }
    
    @Override
    public String toString() {
       for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + Heap[i] 
                     + " LEFT CHILD : " + Heap[2 * i] 
                   + " RIGHT CHILD :" + Heap[2 * i + 1]); 
            System.out.println(); 
        } 
        return null;
    }
}
