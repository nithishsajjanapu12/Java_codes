package com.oops.encapsulation;


import java.util.*;

//Book Class

class Book {
 int id;
 String title;
 String author;
 boolean isAvailable;

 Book(int id, String title, String author) {
     this.id = id;
     this.title = title;
     this.author = author;
     this.isAvailable = true;
 }
}

//Member Class
class Member {
 int id;
 String name;

 Member(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

//Issue Class
class Issue {
 Book book;
 Member member;
 Date issueDate;
 Date dueDate;

 Issue(Book b, Member m, Date issueDate, Date dueDate) {
     this.book = b;
     this.member = m;
     this.issueDate = issueDate;
     this.dueDate = dueDate;
 }
}

//Library Class
class Library {
 Book[] books = new Book[100];
 Member[] members = new Member[100];
 Issue[] issues = new Issue[100];

 int bookCount = 0;
 int memberCount = 0;
 int issueCount = 0;

 // Add Book
 void addBook(int id, String title, String author) {
     books[bookCount++] = new Book(id, title, author);
     System.out.println("Book added!");
 }

 // Search Book
 Book searchBook(int id) {
     for (int i = 0; i < bookCount; i++) {
         if (books[i].id == id)
             return books[i];
     }
     return null;
 }

 // Add Member
 void addMember(int id, String name) {
     members[memberCount++] = new Member(id, name);
     System.out.println("Member added!");
 }

 // Find Member
 Member findMember(int id) {
     for (int i = 0; i < memberCount; i++) {
         if (members[i].id == id)
             return members[i];
     }
     return null;
 }

 // Issue Book
 void issueBook(int bookId, int memberId) {
     Book book = searchBook(bookId);
     Member member = findMember(memberId);

     if (book == null || member == null) {
         System.out.println("Book or Member not found!");
         return;
     }

     if (!book.isAvailable) {
         System.out.println("Book not available!");
         return;
     }

     Date issueDate = new Date();
     Calendar cal = Calendar.getInstance();
     cal.setTime(issueDate);
     cal.add(Calendar.DATE, 7);

     Date dueDate = cal.getTime();

     issues[issueCount++] = new Issue(book, member, issueDate, dueDate);
     book.isAvailable = false;

     System.out.println("Book issued!");
 }

 // Return Book
 void returnBook(int bookId) {
     for (int i = 0; i < issueCount; i++) {
         if (issues[i].book.id == bookId) {

             Date returnDate = new Date();
             long diff = returnDate.getTime() - issues[i].dueDate.getTime();

             if (diff > 0) {
                 long daysLate = diff / (1000 * 60 * 60 * 24);
                 System.out.println("Late! Fine = ₹" + (daysLate * 10));
             } else {
                 System.out.println("Returned on time!");
             }

             issues[i].book.isAvailable = true;

             // Remove issue (shift array)
             for (int j = i; j < issueCount - 1; j++) {
                 issues[j] = issues[j + 1];
             }
             issueCount--;

             return;
         }
     }
     System.out.println("Book not issued!");
 }

 // Reports
 void availableBooks() {
     System.out.println("Available Books:");
     for (int i = 0; i < bookCount; i++) {
         if (books[i].isAvailable) {
             System.out.println(books[i].id + " " + books[i].title);
         }
     }
 }

 void issuedBooks() {
     System.out.println("Issued Books:");
     for (int i = 0; i < issueCount; i++) {
         System.out.println(issues[i].book.title + " -> " + issues[i].member.name);
     }
 }

 void overdueBooks() {
     System.out.println("Overdue Books:");
     Date today = new Date();

     for (int i = 0; i < issueCount; i++) {
         if (today.after(issues[i].dueDate)) {
             System.out.println(issues[i].book.title);
         }
     }
 }
}

//Main Class
public class LibrarySystem {
 public static void main(String[] args) {
     Library lib = new Library();

     lib.addBook(1, "Java", "James");
     lib.addBook(2, "C++", "Bjarne");

     lib.addMember(1, "Alice");
     lib.addMember(2, "Bob");

     lib.issueBook(1, 1);
     lib.availableBooks();

     lib.issuedBooks();

     lib.returnBook(1);

     lib.overdueBooks();
 }
}