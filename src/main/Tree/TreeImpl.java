package main.Tree;

public class TreeImpl implements Tree {
    private Node root;
    public TreeImpl() {
    }

    @Override
    public void addChildWithData(int data) {
        if(root == null){// for empty tree
            root = new Node(data);
        }else if (data >= root.getData()){

        }
    }

    @Override
    public boolean isPresentChildWithData(int data) {
        return false;
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

        public int getData(){
            return data;
        }
    }
}
