package data_structure.linkedlist;

/**
 * Write a Program to reverse the Linked List. (Both Iterative and recursive)
 */
public class LinkedList2 {

    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void reverse() {
        Node currentNode = head;

        Node prevNode = null;
        Node next = null;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;
        }
        head = prevNode;
    }

    public Node recursiveReverse(Node headNode) {
        if (headNode == null || headNode.next == null) {
            return headNode;
        }

        Node rest = recursiveReverse(headNode.next);

        headNode.next.next = headNode;
        headNode.next = null;

        return rest;
    }

    public void addFirst(Node node) {
        node.next = head;
        head = node;
    }

    public void addAtPosition(Node node, int position) throws Exception {
        if (position == 1) {
            addFirst(node);
            return;
        }
        Node currentNode = head.next;
        Node prevNode = head;
        int index = 2;
        while (currentNode != null) {
            if (index == position) {
                prevNode.next = node;
                node.next = currentNode;
                return;
            }
            index++;
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (index == position) {
//            add at last
            prevNode.next = node;
            node.next = null;
            return;
        } else {
            throw new Exception("Invalid position");
        }
    }

    public void addLast(Node node) {
        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.next == null) {
                tempNode.next = node;
                node.next = null;
                break;
            }
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

//        list.reverse();
//        list.addFirst(new Node(0));
//        list.addLast(new Node(6));

        /*
        * Add node at given position
        *
        try {
            list.addAtPosition(new Node(5), 5);
            list.addAtPosition(new Node(6), 6);
            list.addAtPosition(new Node(0), 1);
            list.addAtPosition(new Node(8), 8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        list.head = list.recursiveReverse(list.head);
        list.toString();
    }

    @Override
    public String toString() {
        System.out.print("[");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            if (currentNode.next != null) {
                System.out.print(", ");
            }
            currentNode = currentNode.next;
        }
        System.out.print("]");
        return null;
    }

}
