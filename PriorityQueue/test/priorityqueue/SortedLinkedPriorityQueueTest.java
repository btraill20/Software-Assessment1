package priorityqueue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortedLinkedPriorityQueueTest extends PriorityQueueTest {
    
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
    
    public SortedLinkedPriorityQueueTest() {
    }
   
    @Before
    @Override
    public void setUp(){
        instance = new SortedLinkedPriorityQueue<>();
    }
    
    //basic add test.
    @Test
    public void testAdd() throws QueueOverflowException {
        System.out.println("basic adding test");
        instance.add(person,1);
        instance.add(person2,2);
        String expOutput = "[]";
        System.out.println("Expected: "+expOutput);
        String output = instance.toString();
        System.out.println("actual: "+output);
        assertEquals(expOutput, output);
    }
    
    //test to check if it throws when a queue is full.
    @Test
    public void testAdd2() throws QueueOverflowException {
        System.out.println("\t");
        System.out.println("Adding test 2, testing overflowexception");
        instance.add(person,1);
        instance.add(person2,2);
        instance.add(person3,3);
        instance.add(person4,4);
        instance.add(person5,5);
        instance.add(person6,6);
        instance.add(person7,7);
        instance.add(person8,8);
        instance.add(overflowtest,100);
        String expOutput = "[(manman, 8), (bob, 7), (gary, 6), (stacy, 5), (mary, 4), (dean, 3), (alan, 2), (ben, 1)]";
        System.out.println("Expected: "+expOutput);
        String output = instance.toString();
        System.out.println("actual: "+output);
    }

    //test to make sure the remove method works.
    @Test
    public void testRemove() throws QueueOverflowException,QueueUnderflowException {
        System.out.println("\t");
        System.out.println("test to add some people to a queue and then a remove of the head or 'pop'");
        instance.add(person,1);
        instance.add(person2,2);
        instance.add(person3,3);        
        String addOutput = instance.toString();
        System.out.println("added to queue: "+addOutput);
        
        instance.remove();
        String removeOutput = instance.toString();
        System.out.println("Queue after remove: "+removeOutput);
        
        String expOutput = "[(alan, 2), (ben, 1)]";
        System.out.println("Expected: "+expOutput);
        String output = instance.toString();
        System.out.println("actual: "+output);
        assertEquals(expOutput, output);
    }
    
    //test to check the head of the queue before and after a remove()
    @Test
    public void testHeadCheck() throws QueueOverflowException,QueueUnderflowException{
        System.out.println("\t");
        System.out.println("Test to check the head of the queue before and after remove()");
        instance.add(person,1);
        instance.add(person2,2);
        instance.add(person3,3);        
        String addOutput = instance.toString();
        System.out.println("added to queue: "+addOutput);
        
        instance.head();
        
        instance.remove();
        String removeOutput = instance.toString();
        System.out.println("Queue after remove: "+removeOutput);

        instance.head();
        
        String expOutput = "[(alan, 2), (ben, 1)]";
        System.out.println("Expected: "+expOutput);
        String output = instance.toString();
        System.out.println("actual: "+output);
        assertEquals(expOutput, output);
    }
    
}
