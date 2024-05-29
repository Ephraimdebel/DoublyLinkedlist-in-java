package itsc2;

public class Doublylinkedlist {
    Node head;
    Node tail;

    void append(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        tail = newNode;
        head.prev = null;
        tail.next = null;
    }
    else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next =null;
    }

}
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println("backward");
        current = tail;
        while(current!=null){
            System.out.print(current.data+ " ");
            current = current.prev;
        }

    }
}
