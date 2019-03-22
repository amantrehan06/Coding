package com.aman.leetcode.easy.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code94_InOrderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();

		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<>();

		while (!stack.isEmpty() || root != null) {

			while (root != null) {
				stack.push(root);
				root = root.left;
			}

			root = stack.pop();
			list.add(root.val);
			root = root.right;

		}

		return list;

	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(20);

		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(25);

		List result = new Code94_InOrderTraversal().inorderTraversal(root);

		System.out.println(result);
	}
}
