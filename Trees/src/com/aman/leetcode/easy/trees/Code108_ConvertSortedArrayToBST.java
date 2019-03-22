package com.aman.leetcode.easy.trees;

public class Code108_ConvertSortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		TreeNode node = convert(arr, left, right);
		return node;
	}

	public TreeNode convert(int[] arr, int left, int right) {
		
		if(right < left) {
			return null;
		}
		
		int mid = (left+right)/2;
		
		TreeNode node = new TreeNode(arr[mid]);
		
		node.left = convert(arr, left, mid-1);
		node.right = convert(arr, mid+1, right);
		
		return node;
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

		TreeNode result = new Code108_ConvertSortedArrayToBST().sortedArrayToBST(new int[] { 1, 2, 3 });

		preorder(result);
		//System.out.println(result);
	}

	public static void preorder(TreeNode result) {
		if(result == null) {
			return;
		}
		
		System.out.print(result.val);
		preorder(result.left);
		preorder(result.right);
		
	}
}
