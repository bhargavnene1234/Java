package dataStructures;

public class circularLinkedList {
    listNode root;
    listNode end;
    int size;

    public circularLinkedList(listNode root) {
        this.root = root;
        this.root.next=this.root;
        end = root;
        size = 1;
    }

    public void insert(int value) {
        end.next = new listNode(value);
        end = end.next;
        end.next=root;
        size += 1;
        System.out.println("Value inserted at the end");
    }

    public void insert(int location, int value) {
        try {
            listNode head = root;
            if(location>size){
                throw new Exception();
            }
            if (location == 0) {
                head = new listNode(value);
                head.next = root;
                root = head;
                size += 1;
                System.out.println("Value inserted at the start");
            } else if (location == size) {
                end.next = new listNode(value);
                end = end.next;
                end.next=root;
                size += 1;
                System.out.println("Value inserted at the end");
            } else {
                listNode tail = root;
                for (int iter = 0; iter < location; iter++) {
                    head = head.next;
                }
                while (tail.next != head) {
                    tail = tail.next;
                }
                tail.next = new listNode(value);
                tail.next.next = head;
                size += 1;
                System.out.println("Value inserted at the location : " + location);
            }
        } catch (Exception e) {
            System.out.println("Invalid insert location");
        }
    }

    public void access(int location) {
        try {
            if(location>size){
                throw new Exception();
            }
            listNode head = root;
            for (int iter = 0; iter < location; iter++) {
                head = head.next;
            }
            System.err.println("Value at location is : " + head.value);
        } catch (Exception e) {
            System.err.println("Invalid access location");
        }
    }

    public void traverse() {
        if (size == 0) {
            System.out.println("List does not exist");
        } else {
            listNode head = root;
            int index=0;
            while (index<size) {
                System.out.print("-" + head.value + "-");
                head = head.next;
                index++;
            }
            System.out.println();
        }
    }

    public void remove() {
        listNode head = root;
        while (head.next.next != root) {
            head = head.next;
        }
        head.next = root;
        end = head;
        size -= 1;
        System.out.println("Value deleted from the end");
    }

    public void remove(int location) {
        try {
            if(location>=size){
                throw new Exception();
            }
            if (location == 0) {
                root = root.next;
                size -= 1;
                System.out.println("Value successfully removed from location");
            } else if (location == size-1) {
                listNode head = root;
                while (head.next.next != root) {
                    head = head.next;
                }
                head.next = root;
                end = head;
                size -= 1;
                System.out.println("Value deleted from the end");
            } else {
                listNode head = root;
                listNode tail = root;
                for (int iter = 0; iter < location; iter++) {
                    head = head.next;
                }
                while (tail.next != head) {
                    tail = tail.next;
                }
                tail.next = head.next;
                size -= 1;
                System.out.println("Value successfully removed from location");
            }
        } catch (Exception e) {
            System.out.println("Invalid remove location");
        }
    }

    public void search(int value) {
        listNode head = root;
        int index = 0;
        while (index<size) {
            if (head.value == value) {
                System.out.println("Value found at location :" + index);
                return;
            }
            head = head.next;
            index++;
        }
        System.out.println("Value not found");
    }

    public void delete() {
        root = null;
        end = null;
        size = 0;
        System.out.println("List deleted");
    }
}
