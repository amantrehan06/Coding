package com.aman.leetcode.easy.trees;

public class Code104_MaximumDepth {

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		int result = Math.max(left, right) + 1;
		return result;
	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		int result = new Code104_MaximumDepth().maxDepth(root);

		System.out.println(result);
	}
}
