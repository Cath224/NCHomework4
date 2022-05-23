package com.netcracker.homework.mycollection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;


public class MyLinkedList <E> implements ILinkedList {
    private int size;
    private Node<E> first;
    private Node<E> last;


    public MyLinkedList() {
        last = new Node<E>(first, null, null);
        first = new Node<E>(null, null, last);
    }

    @Override
    public void add(Object el) {
        Node previous = last;
        last = new Node<E>(previous, null, null);
        size++;
        previous.setValue(el);
        previous.setNodeNext(last);
    }

    @Override
    public void add(int index, Object el) {
        Objects.checkIndex(index, size + 1);
        Node<E> node = first.getNodeNext();
        Node<E> previousNew = first.getNodeNext();
        for (int i = 0; i < index; i++) {
            node = node.getNodeNext();
        }

        if (index == 0) {
            previousNew = first;
        } else {
            for (int j = 0; j < index - 1; j++) {
                previousNew = previousNew.getNodeNext();
            }
        }
        size++;

        Node<E> nodeTarget = new Node<E>(previousNew, null, null);

        nodeTarget.setValue((E) el);
        nodeTarget.setNodeNext(node);
        previousNew.setNodeNext(nodeTarget);

    }


    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        Objects.checkIndex(index, size + 1);
        Node<E> search = first.getNodeNext();
        for (int i = 0; i < index; i++) {
            search = search.getNodeNext();
        }
        return search.getValue();
    }


    @Override
    public int indexOf(Object el) {
        int i = 0;
        Node<E> node = first.getNodeNext();
        while (!(node.getValue().equals(el))) {
            i++;
            node = node.getNodeNext();
        }
        return i;
    }

    @Override
    public Object remove(int index) {
        size--;
        Node<E> node = first.getNodeNext();
        Node<E> previousNew = first.getNodeNext();
        Node<E> newNext = first.getNodeNext();
        Objects.checkIndex(index, size + 1);
        for (int i = 0; i < index; i++) {
            node = node.getNodeNext();
        }
        if (index == 0) {
            previousNew = first;
        } else {
            for (int j = 0; j < index - 1; j++) {
                previousNew = previousNew.getNodeNext();
            }
        }
        for (int k = 0; k < index + 1; k++) {
            newNext = newNext.getNodeNext();
        }

        newNext = new Node<E>(previousNew, null, null);

        newNext.setValue(newNext.getValue());
        newNext.setNodeNext(newNext.getNodeNext());
        previousNew.setNodeNext(newNext);

        return node.getValue();
    }

    @Override
    public Object set(int index, Object el) {
        Node<E> nodeNew = first.getNodeNext();
        Node<E> previousNew = first.getNodeNext();
        Node<E> nextNew = first.getNodeNext();

        if (index < size) {
            for (int i = 0; i < index; i++) {
                nodeNew = nodeNew.getNodeNext();
            }

            if (index == 0) {
                previousNew = first;
            } else {
                for (int j = 0; j < index - 1; j++) {
                    previousNew = previousNew.getNodeNext();
                }
            }

            for (int k = 0; k < index + 1; k++) {
                nextNew = nextNew.getNodeNext();
            }

            nodeNew = new Node<E>(previousNew, null, nextNew);

            previousNew.setNodeNext(nodeNew);
            nodeNew.setValue((E) el);
            nodeNew.setNodeNext(nextNew);

        }
        return nodeNew.getValue();
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public Object[] toArray() {

        Object[] array = new Object[size];

        Node nodeNow = first.getNodeNext();
        for (int i = 0; i < size; i++) {
            if (nodeNow != null) {
                array[i] = nodeNow.getValue();
                nodeNow = nodeNow.getNodeNext();
            } else break;
        }
        for (Object n : array) {
            System.out.print("{ " + n + " }");
        }
        return array;
    }


    @Override
    public Object[] toArray(Object[] a) {
        if (a.length < size) {
            a = (Object[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }

        Node nodeNow = first.getNodeNext();


        for (int i = 0; i < size; i++) {
            if (nodeNow == null) {
                break;
            } else {
                a[i] = nodeNow.getValue();
                nodeNow = nodeNow.getNodeNext();
            }
        }

        if (a.length > size) {
            a[size] = null;
        }

        for (Object n : a) {
            System.out.print(n + " ");
        }

        return a;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = new Node<E>(null, null, last);

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                current = current.getNodeNext();
                return current.getValue();
            }

            @Override
            public boolean hasNext() {
                return current.getNodeNext() != null;
            }

        };
    }

    @Override
    public String toString() {
        Node nodeNow = first;
        String  string = new String();
        string =  "size=" + size() + " [";
        while (nodeNow != null) {
            string += (nodeNow.getValue() + " ");
            nodeNow = nodeNow.getNodeNext();
        }
        string+="]";

        return  string;
    }
    private class Node <T>{
        private Node nodeNext;
        private T value;
        private Node nodePrevious;

        public Node(Node nodePrevious, T value, Node nodeNext){
            this.nodePrevious = nodePrevious;
            this.value = value;
            this.nodeNext = nodeNext;
        }

        public T getValue() {
            return value;
        }
        public Node getNodeNext() {
            return nodeNext;
        }
        public void setValue(T value) {
            this.value = value;
        }
        public void setNodeNext(Node nodeNext) {
            this.nodeNext = nodeNext;
        }
        public void setNodePrevious(Node nodePrevious) {
            this.nodePrevious = nodePrevious;
        }
    }

}
