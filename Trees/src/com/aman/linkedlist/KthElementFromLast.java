package com.aman.linkedlist;

public class KthElementFromLast {

	int counter = 0;

	public static void main(String args[]) {
		LinkedListNode iterativeList = GlobalLinkedList.createUniqueLinkedList();
		LinkedListNode recursiveList = GlobalLinkedList.createUniqueLinkedList();

		KthElementFromLast obj = new KthElementFromLast();
		obj.iterative(iterativeList, 1);
		obj.recursive(iterativeList, 1);

	}

	private int recursive(LinkedListNode iterativeList, int k) {
		if (iterativeList == null) {
			return 0;
		}

		counter = ++counter;
		// System.out.println("Counter before "+counter);

		System.out.println("before " + iterativeList.getId() + " " + iterativeList.getName());
		int index = recursive(iterativeList.getNext(), k) + 1;
		// System.out.println("Index after "+ index);
		// System.out.println("Counter after "+ counter);
		System.out.println("after " + iterativeList.getId() + " " + iterativeList.getName());

		if (index - 1 == k) {
			System.out.println(iterativeList.getId() + " " + iterativeList.getName());
		}

		return index;
	}

	private void iterative(LinkedListNode iterativeList, int k) {
		LinkedListNode next = iterativeList;

		int counter = 0;

		while (counter != k) {
			++counter;
			next = next.getNext();
		}

		while (next.getNext() != null) {
			next = next.getNext();
			iterativeList = iterativeList.getNext();
		}

		System.out.println("Iterative: " + iterativeList.getId() + " " + iterativeList.getName());

	}
}
