/**
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
    /**
     * Creating a new linkedlist reversed
     * Time complexity: O(N)
     * Space complexity: O(N)
     * @param head the first node in the given linked list
     * @return the first node of our result linked list
     */
    public static ListNode ReverseSolution1(ListNode head) {
        ListNode result = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = new ListNode(curr.val);
            temp.next = result;
            result = temp;
            curr = curr.next;
        }
        return result;
    }

    /**
     * Reverse the linked list without creating extra linkedlist.
     * Time complexity: O(N)
     * Space complexity: O(1)
     * @param head the first node in the given linked list
     * @return the first node of our result linked list
     */
    public static ListNode ReverseSolution2(ListNode head) {
         ListNode result = null;
         ListNode curr = head;
         while(curr != null) {
             ListNode temp = curr.next;
             curr.next = result;
             result = curr;
             curr = temp;
         }
         return result;
    }

    /**
     * Reverse the linked list recursively.
     * Time complexity = O(N)
     * Space complexity = O(N)
     * @param head the first node in the given linked list
     * @return the first node of our result linked list
     */
    public static ListNode ReverseSolution3(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = ReverseSolution3(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}
