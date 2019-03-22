package com.aman.ramanDoubt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Graph<V> {
	Map<V, List<Node<V>>> adjList;
	
	public Graph()
	{
		this.adjList = new HashMap<>();
	}
	
	void addEdge(V src, Node node, int weight)  //Can be used inside package
	{	
		//Node node = new Node(dest, weight);
		List<Node<V>> adjacentVertices = adjList.get(src);
		
		if(adjacentVertices == null || adjacentVertices.isEmpty())
		{
			adjacentVertices = new ArrayList<Node<V>>();
			adjacentVertices.add(node);
		}
		else
		{
			adjacentVertices.add(node);
		}
		
		adjList.put(src, adjacentVertices);
	}
	
/*
 * Outer classes cannot be static, but nested/inner classes can be. That basically helps you to use the nested/inner class 
 * without creating an instance of the outer class. We needed to call constructor of Node without using object of Graph (outer class)
 * in method method
 */
   static class Node<V>{
	
	private V name;
	private int weight;
	
	public Node(V name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public V getName()
	{
		return this.name;
	}
}

public static void main(String[] args) {
	
	Graph<Integer> graph = new Graph<Integer>();
	
	Scanner in = new Scanner(System.in); //for user input
	System.out.println("Enter number of edges you want in the Graph:");
	
	int edges = in.nextInt();
	
	int u, v, weight;
	
	for(int e=1; e<=edges; e++)
	{
		System.out.println("Enter edge: u-v pair and weight of edge:");
		u = in.nextInt();
		v = in.nextInt();
		weight = in.nextInt();

		graph.addEdge(u, new Node(v, weight), weight);
	}
	

  } //main method

} //outer class