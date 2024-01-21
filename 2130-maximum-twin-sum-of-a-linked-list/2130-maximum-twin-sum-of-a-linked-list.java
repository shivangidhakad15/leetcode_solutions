/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int max=0;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev=null , next;
        while(slow!=null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        while(prev!=null) {
            max = Math.max(max,(head.val + prev.val));
            prev = prev.next;
            head = head.next;
        }
        return max;
    }
}