package com.aman.trees;

/**
 * 
 * https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
 *
 */
public class Height {

	int value;
	Height left, right;

	Height(int item) {
		value = item;
		left = right = null;
	}

	public static void main(String[] args) {

		Height root1 = new Height(1);
		root1.left = new Height(2);
		root1.right = new Height(3);
		root1.left.left = new Height(4);
		root1.left.left.left = new Height(6);
		root1.left.right = new Height(5);
		System.out.println("height of tree is: "+ root1.height(root1));
	}

	private int height(Height root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftTree = height(root.left);
		int rightTree = height(root.right);
		if(leftTree > rightTree) {
			return leftTree + 1;
		} else {
			return rightTree + 1;
		}
	}
}
