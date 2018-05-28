package com.foolchen.leetcode.samples;

import com.foolchen.leetcode.samples.linkedlist.ListNode;

/**
 * @author chenchong. Created on 2018/5/28.
 */
public class Samples {
  public static void main(String[] args) {
    printLinkedList();
  }

  private static void printLinkedList() {
    int[] arr = {1, 2, 3, 4, 5};
    ListNode head = Utils.createLinkedList(arr);
    System.out.println(Utils.linkedListToString(head));
  }
}
