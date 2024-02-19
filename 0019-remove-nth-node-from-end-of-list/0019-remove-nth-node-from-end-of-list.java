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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }
        if (length == n) {
            ListNode temp = head.next;
            head = null;
            return temp;
        }
        current = head;  
        ListNode dummy = new ListNode(0);  
        ListNode temp = dummy;
        int steps = length - n;
        for (int i = 0; i < steps; i++) {
            temp.next = current;
            temp = temp.next;
            current = current.next;
        }
        ListNode nextNode = current.next;  
        current = null;  
        temp.next = nextNode;  
        return dummy.next;
    }
}