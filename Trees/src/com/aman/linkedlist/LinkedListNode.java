package com.aman.linkedlist;

public class LinkedListNode {

	private int id;
	private String name;
	private LinkedListNode next;

	public LinkedListNode(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public LinkedListNode getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "LinkedListNode [id=" + id + ", name=" + name + ", next=" + next + "]";
	}

}
