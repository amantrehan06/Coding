package com.aman.leetcode.easy.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code102_LevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();

		if (root == null) {
			return list;
		}

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			Queue<TreeNode> tempQueue = new LinkedList<>();

			List<Integer> subList = new ArrayList<>();

			while (!queue.isEmpty()) {
				TreeNode temp1 = queue.poll();
				subList.add(temp1.val);

				if (temp1.left != null) {
					tempQueue.add(temp1.left);
				}
				
				if (temp1.right != null) {
					tempQueue.add(temp1.right);
				}
			}

			queue.addAll(tempQueue);
			list.add(subList);
		}

		return list;

	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);

		/*
		 * root.left.left = new TreeNode(3); root.left.right = new TreeNode(4);
		 */
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		List<List<Integer>> result = new Code102_LevelOrderTraversal().levelOrder(root);

		System.out.println(result);
	}
}
