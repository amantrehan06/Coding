package com.aman.trees;

import java.util.Stack;

/**
 * 
 * https://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
 */
public class SpiralTraversal {

	int value;
	SpiralTraversal left, right;

	SpiralTraversal(int item) {
		value = item;
		left = right = null;
	}

	public static void main(String[] args) {

		SpiralTraversal root1 = new SpiralTraversal(1);
		root1.left = new SpiralTraversal(2);
		root1.right = new SpiralTraversal(3);
		root1.left.left = new SpiralTraversal(7);
		root1.left.right = new SpiralTraversal(6);

		root1.right.left = new SpiralTraversal(5);
		root1.right.right = new SpiralTraversal(4);
		
		System.out.println("Spiral traversal of tree is: ");
		root1.spiralTraversal(root1);
	}

	private void spiralTraversal(SpiralTraversal root) {
		
		if(root == null) {
			System.out.println("Error, Node is empty");
		}
		
		Stack<SpiralTraversal> stack1 = new Stack<>();
		Stack<SpiralTraversal> stack2 = new Stack<>();
		
		stack1.add(root);
		
		while (stack1.size() != 0 || stack2.size() != 0) {

			while(stack1.size()!=0) {
				SpiralTraversal node = stack1.pop();
				System.out.println(" "+node.value);
				
				if(node.left !=null) {
					stack2.add(node.left);
				}
				
				if(node.right!=null) {
					stack2.add(node.right);
				}
			}
			
			while(stack2.size()!=0) {
				SpiralTraversal node = stack2.pop();
				System.out.println(" "+node.value);
				
				if(node.right!=null) {
					stack1.add(node.right);
				}
				
				if(node.left !=null) {
					stack1.add(node.left);
				}
				
				
			}
		}	
	}
}
