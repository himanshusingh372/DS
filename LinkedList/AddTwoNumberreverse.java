public class AddTwoNumberreverse {
    // private static Node head;
    // private int length=0;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }System.out.print("null");}

  
    public Node reverse(Node head){
        Node temp=head;
        Node pre=null;
        Node next=null;

        while(temp!=null){
            next=temp.next;
            temp.next=pre;
            pre=temp;
            temp=next;
        }
        return pre;
    }

    public Node addtwonumber(Node h1,Node h2){
        Node dummy=new Node(0);
        Node temp=dummy;
        int C=0;

        while(h1!=null || h2!=null){
            int X=(h1!=null)?h1.data:0;
            int Y=(h2!=null)?h2.data:0;
            int sum=X+Y+C;
            C=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
            if(h1!=null) h1=h1.next;
            if(h2!=null) h2=h2.next;
        }
        if(C>0)
        temp.next=new Node(C);

        return dummy.next;
    }
    
    public static void main(String[] args) {
        AddTwoNumberreverse atn=new AddTwoNumberreverse();
        Node head1=new Node(3);
        Node second=new Node(4);
        Node third=new Node(5);
        head1.next=second;
        second.next=third;

        atn.display(head1);
       head1= atn.reverse(head1);
        System.out.println();
        atn.display(head1);
        
       Node head2 =new Node(5);
        head2.next=new Node(5);

        System.out.println();
        atn.display(head2);   
        head2=atn.reverse(head2);
        System.out.println();
        

       head1= atn.addtwonumber(head1,head2);
       head1=atn.reverse(head1);
       atn.display(head1);
    }
    
}
