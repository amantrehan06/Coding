package com.aman.trees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Level order traversal of a tree is breadth first traversal for the tree.
 * https://www.geeksforgeeks.org/level-order-tree-traversal/
 */
public class BFSTraversal {

    int value;
    BFSTraversal left;
    BFSTraversal right;

    BFSTraversal(int value) {
        this.value = value;
    }

    public void traversal(BFSTraversal root){

        Queue<BFSTraversal> queue = new LinkedBlockingQueue<>();

        queue.add(root);

        while(! queue.isEmpty()){
            root = queue.poll();
            System.out.print(" "+root.value);

            if(root.left != null){
                queue.add(root.left);
            }

            if(root.right !=null){
                queue.add(root.right);
            }
        }
    }

    public static void main(String args[]){
        BFSTraversal root = new BFSTraversal(13);

        root.left = new BFSTraversal(12);
        root.left.left = new BFSTraversal(4);
        root.left.right = new BFSTraversal(19);

        root.right = new BFSTraversal(10);
        root.right.left = new BFSTraversal(16);
        root.right.right = new BFSTraversal(9);

        System.out.println(" BFS traversal ");
        root.traversal(root);
    }
}