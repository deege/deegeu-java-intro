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
package com.deegeu.javaoperators;

/**
 *
 * @author dspiess
 */
public class Operators {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 4;
    
        // Equality and relational operators
        System.out.println("---------------- Equality and relational ---------");
        System.out.println("Equals is " + (a == b));
        System.out.println("Not equals is " + (a != b));
        System.out.println("Greater than is " + (a > b));
        System.out.println("Greater than or equals is " + (a >= b));
        System.out.println("Less than is " + (a < b));
        System.out.println("Less than or equals is " + (a <= b));
        
        
        // Conditional operators 
        System.out.println("------------------ Conditional -------------------");
        boolean testA = true;
        boolean testB = true;
        System.out.println("A AND B is " + (testA && testB));
        System.out.println("A OR  B is " + (testA || testB));
        System.out.println("Not A is " + (!testA));
        
        // Long conditional operator. This is hard to read because it's not
        // clear what operators should be grouped. A better approach would be
        // to use parentheses or split the tests up on each line
        boolean longTest = (4 > 3) && testA || testB && !(a < 4);
        
        // Bitwise Operators
        System.out.println("----------------- Bitwise operators ---------------");
        a = -1; // All bits are set w/ -1
        b = 0;  // All bits are clear with zero
        
        
        // bitwise AND (&)
        int result = a & b;
        System.out.println("a AND b  = " + String.format("%32s", 
                Integer.toBinaryString(result)).replace(' ', '0'));
        
        // bitwise OR (|)
        result = a | b;
        System.out.println("a OR  b  = " + String.format("%32s", 
                Integer.toBinaryString(result)).replace(' ', '0'));
        
        // bitwise XOR (^)
        result = a ^ b;
        System.out.println("a XOR b  = " + String.format("%32s", 
                Integer.toBinaryString(result)).replace(' ', '0'));
        
        // bitwise not a
        System.out.println("not a    = " + String.format("%32s", 
                Integer.toBinaryString(~a)).replace(' ', '0'));
        
        // If you XOR a number twice with the same number, you'll get the original
        // value back.
        a = 42;
        b = 24;
        result = a ^ b;
        System.out.println("42 XOR 24  = " + String.format("%32s", 
                Integer.toBinaryString(result)).replace(' ', '0') + " = " + result);
        result = result ^ b;
        System.out.println("50 XOR 24  = " + String.format("%32s", 
                Integer.toBinaryString(result)).replace(' ', '0') + " = " + result);   
        
        
        System.out.println("----------------- Bit-shift operators -------------");
        
        // Shift left
        a = 0x0FFFFFF0;
        b = 0xFFFFFFF0;
        System.out.println("a   = " + String.format("%32s", 
                Integer.toBinaryString(a)).replace(' ', '0'));
        a = a << 1;       
        System.out.println("a   = " + String.format("%32s", 
                Integer.toBinaryString(a)).replace(' ', '0'));

        System.out.println("b   = " + String.format("%32s", 
                Integer.toBinaryString(b)).replace(' ', '0'));
        b = b << 1;
        System.out.println("b   = " + String.format("%32s", 
                Integer.toBinaryString(b)).replace(' ', '0'));
        
        // Shift right
        a = 0x0FFFFFF0;
        b = 0xFFFFFFF0;
        System.out.println("a   = " + String.format("%32s", 
                Integer.toBinaryString(a)).replace(' ', '0'));
        a = a >> 1;       
        System.out.println("a   = " + String.format("%32s", 
                Integer.toBinaryString(a)).replace(' ', '0'));

        System.out.println("b   = " + String.format("%32s", 
                Integer.toBinaryString(b)).replace(' ', '0'));
        b = b >> 1;
        System.out.println("b   = " + String.format("%32s", 
                Integer.toBinaryString(b)).replace(' ', '0'));
        
        
        // Unsigned shift right
        a = 0x0FFFFFF0;
        b = 0xFFFFFFF0;
        System.out.println("a   = " + String.format("%32s", 
                Integer.toBinaryString(a)).replace(' ', '0'));
        a = a >>> 1;       
        System.out.println("a   = " + String.format("%32s", 
                Integer.toBinaryString(a)).replace(' ', '0'));

        System.out.println("b   = " + String.format("%32s", 
                Integer.toBinaryString(b)).replace(' ', '0'));
        b = b >>> 1;
        System.out.println("b   = " + String.format("%32s", 
                Integer.toBinaryString(b)).replace(' ', '0'));
        
        
    }
}
