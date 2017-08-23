package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hardik on 23/08/17.
 */
public class LinkedListTest {


    @Test
    public void sizeIterative() throws Exception {
        LList ll = new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        assertEquals(5,ll.sizeIterative());
    }

    @org.junit.Test
    public void addNode() throws Exception {
        LList ll = new LinkedList();
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(22);
        assertEquals(22,ll.getLastNodeData());
    }

    @Test
    public void sizeRecursive() throws Exception {
        LList ll = new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        assertEquals(5,ll.getCountRecursively());
    }
}