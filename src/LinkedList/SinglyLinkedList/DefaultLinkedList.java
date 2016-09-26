package LinkedList.SinglyLinkedList;

import LinkedList.LinkedList;

public class DefaultLinkedList<T> implements LinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    @Override
    public void insertStart(T value){
        Node<T> newNode = new Node(value);
        if(!isListEmpty())
            newNode.setNext(first);
        first = newNode;
    }

    @Override
    public void insertEnd(T value){
        Node<T> newNode = new Node(value);
        if(!isListEmpty())
            last.setNext(newNode);
        else first = newNode;
        last = newNode;
    }

    @Override
    public T remove(T value) {
        if(isListEmpty())
            return null;
        if(first == last && value.equals(first.getValue())){
            T removedValue = first.getValue();
            first = null;
            last = null;
            return removedValue;
        }
        if(value.equals(first.getValue())){
            T removedValue = first.getValue();
            first = first.getNext();
            return removedValue;
        }
        if(value.equals(last.getValue())){
            Node iterator = first;
            while(iterator != last){
                if(iterator.getNext() == last){
                    T removedValue = last.getValue();
                    last = iterator;
                    last.setNext(null);
                    return removedValue;
                }
                iterator = iterator.getNext();
            }
        }
        Node iterator = first;
        while(iterator != last){
            if(iterator.getNext().getValue().equals(value)){
                T removedValue = (T) iterator.getNext().getValue();
                iterator.setNext(iterator.getNext().getNext());
                return removedValue;
            }
        }
        return null;
    }

    @Override
    public boolean isListEmpty(){
        return first == null && last == null;
    }

    @Override
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
