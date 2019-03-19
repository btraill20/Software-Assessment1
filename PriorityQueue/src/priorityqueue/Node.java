package priorityqueue;

public class Node<T> {
    
    private T item;
    private int priority;
    private Node<T> next;
    
    public Node(T item, int priority, Node<T> next){
        this.item = item;
        this.priority = priority;
        this.next = next;
    }

    public T getitem(){
        return item;
    }
    
    public T setitem(){
        return item;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public Node <T> getNext(){
        return next;
    }

}
