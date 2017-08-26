package main.linkedlist;

/**
 * Created by hardik on 23/08/17.
 */
public interface LList {
    void addNode(int data);
    int getLastNodeData();
    int sizeIterative();
    int getCountRecursively();
    boolean search(int key);
}
