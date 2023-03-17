package com.leetcode.additionalClasses;


import java.util.ArrayList;
import java.util.List;

/*class ListNode for mergeTwoLists*/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void showListNode(ListNode listNode) {
        if (listNode == null) return;
        System.out.print(listNode.val);
        showListNode(listNode.next);
    }

    List<Integer> arrLisrNode = new ArrayList<>();

    public List listNodeToArrays(ListNode listNode) {
        if (listNode == null) return null;
        arrLisrNode.add(listNode.val);
        listNodeToArrays(listNode.next);
        return arrLisrNode;
    }

    public void add(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = next;
        next = newNode;
    }

}

