package interview.markerinterface;

public class WithCloneable implements Cloneable {

    String clone = "Hi";

/*
    @Override
    protected WithCloneable clone() throws CloneNotSupportedException {
        WithCloneable w = new WithCloneable();
        w.clone = "Clone Hi";
        return w;
    }
*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getClone() {
        return clone;
    }
}
