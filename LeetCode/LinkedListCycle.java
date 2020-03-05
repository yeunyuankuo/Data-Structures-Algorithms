/**
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedListCycle {
    /**
     * Create a hashset to keep track of visited nodes.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param head the first node in the linked list given
     * @return true if there is a cycle; false, otherwise
     */
    public static boolean solution1(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while(head != null) {
            if (visited.contains(head)) {
                return true;
            } else {
                visited.add(head);
            }
            head = head.next;
        }
        return false;
    }

    /**
     * Use Floyd's tortoise and hare algorithm (basically two pointers one fast and one slow)
     * to find out whether there's a cycle in the linked list.
     * If the two pointers meet then there's a cycle.
     *
     * Time complexity: O(N + K); N: whole linked list length + K: the cycle part of the linked list
     * Space complexity: O(1)
     *
     * @param head the first node in the linked list given
     * @return true if there is a cycle; false, otherwise
     */
    public static boolean solution2(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode tortoise = head;
        ListNode hare = head.next;
        while(tortoise != hare) {
            // If hare makes it back to the end then we know there's no cycle
            if (hare == null || hare.next == null) return false;
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return true;
    }
}
