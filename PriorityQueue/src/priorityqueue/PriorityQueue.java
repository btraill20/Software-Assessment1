package priorityqueue;

/**
 * @param <T> The type of items stored in the queue.
 */
public interface PriorityQueue<T> {

    /**
     * Add the given item to the queue with the given priority. Throw an
     * exception if it's already full to capacity.
     *
     * @param item
     * @param priority
     * @throws QueueOverflowException
     */
    public void add(T item, int priority) throws QueueOverflowException;
    public T head() throws QueueUnderflowException;
    public void remove() throws QueueUnderflowException;
    public boolean isEmpty();

    @Override
    public String toString();
}
