package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class binarySearchTree {
    binarySTNode root;

    public binarySearchTree(binarySTNode root) {
        this.root = root;
    }

    public void preOrderTraversal(binarySTNode node) {
        if (node == null) {
            return;
        }
        System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(binarySTNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(binarySTNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
    }

    public void levelOrderTraversal() {
        Queue<binarySTNode> que = new LinkedList<binarySTNode>();
        que.add(root);
        while (!que.isEmpty()) {
            binarySTNode node = que.remove();
            System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
            if (node.left != null) {
                que.add(node.left);
            }
            if (node.right != null) {
                que.add(node.right);
            }
        }
    }

    public void search(int value) {
        try {
            binarySTNode head=root;
            while(head!=null){
                if(head.value==value){
                    System.out.println(value+" found at height : "+head.height);
                }
                if(head.value>value){
                    head=head.left;
                }
                else{
                    head=head.right;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Value not found");
        }
    }

    public void insert(int value) {
        try {
            if(root==null){
                root=new binarySTNode(value,0);
                return;
            }
            binarySTNode head=root;
            int level=0;
            while(head!=null){
                if(head.value>value){
                    if(head.left!=null){
                        head=head.left;
                        level++;
                    }
                    else{
                        head.left=new binarySTNode(value,level+1);
                        return;
                    }
                }
                else{
                    if(head.right!=null){
                        head=head.right;
                        level++;
                    }
                    else{
                        head.right=new binarySTNode(value,level+1);
                        return;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Value insertion failed");
        }
    }

    public binarySTNode minimumNode(binarySTNode node) {
        if(node.left==null){
            return node;
        }
        else{
            return minimumNode(node.left);
        }
    }

    public binarySTNode deleteNode(binarySTNode node,int value) {
        try {
            if(node==null){
                return null;
            }
            if(node.value>value){
                node.left=deleteNode(node.left, value);
            }
            else if(node.value<value){
                node.right=deleteNode(node.right,value);
            }
            else{
                if(node.left!=null && node.right!=null){
                    binarySTNode temp=node;
                    binarySTNode minNodeForRight=minimumNode(temp.right);
                    node.value=minNodeForRight.value;
                    node.right=deleteNode(node.right, minNodeForRight.value);
                }
                else if(node.left!=null){
                    node=node.left;
                }
                else if(node.right!=null){
                    node=node.right;
                }
                else {
                    node=null;
                }
            }
            return node;
        } catch (Exception e) {
            System.out.println("Invalid node value");
            return null;
        }
    }

    public void delete(){
        root=null;
        System.out.println("Tree deleted");
    }
}
