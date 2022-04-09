public class InsertNodeInSortedList {
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
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data +"-->");
            current= current.next;
        }System.out.print("null");}

    public ListNode insertNode(int key){
       
        ListNode newNode=new ListNode(key);
        
        if(head==null){
            return newNode;
        }

        if(head.data>key){
            newNode.next=head;
                head=newNode;  
                return head;         
        }
       
        ListNode current=head;
        ListNode pre=null;
        while(current!=null && current.data<key){
            pre=current;
            current=current.next;
        }
        newNode.next=current;
        pre.next=newNode;
        return head;
    }


    public void removekey(int key){
        ListNode current=head;
        ListNode temp=null;

        if(head!=null && head.data==key){
            head=current.next;
            return;
        }

        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }
        if(current==null) return;
        temp.next=current.next;

    }

    public static void main(String[] args) {
        InsertNodeInSortedList in=new InsertNodeInSortedList();
        head=new ListNode(10);
        head.next=new ListNode(20);
        head.next.next=new ListNode(30);
        head.next.next.next=new ListNode(40);
        head.next.next.next.next=new ListNode(50);


        in.display(head);
        in.insertNode(9);
        in.insertNode(35);
        System.out.println();
        in.display(head);
        System.out.println();
        in.removekey(40);
        in.display(head);
    }
}
