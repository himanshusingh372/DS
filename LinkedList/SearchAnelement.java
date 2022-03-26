public class SearchAnelement {
    private static ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private boolean search(ListNode head,int i) {
        ListNode curr=head;
        int count=1;
        
        while(curr!=null){
            if(curr.data==i)
            {System.out.print("key : "+ i+" found at position :"+ count +"\n"); 
             return true;}
            curr=curr.next;
            count++;
        }System.out.println("key : "+ i+" not found \n");
        return false;
    }

    private void display() {
        if(head==null){
            System.out.println("null");
        }ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.data +"-->");
            curr=curr.next;
        }System.out.print("null");
    }

    public ListNode middle(){
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null&& fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr;
    }

    public ListNode findnthfromlast(int pos)
    { if(head==null) return null;

        if(pos<=0)
        throw new IllegalArgumentException("invalid value");

        ListNode mainptr=head;
        ListNode refptr=head;
        int count =0;
        while(count<pos){
            if(refptr==null)
            throw new IllegalArgumentException(pos+" is greater then the no of nodes in list");
            refptr=refptr.next;
            count++;
        }

        while(refptr!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;
        }
        return mainptr;
    }

    public static void main(String[] args) {
        SearchAnelement sc=new SearchAnelement();
        head=new ListNode(10);
         head.next=new ListNode(20);
         head.next.next=new ListNode(30);
         head.next.next.next=new ListNode(50);
         head.next.next.next.next=new ListNode(100);

         sc.display();
         System.out.println();
         System.out.println(sc.search(head,30));
        System.out.println(sc.middle().data);
        System.out.println(sc.findnthfromlast(1).data);

    }

   
    
}
