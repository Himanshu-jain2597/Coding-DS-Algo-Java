class Solution
{
    public static Node addOne(Node head) 
    {
        
        Node prev = null;
        Node next = null;
        Node curr = head;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        Node temp = head; 
        int carry = 0;
        if(temp.data==9) {
            temp.data = 0;
            carry = 1;
        } 
        else {
            temp.data = temp.data+1;
        }
        temp = temp.next;
        if(temp!=null) {
            while(temp!=null&&carry==1) {
                if(temp.data==9&&carry==1) {
                    temp.data=0;
                }
                else {
                    temp.data = temp.data+1;
                    carry=0;
                }
            temp = temp.next;
            }
        }
        Node prev1 = null;
        Node next1 = null;
        Node curr1 = head;
        while(curr1!=null) {
            next1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }
        head = prev1;
        if(carry==1) {
            Node temps = new Node(1);
            temps.next=head;
            head = temps;
        }
        return head;
    }
}
