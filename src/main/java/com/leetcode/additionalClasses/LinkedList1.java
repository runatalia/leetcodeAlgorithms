package com.leetcode.additionalClasses;

import java.util.Iterator;

public class LinkedList1<U> implements Iterator {
    private class LinkedNode<T> {
        T value;
        LinkedNode<T> next;

        LinkedNode() {
            this.value = null;
            this.next = null;
        }

        LinkedNode(T value) {
            this.value = value;
        }

        LinkedNode(T value, LinkedNode next) {
            this.value = value;
            this.next = next;
        }
    }

    LinkedNode<U> top = new LinkedNode<>();
    static int count;

    public int push(LinkedNode<U> linkedNode) {
        this.top.next = linkedNode;
        count++;
        return count;
    }

    @Override
    public boolean hasNext() {
        return this.top.next == null && this.top.value == null;
    }

    @Override
    public Object next() {
        return top.next;
    }

    public LinkedNode<U> pop() {
        top = top.next;
        return top;
    }
}
