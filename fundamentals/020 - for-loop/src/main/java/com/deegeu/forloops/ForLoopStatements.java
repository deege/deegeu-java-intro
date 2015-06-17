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
package com.deegeu.forloops;

/**
 * This is the code for lesson 20, Java for-loops loops in the Free Java Online Course.
 * 
 * @author dspiess
 */
public class ForLoopStatements {
    public static void main(String args[]) {
        
        // ------ Simple For loop ----------------------------------------------
        // Simple while loop
        System.out.println("------ Simple For loop --------------------------");
        for (int i=0; i<10; i++) {
            System.out.println("Index = " + i);
        }
        
        // ------ Forever For loop ---------------------------------------------
        // 
        System.out.println("------ Forever For loop -------------------------");
        int count = 0;
        for (;;) {
             System.out.println("Forever");
             if (count++ == 10) {
                 break; // This breaks the loop, otherwise we'd loop forever.
             }
        }
        
        // ------ Simple For loop 2 --------------------------------------------
        // This is the same loop, but in this case we're using the addition and 
        // assignment operators, instead of the unray addition. The unary addition
        // is preferred, but this shows this works too.
        System.out.println("------ Simple For loop 2 ------------------------");
        for (int i=0; i<10; i=i+1) {
            System.out.println("Index = " + i);
        }
     
        // ------ Simple For loop x2 -------------------------------------------
        // This loop only prints even numbers. It's adding 2 to every increment.
        System.out.println("------ Simple For loop x2 -----------------------");
        for (int i=0; i<10; i+=2) {
            System.out.println("Index = " + i);
        }
        
        // ------ Simple For loop - Counting backwards -------------------------
        // This counts down from 10 to 1.
        System.out.println("------ Simple For loop - backwards --------------");
        for (int i=10; i>0; i--) {
            System.out.println("Index = " + i);
        }
        
        // ------ Simple For loop - Arrays -------------------------------------
        // This iterates over a simple character array. One thing to note is the
        // character array has 6 items, indexed from 0 to 5. If you try 6, you'll
        // get an error. That's why we make sure i is less than the length. If 
        // we allowed equals, then it would loop from 0 to 6, causing an 
        // IndexOutOfBounds exception.
        System.out.println("------ Simple For loop w/ array -----------------");
        char[] array = {'a', 's', 'd', 'f', 'g', 'h'};
        for (int i=0; i<array.length; i++) {
            System.out.println("Character at index " + i + " is " + array[i]);
        }
        
        // ------ Enhanced For loop - Counting backwards -----------------------
        // This uses the (preferred) enhanced for-loop. We keep an index, just to
        // show what the index is, but if you need an index in your code, use
        // the basic for-loop.
        System.out.println("------ Enhanced For loop -------------------------");
        int index = 0;
        for (char c : array) {
           System.out.println("Character at index " + index++ + " is " + c); 
        }
    }
}
