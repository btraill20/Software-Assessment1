package priorityqueue;

/**
 * @param <T>
 */
public class SortedLinkedPriorityQueue<T>  implements PriorityQueue<T> {

    private Node<T> top;
    
    //cotructor to set the initial node position
    public SortedLinkedPriorityQueue(){
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

