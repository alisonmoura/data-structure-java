package LinkedList.SinglyLinkedList;

import LinkedList.LinkedList;

public class TestSinglyLinkedList {

    public static void main(String[] args) {
        testIsListEmpty();
        testInsertStart();
        testInsertEnd();
        testRemove();
        testFind();
        testSize();
        System.out.println("All ok");
    }

    private static void testIsListEmpty(){
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        if(!linkedList.isEmpty())
            throw new RuntimeException("The list is not empty, but it was just created");
    }

    private static void testInsertStart(){
        Integer value = 4;
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.insertStart(6);
        linkedList.insertStart(8);
        linkedList.insertStart(value);
        if(!linkedList.first().equals(value))
            throw new RuntimeException("The value "+value+" is not the first of the list, but it was, previously, inserted in the start");

    }

    private static void testInsertEnd(){
        Integer value = 4;
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.insertEnd(6);
        linkedList.insertEnd(8);
        linkedList.insertEnd(value);
        if(!linkedList.last().equals(value))
            throw new RuntimeException("The value "+value+" is not the last of the list, but it was, previously, inserted in the end");
    }

    private static void testRemove(){
        Integer value = 4;
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.insertEnd(value);
        linkedList.insertEnd(6);
        linkedList.insertEnd(8);
        linkedList.remove(value);
        if(linkedList.find(value) != null)
            throw new RuntimeException("The value "+value+" was found into the list, but it was, previously, removed");
    }

    private static void testFind(){
        Integer value = 6;
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.insertEnd(value);
        linkedList.insertEnd(4);
        linkedList.insertEnd(8);
        if(linkedList.find(value) == null || !linkedList.find(value).equals(value))
            throw new RuntimeException("The value "+value+" was not found into the list, but it was, previously, inserted");
    }

    private static void testSize(){
        Integer size = 8;
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.insertEnd(4);
        linkedList.insertEnd(8);
        linkedList.insertEnd(5);
        linkedList.insertEnd(34);
        linkedList.insertEnd(90);
        linkedList.insertEnd(90);
        linkedList.insertEnd(45);
        linkedList.insertEnd(2);
        if(!linkedList.size().equals(size))
            throw new RuntimeException("The size of the list doesn't match");
    }
}
