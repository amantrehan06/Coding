package com.aman.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Given a binary tree, delete a node from it by making sure that tree shrinks from the bottom
 * (the deleted not is replaced by bottommost and rightmost node).
 * https://www.geeksforgeeks.org/deletion-binary-tree/
 */
public class DeleteElement {

    int value;
    DeleteElement left;
    DeleteElement right;

    DeleteElement(int value) {
        this.value = value;
    }

    public void traversal(DeleteElement root){
        DeleteElement temp = root;
        if(temp == null){
            return;
        }

        traversal(temp.left);
        System.out.print(" "+temp.value);
        traversal(temp.right);
    }

    public void delete(DeleteElement root, int value){

        DeleteElement delete = null;
        DeleteElement replace = root;
        DeleteElement temp = root;

        if (replace == null){
            System.out.println("No element present, exit");
            return;
        }

        Queue<DeleteElement> queue = new LinkedBlockingQueue<>();
        queue.add(replace);

        while(! queue.isEmpty()){
            replace = queue.poll();
            //System.out.println("Values polled is : "+replace.value );
            if(replace.value == value){
                System.out.println("Value to delete node is : "+replace.value);
                delete = replace;
            }

            if(replace.left !=null ){
                queue.add(replace.left);
            }

            if(replace.right !=null ){
                queue.add(replace.right);
            }
        }
        System.out.println("Value to delete : "+delete.value);
        System.out.println("Value to replace : "+replace.value);

        delete.value = replace.value;

        temp = root;
        queue.add(temp);

        while(! queue.isEmpty()){
            temp = queue.poll();
            //System.out.println("Values polled is : "+replace.value );

            if(temp.left == replace ){
                temp.left = null;
            }else if (temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right == replace ){
                temp.right = null;
            }else if (temp.right != null){
                queue.add(temp.right);
            }
        }
    }

    public static void main(String args[]){
        DeleteElement root = new DeleteElement(13);

        root.left = new DeleteElement(12);
        root.left.left = new DeleteElement(4);
        root.left.right = new DeleteElement(19);

        root.right = new DeleteElement(10);
        root.right.left = new DeleteElement(16);
        root.right.right = new DeleteElement(9);

        System.out.println(" Tree before deletion");
        root.traversal(root);

        root.delete(root,12);

        System.out.println();
        System.out.println(" Tree after deletion 12");
        root.traversal(root);
    }
}