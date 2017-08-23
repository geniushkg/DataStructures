package main;

import static org.junit.Assert.assertEquals;

/**
 * Created by hardik on 23/08/17.
 */
public class LinkedListTest {
    @org.junit.Test
    public void addNode() throws Exception {
        LinkedList ll = new LinkedList();
        ll.addNode(2);
        ll.addNode(3);
        assertEquals(3,ll.getLastNodeData());
    }

}