public class removeduplicate {

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
    
        public void removedplicate(ListNode head){
            ListNode curr=head;
            while(curr!=null && curr.next!=null){
                if(curr.data==curr.next.data){
                    curr.next=curr.next.next;
                }
                else 
                curr=curr.next;
            }
        }
    public static void main(String[] args) {
        removeduplicate rd=new removeduplicate();
        head =new ListNode(10);
        head.next=new ListNode(20);
        head.next.next= new ListNode(30);
        head.next.next.next=new ListNode(30);
        head.next.next.next.next=new ListNode(40);
        head.next.next.next.next.next=new ListNode(40);

        rd.display(head);
        rd.removedplicate(head);
        System.out.println();
        rd.display(head);

    }
    
}
