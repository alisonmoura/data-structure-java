package SinglyLinkedList;

public class DefaultLinkedList<T> implements LinkedList<T>{

    private Node<T> first;
    private Node<T> last;

    public void insertStart(T value){
        Node<T> newNode = new Node<>(value);
        if(!isListEmpty())
            newNode.setNext(first);
        first = newNode;
    }

    public void insertEnd(T value){
        Node<T> newNode = new Node<>(value);
        if(!isListEmpty())
            last.setNext(newNode);
        else first = newNode;
        last = newNode;
    }

    public boolean isListEmpty(){
        return first == null && last == null;
    }

    public void printList(){
        Node<T> iterator = first;
        while(iterator != null){
            System.out.print(iterator.getValue().toString() + " -> ");
            iterator = iterator.getNext();
        }
        System.out.println("#");
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }
}
