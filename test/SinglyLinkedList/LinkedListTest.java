package SinglyLinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        testIsListEmpty();
        testInsertStart();
        testInsertEnd();
    }

    private static void testIsListEmpty(){
        DefaultLinkedList<Integer> linkedList = new DefaultLinkedList<>();
        System.out.println(linkedList.isListEmpty() ? "Right" : "Error");
    }

    private static void testInsertStart(){
        DefaultLinkedList<Integer> linkedList = new DefaultLinkedList<>();
        linkedList.insertStart(4);
        linkedList.insertStart(6);
        linkedList.insertStart(8);
        linkedList.printList();
    }

    private static void testInsertEnd(){
        DefaultLinkedList<Integer> linkedList = new DefaultLinkedList<>();
        linkedList.insertEnd(4);
        linkedList.insertEnd(6);
        linkedList.insertEnd(8);
        linkedList.printList();
    }
}
