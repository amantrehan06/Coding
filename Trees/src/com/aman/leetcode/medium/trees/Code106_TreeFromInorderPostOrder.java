package com.aman.leetcode.medium.trees;

import java.util.HashMap;

import com.aman.leetcode.easy.trees.TreeNode;

public class Code106_TreeFromInorderPostOrder {

	public int preStart = 0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {

		if (preorder.length == 0) {
			return null;

		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}

		return construct(preorder, 0, inorder.length - 1, map);
	}

	public TreeNode construct(int[] preorder, int inStart, int inEnd, HashMap<Integer, Integer> map) {

		if (inStart > inEnd || preStart == preorder.length + 1) {
			return null;
		}

		TreeNode node = new TreeNode(preorder[preStart]);
		int indexInOrder = map.get(preorder[preStart]);

		++preStart;

		node.left = construct(preorder, inStart, indexInOrder - 1, map);
		node.right = construct(preorder, indexInOrder + 1, inEnd, map);

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

		int[] pre = new int[] { -1 };
		int[] in = new int[] { -1 };

		TreeNode result = new Code106_TreeFromInorderPostOrder().buildTree(pre, in);

		System.out.println(result);
	}
}
