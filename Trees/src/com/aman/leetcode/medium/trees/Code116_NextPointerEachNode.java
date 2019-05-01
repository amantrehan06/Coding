package com.aman.leetcode.medium.trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node(int _val) {
		val = _val;

	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + ", left=" + left + ", right=" + right + ", next=" + next + "]";
	}

}

public class Code116_NextPointerEachNode {

	public Node connect(Node root) {

		if (root == null) {
			return root;
		}

		Queue<Node> queue1 = new LinkedList<>();
		Queue<Node> queue2 = new LinkedList<>();

		queue1.add(root);

		while (!queue1.isEmpty() || !queue2.isEmpty()) {

			Node nextNode = null;
			while (!queue1.isEmpty()) {
				Node temp = queue1.poll();

				if (temp.right != null) {
					queue2.add(temp.right);
				}

				if (temp.left != null) {
					queue2.add(temp.left);
				}

				temp.next = nextNode;
				nextNode = temp;
			}

			nextNode = null;
			while (!queue2.isEmpty()) {
				Node temp = queue2.poll();

				if (temp.right != null) {
					queue1.add(temp.right);
				}

				if (temp.left != null) {
					queue1.add(temp.left);
				}

				temp.next = nextNode;
				nextNode = temp;
			}

		}

		return root;
	}

	public static void main(String args[]) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		Node result = new Code116_NextPointerEachNode().connect(root);

		System.out.println(result);
	}
}
