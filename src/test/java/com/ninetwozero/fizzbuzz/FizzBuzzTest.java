package com.ninetwozero.fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    public static final Object[] testValues() {
        return $(
                $(9, "Fizz"),
                $(10, "Buzz"),
                $(14, "Woof"),
                $(11, "11")
        );
    }

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_print_fizz_on_division_of_three() {
        assertEquals("Fizz", fizzBuzz.of(3));
    }

    @Test
    public void should_print_buzz_on_division_of_five() {
        assertEquals("Buzz", fizzBuzz.of(5));
    }

    @Test
    public void should_print_fizz_buzz_on_division_of_three_and_five() {
        assertEquals("FizzBuzz", fizzBuzz.of(15));
    }

    @Test
    public void should_print_woof_on_division_of_seven() {
        assertEquals("Woof", fizzBuzz.of(14));
    }

    @Test
    public void should_return_the_inputed_number_if_not_modulus() {
        assertEquals("11", fizzBuzz.of(11));
    }

    @Test
    @Parameters(method = "testValues")
    public void junitparams_run_tests(final int number, final String expectedResult) {
        assertEquals(expectedResult, fizzBuzz.of(number));
    }
}
