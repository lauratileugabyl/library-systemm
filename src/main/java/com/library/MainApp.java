package com.library;

import com.library.config.AppConfig;
import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.service.SimpleBookService;
import com.library.service.AdvancedBookService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BookService simpleBookService = context.getBean(SimpleBookService.class);
        BookService advancedBookService = context.getBean(AdvancedBookService.class);

        // Добавление книг
        simpleBookService.addBook(new Book("1984", "George Orwell"));
        advancedBookService.addBook(new Book("Brave New World", "Aldous Huxley"));

        // Получение всех книг
        System.out.println("Books in SimpleBookService:");
        simpleBookService.getAllBooks().forEach(System.out::println);

        System.out.println("Books in AdvancedBookService:");
        advancedBookService.getAllBooks().forEach(System.out::println);
    }
}