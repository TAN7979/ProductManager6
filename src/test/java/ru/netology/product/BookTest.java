package ru.netology.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void changeAuthor() {
        Book book = new Book(4, "masks", 41, "Metelsky");
        book.setAuthor("Po");

        String expected = "Po";
        String actual = book.getAuthor();
        Assertions.assertEquals(expected, actual);
    }
}
