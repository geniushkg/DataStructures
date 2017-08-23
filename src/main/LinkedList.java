package main;

public class LinkedList {
    private Node start;

    public LinkedList() {
    }

    public void addNode(int data) {
        if (start == null) {
            start = new Node(data);
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
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

    public int sizeIterative() {
        if (start == null) {
            return 0;
        } else {
            int count = 0;
            Node currentNode = start;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                count++;
            }
            return count + 1;
        }
    }

    public int getCountRecursively() {
        return getCountRecursive(start);
    }

    private int getCountRecursive(Node head) {
        if (head == null) {
            return 0;
        } else {
            return 1 + getCountRecursive(head.next);
        }
    }

    public Node getStart() {
        return start;
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
