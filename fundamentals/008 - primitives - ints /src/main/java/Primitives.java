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
 * Demonstration of the int primitive available in Java
 * @author dspiess
 */
public class Primitives {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // -2^31 to (2^31)-1
        int i = 707406378;
        int ib = 0b00101010001010100010101000101010;
        int ih = 0x2A2A2A2A;
        System.out.println("integer i = " + i);
        System.out.println("integer ib = " + ib);
        System.out.println("integer ih = " + ih);
       
        // Making numbers easier to read, you can use the underscore
        // to group byte or word ranges. This has no effect on the number, 
        // but it does make it easier to read. Any grouping will work.
        ib = 0b0010_1010_0010_1010_0010_1010_0010_1010;
        ih = 0x2A_2A_2A_2A;
        System.out.println("integer ib = " + ib);
        System.out.println("integer ih = " + ih);
        
        ih = 0x2A2A_2A2A;
        System.out.println("integer ih = " + ih);
   }
    
}
