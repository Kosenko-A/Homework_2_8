package ru.geekbrains.homeworks;

public class DoublyLinkedList implements GeekbrainsList{

    private Node head;

    @Override
    public void add(String o) {
        if (head == null) {
            head = new Node(o);
            return;
        }
        add(head, o);
    }

    @Override
    public void remove(String o) {
        if (head == null){
            return;
        } else {
            if (head.getVal().equals(o)){
                head = head.getNext();
                head.setPrev(null);
                return;
            }
        }

        remove(head, head.getNext(), o);

    }

    private void remove (Node prev, Node current, String o){
        if (current == null){
            return;
        }
        if (current.getVal().equals(o)){
            Node b = current.getNext();
            prev.setNext(b);

            if (current.getNext()!= null) {
                b.setPrev(current.getPrev());
            }
            return;
        }
        remove(current, current.getNext(), o);
    }

    private void add (Node current, String o){
        if (current.getNext() == null){
            Node a = new Node(o);
            current.setNext(a);
            a.setPrev(current);
            return;
        }
        add(current.getNext(), o);

    }

    private static class Node{
        private final String val;
        private Node next;
        private Node prev;

        public Node (Node prev,String val,Node next) {
            this.prev = prev;
            this.val = val;
            this.next = next;
        }

        public Node (String val){
            this(null, val, null);
        }

        public String getVal() {
            return val;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "prev='" + ((prev != null) ? prev.getVal() : null) +
                    ", val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "{" +
                 head +
                '}';
    }
}
