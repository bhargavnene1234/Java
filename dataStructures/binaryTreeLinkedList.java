package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeLinkedList {
    binaryTNode root;

    public binaryTreeLinkedList(binaryTNode root) {
        this.root = root;
    }

    public void preOrderTraversal(binaryTNode node) {
        if (node == null) {
            return;
        }
        System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(binaryTNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(binaryTNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
    }

    public void levelOrderTraversal() {
        Queue<binaryTNode> que = new LinkedList<binaryTNode>();
        que.add(root);
        while (!que.isEmpty()) {
            binaryTNode node = que.remove();
            System.out.println(" ".repeat(node.height * 5) + "-" + node.value + "-");
            if (node.left != null) {
                que.add(node.left);
            }
            if (node.right != null) {
                que.add(node.right);
            }
        }
    }

    public void search(String value) {
        try {
            Queue<binaryTNode> que = new LinkedList<binaryTNode>();
            que.add(root);
            while (!que.isEmpty()) {
                binaryTNode node = que.remove();
                if (node.value == value) {
                    System.out.println("Value found at height: " + node.height);
                    return;
                }
                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                    que.add(node.right);
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Value not found");
        }
    }

    public void insert(String value) {
        try {
            Queue<binaryTNode> que = new LinkedList<binaryTNode>();
            que.add(root);
            int level = 0;
            if (root == null) {
                root = new binaryTNode(value, level);
                System.out.println("Value inserted at the start");
                return;
            }
            while (!que.isEmpty()) {
                binaryTNode node = que.remove();
                if (node.height > level) {
                    level = node.height;
                }
                if (node.left == null) {
                    node.left = new binaryTNode(value, level + 1);
                    System.out.println("Value inserted succesfully");
                    return;
                } else if (node.right == null) {
                    node.right = new binaryTNode(value, level + 1);
                    System.out.println("Value inserted succesfully");
                    return;
                } else {
                    que.add(node.left);
                    que.add(node.right);
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Value insertion failed");
        }
    }

    public binaryTNode getDeepestTNode() {
        Queue<binaryTNode> que = new LinkedList<binaryTNode>();
        que.add(root);
        binaryTNode node = null;
        while (!que.isEmpty()) {
            node = que.remove();
            if (node.left != null) {
                que.add(node.left);
            }
            if (node.right != null) {
                que.add(node.right);
            }
        }
        return node;
    }

    public void deleteDeepestTNode() {
        Queue<binaryTNode> que = new LinkedList<binaryTNode>();
        que.add(root);
        binaryTNode tail, head = null;
        while (!que.isEmpty()) {
            tail = head;
            head = que.remove();
            if (head.left == null) {
                tail.right = null;
                return;
            } else if (head.right == null) {
                head.left = null;
                return;
            }
            que.add(head.left);
            que.add(head.right);
        }
    }

    public void deleteNode(String value) {
        try {
            Queue<binaryTNode> que = new LinkedList<binaryTNode>();
            que.add(root);
            while (!que.isEmpty()) {
                binaryTNode node = que.remove();
                if (node.value == value) {
                    node.value = getDeepestTNode().value;
                    deleteDeepestTNode();
                    System.out.println(value + " node deleted.");
                    return;
                } else {
                    if (node.left != null) {
                        que.add(node.left);
                    }
                    if (node.right != null) {
                        que.add(node.right);
                    }
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Invalid node value");
        }
    }

    public void delete(){
        root=null;
        System.out.println("Tree deleted");
    }
}
