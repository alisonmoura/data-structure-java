package SinglyLinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        testIsListEmpty();
        testInsertStart();
        testInsertEnd();
    }

    private static void testIsListEmpty(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList.isListEmpty() ? "Right" : "Error");
    }

    private static void testInsertStart(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertStart(4);
        linkedList.insertStart(6);
        linkedList.insertStart(8);
        linkedList.printList();
    }

    private static void testInsertEnd(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertEnd(4);
        linkedList.insertEnd(6);
        linkedList.insertEnd(8);
        linkedList.printList();
    }
}
