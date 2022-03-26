public class InsertNode {
    private  ListNode head;
    public static class ListNode{
            private int data;
            private ListNode next;

            public ListNode(int data)
            {
                this.data=data;
                this.next=null;
            }

    }
    // method for insert node at start
    public void InsertAtStart(int data){
        if(head==null)
        {
            head=new ListNode(data);
        }
        else{
            ListNode newNode=new ListNode(data);
            newNode.next=head;
            head=newNode;
    }}

    // insert the node at end
        public void InsertAtEnd(int value)
        {
            ListNode newNode =new ListNode(value);
            if(head==null){
                head=newNode;
                return;
            }
            ListNode current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }

        // Delete a note from a position
            public ListNode DeletePos(int pos){
                if(head==null||head.next==null)
                {
                    return head;
                }
                if(pos==1){head=head.next; }

              else
                { 
                        ListNode pre=head;
                        int count=1;
                        while(count<pos-1){
                            pre=pre.next;
                            count++;
                        }
                        ListNode curr=pre.next;
                        pre.next=curr.next;
                }
                return head;
            
            }

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data +"-->");
            current= current.next;
        }System.out.print("null");
    }
    public static void main(String[] args) {
        InsertNode In=new InsertNode();
        In.InsertAtStart(10);
        In.InsertAtStart(5);
        In.InsertAtStart(11);
        In.InsertAtEnd(50);
        
            In.display();
            In.DeletePos(2);
            System.out.println();
            In.display();

    }
}
