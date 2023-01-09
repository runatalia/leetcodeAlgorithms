package additionalClasses;


import java.util.ArrayList;
import java.util.List;

/*class ListNode for mergeTwoLists*/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    List<ListNode> testList = new ArrayList<>();

}


//class IteratorListNode implements Iterator {
//    private int position;
//    private ListNode listNode;
//    IteratorListNode(ListNode listNode){
//        this.listNode = listNode;
//        position=0;
//    }
//    @Override
//    public boolean hasNext() {
//        return listNode.next!=null;
//    }

//    @Override
//    public Object next() {
//        Integer result = listNode.val;
//        if (!listNode.hasNext()) throw new IndexOutOfBoundsException("End of list.");
//        current = current.next;
//        return result;
//   }
//}