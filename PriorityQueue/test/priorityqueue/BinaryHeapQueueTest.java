/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benja
 */
public class BinaryHeapQueueTest {
    
    public BinaryHeapQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
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
        instance.minHeap();
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
