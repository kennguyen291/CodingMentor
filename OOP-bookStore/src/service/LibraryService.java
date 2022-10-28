package service;

import entity.Book;
import entity.Customer;
import entity.Ticket;

import static dataSource.DataSource.*;

public class LibraryService {
    public void showAllTickets() {
        for (Ticket ticket : tickets) {
            for (Customer customer: customers){
                if (customer.getId() == ticket.getCustomerId()){
                    System.out.println("Ticket ID: " + ticket.getId());
                    System.out.println("Customer Name: " + customer.getFirstName() + " " + customer.getLastName());
                }
            }
            for (Book book: books){
                if (book.getId() == ticket.getBookId()){
                    System.out.println("Book Name: " + book.getName());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println();
                }
            }
            System.out.println("Borrow Date: " + ticket.getBorrowDate());
            System.out.println("Return Date: " + ticket.getReturnBy());
            System.out.println();

        }
    }
}
