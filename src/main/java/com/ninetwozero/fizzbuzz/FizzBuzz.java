package com.ninetwozero.fizzbuzz;

import java.util.*;

public class FizzBuzz {

    private Map<Integer, String> fizzBuzzStrings;

    public FizzBuzz() {
        fizzBuzzStrings = new HashMap<Integer, String>();
        fizzBuzzStrings.put(3, "Fizz");
        fizzBuzzStrings.put(5, "Buzz");
    }

    public String of(final int number) {
        final StringBuilder builder = new StringBuilder(); 
        for( int key : fizzBuzzStrings.keySet() ) {
            if( isModulusOf(number, key) ) {
                builder.append(fizzBuzzStrings.get(key));
            }
        }
        return builder.length() == 0? String.valueOf(number) : builder.toString(); 
    }

    private boolean isModulusOf(final int number, final int modulus) {
        return number % modulus == 0;
    } 
}

