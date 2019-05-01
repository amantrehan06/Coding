package com.aman.leetcode.medium.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.aman.leetcode.easy.trees.TreeNode;

public class Code103_ZigZagLevelOrderTraversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> lists = new ArrayList<>();

		if (root == null) {
			return lists;
		}

		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();

		stack1.add(root);

		while (!stack1.isEmpty() || !stack2.isEmpty()) {

			List<Integer> list = new ArrayList<>();
			while (!stack1.isEmpty()) {
				TreeNode node = stack1.pop();
				list.add(node.val);
				

				if (node.left != null) {
					stack2.add(node.left);
				}
				
				if (node.right != null) {
					stack2.add(node.right);
				}
			}

			if (list.size() > 0) {
				lists.add(list);
			}

			list = new ArrayList<>();
			while (!stack2.isEmpty()) {
				TreeNode node = stack2.pop();
				list.add(node.val);
				
				if (node.right != null) {
					stack1.add(node.right);
				}
				
				if (node.left != null) {
					stack1.add(node.left);
				}
				
			}
			
			if (list.size() > 0) {
				lists.add(list);
			}

		}

		return lists;
	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);

		root.right = new TreeNode(20);

		
		root.left.left = new TreeNode(99);
		root.left.right = new TreeNode(199);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		List<List<Integer>> result = new Code103_ZigZagLevelOrderTraversal().zigzagLevelOrder(root);

		System.out.println(result);
	}
}
