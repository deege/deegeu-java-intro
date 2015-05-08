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
 * Demonstration of the short primitive available in Java
 * 
 * @author dspiess
 */
public class Primitives {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        // -32,768 to 32,767
        short s = 10794;
        short sb = 0b0010101000101010;
        short sh = 0x2A2A;
        System.out.println("short s = " + s);
        System.out.println("short sb = " + sb);
        System.out.println("short sh = " + sh);
              
        // Making numbers easier to read, you can use the underscore
        // to group byte or word ranges. This has no effect on the number, 
        // but it does make it easier to read.
        sb = 0b0010_1010_0010_1010;
        sh = 0x2A_2A;
        System.out.println("short sb = " + sb);
        System.out.println("short sh = " + sh);
   }
    
}
