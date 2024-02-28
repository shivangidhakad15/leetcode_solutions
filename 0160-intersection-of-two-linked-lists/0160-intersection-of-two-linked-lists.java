/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        int l1=0;
        while (temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        ListNode temp2=headB;
        int l2=0;
        while (temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        if (l1>l2){
            headA= collisionPoint(headA, l1-l2);
        }else{
            headB= collisionPoint(headB, l2-l1);
        }
        while(headA!=null && headB!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    static ListNode collisionPoint(ListNode head, int steps){
        while(steps>0 && head!=null){
            head=head.next;
            steps--;
        }
        return head;
    }
}