package com.aman.leetcode.easy.trees;

import java.util.Stack;

public class Code98_ValidBinarySearchTree {

	public boolean isValidBST(TreeNode root) {

		if (root == null) {
			return true;
		}

		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;

		while (!stack.isEmpty() || root != null) {

			while (root != null) {
				stack.push(root);
				root = root.left;
			}

			root = stack.pop();
			System.out.println(root.val);
			if (pre!=null && root.val <= pre.val) {
				return false;
			} else {
				pre = root;
			}

			root = root.right;

		}

		return true;

	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(20);

		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(25);

		boolean result = new Code98_ValidBinarySearchTree().isValidBST(root);

		System.out.println(result);
	}
}
