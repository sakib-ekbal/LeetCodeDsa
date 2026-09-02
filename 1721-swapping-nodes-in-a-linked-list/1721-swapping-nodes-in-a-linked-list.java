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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode first = head;
       ListNode second = head;
       ListNode current = head;
       for(int i=1;i<k;i++){
        current = current.next;
       }
       first = current.next;
       while(first != null){
        second = second.next;
        first = first.next;
       }
       int temp = current.val;
       current.val = second.val;
       second.val = temp;
       return head;
    }
}