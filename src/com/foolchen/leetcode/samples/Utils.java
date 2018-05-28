package com.foolchen.leetcode.samples;

import com.foolchen.leetcode.samples.data.ListNode;
import com.foolchen.leetcode.samples.data.TreeNode;

/**
 * @author chenchong. Created on 2018/5/28.
 */
public class Utils {

  /**
   * 根据数组创建链表
   *
   * @return 链表的头结点
   */
  public static ListNode createLinkedList(int[] arr) {
    if (arr == null || arr.length == 0) return null;
    int length = arr.length;
    ListNode head = new ListNode(arr[0]);
    ListNode current = head;
    for (int i = 1; i < length; i++) {
      current.next = new ListNode(arr[i]);
      current = current.next;
    }
    return head;
  }

  public static TreeNode createTree(int[] arr) {
    int length = arr.length;
    TreeNode[] nodes = new TreeNode[length];
    for (int i = 0; i < length; i++) {
      TreeNode node = new TreeNode(arr[i]);
      nodes[i] = node;
      if (i > 0) {
        TreeNode parent = nodes[(i - 1) / 2];
        if ((i - 2) % 2 == 0) {
          parent.left = node;
        } else {
          parent.right = node;
        }
      }
    }
    return nodes[0];
  }

  public static String linkedListToString(ListNode node) {
    if (node == null) return "[]";
    StringBuilder builder = new StringBuilder("[");
    while (node.next != null) {
      builder.append(node.val).append(" , ");
      node = node.next;
    }
    builder.append(node.val);
    builder.append("]");
    return builder.toString();
  }

  /**
   * 查找链表中的中间节点
   */
  public static ListNode findMidNode(ListNode head) {
    if (head == null) return null;
    if (head.next == null) return head;

    ListNode p = head, q = head;
    while (q != null && q.next != null) {
      p = p.next;
      q = q.next.next;
    }

    return p;
  }
}
