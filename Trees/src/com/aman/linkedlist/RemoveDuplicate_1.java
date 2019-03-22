package com.aman.linkedlist;

public class RemoveDuplicate_1 {

	public static void main(String[] args) {
		LinkedListNode node = GlobalLinkedList.createDuplicateElementLinkedList();

		new RemoveDuplicate_1().remove(node);

	}

	private void remove(LinkedListNode root) {

		LinkedListNode current = root;
		while (current != null) {
			LinkedListNode runner = current;
			while (runner != null && runner.getNext() != null) {
				if (current.getName().equals(runner.getNext().getName())) {
					System.out.println("Removing " + runner.getNext());
					runner.setNext(runner.getNext().getNext());
				}
				runner = runner.getNext();
			}
			current = current.getNext();
		}
		System.out.println(root);
	}
}
