package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test(expected = Exception.class)
    public void getFoodException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Млекопитающее");
    }

    @Test
    public void getFoodGrass() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodMeat() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}