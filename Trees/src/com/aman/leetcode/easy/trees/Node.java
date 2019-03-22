package com.aman.leetcode.easy.trees;

import java.util.List;

public class Node {

	public int val;
	public List<Node> children;

	public Node(int val, List<Node> children) {
		this.val = val;
		this.children = children;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "NArrayTree [val=" + val + ", children=" + children + "]";
	}

}
