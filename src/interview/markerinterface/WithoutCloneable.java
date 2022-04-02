package interview.markerinterface;

public class WithoutCloneable {

    String clone = "Hi";

/*
    @Override
    protected WithoutCloneable clone() throws CloneNotSupportedException {
        WithoutCloneable w = new WithoutCloneable();
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
