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

/**
 * Demonstration of the byte primitive available in Java
 * 
 * @author dspiess
 */
public class Primitives {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // -128 to 127
        byte b = 42;
        byte bb = 0b00101010;
        byte bh = 0x2A;
        System.out.println("byte b = " + b);
        System.out.println("byte bb = " + bb);
        System.out.println("byte bh = " + bh);
        
                
        // Making numbers easier to read, you can use the underscore
        // to group byte ranges. This has no effect on the number, but
        // it does make it easier to read.
        bb = 0b0010_1011;
        System.out.println("byte bb = " + bb);
        
        // This will not fit into a byte. Uncomment to see.  The
        // reason is the literal you assign is converted to a
        // unsigned decimal number.  It is NOT a 2's complement number.
        // If you want a number like -128, you'll need to represent it
        // as a negative number like bb, listed below the commented out
        // byte.
        // b = 0b1000_0000;
        bb = -0b1000_0000;
        System.out.println("byte bb = " + bb);
        
        // If you want to print out a binary number as as string,
        // use the following code. 
        System.out.println("byte bb = " + Integer.toBinaryString(0xff & bb));
   }
    
}
