package Exercises.SumSinglyLinkedList;

import LinkedList.SinglyLinkedList.SinglyLinkedList;

/**
 *
 */
public interface SumSinglyLinkedList <T extends Number>{

    int sumSeq(SinglyLinkedList<T> list);
    int sumRec(SinglyLinkedList<T> list);

}
