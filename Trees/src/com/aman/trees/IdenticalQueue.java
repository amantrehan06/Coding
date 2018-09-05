package com.aman.trees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 * https://www.geeksforgeeks.org/iterative-function-check-two-trees-identical/
 *
 */
public class IdenticalQueue {

	int value;
	IdenticalQueue left, right;

	IdenticalQueue(int item) {
		value = item;
		left = right = null;
	}

	public static void main(String[] args) {

		IdenticalQueue root1 = new IdenticalQueue(1);
		root1.left = new IdenticalQueue(2);
		root1.right = new IdenticalQueue(3);
		root1.left.left = new IdenticalQueue(4);
		root1.left.right = new IdenticalQueue(5);

		IdenticalQueue root2 = new IdenticalQueue(1);
		root2.left = new IdenticalQueue(2);
		root2.right = new IdenticalQueue(3);
		root2.left.left = new IdenticalQueue(4);
		root2.left.right = new IdenticalQueue(5);

		
		if (root1.identicalTrees(root1, root2))
			System.out.println("Both trees are identical");
		else
			System.out.println("Trees are not identical");

	}

	private boolean identicalTrees(IdenticalQueue root1, IdenticalQueue root2) {

		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 == null || root2 == null) {
			return false;
		}

		Queue<IdenticalQueue> queue1 = new LinkedBlockingQueue<IdenticalQueue>();
		Queue<IdenticalQueue> queue2 = new LinkedBlockingQueue<IdenticalQueue>();

		queue1.add(root1);
		queue2.add(root2);

		while (queue1.size() != 0 || queue2.size() != 0) {

			IdenticalQueue data1 = queue1.poll();
			IdenticalQueue data2 = queue2.poll();

			if (data1.value != data2.value) {
				return false;
			}

			if (data1.left != null && data2.left != null) {
				queue1.add(data1.left);
				queue2.add(data2.left);
			} else if ((data1.left == null && data2.left != null) || 
					(data1.left != null && data2.left == null)) {
				System.out.println("Either one of the left node is blank");
				return false;
			}

			if (data1.right != null && data2.right != null) {
				queue1.add(data1.right);
				queue2.add(data2.right);
			} else if ((data1.right == null && data2.right != null) || 
					(data1.right != null && data2.right == null)) {
				System.out.println("Either one of the right node is blank");
				return false;
			}
		}

		return true;
	}
}
