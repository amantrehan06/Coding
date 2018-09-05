package com.aman.trees;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 * https://www.geeksforgeeks.org/reverse-level-order-traversal/
 */
public class ReverseInorderTraversal {

	int value;
	ReverseInorderTraversal left, right;

	ReverseInorderTraversal(int item) {
		value = item;
		left = right = null;
	}

	public static void main(String[] args) {

		ReverseInorderTraversal root1 = new ReverseInorderTraversal(1);
		root1.left = new ReverseInorderTraversal(2);
		root1.left.left = new ReverseInorderTraversal(4);
		root1.left.right = new ReverseInorderTraversal(5);

		root1.right = new ReverseInorderTraversal(3);
		root1.right.left = new ReverseInorderTraversal(6);
		root1.right.right = new ReverseInorderTraversal(7);
		
		System.out.println("Reverse traversal of tree is: ");
		root1.reverseLevelOrderTraversal(root1);
	}

	private void reverseLevelOrderTraversal(ReverseInorderTraversal root) {
		
		if(root == null) {
			System.out.println("Error, Node is empty");
		}
		
		Stack<ReverseInorderTraversal> stack = new Stack<>();
		Queue<ReverseInorderTraversal> queue = new LinkedBlockingQueue<ReverseInorderTraversal>();
		
		queue.add(root);
		
		while (queue.size() > 0) {
			ReverseInorderTraversal node = queue.poll();
			
			stack.push(node);
			
			if(node.right!=null) {
				System.out.println("Pusing right node: "+node.right.value);
				queue.add(node.right);
			}
			
			if(node.left !=null) {
				System.out.println("Pusing left node: "+node.left.value);
				queue.add(node.left);
			}	
		}	
		
		while (! stack.isEmpty()) {
			System.out.println(" "+stack.pop().value);
			
		}
	}
}
