
package com.example.Blog.Model;

public class DoublyLinkedList {
    private static class Node {
        Post data;
        Node next;
        Node prev;

        public Node(Post data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;

    public void adicionar(Post post) {
        Node novo = new Node(post);
        if (head == null) {
            head = tail = novo;
        } else {
            tail.next = novo;
            novo.prev = tail;
            tail = novo;
        }
    }

    public Post removerUltimo() {
        if (tail == null) return null;

        Post removido = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return removido;
    }

    public String getAllAsString() {
        StringBuilder sb = new StringBuilder();
        Node atual = head;
        while (atual != null) {
            sb.append(atual.data.toString()).append("\n");
            atual = atual.next;
        }
        return sb.toString();
    }
}
