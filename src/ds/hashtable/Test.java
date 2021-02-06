package ds.hashtable;

public class Test {

    public static void main(String[] args) {
        BasicHashTable<String, String> hashTable = new BasicHashTable<>();

        hashTable.put("Hi", "Hi");
        hashTable.put("Hi", "Hello");
        hashTable.put("Hello", "Hello");

        System.out.println(hashTable.toString());
    }

}
