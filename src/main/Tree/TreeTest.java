package main.Tree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TreeTest {

    @Test
    public void testAddChild() throws Exception {
        Tree tree = new TreeImpl();
        tree.addChildWithData(1);
        assertEquals(true,tree.isPresentChildWithData(1));
    }

    @Test
    public void testFindChild() throws Exception {
        Tree tree = new TreeImpl();
        tree.addChildWithData(1);
        assertFalse(tree.isPresentChildWithData(2));
        assertTrue(tree.isPresentChildWithData(1));
    }

}

