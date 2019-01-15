package priorityqueue;

/**
 * @param <T> The type of things being stored.
 */
public class SortedLinkedPriorityQueue<T>  implements PriorityQueue<T> {
    
      private final Object[] storage;
      private final int capacity;
      private final int tailIndex;
      Node head;
      int position;
      
      public SortedLinkedPriorityQueue(int size) {
            storage = new Object[size];
            capacity = size;
            tailIndex = -1;
  }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
            /* 1. Allocate the Node & 
       2. Put in the data 
       3. Set next as null */
    Node new_node = new Node(priority); 
  
    /* 4. If the Linked List is empty, then make the 
           new node as head */
    if (head == null) 
    { 
        head = new Node(priority); 
        return; 
    } 
  
    /* 4. This new node is going to be the last node, so 
         make next of it as null */
    new_node.next = null; 
  
    /* 5. Else traverse till the last node */
    Node last = head;  
    while (last.next != null) 
        last = last.next; 
  
    /* 6. Change the next of last node */
    last.next = new_node; 
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
        // If linked list is empty 
        if (head == null) 
            return; 
  
        // Store head node 
        Node temp = head; 
  
        // If head needs to be removed 
        if (position == 0) 
        { 
            head = temp.next; 
            return; 
        } 
  
        // Find previous node of the node to be deleted 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
  
        // If position is more than number of ndoes 
        if (temp == null || temp.next == null) 
            return; 
  
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        Node next = temp.next.next; 
  
        temp.next = next;  // Unlink the deleted node from list 
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
    @Override
    public String toString() {
        String result = "[";
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
        result = result + "]";
        return result;
    } 
    
}

