package main.java.com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println("START");
        bookService.listBooks();
        System.out.println("END");
    }
}
// This is the main application class that initializes the Spring context and
// retrieves the BookService bean.
// It then calls the listBooks method to demonstrate the functionality of the
// application.