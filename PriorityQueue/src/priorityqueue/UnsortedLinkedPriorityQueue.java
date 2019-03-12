package priorityqueue;

/**
 * @param <T> The type of things being stored.
 */
public class UnsortedLinkedPriorityQueue<T>  implements PriorityQueue<T> {
    private Node<T> top;
    private int tail = -1;
    
    public UnsortedLinkedPriorityQueue(){
        top = null;
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        top = new Node<>(item, priority, top);
    }

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return top.getitem();
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            top = top.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    @Override
    public String toString(){
         String result = "Queue contents = [";
         for(Node<T> node = top; node != null; node = node.getNext()){
             if(node != top){
                 result += ", ";
             }
             result += node.getitem() + " ";
             result += node.getPriority();
         }
         result += "]";
         return result;
    }
}
