public class linkedList {
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);

        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }

    }    

}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int value){
        val=value;
    }

}