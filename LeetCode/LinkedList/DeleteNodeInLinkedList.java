/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Time compleixty: O(1)
 * Space complexity: O(1)
 */
public class DeleteNodeInLinkedList {
    public static void solution(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
