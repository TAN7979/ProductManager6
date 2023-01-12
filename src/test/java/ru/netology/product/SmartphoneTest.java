package ru.netology.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {
    @Test
    public void changeManufacturer() {
        Smartphone smart = new Smartphone(3, "HP 3", 31, "HP");
        smart.setManufacturer("Acer");

        String expected = "Acer";
        String actual = smart.getManufacturer();
        Assertions.assertEquals(expected, actual);
    }
}
