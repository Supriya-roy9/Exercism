import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int size;

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    public SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() {
        if (head == null) {
            throw new NoSuchElementException("The list is empty");
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public void reverse() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public T[] asArray(Class<T> clazz) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
        int i = 0;
        for (Node<T> node = head; node != null; node = node.next) {
            array[i++] = node.data;
        }
        return array;
    }
}
