package ds.list;

public class BasicListMyImpl<X> {

    private Node rootNode;
    private int size;

    public BasicListMyImpl() {
        rootNode = null;
        size = 0;
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
        return size;
    }

    public void add(X item) {
        Node newNode = new Node(item);
        if (rootNode == null) {
            rootNode = newNode;
            size++;
            return;
        }

        Node tempNode = rootNode;
        while (tempNode.getNextNode() != null) {
            tempNode = tempNode.getNextNode();
        }
        tempNode.setNextNode(newNode);
        size++;
    }

    @Override
    public String toString() {
        return "BasicList{" +
                "rootNode=" + rootNode +
                '}';
    }

    public static void main(String[] args) {
        BasicListMyImpl<String> list = new BasicListMyImpl<>();
        list.add("Hi");
        list.add("tvhere");
        list.add("I");
        list.add("am");
        list.add("VIvek");

        System.out.println(list);
        System.out.println(list.size());
    }
}
