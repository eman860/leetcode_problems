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
    public ListNode partition(ListNode head, int x) {
        
        ListNode lt = new ListNode(0), imman = lt;
        ListNode gt = new ListNode(0), hari = gt;

        while(head != null){
            if(head.val < x){
                imman.next = head;
                imman = imman.next;
            }
            else{
                hari.next =head;
                hari = hari.next;
            }
            head = head.next;
        }
        hari.next = null;
        imman.next = gt.next;
        return lt.next;
    }
}