package com.aman.leetcode.easy.trees;

import java.util.ArrayList;
import java.util.List;

public class Code559_MaximumDepthNAryTree {

	public int maxDepth(Node root) {

		if (root == null) {
			return 0;
		}

		/*
		 * Queue<Node> queue = new LinkedList<>(); queue.add(root);
		 * 
		 * int depth = 0; while (!queue.isEmpty()) {
		 * 
		 * Queue<Node> tempQueue = new LinkedList<>(); int n = queue.size(); for (int i
		 * = 0; i < n; i++) { Node pop = queue.poll(); List<Node> list = pop.children;
		 * if (list != null) { for (Node node : list) { tempQueue.add(node); } } }
		 * 
		 * queue.addAll(tempQueue); ++depth;
		 * 
		 * }
		 * 
		 * return depth;
		 */

		if (root.getChildren() == null) {
			return 1;
		}

		int maxDepth = 0;
		for (Node tree : root.getChildren()) {
			maxDepth = Math.max(maxDepth, maxDepth(tree));
		}

		maxDepth = maxDepth + 1;
		return maxDepth;

	}

	public static void main(String args[]) {

		// NArrayTree root = new NArrayTree(1);

		Node five = new Node(5, null);
		Node six = new Node(6, null);

		List<Node> threeList = new ArrayList<>();
		threeList.add(five);
		threeList.add(six);

		Node three = new Node(3, threeList);
		Node two = new Node(2, null);
		Node four = new Node(4, null);

		List<Node> oneList = new ArrayList<>();
		oneList.add(three);
		oneList.add(two);
		oneList.add(four);

		Node root = new Node(1, oneList);

		int result = new Code559_MaximumDepthNAryTree().maxDepth(root);

		System.out.println(result);
	}
}
