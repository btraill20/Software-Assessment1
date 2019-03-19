package priorityqueue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryHeapQueueTest extends PriorityQueueTest {
    
        String name = "ben";
        String name2 = "alan";
        String name3 = "dean";
        String name4 = "mary";
        String name5 = "stacy";
        String name6 = "gary";
        String name7 = "bob";
        String name8 = "manman";
        String overflow = "overflowtest";
        Person person = new Person(name);
        Person person2 = new Person(name2);
        Person person3 = new Person(name3);
        Person person4 = new Person(name4);
        Person person5 = new Person(name5);
        Person person6 = new Person(name6);
        Person person7 = new Person(name7);
        Person person8 = new Person(name8);
        Person overflowtest = new Person(overflow);
    
    public BinaryHeapQueueTest() {
    }

    @Before
    @Override
    public void setUp(){
        instance = new BinaryHeapQueue<>(10);
    }

    /**
     * Test of add method, of class BinaryHeapQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = null;
        int priority = 0;
        BinaryHeapQueue instance = null;
        instance.add(item, priority);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minHeap method, of class BinaryHeapQueue.
     */
    @Test
    public void testMinHeap() {
        System.out.println("minHeap");
        BinaryHeapQueue instance = null;
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of head method, of class BinaryHeapQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        BinaryHeapQueue instance = null;
        Object expResult = null;
        Object result = instance.head();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BinaryHeapQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        BinaryHeapQueue instance = null;
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BinaryHeapQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinaryHeapQueue instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BinaryHeapQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BinaryHeapQueue instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
