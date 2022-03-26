
// implement linklist
public class Singlylinklist{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
    
    public  ListNode(int data)
    {
        this.data =data;
        this.next=null;
    }}
    // Method for display linklist
    public void display(){
        ListNode current =head;
        while(current!= null){
            System.out.print(current.data +"-->");
            current=current.next;
        }
        System.out.print("null");
    }

    // method for  count the length
    public int length(){
        int count=0;
        ListNode current =head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    // Create linklist
    public static void main(String[] args) {
        Singlylinklist sll=new Singlylinklist();
        sll.head=new ListNode(10);
        ListNode second =new ListNode(1);
        ListNode third =new ListNode(8);
        ListNode fourth =new ListNode(12);
        ListNode fifth =new ListNode(5);

        // now willl connect together to form a chain
        sll.head.next= second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        sll.display();
        System.out.println();
        System.out.println(sll.length());
    }

    
}
