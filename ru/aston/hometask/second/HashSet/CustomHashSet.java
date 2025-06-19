package aston.hometask.second.HashSet;

public class CustomHashSet <T> {
    private Node[] table;
    private final int START_SIZE = 16;
    private int busyBucket = 0;

    public CustomHashSet() {
        table = new Node[START_SIZE];
    }

    private int hash(T value) {
        if (value == null)
            return 0;
        return value.hashCode();
    }
    private int getIndex(int hash) {
        int index = hash & (table.length - 1);
        return index;
    }
    private boolean addNode(int index, Node node) {
        if (busyBucket == table.length)
            resize();

        Node oldNode = table[index];
        if (oldNode == null) {
            busyBucket++;
            table[index] = node;
        }
        else {
            while (oldNode != null) {
                if (oldNode.hash == node.hash || oldNode.value.equals(node.value)) {
                    return false;
                }
                if (oldNode.next == null) {
                    oldNode.next = node;
                    break;
                }
                else oldNode = oldNode.next;
            }
            oldNode.next = node;
        }
        return true;
    }
    private boolean removeNode(int index, Node node) {
        Node currentNode = table[index];
        if (currentNode == null)
            return false;

        if (currentNode.hash == node.hash || currentNode.value.equals(node.value)) {
            table[index] = currentNode.next;
            if (table[index] == null)
                busyBucket--;
            return true;
        }
        else {
            Node prevNode = currentNode;
            currentNode = currentNode.next;
            while (currentNode != null) {
                if (currentNode.hash == node.hash || currentNode.value.equals(node.value)) {
                    prevNode.next = currentNode.next;
                    return true;
                }
            }
            return false;
        }
    }

    public boolean add(T value) {
        if (value == null)
            return false;
        int hash = hash(value);
        return addNode(getIndex(hash), new Node(hash, value));
    }
    public boolean remove(T value) {
        if (value == null)
            return false;
        int hash = hash(value);
        return removeNode(getIndex(hash), new Node(hash, value));
    }

    private void resize() {
        Node[] newTable = new Node[table.length * 2];

        for (int i = 0; i < table.length; i++) {
            Node oldNode = table[i];
            while (oldNode != null) {
                int index = getIndex(oldNode.hash);
                Node newNode = newTable[index];
                if (newNode == null)
                    newTable[index] = oldNode.reset();
                else {
                    while(newNode != null)
                        newNode = newNode.next;
                    newNode = oldNode.reset();
                }
                oldNode = oldNode.next;
            }
        }
        table = newTable;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < table.length; i++) {
            Node node = table[i];
            while (node != null) {
                builder.append(node.value.toString()).append(", ");
                node = node.next;
            }
        }
        if (builder.length() > 1)
            builder.delete(builder.length() - 2, builder.length());

        builder.append("]");
        return builder.toString();
    }

    private class Node <T> {
        int hash;
        T value;
        Node next;

        public Node(int hash, T value) {
            this.hash = hash;
            this.value = value;
        }
        public Node reset() {
            next = null;
            return this;
        }
    }
}