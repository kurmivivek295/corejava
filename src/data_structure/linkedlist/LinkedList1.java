package data_structure.linkedlist;

/**
 * Write a Program to reverse the Linked List. (Both Iterative and recursive)
 */
public class LinkedList1 {

    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void reverse() {
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

    public static Node recursiveReverseSplit(Node headNode) {
        if (headNode == null || headNode.next == null) {
            return headNode;
        }

        Node rest = recursiveReverseSplit(headNode.next);

        headNode.next.next = headNode;
        headNode.next = null;

        return rest;
    }

    public static void recursiveReverse(Node prevNode, Node currNode) {
        if (head == null) {
            return;
        }

        if (currNode.next == null) {
            currNode.next = prevNode;
            head = currNode;
            return;
        }

        recursiveReverse(prevNode.next, currNode.next);

        currNode.next = prevNode;
    }

    public static void addFirst(Node node) {
        node.next = head;
        head = node;
    }

    public static void addAtPosition(Node node, int position) throws Exception {
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

    public static void addLast(Node node) {
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
        addFirst(new Node(4));
        addFirst(new Node(3));
        addFirst(new Node(2));
        addFirst(new Node(1));

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
        recursiveReverse(head, head.next);
        print();
    }

    public static void print() {
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
    }

}
