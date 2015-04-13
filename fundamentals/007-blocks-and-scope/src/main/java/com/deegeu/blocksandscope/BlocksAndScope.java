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
package com.deegeu.blocksandscope;

/**
 *
 * @author dspiess
 */
public class BlocksAndScope {
    public static void main(String[] args) {
        
        // These statements are in the main method scope
        System.out.println("This is IN the main method scope.");
        int i = 42;
        System.out.println("Integer i equals " + i);
        boolean b = true;  
        
        // Demonstration of inside and outside blocks
        if (b) {
            System.out.println("This is IN the true block for the if-then.");
        } else {
            System.out.println("This is IN the false block for the if-then.");
        }
        System.out.println("This is OUT of the block for the if-then.");
        
        // Demonstration of scope
        if (b) {
           int k = 24;
           System.out.println("Integer i equals " + i);
           System.out.println("Integer k equals " + k);
        }
        // System.out.println("Integer k equals " + k);  // FAILS!
        
        
        // Demonstration of an empty block
        { }
        
        // unnamed scopes
        {
            int j = 100;
            System.out.println("Integer j equals " + j);
        }
        // System.out.println("Integer j equals " + j); // FAILS!
    }
}
