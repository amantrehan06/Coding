package com.aman.leetcode.medium.trees;

import java.util.HashMap;

import com.aman.leetcode.easy.trees.TreeNode;

public class Code105_TreeFromInorderPreorder {

	public int start = 0;

	public TreeNode buildTree(int[] inorder, int[] postOrder) {

		if (postOrder.length == 0) {
			return null;

		}

		start = postOrder.length - 1;

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}

		return construct(postOrder, 0, inorder.length - 1, map);
	}

	public TreeNode construct(int[] postOrder, int inStart, int inEnd, HashMap<Integer, Integer> map) {

		if (inStart > inEnd || start == -1) {
			return null;
		}

		TreeNode node = new TreeNode(postOrder[start]);
		int indexInOrder = map.get(postOrder[start]);

		--start;

		node.right = construct(postOrder, indexInOrder + 1, inEnd, map);
		node.left = construct(postOrder, inStart, indexInOrder - 1, map);

		return node;
	}

	public static void main(String args[]) {

		/*
		 * TreeNode root = new TreeNode(3); root.left = new TreeNode(9);
		 * 
		 * root.right = new TreeNode(20);
		 * 
		 * root.left.left = new TreeNode(99); root.left.right = new TreeNode(199);
		 * 
		 * root.right.left = new TreeNode(15); root.right.right = new TreeNode(7);
		 */

		int[] in = new int[] { 9, 3, 15, 20, 7 };
		int[] post = new int[] { 9, 15, 7, 20, 3 };

		TreeNode result = new Code105_TreeFromInorderPreorder().buildTree(post, in);

		System.out.println(result);
	}
}
