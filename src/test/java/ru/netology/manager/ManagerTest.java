package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.product.Book;
import ru.netology.product.Product;
import ru.netology.product.Smartphone;
import ru.netology.repository.Repository;

public class ManagerTest {

    Smartphone smart1 = new Smartphone(1, "Sony 1", 11, "Sony");
    Smartphone smart2 = new Smartphone(2, "LG 2", 21, "LG");
    Smartphone smart3 = new Smartphone(3, "HP 3", 31, "HP");
    Book book4 = new Book(4, "masks", 41, "Metelsky");
    Book book5 = new Book(5, "witchery", 51, "Vasiliev");
    Book book6 = new Book(6, "legacy", 61, "Tarmyshev");


    @Test
    public void searchInAnArraySmart() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        manager.add(smart1);
        manager.add(smart2);
        manager.add(smart3);
        manager.add(book4);
        manager.add(book5);
        manager.add(book6);

        Product[] expected = {smart2};
        Product[] actual = manager.searchBy("LG");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchInAnArrayBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        manager.add(smart1);
        manager.add(smart2);
        manager.add(smart3);
        manager.add(book4);
        manager.add(book5);
        manager.add(book6);

        Product[] expected = {book4};
        Product[] actual = manager.searchBy("masks");
        Assertions.assertArrayEquals(expected, actual);
    }

}

