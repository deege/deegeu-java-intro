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
package com.deegeu.switches;

/**
 * This is the code for lesson 18, Java switches in the Free Java Online Course.
 * 
 * @author dspiess
 */
public class SwitchStatement {
    public static void main(String args[]) {
        char operation = '+';
        int a = 23;
        int b = 14;
        switch (operation) {
            case '+': {
                System.out.println("a + b = " + (a + b));
                break; // These are required to prevent fall-through
            }
            case '-': {
                System.out.println("a - b = " + (a - b));
                break;
            }
            case '/': {
                System.out.println("a / b = " + (a / b));
                break;
            }
            case '*': {
                System.out.println("a * b = " + (a * b));
                break;
            }
            default: { 
                // The default statement should always be included. This 
                // ensures every case is handled. 
                System.out.println("Unknown operation");
            }
        }
    }
}
