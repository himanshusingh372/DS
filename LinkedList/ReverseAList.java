public class ReverseAList {
    private static ListNode head;
    public static class ListNode{
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
            System.out.print(curr.data + "--> ");
            curr=curr.next;
        }
        System.out.print("null");
    }


    public ListNode reverse(){
        if(head==null || head.next==null)
        return head;

        ListNode pre=null;
        ListNode curr=head;
        ListNode forward=head.next;

        while(forward.next!=null)
{
    curr.next=pre;
    pre=curr;
    curr=forward;
    forward=forward.next;

}
forward.next=curr;
curr.next=pre;
head=forward;

return head;
    }
    public static void main(String[] args) {
        ReverseAList ra=new ReverseAList();
        head=new ListNode(10);
        head.next=new ListNode(20);
        head.next.next=new ListNode(30);
        head.next.next.next=new ListNode(40);
        head.next.next.next.next=new ListNode(50);

        ra.display(head);
        ra.reverse();
        System.out.println();
        ra.display(head);
     
     

    }
    
}
