import java.util.NoSuchElementException;

public class DoubleLinkedlist {
    private ListNode head=null;
    private ListNode tail=null;
    private int length=0;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data=data;
        }
    }

    public boolean isEmpty(){ return  length==0;}
    public int length(){ return length;}

    public void displayForward(){
        if(head==null) {System.out.println("null"); return;}
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.next;
        }System.out.print ("null");
    }

    public void displayBackward(){

        if(tail==null){System.out.println("null");return;}
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.previous;
        }System.out.print ("null");
    }

    public void insertNode(int data){
        ListNode newNode =new ListNode(data);
        if(isEmpty()){
            tail=newNode;
        }else{
            head.previous=newNode;
            newNode.next=head;
        }
        head=newNode;
        length++;
    }

    public void insertEnd(int data){
        ListNode newNode=new ListNode(data);
        if(isEmpty()) {
            head=newNode;
        }
        else { tail.next=newNode;
            newNode.previous=tail;
        }
            tail=newNode;
            length++;
    }

    public void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
            ListNode temp=head;
            if(head==tail){tail=null;}
            else{head.next.previous=null;}

            head=head.next;
            temp.next=null;
            length--;
        }

    public void deleteLast(){
        if(isEmpty()){throw new NoSuchElementException();}
        ListNode temp=tail;
        if(head==tail){head=null;}
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.next=null;
        length--;
    }
    
    public static void main(String[] args) {
    DoubleLinkedlist cl=new DoubleLinkedlist();
        cl.insertNode(10);
        cl.insertNode(20);
        cl.insertNode(30);
        cl.insertNode(40);
        cl.insertEnd(50);
        cl.displayForward();
        System.out.println();
        cl.displayBackward();
        System.out.println();
       cl.deleteLast();
       cl.deleteLast();
       cl.deleteLast();
       cl.deleteLast();
       cl.deleteLast();
        cl.displayForward();
    }
    
}
