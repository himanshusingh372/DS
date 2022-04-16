import java.util.NoSuchElementException;

public class circularsinglyList {

    private ListNode last=null;
    private int length=0;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
        }
    }
    public int length(){return length;}
    public boolean isEmpty(){return length==0;}

    public void createAList(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(15);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;
    }

    public void display(){
        if(last==null){ System.out.println("null"); return;}
        ListNode first=last.next;
        while(first!=last){
            System.out.print(first.data+" -->");
            first=first.next;
        }System.out.print(last.data);
    }

    public void insertBegin(int data){
        ListNode NewNode=new ListNode(data);
        if(last==null){last=NewNode;}
        else{
            NewNode.next=last.next;
        } 
        last.next=NewNode;
        length++;
    }

    public void insertEnd(int data){
        ListNode newNode=new ListNode(data);
        if(last==null){last=newNode; last.next=last;}
        else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
       
        length++;
    }

        public void removeFirst(){
            
            if(last==null){throw new NoSuchElementException("circular linked linked is already empty");}
            ListNode temp=last.next;
            if(last==last.next)
            {
                last=null;
            }
            else
            {
                last.next=temp.next;
            }
            temp.next=null;
            length--;
        }

    public static void main(String[] args) {
        circularsinglyList cll=new circularsinglyList();
        cll.createAList();
        cll.display();

        cll.insertBegin(100);
        System.out.println();
        cll.display();
        cll.insertEnd(50);
        System.out.println();
        cll.display();
        cll.removeFirst();
        System.out.println();
        cll.display();
    }
}
