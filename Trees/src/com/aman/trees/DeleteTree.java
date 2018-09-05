package com.aman.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * http://www.techiedelight.com/delete-given-binary-tree-iterative-recursive/
 */
public class DeleteTree {

    int value;
    DeleteTree left;
    DeleteTree right;

    DeleteTree(int value) {
        this.value = value;
    }

    public void traversal(DeleteTree root){
        DeleteTree temp = root;
        if(temp == null){
            return;
        }

        traversal(temp.left);
        System.out.print(" "+temp.value);
        traversal(temp.right);
    }

    public void delete(DeleteTree root){
    	
    }

    public static void main(String args[]){
        DeleteTree root = new DeleteTree(13);

        root.left = new DeleteTree(12);
        root.left.left = new DeleteTree(4);
        root.left.right = new DeleteTree(19);

        root.right = new DeleteTree(10);
        root.right.left = new DeleteTree(16);
        root.right.right = new DeleteTree(9);

        root.delete(root);

    }
}