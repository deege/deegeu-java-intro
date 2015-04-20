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
package com.deegeu.conditionals1;

/**
 *
 * @author dspiess
 */
public class ConditionalsIfThen {
    public static void main(String args[]) {
        int a = 6;
        boolean myCondition = (a > 5);
        
        // simple if-then statement
        if (myCondition) {
            System.out.println("a is greater than 5");
        }
        
        // multiple if-then statements
        if (a > 5) {
            System.out.println("a is greater than 5");
        } else if (a < 5) {
            System.out.println("a is less than 5");
        } else if (a == 5) {
            System.out.println("a is equal to 5"); 
        }
        
        // if-then-else with a default else
        if (a > 5) {
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is less than or equal to 5");
        }
        
        // Simple ternary example
        int b = (a > 5) ? 42 : 24;
        System.out.println("b is equal to " + b);
    }
}
