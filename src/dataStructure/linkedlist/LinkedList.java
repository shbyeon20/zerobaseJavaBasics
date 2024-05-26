package dataStructure.linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addData(int data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node nextnode = this.head.next;
            while (nextnode != null) {
                nextnode = nextnode.next;
            }
            nextnode = new Node(data, null);
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node cur = this.head;
        Node prev = cur;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == this.head) {
            this.head = null;
        } else {
            prev.next = null;
        }

    }


    public void findData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
                System.out.println("Data is found");
                return;
            }
            cur = cur.next;
        }
        System.out.println("Data is not found");
        return;
    }

    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data);
            cur = cur.next;
        }
        System.out.println();
    }

}
