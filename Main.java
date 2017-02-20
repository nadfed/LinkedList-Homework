package by.htp.doublelist.controller;

import by.htp.doublelist.domain.Book;
import by.htp.doublelist.service.DoubleLinkedListImpl;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedListImpl dll = new DoubleLinkedListImpl();
		Book book1 = new Book("Tom Soyer", 1990, "Mark Twain", 1);
		Book book2 = new Book("Pride", 1991, "Gloria Evans", 2);
		Book book3 = new Book("The Richest", 1992, "Drew Dain", 3);
		Book book4 = new Book("My Friend", 1993, "Alice Smith", 4);
		Book book5 = new Book("Adventure", 1994, "Liz Fowl", 5);
		Book book6 = new Book("My house", 1995, "Anna Gomes", 6);
        dll.addFirst(book1);
        dll.addBook(book2);
        dll.addBook(book3);
        dll.addBook(book4);
        dll.addBook(book5);
        dll.addLast(book6);
        System.out.println("Size of the Linked List: " + dll.size());
        //System.out.println("Element at index 2: "+dll.elementAt(2));
       // dll.iterateForward();
       //dll.removeFirst();
       // dll.removeLast();
       //dll.iterateBackward();

	}

}
