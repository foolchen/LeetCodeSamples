package com.foolchen.leetcode.samples.linkedlist;

import com.foolchen.leetcode.samples.data.TreeNode;
import java.util.Stack;

/**
 * @author chenchong. Created on 2018/5/28.
 */
public class SymmetricCase {
  // 此处可以分解为以当前节点为根的两个子树是否相等
  // 如此递归调用
    /*public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isEqual(root.left,root.right);
    }

    private boolean isEqual(TreeNode left , TreeNode right){
      if(left != null && right != null) {
        if(left.val != right.val) return false;
      } else if( left == null && right == null ){
        return true;
      } else {
        return false;
      }

      return isEqual(left.left,right.right) && isEqual(left.right,right.left);
    }*/

  // 以下为迭代实现
  // 在对称二叉树中，对于任意一个子树：
  // 其根节点对应的左右子树互相对称（左右子树的左右孩子都是对称的）
  // 例如： 3 4 4 3 或者 1 2 2 1 1 2 2 1
  // 根据这种特征，可以使用栈，将左右孩子节点按照对称的顺序添加到栈中
  // 然后按照顺序取出两个节点进行比较，如果都相等，则表示对称
  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root.left);
    stack.push(root.right);
    while (!stack.isEmpty()) {
      TreeNode right = stack.pop();
      TreeNode left = stack.pop();
      if (left != null && right != null) {
        if (left.val == right.val) {
          // 按照对称的顺序将孩子添加到栈中，继续下次迭代
          stack.push(left.left);
          stack.push(right.right);
          stack.push(left.right);
          stack.push(right.left);
        } else {
          return false;
        }
      } else if (left != null || right != null) {
        return false;
      }
    }

    // 如果迭代过程中没有中断，执行到此处，则证明是对称二叉树
    return true;
  }
}
