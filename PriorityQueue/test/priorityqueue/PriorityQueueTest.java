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


public abstract class PriorityQueueTest {
    
    public PriorityQueue<Person> instance;    

    @Before
    public abstract void setUp();

    //test to check the queue if its empty
    @Test
    public void testIsEmpty() {
        System.out.println("test to check if the queue is empty.");
        boolean expResult = true;
        boolean result = instance.isEmpty();
        System.out.println("actual: "+result);
        assertEquals(expResult, result);
    }
//    
//    /**
//     * Test of head method, of class SortedArrayPriorityQueue.
//     */
//    @Test
//    public void testHead() throws Exception {
//        System.out.println("head test");
//        Object expResult = null;
//        Object result = instance.head();
//        assertEquals(expResult, result);
//    }
//



}
