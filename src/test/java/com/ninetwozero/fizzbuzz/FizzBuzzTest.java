package com.ninetwozero.fizzbuzz;

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
    public void should_print_fizz_on_division_of_three(){
        assertEquals("Fizz", fizzBuzz.of(3));
    }
    
    @Test
	public void should_print_buzz_on_division_of_five(){
        assertEquals("Buzz", fizzBuzz.of(5));
    }

	@Test
	public void should_print_fizz_buzz_on_division_of_three_and_five(){
		assertEquals("FizzBuzz", fizzBuzz.of(15));
	}
	
	@Test
	public void should_return_the_inputed_number_if_not_modulus(){
		assertEquals("11", fizzBuzz.of(11));
	}
}
