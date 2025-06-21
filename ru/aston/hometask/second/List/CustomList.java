package aston.hometask.second.List;

import java.util.Collection;

public class CustomList <T> {
    private Node first;
    private int size;

    public CustomList() {
        size = 0;
    }

    public T get(int index) {
        if (index > size - 1)
            return null;
        Node node = first;
        for (int i = 0; i < index; i++)
            node = node.next;
        return (T) node.value;
    }

    public boolean add(T value) {
        Node node = new Node(value);
        if (first == null) {
            first = node;
        } else {
            Node oldNode = first;
            while (oldNode.next != null)
                oldNode = oldNode.next;
            oldNode.next = node;
            node.prev = oldNode;
        }
        size++;
        return true;
    }
    public boolean add(int index, T value) {
        if (index > size)
            return false;
        if (index == size)
            return add(value);
        Node node = new Node(value);

        Node oldNode = first;
        for (int i = 0; i < index; i++)
            oldNode = oldNode.next;
        if (index == 0)
            first = node;
        else {
            oldNode.prev.next = node;
            node.prev = oldNode.prev;
        }
        node.next = oldNode;
        oldNode.prev = node;
        size++;
        return true;
    }

    public boolean addAll(Collection<T> collection) {
        for (T o : collection)
            if (!add(o))
                return false;
        return true;
    }
    public boolean addAll(int index, Collection<T> collection) {
        for (T o : collection)
            if (!add(index++, o))
                return false;
        return true;
    }

    public boolean remove(T value) {
        if (first == null)
            return false;
        Node node = first;
        while (node != null) {
            if (node.value.equals(value)) {
                node.prev.next = node.next;
                if (node.next != null)
                    node.next.prev = node.prev;
                size--;
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public T remove(int index) {
        if (index > size - 1)
            return null;
        Node node = first;
        for (int i = 0; i < index; i++)
            node = node.next;
        if (index == 0)
            first = node.next;
        else
            node.prev.next = node.next;
        if (node.next != null)
            node.next.prev = node.prev;
        size--;
        return (T) node.value;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node node = first;
        while (node != null) {
            builder.append(node.value.toString()).append(", ");
            node = node.next;
        }
        if (builder.length() > 1)
            builder.delete(builder.length() - 2, builder.length());
        builder.append("]");
        return builder.toString();
    }

    private class Node <S> {
        S value;
        Node next;
        Node prev;
        public Node(S value) {
            this.value = value;
        }
    }
}