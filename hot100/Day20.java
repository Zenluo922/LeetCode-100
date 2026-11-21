package hot100;

public class Day20 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        //前一个节点
        ListNode pre = null;
        //当前节点
        ListNode cur = head;
        //下一个节点
        ListNode next = null;

        while (cur!=null){
            //保存下一个节点
            next = cur.next;
            //反转当前的节点指向
            cur.next = pre;
            //向前移动
            pre = cur;
            //当前处理的向前移动
            cur = next;
        }
        //返回反转后的头节点
        return pre;
    }
}
