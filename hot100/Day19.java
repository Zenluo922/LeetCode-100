package hot100;


public class Day19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {

            val = x;

            next = null;

        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;//双指针解法
        // 两个指针没有相遇就继续走
        while (pA != pB){
            // pA 走到末尾，就从 B 链表重新开始
            if (pA == null){
                pA = headB;
            }else {
                pA=pA.next;
            }

            if (pB == null){
                pB = headA;
            }else {
                pB=pB.next;
            }
        }
        return pA;//相交：返回 pA 当前指向的节点；不相交：返回null
    }
}
