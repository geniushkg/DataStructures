package main.Tree;

public class TreeImpl implements Tree {
    private Node root;

    public TreeImpl() {
        root = null;
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
        if (search(root,data) != null)
            return true;
        else
            return false;
    }

    public Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.getData() == key)
            return root;

        // val is greater than root's key
        if (root.getData() > key)
            return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
    }


    private boolean findChildWithDataRecursively(int data, Node current) {
        if (current == null) {
            return false;
        } else if (data > current.getData()) {
            return findChildWithDataRecursively(data, current.right);
        } else if (data < current.getData()) {
            return findChildWithDataRecursively(data, current.left);
        } else {
            return data == current.getData();
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
