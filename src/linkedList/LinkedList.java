package linkedList;

public class LinkedList {
    class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head = null;
//    public static Node tail = null;
    public void addLinkedList(Object data){
        Node newNode = new Node(data);
        if (head==null){
//            head=newNode;
//            tail=newNode;               //return
            head=newNode;
            return;
        }else {
            //tail.next=newNode;          //newNode.next = head;
            //tail=newNode;               //head = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    public void diaplay(){
        Node current = head;
        if(current==null){
            System.out.println("Linked List is empty ...");
            return;
        }
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLinkedList(5);
        linkedList.addLinkedList(6);
        linkedList.addLinkedList(7);
        linkedList.diaplay();
    }
}
