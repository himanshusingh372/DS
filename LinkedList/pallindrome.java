public class pallindrome
{   private static Node head;
    // private int length=0;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node h1=head;
        Node h2=reverse(head);
        
        while(h1!=null){
            if(h1.data!=h2.data)return false;
            h1=h1.next;
            h2=h2.next;
        }
        
        return true;
    }  
    
    static Node reverse(Node head){
        Node temp=head;
        Node pre=null;
        Node next=null;
        
        while(temp!=null){
            next=temp.next;
            temp.next=pre;
            pre=temp;
            temp=next; }
            return pre;
}
public static void main(String[] args) {
    pallindrome pl=new pallindrome();
     head=new Node(1);
     head.next=new Node(2);
     head.next.next=new Node(1);


     if(pl.isPalindrome(head)) System.out.println(1);
     else System.out.println(0);
}

}
 
/**  boolean isPalindrome(Node head) 
    {
        int number1 = 0;
        int number2 = 0;
        int power = 1;
        //Your code here
        Node x = head;
        
        while(x!=null){
            number1 = (number1 * 10) + x.data;
            number2 = number2 + (x.data * power);
            power = power * 10;
            x = x.next;
        }
        
        return number1 == number2;
    
    }    
} */