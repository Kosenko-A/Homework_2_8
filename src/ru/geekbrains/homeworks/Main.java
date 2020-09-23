package ru.geekbrains.homeworks;

public class Main {

    public static void main(String[] args) {
	DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
	doublyLinkedList.add("Harry");
	doublyLinkedList.add("Ron");
	doublyLinkedList.add("Hermione");
	doublyLinkedList.add("Luna");

	System.out.println(doublyLinkedList);

	//doublyLinkedList.remove("Harry");
	//System.out.println(doublyLinkedList);

	doublyLinkedList.remove("Hermione");
	System.out.println(doublyLinkedList);
    }

}
