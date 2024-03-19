package dataStructures;

public class doublyLinkedList {
    listNode root;
    listNode end;
    int size;

    public doublyLinkedList(listNode root) {
        this.root = root;
        end = root;
        size = 1;
    }

    public void insert(int value) {
        end.next = new listNode(value);
        end.next.prev=end;
        end = end.next;
        size += 1;
        System.out.println("Value inserted at the end");
    }

    public void insert(int location, int value) {
        try {
            listNode head = root;
            if(location>=size){
                throw new Exception();
            }
            if (location == 0) {
                head = new listNode(value);
                head.next = root;
                root.prev=head;
                root = head;
                size += 1;
                System.out.println("Value inserted at the start");
            } else if (location == size) {
                end.next = new listNode(value);
                end.next.prev=end;
                end = end.next;
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
                tail.next.prev=tail;
                tail.next.next=head;
                head.prev=tail.next;
                size += 1;
                System.out.println("Value inserted at the location : " + location);
            }
        } catch (Exception e) {
            System.out.println("Invalid insert location");
        }
    }

    public void access(int location) {
        try {
            if(location>=size){
                throw new Exception();
            }
            if(location<=size/2){
                listNode head = root;
                for (int iter = 0; iter <location; iter++) {
                    head = head.next;
                }
                System.err.println("Value at location is : " + head.value);
            }
            else{
                listNode tail = end;
                for (int iter = size-1; iter >location; iter--) {
                    tail = tail.prev;
                }
                System.err.println("Value at location is : " + tail.value);    
            }
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
    
    }public void reverseTraverse() {
        if (size == 0) {
            System.out.println("List does not exist");
        } else {
            listNode tail = end;
            int index=size-1;
            while (index>=0) {
                System.out.print("-" + tail.value + "-");
                tail = tail.prev;
                index--;
            }
            System.out.println();
        }
    }

    public void remove() {
        end = end.prev;
        end.next=null;
        size -= 1;
        System.out.println("Value removed from the end");
    }

    public void remove(int location) {
        try {
            if(location>=size){
                throw new Exception();
            }
            if (location == 0) {
                root = root.next;
                root.prev=null;
                size -= 1;
                System.out.println("Value successfully removed from the start");
            } else if (location == size-1) {
                end = end.prev;
                end.next=null;
                size -= 1;
                System.out.println("Value successfully removed from the end");
            } else {
                if(location<=size/2){
                    listNode head = root;
                    listNode tail = root;
                    for (int iter = 0; iter <location; iter++) {
                        head = head.next;
                    }
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    tail.next = head.next;
                    tail.next.prev=tail;

                    size -= 1;
                    System.out.println("Value successfully removed from location");
                }
                else{
                    listNode head = end;
                    listNode tail = end;
                    for (int iter = size-1; iter >location; iter--) {
                        head = head.prev;
                    }
                    while (tail.prev != head) {
                        tail = tail.prev;
                    }
                    tail.prev = head.prev;
                    tail.prev.next = tail;
                    size -= 1;
                    System.out.println("Value successfully removed from location");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid remove location");
        }
    }

    public void search(int value) {
        listNode head = root;
        int index = 0;
        while (head != null) {
            if (head.value == value) {
                System.out.println("Value found at location :" + index);
                return;
            }
            head = head.next;
            index++;
        }
        System.out.println("Value not found");
    }

    public void reverseSearch(int value){
        listNode tail = end;
        int index = size-1;
        while (tail != null) {
            if (tail.value == value) {
                System.out.println("Value found at location :" + index);
                return;
            }
            tail = tail.prev;
            index--;
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
