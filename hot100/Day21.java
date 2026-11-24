package hot100;

import java.util.HashSet;

public class Day21 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }//快慢指针找中点

        ListNode pre = null;
        ListNode cur = slow;
        while (cur!= null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        ListNode left = head;
        ListNode right = pre;
        while (right!=null){
            if (left.val!= right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

