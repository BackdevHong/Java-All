package DoubleLinkedList.DoubleNode;

public class Node<T> {
    public T data;
    public Node<T> next = null;
    public Node<T> prev = null;
    public Node(T data) {
        this.data = data;
    }
}
