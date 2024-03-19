package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    binarySTNode root;

    public AVLTree() {
        root = null;
    }

    public AVLTree(binarySTNode root) {
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
            System.out.print("-" + node.value + "-");
            if (node.left != null) {
                que.add(node.left);
            }
            if (node.right != null) {
                que.add(node.right);
            }
        }
        System.out.println();
    }

    public void search(int value) {
        try {
            binarySTNode head = root;
            while (head != null) {
                if (head.value == value) {
                    System.out.println(value + " found at height : " + head.height);
                }
                if (head.value > value) {
                    head = head.left;
                } else {
                    head = head.right;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Value not found");
        }
    }

    public int getHeight(binarySTNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;

    }

    private binarySTNode rotateLeft(binarySTNode disbalanced_Node) {
        binarySTNode new_Node = disbalanced_Node.right;
        disbalanced_Node.right = disbalanced_Node.right.left;
        new_Node.left = disbalanced_Node;
        disbalanced_Node.height = 1 + Math.max(getHeight(disbalanced_Node.left), getHeight(disbalanced_Node.right));
        new_Node.height = 1 + Math.max(getHeight(new_Node.left), getHeight(new_Node.right));
        return new_Node;
    }

    private binarySTNode rotateRight(binarySTNode disbalanced_Node) {
        binarySTNode new_Node = disbalanced_Node.left;
        disbalanced_Node.left = disbalanced_Node.left.right;
        new_Node.right = disbalanced_Node;
        disbalanced_Node.height = 1 + Math.max(getHeight(disbalanced_Node.left), getHeight(disbalanced_Node.right));
        new_Node.height = 1 + Math.max(getHeight(new_Node.left), getHeight(new_Node.right));
        return new_Node;
    }

    public int getBalance(binarySTNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    public binarySTNode insertNode(binarySTNode node, int value) {
        try {
            if (node == null) {
                binarySTNode new_Node = new binarySTNode();
                new_Node.value = value;
                new_Node.height = 1;
                return new_Node;
            } else if (value < node.value) {
                node.left = insertNode(node.left, value);
            } else {
                node.right = insertNode(node.right, value);
            }
            node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
            int balance = getBalance(node);
            if (balance > 1 && value < node.left.value) {
                return rotateRight(node);
            }
            if (balance > 1 && value > node.left.value) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
            if (balance < -1 && value > node.right.value) {
                return rotateLeft(node);
            }
            if (balance < -1 && value < node.right.value) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }
            return node;
        } catch (Exception e) {
            System.out.println("Value insertion failed");
            return null;
        }
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    public binarySTNode minimumNode(binarySTNode node) {
        if (node.left == null) {
            return node;
        } else {
            return minimumNode(node.left);
        }
    }

    public binarySTNode deleteNode(binarySTNode node, int value) {
        try {
            if (node == null) {
                System.out.println("Value not found in AVL");
                return node;
            }
            if (node.value > value) {
                node.left = deleteNode(node.left, value);
            } else if (node.value < value) {
                node.right = deleteNode(node.right, value);
            } else {
                if (node.left != null && node.right != null) {
                    binarySTNode temp = node;
                    binarySTNode minNodeForRight = minimumNode(temp.right);
                    node.value = minNodeForRight.value;
                    node.right = deleteNode(node.right, minNodeForRight.value);
                } else if (node.left != null) {
                    node = node.left;
                } else if (node.right != null) {
                    node = node.right;
                } else {
                    node = null;
                }
            }
            int balance = getBalance(node);
            if (balance > 1 && value < node.left.value) {
                return rotateRight(node);
            }
            if (balance > 1 && value > node.left.value) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
            if (balance < -1 && value > node.right.value) {
                return rotateLeft(node);
            }
            if (balance < -1 && value < node.right.value) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }
            return node;
        } catch (Exception e) {
            System.out.println("Invalid node value"+ e);
            return null;
        }
    }

    public void remove(int value) {
        root = deleteNode(root, value);
    }

    public void delete() {
        root = null;
        System.out.println("Tree deleted");
    }
}
