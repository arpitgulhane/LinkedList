package linkedList;

import javax.swing.*;

public class LinkedList <T extends Comparable<T>>{
    class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    public Node<T>  head = null;
//    public static Node tail = null;
    //----------------------------add Linked List-----------------------------------------------------------------
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
    //----------------------append Data---------------------------------------------------------------------------
    public void appendData(Object dataOld ,Object newData){
        if (head==null){
            System.out.println("List is Empty to append ...");
            return;
        }
        else {
            Node newNoad = new Node(newData);
            Node temp = head;
            while (temp!=null){
                if(temp.data == dataOld){
                    newNoad.next=temp.next;
                    temp.next=newNoad;
                    System.out.println("Append Data ... "+newData);
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Data Not Found : "+dataOld);
        }
    }
    //----------------------delete First---------------------------------------------------------------------------
   public void deleteFirst(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
       System.out.println("After Delete Head");

    }
    //--------------------delete Last-----------------------------------------------------------------------------
    public void deleteLast(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node corrent = head;
        while (corrent.next.next != null){
            System.out.println("Check"+corrent.data);
            corrent=corrent.next;
        }
        corrent.next=null;
    }
    //---------------------Search----------------------------------------------------------------------------
    public void search(T searchData){
        if (head==null){
            System.out.println("cant searchList is Empty ");
        }
        Node current=head;
        while (current != null){
            if(current.data == searchData){
                System.out.println(searchData+" is present");
                return;
            }
            current = current.next;
        }
        System.out.println(searchData + " Not present ");
    }
    //---------------Delete element----------------------------------------------------------------------------------
    public void deleteElement(T deleteData){
        if (head==null){
            System.out.println("cant searchList is Empty ");
        }
        Node current=head;
        Node previous = null;
        while (current != null){
            if(current.data == deleteData){
                System.out.println(deleteData+" is present");
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            current = current.next;
        }
        System.out.println(deleteData + " Not present ");
    }
    //---------------------- Sort ---------------------------------------------------------------------------
    public void sort(){
        System.out.println("in sort ");
        if(head==null){
            System.out.println("Linked List is empty ...");
            return;
        }
//        Node <T> newNode = new Node<>();

        Node <T> current = head;
        Node <T> current2;
        while (current != null){
            current2=current.next;
//            if(current.data.compareTo(current2.data)){
//
//            }
//            System.out.println(s1+" "+s2);
            current=current.next;
        }

    }
    //------------------- Display ------------------------------------------------------------------------------
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
        linkedList.addLinkedList(777);
        linkedList.addLinkedList(78);
        linkedList.addLinkedList(67);
        linkedList.diaplay();
        linkedList.appendData(7,10);
        linkedList.diaplay();
        linkedList.deleteFirst();
        linkedList.diaplay();
        linkedList.deleteLast();
        linkedList.diaplay();
        linkedList.search(100);
        linkedList.appendData(10,1000);
        linkedList.diaplay();
        linkedList.deleteElement(777);
        linkedList.diaplay();
        linkedList.sort();
    }
}
