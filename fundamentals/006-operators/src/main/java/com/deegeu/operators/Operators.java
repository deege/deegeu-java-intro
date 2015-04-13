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
package com.deegeu.operators;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dspiess
 */
public class Operators {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // unary - only one argument
        System.out.println("Unary examples");
        int i = +1;
        System.out.println("+i is equal to " + i);
        i = -1;
        System.out.println("-i is equal to " + i);

        // postfix
        i = 0;
        System.out.println("Postfix i-- is equal to " + i++);
        System.out.println("After postfix i is equal to " + i);
        
        System.out.println("Postfix i-- is equal to " + i--);
        System.out.println("After postfix i is equal to " + i);
        
        boolean b = true;
        System.out.println("b is " + b);
        System.out.println("Not b is " + !b);
         
        // unary not
        int ih = 0x2A2A2A2A;
        System.out.println("ih is " + Integer.toBinaryString(ih));
        ih = ~ih;
        System.out.println("Unary not ih is " + Integer.toBinaryString(ih));
        
        // multiplicative
        int ia = 7;
        int ib = 6;
        int ic = ia * ib;
        System.out.println("7 multiplied by 6 equals " + ic);
        ic = ic / ib;
        System.out.println("42 divided by 6 equals " + ic);
        ic = 43 % 6;
        System.out.println("43 modulus 6 equals " + ic); 
        
        // additive
        ic = ia + ib;
        System.out.println("7 plus 6 equals " + ic);
        ic = ia - ib;
        System.out.println("7 minus 6 equals " + ic);
        
        // shift
        int shift = 1;
        System.out.println("Left shift 0 = " + Integer.toBinaryString(shift));
        shift = shift << 1;
        System.out.println("Left shift 1 = " + Integer.toBinaryString(shift));
        shift <<= 1;
        System.out.println("Left shift 2 = " + Integer.toBinaryString(shift));
        shift <<= 1;
        System.out.println("Left shift 3 = " + Integer.toBinaryString(shift));
          
        shift = 128;
        System.out.println("Right shift 0 = " + Integer.toBinaryString(shift));
        shift = shift >> 1;
        System.out.println("Right shift 1 = " + Integer.toBinaryString(shift));
        shift >>= 1;
        System.out.println("Right shift 2 = " + Integer.toBinaryString(shift));
        shift >>= 1;
        System.out.println("Right shift 3 = " + Integer.toBinaryString(shift));
        
        shift = -128;
        System.out.println("Right shift 0 = " + Integer.toBinaryString(shift));
        shift >>= 1;
        System.out.println("Right shift 1 = " + Integer.toBinaryString(shift));
        shift >>= 1;
        System.out.println("Right shift 2 = " + Integer.toBinaryString(shift));
        shift >>= 1;
        System.out.println("Right shift 3 = " + Integer.toBinaryString(shift));
        
        shift = -128;
        System.out.println("Right shift 0 = " + Integer.toBinaryString(shift));
        shift = shift >>> 1;
        System.out.println("Right shift 1 = " + Integer.toBinaryString(shift));
        shift >>>= 1;
        System.out.println("Right shift 2 = " + Integer.toBinaryString(shift));
        shift >>>= 1;
        System.out.println("Right shift 3 = " + Integer.toBinaryString(shift));
        
        // relational
        
        // equality
        
        // bitwise AND
        
        // bitwise exclusive OR
        
        // bitwise inclusive OR
        
        // logical AND
        
        // logical OR
        
        // ternary
        
        // assignment
    }
}
