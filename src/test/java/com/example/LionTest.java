package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(true, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeException() throws Exception {
        new Lion("Львенок");
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> list = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(list);
        assertEquals(list, lion.getFood());
    }
}