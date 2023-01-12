package ru.netology.product;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {



    @Test
    public void changeId(){
        Product product = new Product(2, "LG 2", 21);
        product.setId(0);

        int expected = 0;
        int actual = product.getId();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void changeName(){
        Product product = new Product(2, "LG 2", 21);
        product.setName("Acer");

        String expected = "Acer";
        String actual = product.getName();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void changePrice() {
        Product product = new Product(2, "LG 2", 21);
        product.setPrice(44);

        int expected = 44;
        int actual = product.getPrice();
        Assertions.assertEquals(expected, actual);

    }
}
