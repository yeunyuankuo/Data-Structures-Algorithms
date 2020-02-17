package linkedlist;
/**
 * Linked List Node.
 */
class Node {
    public int data;
    public Node next;
    Node(int value) {
        data = value;
        next = null;
    }
}

public class SinglyLinkedList {
    /**
     * Head: Node that points to the first node in our Singly Linked list.
     */
    private Node head;

    public void insertFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;    // setting newNode.next to whatever head is right now
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        Node ptr = head;
        while(ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }

    /**
     * Deleting the first node in linked list.
     * @return the deleted node
     */
    public Node deleteFirstNode() {
        Node temp = head;
        head = head.next;
        return temp;
    }
    
    public void deleteNode(Node node) {
        Node ptr = head;
        while (ptr.next != null && ptr.next.data != node.data) {
            ptr = ptr.next;
        }
        if (ptr.next != null) {
            ptr.next = ptr.next.next;
        }
    }

    public void printLinkedList() {
        Node ptr = head;
        while(ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    // Returns the node's index if it is in the list; -1, otherwise
    public int findValue(int value) {
        Node ptr = head;
        int index = -1;
        while (ptr != null) {
            index++;
            if (ptr.data == value) return index;
            ptr = ptr.next;
        }
        return index;
    }
}
