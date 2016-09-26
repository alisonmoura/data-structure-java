package LinkedList;

/**
 *
 * This is a interface that represents de structure of a
 * Linked List Abstract Data Type.
 *
 * Created by alisonmoura on 16/09/16.
 */
public interface LinkedList<T> {

    /**
     * This method get the value, create a new Node with
     * this value. And insert this in the start of the list.
     * @param value
     */
    void insertStart(T value);

    /**
     * This method get the value, create a new Node with
     * this value. And insert this in the end of the list.
     * @param value
     */
    void insertEnd(T value);

    /**
     * This method remove, from the list, the node that have
     * the value equals given param's value, and return the value
     * of removed node.
     * @param value
     */
    T remove(T value);

    /**
     * This method verifies if the list is empty or not.
     * @return true: if the list is empty, false: if the
     * list isn't empty.
     */
    boolean isListEmpty();

    /**
     * This method print de list in the console.
     */
    void printList();

}
