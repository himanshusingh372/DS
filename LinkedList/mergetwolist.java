public class mergetwolist {

    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;


        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data +"-->");
            current= current.next;
        }System.out.print("null");}



    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }else
            {tail.next=b;
            b=b.next;}

            tail=tail.next;
        }

        if(a==null)
        tail.next=b;
        else
        {tail.next=a;}

        return dummy.next;

    }

    public static void main(String[] args) {
        mergetwolist ml=new mergetwolist();
        ListNode a=new ListNode(2);
        a.next=new ListNode(4);
        a.next.next =new ListNode(6);
        a.next.next.next= new ListNode(8);
        a.next.next.next.next= new ListNode(10);
        a.next.next.next.next.next= new ListNode(12);
        a.next.next.next.next.next.next = new ListNode(14);
        

        ListNode b=new ListNode(3);
        b.next=new ListNode(5);
        b.next.next =new ListNode(7);
        b.next.next.next= new ListNode(9);


        ml.display(a);
        System.out.println();
        ml.display(b);

        head=ml.merge(a,b);
        
        ml.display(head);
       
    }
    
}
