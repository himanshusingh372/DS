public class loopinList {
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

        public boolean detectloop(){
            boolean result=false;

            ListNode fastptr=head;
            ListNode slowptr=head;

            while(fastptr!=null && fastptr.next!=null){
                fastptr=fastptr.next.next;
                slowptr=slowptr.next;
            if(slowptr==fastptr) return true;}

            return result; 

        }

        public ListNode loopstartNode()
        {
            ListNode fastptr=head;
            ListNode slowptr=head;

            while(fastptr!=null && fastptr.next!=null){
                fastptr=fastptr.next.next;
                slowptr=slowptr.next;

                if(slowptr==fastptr) return startpoint(slowptr);
            }
            return null;
        }

        
        public ListNode startpoint(ListNode slowptr){
            ListNode temp=head;
            ListNode ptr=slowptr;

            while(temp!=slowptr){
                ptr=ptr.next;
                temp=temp.next; 
            }
            return temp;
        }

        public void Removeloop()
        {
            ListNode fastptr=head;
            ListNode slowptr=head;

            while(fastptr!=null && fastptr.next!=null){
                fastptr=fastptr.next.next;
                slowptr=slowptr.next;

                if(slowptr==fastptr)  removeloop(slowptr);
            }
        
        }

        public void removeloop(ListNode slowptr){
            ListNode temp=head;
            while(temp.next!=slowptr.next){
                temp=temp.next;
                slowptr=slowptr.next;
            }
            slowptr.next=null;
        }

        public static void main(String[] args) {
            loopinList ll=new loopinList();
            head=new ListNode(10);
            head.next=new ListNode(20);
            head.next.next=new ListNode(30);
            head.next.next.next=new ListNode(40);
            head.next.next.next.next=new ListNode(50);
            head.next.next.next.next.next=head.next.next;

           //ll.display(head);
           
            System.out.println(ll.detectloop());
            System.out.println(ll.loopstartNode().data);

            ll.Removeloop();

            
            System.out.println(ll.detectloop());
            ll.display(head);// use only after loop deleted
        }
    
}
