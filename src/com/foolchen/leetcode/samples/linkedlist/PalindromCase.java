package com.foolchen.leetcode.samples.linkedlist;

/*
请判断一个链表是否为回文链表。

示例 1:

输入: 1->2
输出: false
示例 2:

输入: 1->2->2->1
输出: true
进阶：
你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */

import com.foolchen.leetcode.samples.data.ListNode;

/**
 * @author chenchong. Created on 2018/5/28.
 */
public class PalindromCase {

  /*
  思路1：
  将整个链表逆序，与原链表中的节点进行一一比较，如果全部节点都能够一一相等，则为回文链表。
  注意：
  该方式需要为原链表创建一个逆序的链表，所有节点都需要重新创建，空间复杂度为O(n)。

  思路2：
  如果一个链表为回文链表，则可以将链表分为两部分，并将第一部分进行逆序。
  然后对链表1、2进行遍历，查看对应位置的节点值是否相等。如果节点无法一一对应，则证明不是回文链表；否则，是回文链表。
  例外情况：
  1. 节点为空，此时true；
  2. 只有一个节点，此时true；
  3. 所有节点值相同，此时true；

  思路3：
  将链表中的所有节点放入栈中，利用栈的先进后出的特性来变相实现链表的逆序，并与链表的正序节点进行一一比较
  */

  public boolean isPalindrome(ListNode head) {
    /*if (head == null) return false;
    Stack<ListNode> stack = new Stack<>();
    ListNode node = head;
    while (node.next != null) {
      stack.push(node);
      node = node.next;
    }
    stack.push(node);

    node = head;
    while (node != null) {
      if (node.val != stack.pop().val) {
        return false;
      }
      node = node.next;
    }
    return true;*/
    if (head == null) return true;
    ListNode middle = findMidNode(head);
    // middle为中间节点，则将中间节点之后的子链表进行逆序
    ListNode q = reverse(middle.next);

    // 逆序后的子链表长度必然小于middle之前节点组成的链表长度
    // 故对两个链表进行遍历，如果为回文链表，则q必然首先为空
    ListNode p = head;
    while (p != null && q != null && p.val == q.val) {
      p = p.next;
      q = q.next;
    }
    // 如果q为空，则表示为回文链表
    return q == null;
  }

  // 使用龟兔算法来查找中间节点
  private ListNode findMidNode(ListNode head) {
    ListNode p = head, q = head;
    while (q != null && q.next != null) {
      p = head.next;
      q = q.next.next;
    }
    return p;
  }

  // 原地逆转链表
  private ListNode reverse(ListNode head) {
    ListNode pre = null;
    while (head != null) {
      ListNode t = head.next;
      head.next = pre;
      pre = head;
      head = t;
    }
    // pre为head的上一个节点，如果head为null，则pre为交换后的头结点
    return pre;
  }
}
