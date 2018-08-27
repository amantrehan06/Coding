
package com.aman.trees;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
 */
public class ITraversalWithoutRecurssion {

    int value;
    ITraversalWithoutRecurssion left;
    ITraversalWithoutRecurssion right;

    ITraversalWithoutRecurssion(int value){
        this.value = value;
    }

    public void traversal(ITraversalWithoutRecurssion root){
        ITraversalWithoutRecurssion temp = root;
        if(temp == null){
            return;
        }

        Stack<ITraversalWithoutRecurssion> stack = new Stack();

        while(root != null || stack.size() > 0) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println(" "+root.value);
            root = root.right;
        }
    }


    public static void main(String args[]){

        ITraversalWithoutRecurssion root = new ITraversalWithoutRecurssion(1);

        root.left = new ITraversalWithoutRecurssion(2);
        root.right = new ITraversalWithoutRecurssion(3);
        root.left.left = new ITraversalWithoutRecurssion(4);
        root.left.right = new ITraversalWithoutRecurssion(5);

        System.out.println(" inorder traversal without recurrsion is : ");
        root.traversal(root);
    }

}
