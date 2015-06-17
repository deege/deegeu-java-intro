/*
 * The MIT License
 *
 * Copyright 2014 DJ Spiess and DeegeU.com.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.deegeu.fizzbuzz;

/**
 * This is the code for lesson 21, FizzBuzz in the Free Java Online Course.
 * 
 * @author dspiess
 */
public class FizzBuzz {
    public static void main(String args[]) {
        
        // ------ Simple For loop ----------------------------------------------
        // Simple for loop that prints numbers from 1 to 100
        System.out.println("------------- 1 to 100 --------------------------");
        for (int i=1; i<=100; i++) {
            System.out.println(i);
        }
        
        // ------ Simple For loop ----------------------------------------------
        // Simple for loop that prints numbers from 100 to 1
        System.out.println("------------- 100 to 1 --------------------------");
        for (int i=100; i>=1; i--) {
            System.out.println(i);
        }
        
        // ------ Simple For loop ----------------------------------------------
        // Simple for loop that prints numbers from 100 to 1, start at 0
        System.out.println("------------- 100 to 1, start at 0 --------------");
        for (int i=0; i<100; i++) {
            System.out.println(100 - i);
        }
        
        // ------- While For loop ----------------------------------------------
        // Simple while loop that prints numbers from 1 to 100
        System.out.println("------------- 1 to 100, no for-loop -------------");
        int j = 1;
        while (j <= 100) {
            System.out.println(j++);
        }
        
        // ------- FizzBuzz ----------------------------------------------------
        // FizzBuzz solution 
        System.out.println("-------------------- FizzBuzz -------------------");
        for (int i=1; i<=100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
