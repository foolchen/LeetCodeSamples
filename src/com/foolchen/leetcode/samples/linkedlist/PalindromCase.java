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

import java.util.Stack;

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
  4. 存在重复节点，此时无法对链表进行分割。

  思路3：
  将链表中的所有节点放入栈中，利用栈的先进后出的特性来变相实现链表的逆序，并与链表的正序节点进行一一比较
  */

  public boolean isPalindrome(ListNode head) {
    if (head == null) return false;
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
    return true;
  }
}
