/**
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Time complexity: O(N + M); N: l1.length, M: l2.length
        // Space complexity: O(Max(N,M))
        int overTen = 0;
        ListNode result = new ListNode(-1);
        ListNode traverse = result;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + overTen;
            overTen = 0;
            if (sum >= 10) {
                sum -= 10;
                overTen = 1;
            }
            ListNode node = new ListNode(sum);
            traverse.next = node;
            l1 = l1.next;
            l2 = l2.next;
            traverse = traverse.next;
        }
        while(l1 != null) {
            int sum = l1.val + overTen;
            overTen = 0;
            if (sum >= 10) {
                sum -= 10;
                overTen = 1;
            }
            ListNode node = new ListNode(sum);
            traverse.next = node;
            l1 = l1.next;
            traverse = traverse.next;
        }
        while(l2 != null) {
            int sum = l2.val + overTen;
            overTen = 0;
            if (sum >= 10) {
                sum -= 10;
                overTen = 1;
            }
            ListNode node = new ListNode(sum);
            traverse.next = node;
            l2 = l2.next;
            traverse = traverse.next;
        }
        if (overTen == 1) traverse.next = new ListNode(1);
        return result.next;
    }
}
