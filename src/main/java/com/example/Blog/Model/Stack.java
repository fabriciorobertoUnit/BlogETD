package com.example.Blog.Model;

public class Stack {
    private static class StackNode {
        Post data;
        StackNode next;

        StackNode(Post data) {
            this.data = data;
        }
    }

    private StackNode top;

    public void push(Post data) {
        StackNode novo = new StackNode(data);
        novo.next = top;
        top = novo;
    }

    public Post pop() {
        if (top == null) return null;
        Post data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
