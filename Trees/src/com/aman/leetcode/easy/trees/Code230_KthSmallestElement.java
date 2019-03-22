package com.aman.leetcode.easy.trees;

import java.util.Stack;

public class Code230_KthSmallestElement {

    public int kthSmallest(TreeNode root, int k) {

		if (root == null) {
			return 0;
		}

		Stack<TreeNode> stack = new Stack<>();
		int count = 0;

		while (!stack.isEmpty() || root != null) {

			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			System.out.println(root.val);
			++ count;
			if(count == k) {
				return root.val;
			}
			root = root.right;
		}
		return 0;
	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(20);

		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(25);

		int result = new Code230_KthSmallestElement().kthSmallest(root,3);

		System.out.println(result);
	}
}
