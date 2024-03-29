package DoubleLinkedList;

import DoubleLinkedList.DoubleNode.Node;

public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.print(node.data);

            while (node.next != null) {
                node = node.next;
                System.out.print(node.data);
            }
        }
    }
    // 숙제 부분
    public T headSearch(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node.next != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
        return null;
    }

    public T tailSearch(T isData) {
        if (this.tail != null) {
            Node<T> node = this.tail;
            while (node.prev != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
        return null;
    }

    public boolean addNodeInside(T data, T isData) {
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
            return true;
        } else if (this.head.data == isData){
            Node<T> newNode = new Node<>(data);
            newNode.next = this.head;
            this.head = newNode;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    Node<T> nodePrev = node.prev;

                    nodePrev.next = new Node<>(data);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                } else {
                    node = node.next;
                }
            }
            return false;
        }
    }
}
