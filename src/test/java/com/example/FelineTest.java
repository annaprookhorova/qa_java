package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> list = List.of("Животные", "Птицы", "Рыба");
        assertEquals(list, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        feline.getFamily();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

}