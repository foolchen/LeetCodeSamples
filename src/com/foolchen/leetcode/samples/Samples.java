package com.foolchen.leetcode.samples;

import com.foolchen.leetcode.samples.data.ListNode;
import com.foolchen.leetcode.samples.data.TreeNode;
import com.foolchen.leetcode.samples.linkedlist.PalindromCase;
import com.foolchen.leetcode.samples.linkedlist.SymmetricCase;

import static com.foolchen.leetcode.samples.Utils.createLinkedList;
import static com.foolchen.leetcode.samples.Utils.createTree;

/**
 * @author chenchong. Created on 2018/5/28.
 */
public class Samples {
  public static void main(String[] args) {
    //isPalindrome();
    isSymmetric();
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

  private static void isSymmetric() {
    int[] arr = {1, 2, 2, 3, 4, 4, 3};
    TreeNode root = createTree(arr);
    SymmetricCase symmetricCase = new SymmetricCase();
    boolean result = symmetricCase.isSymmetric(root);
    assert result;
  }
}
