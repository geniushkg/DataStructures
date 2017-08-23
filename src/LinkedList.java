public class LinkedList {
    private Node start;

    public LinkedList(){
    }

    public void addNode(int data){
        if (start==null){
            start = new Node(data);
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
        }
    }
}
