public class LinkedList{
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    public static void addNode(LinkedList ll,int val){
        Node newNode=new Node(val);
        newNode.next=null;
        if(ll.head==null){
            ll.head=newNode;
        }
        else{
            Node ct=ll.head;
            while(ct.next!=null){
                ct=ct.next;
            }
            ct.next=newNode;
        }
    }
    public  void showList(){
        Node ct=head;
        while(ct!=null){
            System.out.print(ct.val+" ");
            ct=ct.next;
        }
    }
    public static boolean search(LinkedList ll,int data){
        Node ct=ll.head;
        while(ct!=null){
            if(ct.val==data){
                
                return true;
            }
            ct=ct.next;
        }
        return false;
    }
    public static LinkedList deleteDuplicate(LinkedList ll){
        Node ct=ll.head;
        while(ct!=null){
            if(ct.next!=null && ct.val==ct.next.val){
                ct.next=ct.next.next;
                continue;
            }
            ct=ct.next;
            
        }
        return ll;
    }
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        addNode(ll,10);
        addNode(ll,11);
        addNode(ll,11);
        addNode(ll,12);
        addNode(ll,14);
        ll.showList();
        System.out.println(search(ll,22)?"found":"not found");
        deleteDuplicate(ll);
        ll.showList();
    }
    
    
    
}
