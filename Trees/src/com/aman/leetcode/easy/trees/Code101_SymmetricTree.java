package com.aman.leetcode.easy.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Code101_SymmetricTree {

	public boolean isSymmetric(TreeNode root) {

		boolean result = isMirror(root, root);
		return result;
	}

	public boolean isMirror(TreeNode root1, TreeNode root2) {

		Queue<TreeNode> queue1 = new LinkedList();
		Queue<TreeNode> queue2 = new LinkedList();

		while (((!queue1.isEmpty()) || root1 != null) && ((!queue2.isEmpty()) || root2 != null)) {

			while (root1 != null) {
				queue1.add(root1);
				root1 = root1.left;
			}

			while (root2 != null) {
				queue2.add(root2);
				root2 = root2.right;
			}

			int size1 = queue1.size();
			int size2 = queue2.size();
			
			root1 = queue1.poll();
			root2 = queue2.poll();

			System.out.println("Checking: " + root1.val + " " + root2.val);
			if ((root1.val != root2.val) || size1!=size2) {
				return false;
			}

			root1 = root1.right;
			root2 = root2.left;

		}

		return true;

	}

	/*
	 * public boolean isMirror(TreeNode root1, TreeNode root2) {
	 * 
	 * if (root1 == null && root2 == null) { return true; }
	 * 
	 * if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
	 * return false; }
	 * 
	 * boolean result = ((root1.val == root2.val) && isMirror(root1.left,
	 * root2.right) && isMirror(root1.right, root2.left));
	 * 
	 * return result;
	 * 
	 * }
	 */
	public static void main(String args[]) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		/*
		 * root.right = new TreeNode(2);
		 * 
		 * root.left.left = new TreeNode(3); root.left.right = new TreeNode(4);
		 * 
		 * root.right.left = new TreeNode(4); root.right.right = new TreeNode(3);
		 */

		boolean result = new Code101_SymmetricTree().isSymmetric(root);

		System.out.println(result);
	}
}
