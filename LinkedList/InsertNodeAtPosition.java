public class InsertNodeAtPosition 
{
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }    

    public void display() {
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data + "-->");
            current=current.next;
        }
        System.out.print("null");
    }
    // Insert At position
    
    public void InsertAtPosition(int data, int num){
        ListNode newNode=new ListNode(data);
        if(num==1){
            newNode.next=head;
            head=newNode;
        } 
        else
        {
            ListNode current =head;
            int count=1;
            while(count<num-1)
            {
                current=current.next;
                count++;
            }
            newNode.next=current.next;
            current.next=newNode;
        
        }}
    // Delete first Node

    public ListNode DeleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    // Delete last Node

    public ListNode DeleteLast(){
        if(head==null|| head.next==null){
            return head;
        } 
        ListNode temp=head;
        ListNode pre=null;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        } 
        pre.next=null;
        return temp;
    
    }

    public static void main(String[] args) {
        InsertNodeAtPosition sc = new InsertNodeAtPosition();
        sc.head= new ListNode(10);
        sc.head.next=new ListNode(20);
        // sc.head.next.next=new ListNode(30);
        // sc.head.next.next.next=new ListNode(40);
        // sc.head.next.next.next.next=new ListNode(50);
        // sc.head.next.next.next.next.next=new ListNode(60);
        // sc.InsertAtPosition(100, 5);

        // sc.display();
        //  sc.DeleteFirst();
        // System.out.println();
        // sc.display();
        //  sc.DeleteFirst();
        //  System.out.println();
        sc.display();
        sc.DeleteLast();
        System.out.println();
         sc.display();

    }

   
}
