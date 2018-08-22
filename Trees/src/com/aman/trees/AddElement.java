package com.aman.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Add element to the binary tree
 * https://www.geeksforgeeks.org/insertion-binary-tree/
 */
public class AddElement {

    int value;
    AddElement left;
    AddElement right;

    AddElement(int value){
        this.value = value;
    }

    public void traversal(AddElement root){
        AddElement temp = root;
        if(temp == null){
            return;
        }

        traversal(temp.left);
        System.out.print(" "+temp.value);
        traversal(temp.right);
    }

    public void insert(AddElement root, int value){

        AddElement temp = root;

        if(temp == null ){
            System.out.println("Cannot insert element since tree is empty");
            return;
        }
        Queue<AddElement> queue = new LinkedBlockingQueue<AddElement>();

        queue.add(temp);

        while( !queue.isEmpty() ){

            temp = queue.poll();

            if(temp.left == null ){
                temp.left = new AddElement(value);
                break;
            }else if (temp.right == null){
                temp.right = new AddElement(value);
                break;
            }

            queue.add(temp.left);
            queue.add(temp.right);


        }




    }


    public static void main(String args[]){

        AddElement root = new AddElement(10);

        root.left = new AddElement(11);
        root.right = new AddElement(9);
        root.left.left = new AddElement(7);
        root.right.left = new AddElement(15);
        root.right.right = new AddElement(8);


        System.out.println(" Tree before insertion");
        root.traversal(root);

        root.insert(root,12);

        System.out.println();
        System.out.println(" Tree after insertion");
        root.traversal(root);



    }

}
