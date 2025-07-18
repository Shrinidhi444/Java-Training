package PacJava;

public class LRrotation {
 Node head,tail;
 class Node{
	 
	 int data;
	 Node next;
	 Node prev;
	 
	 Node(int d){
		 this.data = d;
		 this.next=null;
		 this.prev=null;
	 }
 }
 
 LRrotation(){
	 this.head=null;
	 this.tail=null;
 }
 
 void insert(int data) {
	 Node newNode = new Node(data);
	 
	 if(head == null) {
		 head=tail=newNode;
	 }else {
		 tail.next = newNode;
		 newNode.prev=tail;
		 tail=newNode;
	 }
 }
 
 void display() {
	 Node current = head;
	 while(current != null) {
		 System.out.println(current.data +" ");
		 current = current.next;
	 }
	 System.out.println();
 }
 

void leftRotate() {
    if (head == null || head.next == null) return;

    Node temp = head;
    head = head.next;
    head.prev = null;

    tail.next = temp;
    temp.prev = tail;
    temp.next = null;
    tail = temp;
}


void rightRotate() {
    if (head == null || head.next == null) return;

    Node temp = tail;
    tail = tail.prev;
    tail.next = null;

    temp.next = head;
    head.prev = temp;
    temp.prev = null;
    head = temp;
}


public static void main(String[] args) {
    LRrotation list = new LRrotation();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);

    
    list.display();

    
    list.leftRotate();
    list.display();

 
    list.rightRotate();
    list.display();

   
    list.rightRotate();
    list.display();
}
}
