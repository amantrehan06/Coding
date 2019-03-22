package com.aman.linkedlist;

/**
 * In case of un equal list, pad the smaller list with the zeros
 * 
 * @author ihsgah
 *
 */
class IntegerNode {
	int number;
	IntegerNode next;

	public IntegerNode(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public IntegerNode getNext() {
		return next;
	}

	public void setNext(IntegerNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "IntegerNode [number=" + number + ", next=" + next + "]";
	}

}

public class SumList_5 {

	IntegerNode node;

	public static void main(String args[]) {
		IntegerNode node1 = new IntegerNode(7);
		IntegerNode node2 = new IntegerNode(1);
		IntegerNode node3 = new IntegerNode(6);

		node1.setNext(node2);
		node2.setNext(node3);

		IntegerNode node4 = new IntegerNode(5);
		IntegerNode node5 = new IntegerNode(9);
		IntegerNode node6 = new IntegerNode(2);

		node4.setNext(node5);
		node5.setNext(node6);

		System.out.println(new SumList_5().add(node1, node4, 0));
	}

	private IntegerNode add(IntegerNode first, IntegerNode second, int carryForward) {

		if (first == null || second == null) {
			return null;
		}

		int nodeValue = (first.getNumber() + second.getNumber() + carryForward) % 10;
		int remainder = (first.getNumber() + second.getNumber() + carryForward) / 10;

		IntegerNode node = new IntegerNode(nodeValue);

		IntegerNode next = add(first.getNext(), second.getNext(), remainder);
		node.setNext(next);

		return node;
	}
}
