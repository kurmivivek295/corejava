package ds.queue;

import java.util.Arrays;

public class BasicQueue<X> {

    private X [] data;
    private int front;
    private int rear;

    public BasicQueue() {
        this(5);
    }
    public BasicQueue(int size) {
        data = (X[]) new Object[size];
        front = -1;
        rear = -1;
    }

    public int size() {
        if (front == -1 && rear == -1) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

    public void enqueue(X item) {
//        if((rear + 1) % data.length == front) {
//        Check if queue is not full
        if (rear == data.length) {
            throw new IllegalStateException("Overflow");
        }
//        check if adding first element
        else if(size() == 0) {
            front++;
            rear++;
            data[rear] = item;
        }
//        if adding items after first item
        else {
            rear++;
            data[rear] = item;
        }
    }

    public X dequeue() {
        X item = null;
//        check if there are no items in the queue
        if (size() == 0) {
            throw new IllegalStateException("Underflow");
        }

//        check if there is only one item in the queue hence front and rear will be equal
        else if (front == rear) {
            item = data[front];
            data[front] = null;
            front = -1;
            rear = -1;
        }
//        If front and rear are not equal means there are multiple people are there in the queue
        else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(X item) {
        boolean found = false;
        if (size() == 0) {
            return found;
        }
        for (int i = front; i < rear; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return false;
    }

    public X access(int position) {
        if (size() == 0 || position > size()) {
            throw new IllegalArgumentException("No items in queue or invalid size");
        }

        // This for actual no in queue think of real time
        int trueindex = 0;
        for (int i = front; i < rear; i++) {
            if (trueindex == position) {
                return data[i];
            }
            trueindex++;
        }
        throw new IllegalArgumentException("Could not get the item at the given posiotn");
    }

    public static void main(String[] args) {
        BasicQueue<String> basicQueue = new BasicQueue<>();

        basicQueue.enqueue("Hi");
        basicQueue.enqueue("I");
        basicQueue.enqueue("am");
        basicQueue.enqueue("Vivek");
        basicQueue.enqueue("From");

        System.out.println(basicQueue);

        basicQueue.dequeue();
        basicQueue.enqueue("BLR");

        System.out.println(basicQueue);
    }

    @Override
    public String toString() {
        return "BasicQueue{" +
                "data=" + Arrays.toString(data) +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
