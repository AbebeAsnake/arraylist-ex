package com.abebe.arraylistex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController

public class MainController {
    @RequestMapping("/")
            public String MyBook(){
    ArrayList<Book> books = new ArrayList<Book>();
    //add a new book
    //create a book from our object
    Book book1 = new Book();
    Book book2 = new Book();
        book1.SetAuthor("Author 1");
        book2.SetAuthor("Author 2");
        book1.SetTitle("Title of Book 1");
        book2.SetTitle("Title of Book 2");
        books.add(book1);
        books.add(book2);
        System.out.println("All the books:");
        for(Book book:books)
        {
            System.out.print(book.GetAuthor());
            System.out.print(" ");
            System.out.print(book.GetTitle());
            System.out.println();
        }
        return "xx";
    }


    //print all the books in the array list
}
