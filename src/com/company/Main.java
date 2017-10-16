package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();
        Scanner Keyboard = new Scanner(System.in);
        String answer ="y";
        while (answer.equalsIgnoreCase("y")){

            System.out.println("Do you want to enter a new book? (Y/N)");
            answer = Keyboard.nextLine();
            if (answer.equalsIgnoreCase("y")){
                Book book = new Book();
                System.out.print("Enter the author: ");
                book.author = Keyboard.nextLine();
                System.out.print("Enter the title: ");
                book.title=Keyboard.nextLine();
                library.add(book);
            }
        }

        //print all the books in the array list
        System.out.println("All the books:");
        for(Book book:library)
        {
            System.out.print(book.title);
            System.out.print(" ");
            System.out.print(book.author);
            System.out.println();
        }

    }
}