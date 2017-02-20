package by.htp.doublelist.domain;

public class Node {
	 public Book book;
     public Node next;
     public Node prev;

     public Node(Book book, Node next, Node prev) {
         this.book = book;
         this.next = next;
         this.prev = prev;
     }
}
     