package ds.hashtable;

import java.util.Hashtable;

public class BasicHashTable<X, Y> {

    private HashEntry<X,Y>[] data;
    private int capacity;
    private int size;

    public BasicHashTable() {
        this(10);
    }

    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        this.data = new HashEntry[capacity];
        this.size = 0;
    }

    public Y get(X key) {
        int hash = calculateHash(key);
        if(data[hash] == null) {
            return null;
        }
        return data[hash].getValue();
    }

    public void put(X key, Y value) {
        int hash = calculateHash(key);

        if(data[hash] == null) {
            data[hash] = new HashEntry<>(key, value);
        } else {
            if (data[hash].getKey().equals(key)) {
                data[hash].setValue(value);
            } else {
                throw new IllegalArgumentException("Some issue with key mapping");
            }
        }
        size++;
    }

    public boolean delete(X key) {
        boolean deleted = false;
        Y value = get(key);

        if (value != null) {
            int hash = calculateHash(key);

            data[hash] = null;
            size--;

            hash = (hash + 1) % this.capacity;

            while (data[hash] != null) {
                HashEntry he = data[hash];
                data[hash] = null;

                put((X)he.getKey(), (Y)he.getValue());

                size--;
                hash = (hash + 1) % this.capacity;
            }
        }

        return deleted;
    }

    private int calculateHash(X key) {
        int hash = key.hashCode() % this.capacity;

        while (data[hash] != null && !data[hash].getKey().equals(key)) {
            hash = (hash + 1) % this.capacity;
        }

        return hash;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hashtable[");
        for (int i = 0; i < data.length; i++) {
            HashEntry hashEntry = data[i];
            if (hashEntry != null) {
                builder.append("{" + hashEntry.key + ", " + hashEntry.getValue() + "}");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private class HashEntry<X, Y> {
        private X key;
        private Y value;

        public HashEntry(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }
    }

}
