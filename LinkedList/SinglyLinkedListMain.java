package linkedlist;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFront(1);
        singlyLinkedList.insertFront(5);
        singlyLinkedList.insertFront(10);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.deleteFirstNode();
        singlyLinkedList.printLinkedList();
        System.out.println("index: " + singlyLinkedList.findValue(5));
        singlyLinkedList.insertLast(100);
        singlyLinkedList.printLinkedList();
    }
}
