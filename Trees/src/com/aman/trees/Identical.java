package com.aman.trees;

/**
 * 
 * https://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
 *
 */
public class Identical {

	int value;
	Identical left, right;

	Identical(int item) {
		value = item;
		left = right = null;
	}

	public static void main(String[] args) {

		Identical root1 = new Identical(1);
		root1.left = new Identical(2);
		root1.right = new Identical(3);
		root1.left.left = new Identical(4);
		root1.left.right = new Identical(5);

		Identical root2 = new Identical(1);
		root2.left = new Identical(2);
		root2.right = new Identical(3);
		root2.left.left = new Identical(4);
		root2.left.right = new Identical(5);

		
		if (root1.identicalTrees(root1, root2))
			System.out.println("Both trees are identical");
		else
			System.out.println("Trees are not identical");

	}

	private boolean identicalTrees(Identical root1, Identical root2) {
		
		if(root1 == null && root2 == null) 
			return true;
		
		if(root1 == null || root2 ==null) {
			return false;
		}
		
		boolean leftTree = identicalTrees(root1.left, root2.left);
		boolean rightTree = identicalTrees(root1.right, root2.right);

		if(root1.value == root2.value && leftTree && rightTree) {
			return true;
		} else {
			return false;
		}
	}
}
