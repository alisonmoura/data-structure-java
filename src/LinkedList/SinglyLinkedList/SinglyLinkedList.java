package LinkedList.SinglyLinkedList;

import LinkedList.LinkedList;

public class SinglyLinkedList<T> implements LinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private Integer size = 0;

    @Override
    public void insertStart(T value){
        Node<T> newNode = new Node<>(value);
        if(!isEmpty())
            newNode.setNext(first);
        first = newNode;
        ++size;
    }

    @Override
    public void insertEnd(T value){
        Node<T> newNode = new Node<>(value);
        if(!isEmpty())
            last.setNext(newNode);
        else first = newNode;
        last = newNode;
        ++size;
    }

    @Override
    public T remove(T value) {
        if(isEmpty())
            return null;
        if(first == last && value.equals(first.getValue())){
            T removedValue = first.getValue();
            first = null;
            last = null;
            --size;
            return removedValue;
        }
        if(value.equals(first.getValue())){
            T removedValue = first.getValue();
            first = first.getNext();
            --size;
            return removedValue;
        }
        if(value.equals(last.getValue())){
            Node<T> iterator = first;
            while(iterator != last){
                if(iterator.getNext() == last){
                    T removedValue = last.getValue();
                    last = iterator;
                    last.setNext(null);
                    --size;
                    return removedValue;
                }
                iterator = iterator.getNext();
            }
        }
        Node<T> iterator = first;
        while(iterator != last){
            if(iterator.getNext().getValue().equals(value)){
                T removedValue = iterator.getNext().getValue();
                iterator.setNext(iterator.getNext().getNext());
                --size;
                return removedValue;
            }
        }
        return null;
    }

    @Override
    public T find(T value) {
        Node<T> iterator = first;
        while(iterator != null){
            if(iterator.getValue().equals(value))
                return iterator.getValue();
            iterator = iterator.getNext();
        }
        return null;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public boolean isEmpty(){
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

    public T first(){
        return first.getValue();
    }

    public T last(){
        return last.getValue();
    }
}
