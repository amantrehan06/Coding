package com.aman.trees;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 * http://www.techiedelight.com/print-nodes-binary-tree-specific-order/
 */
public class SpecificOrderTraversal {

	int value;
	SpecificOrderTraversal left, right;

	SpecificOrderTraversal(int item) {
		value = item;
		left = right = null;
	}

	public static void main(String[] args) {

		SpecificOrderTraversal root1 = new SpecificOrderTraversal(1);
		root1.left = new SpecificOrderTraversal(2);
		root1.left.left = new SpecificOrderTraversal(4);
		
		root1.left.left.left = new SpecificOrderTraversal(8);
		root1.left.left.right = new SpecificOrderTraversal(9);
		
		root1.left.right = new SpecificOrderTraversal(5);
		root1.left.right.left = new SpecificOrderTraversal(10);
		root1.left.right.right = new SpecificOrderTraversal(11);

		root1.right = new SpecificOrderTraversal(3);
		
		root1.right.left = new SpecificOrderTraversal(6);
		root1.right.left.left = new SpecificOrderTraversal(12);
		root1.right.left.right = new SpecificOrderTraversal(13);
		
		root1.right.right = new SpecificOrderTraversal(7);
		root1.right.right.left = new SpecificOrderTraversal(14);
		root1.right.right.right = new SpecificOrderTraversal(15);
		
		System.out.println("Specific traversal of tree is: ");
		//root1.specificOrderTraversal(root1);
		root1.specificOrderTraversal1(root1);

	}

	private void specificOrderTraversal1(SpecificOrderTraversal root) {
		
		if(root == null) {
			System.out.println("Error, Node is empty");
		}
		
		
		Queue<SpecificOrderTraversal> queue1 = new LinkedBlockingQueue<SpecificOrderTraversal>();
		Queue<SpecificOrderTraversal> queue2 = new LinkedBlockingQueue<SpecificOrderTraversal>();

		
		Stack<SpecificOrderTraversal> stack1 = new Stack<>();
		Stack<SpecificOrderTraversal> stack2 = new Stack<>();
		
		queue1.add(root);
		//queue2.add(root);

		stack1.add(root);
		
				
		while (! queue1.isEmpty() || ! queue2.isEmpty()) {
			SpecificOrderTraversal node1 = queue1.poll();
			SpecificOrderTraversal node2 = queue2.poll();
			
		

			if(node1!=null && node1.left != null) {
				System.out.print(" queueL1 "+node1.left.value);
				stack1.add(node1.left);
				queue1.add(node1.left);
			}
			
			if(node2!=null &&node2.right!=null) {
				System.out.print(" queueR2 "+node2.right.value);
				stack2.add(node2.right);
				queue2.add(node2.right);

			}
			
			if(node1!=null && node1.right!=null) {
				System.out.print(" queueR1 "+node1.right.value);
				stack2.add(node1.right);
				queue2.add(node1.right);

			}
			
			
			if(node2!=null &&node2.left != null) {
				System.out.print(" queueL2 "+node2.left.value);
				stack1.add(node2.left);
				queue1.add(node2.left);
			}
			
			
			
			
				
		}	
		
		System.out.println(" ");
		System.out.println(" Order is");
		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			
			System.out.print(" "+stack1.pop().value + " "+stack2.pop().value);
			
		}
	}


	private void specificOrderTraversal(SpecificOrderTraversal root) {
		
		if(root == null) {
			System.out.println("Error, Node is empty");
		}
		
		
		Queue<SpecificOrderTraversal> queue1 = new LinkedBlockingQueue<SpecificOrderTraversal>();
		Queue<SpecificOrderTraversal> queue2 = new LinkedBlockingQueue<SpecificOrderTraversal>();
		
		
		queue1.add(root.left);
		queue2.add(root.right);
		
		System.out.print (" "+root.value + " "+root.left.value + " "+root.right.value);
		
		while (queue1.size() > 0 || queue2.size() >0) {
			SpecificOrderTraversal node = queue1.poll();
			SpecificOrderTraversal node2 = queue2.poll();

			if(node.left != null) {
				System.out.print(" "+node.left.value);
				queue1.add(node.left);
			}
			
			if(node2.right!=null) {
				System.out.print(" "+node2.right.value);
				queue2.add(node2.right);
			}
			
			if(node.right!=null) {
				System.out.print(" "+node.right.value);
				queue2.add(node.right);
			}
			
			if(node2.left != null) {
				System.out.print(" "+node2.left.value);
				queue1.add(node2.left);
			}
			
				
		}	
		
		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			System.out.print(" "+queue1.poll() + " "+queue2.poll());
			
		}
	}
}
