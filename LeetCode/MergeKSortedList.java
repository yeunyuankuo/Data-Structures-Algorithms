/**
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        // Time complexity: O(kN); k: number of linked lists, N: the length of the final linked list
        // Space complexity: O(M); M: all of the nodes in all the linked list
        ListNode result = new ListNode(-1);
        ListNode traverse = result;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<>(){
            public int compare(ListNode node1, ListNode node2) {
                return node1.val - node2.val;
            }
        });
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }
        while(minHeap.size() > 0) {
            ListNode curr = minHeap.poll();
            if (curr != null) {
                traverse.next = new ListNode(curr.val);
                if (curr.next != null) {
                    curr = curr.next;
                    minHeap.add(curr);
                }
                traverse = traverse.next;
            }
        }
        return result.next;
    }
}
