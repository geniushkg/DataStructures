package main;

public class LinkedList {
    private Node start;

    public LinkedList() {
    }

    public void addNode(int data) {
        if (start == null) {
            start = new Node(data);
        } else {
            start.next = new Node(data);
        }
    }

    public int getLastNodeData() {
        if (start == null) {
            return -1;
        } else {
            Node thisnode = start;
            while (thisnode.next != null) {
                thisnode = thisnode.next;
            }
            return thisnode.getData();
        }
    }

    private class Node {
        private int data;
        private Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }
    }
}
