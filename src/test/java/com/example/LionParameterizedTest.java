package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private String lionSex;
    private Feline feline;
    private boolean hasManeExpected;

    public LionParameterizedTest(String lionSex, Feline feline, boolean hasManeExpected) {
        this.lionSex = lionSex;
        this.feline = feline;
        this.hasManeExpected = hasManeExpected;
    }

    @Parameterized.Parameters(name = "Пол животного: {0}, значение: {2}")
    public static Object[][] getDataForm() {
        Feline felineMock = Mockito.mock(Feline.class);
        return new Object[][] {
                {"Самец", felineMock, true},
                {"Самка", felineMock, false},
        };
    }

    @Test
    public void doesHaveManeReturnsExpectedValue() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        boolean hasManeActual = lion.doesHaveMane();

        assertEquals(hasManeExpected, hasManeActual);
    }
}
