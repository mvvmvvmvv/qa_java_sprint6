package com.example;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat(new Feline());
        String expectedMeow = "Мяу";

        assertEquals(expectedMeow, cat.getSound());
    }

    @Test
    public void getFoodReturnsMeat() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, cat.getFood());
    }
}
