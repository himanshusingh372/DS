public class addtwonumber {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.data +"-->");
            curr=curr.next;
        }
        System.out.print("null");

    }


    public ListNode add(ListNode a,ListNode b){
       ListNode dummy=new ListNode(0);
       ListNode tail=dummy;
       int count=0;

       while(a!=null || b!=null){
           int X=(a!=null)?a.data:0;
           int Y=(b!=null)?b.data:0;

           int sum=count+X+Y;
           count=sum/10;
           tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(a!=null) a=a.next;
            if(b!=null) b=b.next;
        }
        if(count>0)
        tail.next=new ListNode(count);

        return dummy.next;

    }
 
    
public static void main(String[] args) {
    addtwonumber l1=new addtwonumber();
    addtwonumber l2=new addtwonumber();

    l1.head=new ListNode(7);
    l1.head.next=new ListNode(4);
    l1.head.next.next=new ListNode(9);

    l2.head=new ListNode(5);
    l2.head.next=new ListNode(6);
  //  l1.head.next.next=new ListNode(9);

  l1.display(l1.head);
  System.out.println();
  l2.display(l2.head);

  addtwonumber l3=new addtwonumber();
  ListNode result=l3.add(l1.head, l2.head);
  System.out.println();
    l3.display(result);

}

}
