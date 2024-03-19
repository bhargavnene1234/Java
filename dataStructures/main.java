package dataStructures;

public class main {

    public static void main(String[] args) {
        
        //Single Dimensional Array

        /*
         * =
         * singleDimensionalArray array=new singleDimensionalArray(10);
         * array.insert(0, 1);
         * array.insert(1, 11);
         * array.traverse();
         * 
         * array.access(2);
         * 
         * array.insert(2, 111);
         * array.insert(9, 1111);
         * 
         * array.traverse();
         * 
         * array.insert(1, 22);
         * array.insert(10, 11111);
         * 
         * array.traverse();
         * 
         * array.access(0);
         * array.access(1);
         * array.access(2);
         * array.access(10);
         * 
         * array.traverse();
         * 
         * array.remove(2);
         * array.traverse();
         * 
         * array.search(1111);
         */

        //Two Dimensional Array

        /*
         * twoDimensionalArray array=new twoDimensionalArray(5,5);
         * 
         * array.insert(0, 1, 1);
         * array.insert(1,2, 11);
         * array.traverse();
         * 
         * array.access(2,3);
         * 
         * array.insert(2,3, 111);
         * array.insert(3,4, 1111);
         * 
         * array.traverse();
         * 
         * array.insert(1,2, 22);
         * array.insert(4,5, 11111);
         * 
         * array.traverse();
         * 
         * array.access(0,1);
         * array.access(1,2);
         * array.access(2,3);
         * array.access(4,5);
         * 
         * array.traverse();
         * 
         * array.remove(2,3);
         * array.traverse();
         * 
         * array.search(1111);
         */

        //Singly Linked List
         
        /*
         * listNode node = new listNode(10);
         * linkedList list = new linkedList(node);
         * list.insert(11);
         * list.insert(12);
         * list.insert(13);
         * list.traverse();
         * list.insert(6, 14);
         * list.insert(2, 14);
         * list.insert(1, 15);
         * list.insert(0, 16);
         * list.traverse();
         * list.insert(6, 17);
         * list.traverse();
         * list.insert(8, 18);
         * list.traverse();
         * list.insert(15);
         * list.traverse();
         * list.search(13);
         * list.access(4);
         * list.access(7);
         * list.remove(3);
         * list.traverse();
         * list.remove(0);
         * list.traverse();
         * list.remove();
         * list.traverse();
         * list.search(13);
         * list.remove(5);
         * list.traverse();
         * list.delete();
         * 
         * list.traverse();
         */

        //Circular Singly Linked List

        /*
         * listNode node=new listNode(1);
         * circularLinkedList circList=new circularLinkedList(node);
         * circList.insert(2);
         * circList.insert(3);
         * circList.insert(4);
         * circList.traverse();
         * circList.insert(2,5);
         * circList.traverse();
         * circList.insert(0,6);
         * circList.traverse();
         * circList.insert(6,7);
         * circList.traverse();
         * circList.insert(10,7);
         * circList.traverse();
         * circList.access(3);
         * circList.access(10);
         * circList.remove();
         * circList.traverse();
         * circList.remove(0);
         * circList.traverse();
         * circList.remove(5);
         * circList.traverse();
         * circList.remove(2);
         * circList.traverse();
         * circList.search(2);
         * circList.search(7);
         * circList.remove();
         * circList.remove();
         * circList.remove();
         * circList.traverse();
         * circList.remove(0);
         * circList.traverse();
         */

        //Doubly Linked List

        /*
         * listNode node= new listNode(0);
         * doublyLinkedList doublyList= new doublyLinkedList(node);
         * doublyList.traverse();
         * doublyList.reverseTraverse();
         * doublyList.insert(1);
         * doublyList.insert(2);
         * doublyList.insert(3);
         * doublyList.traverse();
         * doublyList.reverseTraverse();
         * doublyList.insert(2,4);
         * doublyList.insert(1,5);
         * doublyList.insert(0,6);
         * doublyList.traverse();
         * doublyList.reverseTraverse();
         * doublyList.search(3);
         * doublyList.reverseSearch(4);
         * doublyList.access(3);
         * doublyList.access(0);
         * doublyList.access(6);
         * System.err.println(doublyList.size);
         * doublyList.remove();
         * doublyList.traverse();
         * doublyList.reverseTraverse();
         * doublyList.remove(6);
         * doublyList.remove(0);
         * doublyList.remove(3);
         * doublyList.traverse();
         * doublyList.reverseTraverse();
         */

        //Circular Doubly Linked List
         
        /*
         * listNode node = new listNode(10);
         * circularDoublyLinkedList circDoublyList = new circularDoublyLinkedList(node);
         * circDoublyList.traverse();
         * circDoublyList.reverseTraverse();
         * circDoublyList.insert(11);
         * circDoublyList.insert(12);
         * circDoublyList.insert(13);
         * circDoublyList.traverse();
         * circDoublyList.reverseTraverse();
         * circDoublyList.insert(4, 14);
         * circDoublyList.insert(0, 15);
         * circDoublyList.insert(3, 16);
         * circDoublyList.insert(10, 16);
         * circDoublyList.traverse();
         * circDoublyList.reverseTraverse();
         * circDoublyList.search(13);
         * circDoublyList.reverseSearch(13);
         * circDoublyList.search(16);
         * circDoublyList.reverseSearch(16);
         * circDoublyList.search(10);
         * circDoublyList.reverseSearch(10);
         * circDoublyList.access(1);
         * circDoublyList.access(3);
         * circDoublyList.access(5);
         * circDoublyList.access(10);
         * circDoublyList.remove();
         * circDoublyList.traverse();
         * circDoublyList.reverseTraverse();
         * circDoublyList.remove(4);
         * circDoublyList.remove(0);
         * circDoublyList.remove(1);
         * circDoublyList.traverse();
         * circDoublyList.reverseTraverse();
         * circDoublyList.delete();
         * circDoublyList.traverse();
         * circDoublyList.reverseTraverse();
         */

        //Queue

        /*
         * listNode node=new listNode(0);
         * queue que=new queue(node);
         * que.peek();
         * que.pop();
         * que.peek();
         * que.push(1);
         * que.push(11);
         * que.push(111);
         * que.push(1111);
         * que.push(11111);
         * que.push(111111);
         * que.push(1111111);
         * que.push(11111111);
         * que.push(111111111);
         * que.push(1111111111);
         * que.push(111111111);
         * que.isEmpty();
         * que.isFull();
         * que.peek();
         * que.pop();
         * que.peek();
         * que.pop();
         * que.peek();
         * que.pop();
         * que.isEmpty();
         * que.isFull();
         * que.pop();
         * que.pop();
         * que.pop();
         * que.pop();
         * que.pop();
         * que.pop();
         * que.pop();
         * que.pop();
         * que.isEmpty();
         */

        //Stack

        /*
         * listNode node=new listNode(0);
         * stack stk=new stack(node);
         * stk.peek();
         * stk.pop();
         * stk.peek();
         * stk.push(1);
         * stk.push(11);
         * stk.push(111);
         * stk.push(1111);
         * stk.push(11111);
         * stk.push(111111);
         * stk.push(1111111);
         * stk.push(11111111);
         * stk.push(111111111);
         * stk.push(1111111111);
         * stk.push(111111111);
         * stk.isEmpty();
         * stk.isFull();
         * stk.peek();
         * stk.pop();
         * stk.peek();
         * stk.pop();
         * stk.peek();
         * stk.pop();
         * stk.isEmpty();
         * stk.isFull();
         * stk.pop();
         * stk.pop();
         * stk.pop();
         * stk.pop();
         * stk.pop();
         * stk.pop();
         * stk.pop();
         * stk.pop();
         * stk.isEmpty();
         */

        //Binary Tree

        /*
         * binaryTNode drinks = new binaryTNode("drinks", 0);
         * binaryTNode hot=new binaryTNode("hot",1);
         * binaryTNode cold=new binaryTNode("cold",1);
         * binaryTNode coffee=new binaryTNode("coffee",2);
         * binaryTNode tea=new binaryTNode("tea",2);
         * binaryTNode alcoholic=new binaryTNode("alcoholic",2);
         * binaryTNode non_alcoholic=new binaryTNode("non alcoholic",2);
         * drinks.left=hot;
         * drinks.right=cold;
         * hot.left=coffee;
         * hot.right=tea;
         * cold.left=alcoholic;
         * cold.right=non_alcoholic;
         * binaryTreeLinkedList tree=new binaryTreeLinkedList(drinks);
         * tree.insert("hot");
         * tree.insert("cold");
         * tree.insert("tea");
         * tree.insert("coffee");
         * tree.insert("alcoholic");
         * tree.insert("non alcoholic");
         * tree.preOrderTraversal(drinks);
         * System.out.println(
         * "*******************************************************************************************************"
         * );
         * tree.inOrderTraversal(drinks);
         * System.err.println(
         * "*******************************************************************************************************"
         * );
         * tree.postOrderTraversal(drinks);
         * System.err.println(
         * "*******************************************************************************************************"
         * );
         * tree.levelOrderTraversal();
         * tree.search("tea");
         * tree.search("boba");
         * binaryTNode out=tree.getDeepestTNode();
         * System.out.println("Deepest Node is : "+out.value);
         * tree.deleteDeepestTNode();
         * tree.levelOrderTraversal();
         * tree.insert("non alcoholic");
         * tree.insert("boba");
         * tree.insert("green");
         * tree.insert("black");
         * tree.insert("milk");
         * tree.insert("cocktails");
         * tree.insert("on ice");
         * tree.insert("juices");
         * tree.levelOrderTraversal();
         * System.out.println(
         * "*******************************************************************************************************"
         * );
         * tree.preOrderTraversal(drinks);
         * tree.deleteNode("cold");
         * tree.levelOrderTraversal();
         * System.out.println(
         * "*******************************************************************************************************"
         * );
         * tree.preOrderTraversal(drinks);
         */

        //Binary Search Tree
        
        /*
         * binarySTNode node = new binarySTNode(6, 0);
         * binarySearchTree tree=new binarySearchTree(node);
         * tree.postOrderTraversal(node);
         * System.out.println(
         * "***********************************************************");
         * tree.inOrderTraversal(node);
         * System.out.println(
         * "***********************************************************");
         * tree.preOrderTraversal(node);
         * System.out.println(
         * "***********************************************************");
         * tree.insert(3);
         * tree.insert(4);
         * tree.insert(1);
         * tree.insert(2);
         * tree.insert(9);
         * tree.insert(6);
         * tree.insert(8);
         * tree.insert(7);
         * tree.insert(5);
         * tree.postOrderTraversal(node);
         * System.out.println(
         * "***********************************************************");
         * tree.inOrderTraversal(node);
         * System.out.println(
         * "***********************************************************");
         * tree.preOrderTraversal(node);
         * tree.deleteNode(node, 9);
         * System.out.println(
         * "***********************************************************");
         * tree.preOrderTraversal(node);
         * System.out.println(
         * "***********************************************************");
         * tree.inOrderTraversal(node);
         * System.out.println(
         * "***********************************************************");
         * tree.postOrderTraversal(node);
         */

        //AVL tree

        /*
         * binarySTNode node = new binarySTNode(6, 0);
         * AVLTree tree = new AVLTree(node);
         * tree.levelOrderTraversal();
         * 
         * tree.insert(3);
         * tree.insert(4);
         * tree.insert(1);
         * tree.insert(2);
         * tree.insert(9);
         * tree.insert(6);
         * tree.insert(8);
         * tree.insert(7);
         * tree.insert(5);
         * 
         * tree.levelOrderTraversal();
         * 
         * tree.remove(9);
         * 
         * tree.levelOrderTraversal();
         * 
         * tree.preOrderTraversal(tree.root);
         */

        //Binary Heap

        /*
         * binaryHeap heap=new binaryHeap(5);
         * heap.insert(10,"Min");
         * heap.insert(5,"Min");
         * heap.insert(15,"Min");
         * heap.insert(1,"Min");
         * heap.levelOrderTraversal();
         * heap.peek();
         * heap.extractHeadOfBH("Min");
         * heap.levelOrderTraversal();
         * heap.delete();
         * heap.levelOrderTraversal();
         */

        //Trie
        
        /*
         * Trie trie=new Trie();
         * trie.insert("API");
         * trie.insert("APIS");
         * trie.search("APIS");
         * trie.delete("APIS");
         * trie.search("APIS");
         */

        //Hashing-Direct Chaining
        
        /*
         * directChaining dChain=new directChaining(13);
         * dChain.insert("The");
         * dChain.insert("quick");
         * dChain.insert("brown");
         * dChain.insert("fox");
         * dChain.search("ox");
         * dChain.insert("over");
         * dChain.delete("The");
         * dChain.display();
         */

        //Hashing-Open Addressing-Linear Probing

        /*
         * linearProbing lProbe=new linearProbing(13);
         * lProbe.insert("The");
         * lProbe.insert("quick");
         * lProbe.insert("brown");
         * lProbe.insert("fox");
         * lProbe.search("ox");
         * lProbe.insert("over");
         * lProbe.search("over");
         * lProbe.display();
         * lProbe.delete("over");
         * lProbe.display();
         */

        //Hashing-Open Addressing-Quadratic Probing

        /*
         * quadraticProbing qProbe=new quadraticProbing(13);
         * qProbe.insert("The");
         * qProbe.insert("quick");
         * qProbe.insert("brown");
         * qProbe.insert("fox");
         * qProbe.search("ox");
         * qProbe.insert("over");
         * qProbe.search("over");
         * qProbe.display();
         * qProbe.delete("over");
         * qProbe.display();
         */

        //Hashing-Open Addressing-Double Hashing
        
        /*
         * doubleHashing dHash=new doubleHashing(13);
         * dHash.insert("The");
         * dHash.insert("quick");
         * dHash.insert("brown");
         * dHash.insert("fox");
         * dHash.search("ox");
         * dHash.insert("over");
         * dHash.search("over");
         * dHash.display();
         * dHash.delete("over");
         * dHash.display();
         */
    }
}
