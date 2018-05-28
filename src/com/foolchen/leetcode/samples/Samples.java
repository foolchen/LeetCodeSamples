package com.foolchen.leetcode.samples;

import com.foolchen.leetcode.samples.linkedlist.ListNode;
import com.foolchen.leetcode.samples.linkedlist.PalindromCase;

import static com.foolchen.leetcode.samples.Utils.createLinkedList;

/**
 * @author chenchong. Created on 2018/5/28.
 */
public class Samples {
  public static void main(String[] args) {
    isPalindrome();
  }

  private static void isPalindrome() {
    PalindromCase palindromCase = new PalindromCase();
    int[] arr = null;
    ListNode head = createLinkedList(arr);
    assert palindromCase.isPalindrome(head);
    arr = new int[] {1};
    head = createLinkedList(arr);
    assert palindromCase.isPalindrome(head);
    arr = new int[] {1, 1, 1, 1};
    head = createLinkedList(arr);
    assert palindromCase.isPalindrome(head);
    arr = new int[] {1, 2};
    head = createLinkedList(arr);
    assert palindromCase.isPalindrome(head);
    arr = new int[] {1, 2, 1};
    head = createLinkedList(arr);
    assert palindromCase.isPalindrome(head);
    arr = new int[] {1, 2, 2, 1};
    head = createLinkedList(arr);
    assert palindromCase.isPalindrome(head);
    System.out.println("isPalindrome passed.");
  }
}
