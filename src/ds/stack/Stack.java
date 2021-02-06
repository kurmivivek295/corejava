package ds.stack;

public interface Stack<X> {

    void push(X item);
    X pop();
    boolean contains(X item);
    X access(X item);
    int size();

}
