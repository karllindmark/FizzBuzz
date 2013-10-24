package com.karllindmark.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_print_buzz_on_division_of_three(){
        assertEquals("Fizz", fizzBuzz.of(3));
    }
}