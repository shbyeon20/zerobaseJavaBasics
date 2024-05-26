package dataStructure.linkedlist;

public class LinkedList2 extends LinkedList {
    public LinkedList2(Node node) {
        this.head = node;
    }

    public void addData(int data,Integer beforeData) {
        if (head == null) {
            head = new Node(data,null);
        } else if (beforeData==null) {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data,null);
        }else{
            Node cur = head;
            Node prev = cur;
            while (cur.next != null) {
                if (cur.data == beforeData) {
                    if (cur == head){
                        head = new Node(data,head);
                    } else{
                        prev.next = new Node(data,cur);
                    }
                }
                prev = cur;
                cur = cur.next;
            }
        }
    }

    public void removeData(int data) {
        if(this.isEmpty()){
            System.out.println("the list is empty");
            return;
        }

    }

    public static void main(String[] args) {}
}
