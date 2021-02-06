package ds.list;

import java.util.Optional;

public class BasicList<X> {

    private Node first;
    private Node last;
    private int nodeCount;

    public BasicList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    public void add(X item) {
        if (size() == 0) {
            first = new Node(item);
            last = first;
        } else {
            Node newNode = new Node(item);
            last.setNextNode(newNode);
            last = newNode;
        }
        nodeCount++;
    }

    public void insertAt(X item, int position) {
        if (position > size()) {
            throw new IllegalArgumentException("Invalid postion");
        }
        Node currentNode = first;
        for (int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    public X remove() {
        if (size() == 0) {
            throw new IllegalStateException("Empty list");
        }
        X removedItem = first.getNodeItem();
        first = first.getNextNode();
        nodeCount--;
        return removedItem;
    }

    public X removeAt(int position) {
        if (size() == 0) {
            throw new IllegalStateException("List is empty, cannot remove");
        }
        if (position > size()) {
            throw new IllegalArgumentException("Invalid postion");
        }
        Node currentNode = first;
        for (int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        X item = currentNode.getNextNode().getNodeItem();
        Node nextNode = currentNode.getNextNode().getNextNode();
        currentNode.setNextNode(nextNode);
        nodeCount--;
        return item;
    }

    public X get(int position) {
        if (position < 1) {
            throw new IllegalArgumentException("Position cannot be negative");
        }

        Node tempNode = first;
        int count = 0;
        while (tempNode != null) {
            count++;
            if(count == position) {
                return tempNode.getNodeItem();
            }
            tempNode = tempNode.getNextNode();
        }
        throw new IllegalArgumentException("No node there");
    }

    public int find(X item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }

        Node tempNode = first;
        int pos = 0;
        while (tempNode != null) {
            pos++;
            if (item.equals(tempNode.getNodeItem())) {
                break;
            }
            tempNode = tempNode.getNextNode();
        }
        return pos;
    }

    private class Node  {
        private X nodeItem;
        private Node nextNode;

        @Override
        public String toString() {
            return "Node{" +
                    "nodeItem=" + nodeItem +
                    ", nextNode=" + nextNode +
                    '}';
        }

        public Node(X item) {
            this.nodeItem = item;
            nextNode = null;
        }

        public X getNodeItem() {
            return nodeItem;
        }
        public Node getNextNode() {
            return nextNode;
        }
        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    public int size() {
        return nodeCount;
    }

    @Override
    public String toString() {
        Node currentNode = first;
        String print = "BasicList{";
        while(currentNode != null) {
            print = print + currentNode.getNodeItem() + ", ";
            currentNode = currentNode.getNextNode();
        }
        print += "}";
        return print;
    }
}
