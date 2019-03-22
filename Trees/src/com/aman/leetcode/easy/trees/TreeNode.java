package com.aman.leetcode.easy.trees;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
	}

}