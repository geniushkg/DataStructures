package main.Tree;

public class TreeImpl implements Tree {
    private Node root;

    public TreeImpl() {
    }

    @Override
    public void addChildWithData(int data) {
        addChildWithDataRecursively(data, root);
    }

    /**
     * @param data
     * @param current
     */
    private void addChildWithDataRecursively(int data, Node current) {
        if (current == null) {
            current = new Node(data);
        } else if (data > current.getData()) {
            addChildWithDataRecursively(data, current.right);
        } else {
            addChildWithDataRecursively(data, current.left);
        }
    }

    @Override
    public boolean isPresentChildWithData(int data) {
        return findChildWithDataRecursively(data, root);
    }


    private boolean findChildWithDataRecursively(int data, Node current) {
        if (current == null) {
            return false;
        } else if (data > current.getData()) {
            return findChildWithDataRecursively(data, current.right);
        } else if (data < current.getData()) {
            return findChildWithDataRecursively(data, current.left);
        } else {
            return true;
        }
    }

    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }
}
