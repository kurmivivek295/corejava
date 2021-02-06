package ds.list;

public class BasicListTest {

    public static void main(String[] args) {
        BasicList<String> list = new BasicList<>();

        list.add("Hi");
        list.add("I");
        list.insertAt("there", 1);

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.find("Hi"));
    }

}
