package by.htp.doublelist.service;

import java.util.NoSuchElementException;

import by.htp.doublelist.domain.Book;
import by.htp.doublelist.domain.Node;

public class DoubleLinkedListImpl {
	public Node head;
    public Node tail;
    public int size;
    public Book book;
     
    public DoubleLinkedListImpl() {
        size = 0;
    }
    public int size() { return size; }
  
    public boolean isEmpty() { return size == 0; }
     
    public void addFirst(Book book) {
        Node tmp = new Node(book, head, null);
        if(head != null ) {head.prev = tmp;}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
        System.out.println("adding: "+book);
    }
    public void addBook(Book book) {
        Node tmp = new Node(book, head, tail);
        head.prev = tmp;
        head = tmp;
        tail = tmp;
        size++;
        System.out.println("adding: "+book);
    }
    
    public void addLast(Book book) {
         
        Node tmp = new Node(book, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
        System.out.println("adding: "+book);
    }
 
    public void iterateForward(){
         
        System.out.println("iterating forward..");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.book);
            tmp = tmp.next;
        }
    }
     
   
    public void iterateBackward(){
         
        System.out.println("iterating backword..");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.book);
            tmp = tmp.prev;
        }
    }
  
    public Book removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: "+tmp.book);
        return (Book) tmp.book;
    }
     
    public Book removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.book);
        return (Book) tmp.book;
    }
    
}


