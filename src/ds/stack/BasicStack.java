package ds.stack;

public class BasicStack<X> implements  Stack<X>{

    private X [] data;
    private int top;

    public BasicStack() {
        data = (X[]) new Object[100];
        top = 0;
    }

    public void push(X item) {
        if (top == data.length) {
            throw new IllegalArgumentException("Stack is full");
        }
        data[top++] = item;
    }

    public X pop() {
        if (top == 0) {
            throw new IllegalStateException("Empty Stack");
        }
        return data[--top];
    }

    public boolean contains(X item) {
        boolean found = false;

        for (int i = 0; i < top; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        
        return found;
    }

    public X access(X item) {
        while (top > 0) {
            X tempItem = pop();
            if (tempItem.equals(item)) {
                return tempItem;
            }
        }
        throw new IllegalArgumentException("Item does not exist");
    }

    public int size() {
        return top;
    }
}
