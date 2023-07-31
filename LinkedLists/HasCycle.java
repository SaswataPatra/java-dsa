package LinkedLists;

public class HasCycle {

    public static void main(String[]args){
        int a[] = {1,2,0,4};
        ListNode root = createLinkedList(a);
        System.out.println(hasCycle(root));
    }

    public static ListNode createLinkedList(int[] a){
        ListNode head=new ListNode();

        
        // for (int i: a){
        //     root.val = i;
        //     root.next=root;
        // }
        // return root;
    }

    public static ListNode addlast(ListNode head){
        listNode node = new Node()
        if (head==null){
            
        }
    }
    public static  boolean hasCycle(ListNode head){

        ListNode slow = head,fast = head;
        while(fast.next!=null&&fast!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow) return true;
        }
        return false;
    }
    
}
