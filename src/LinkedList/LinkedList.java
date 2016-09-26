package LinkedList;

/**
 *
 * This is a interface that represents de structure of a
 * Linked List Abstract Data Type.
 *
 * @author <a href="https://plus.google.com/118347808183815659392">Alison Moura</a>
 */
public interface LinkedList<T> {

    /**
     * This method get the value, create a new Node with
     * this value. And insert this in the start of the list.
     * @param value the value to be insert
     */
    void insertStart(T value);

    /**
     * This method get the value, create a new Node with
     * this value. And insert this in the end of the list.
     * @param value the value to be insert
     */
    void insertEnd(T value);

    /**
     * This method remove, from the list, the node that have
     * the value equals given param's value, and return the value
     * of removed node.
     * @param value the value to be remove
     */
    T remove(T value);

    /**
     * This method search for an element inside of the list and return it,
     * if it was found or return null if it wasn't found.
     * @return found value
     */
    T find(T value);

    /**
     * This method return the first node into the list.
     * @return the first node of the list
     */
    T first();

    /**
     * This method return the last node into the list.
     * @return the last node of the list
     */
    T last();

    /**
     * This method return the size of the list.
     * @return the size of the list
     */
    Integer size();

    /**
     * This method verifies if the list is empty or not.
     * @return true: if the list is empty, false: if the
     * list isn't empty.
     */
    boolean isEmpty();

    /**
     * This method print de list in the console.
     */
    void printList();

}
