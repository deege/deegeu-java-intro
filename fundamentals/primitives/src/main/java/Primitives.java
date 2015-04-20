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
 * Demonstration of the different primitives available in Java
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
        
        // -32,768 to 32,767
        short s = 10794;
        short sb = 0b0010101000101010;
        short sh = 0x2A2A;
        System.out.println("short s = " + s);
        System.out.println("short sb = " + sb);
        System.out.println("short sh = " + sh);
        
        // -2^31 to (2^31)-1
        int i = 707406378;
        int ib = 0b00101010001010100010101000101010;
        int ih = 0x2A2A2A2A;
        System.out.println("integer i = " + i);
        System.out.println("integer ib = " + ib);
        System.out.println("integer ih = " + ih);
        
        // -2^63 to (2^63)-1
        long l = 3038287259199220266L;
        long lb = 0b0010101000101010001010100010101000101010001010100010101000101010L;
        long lh = 0x2A2A2A2A2A2A2A2AL;
        System.out.println("long l = " + l);
        System.out.println("long lb = " + lb);
        System.out.println("long lh = " + lh);
        
        float f = 1.5113662e-13f;
        System.out.println("float f = " + f);
        float f2 = 0.00000000000015113662f;
        System.out.println("float f = " + f2);
        int fh = Float.floatToRawIntBits(1.5113662e-13f);
        System.out.println(String.format("0x%8s", 
                Integer.toHexString(fh)).replace(' ', '0'));
        
        // Floating point numbers can be tricky
        float fe = 0.1f + 0.2f; 
        System.out.printf("%.16f\n", fe);
        double d = 0.1d + 0.2d;
        System.out.printf("%.17f\n", d);
        
        // True or false
        boolean bool = true;
        System.out.println("Boolean b = " + bool);
        
        // one character
        char c = 'A';
        System.out.println("character c = " + c);
        c = 65;  
        System.out.println("character c = " + c);
        c = 0x41;  
        System.out.println("character c = " + c);
        c = '☺';
        System.out.println("character c = " + c);
        System.out.println("character (as int) c = " + (int)c);
                
        // Unicode characters in names
        double π = 3.14159;
        System.out.println(π);
        
        // Making numbers easier to read
        l = 0x7fff_ffff_ffff_ffffL;
        d = 1_000_000.000_000;
   }
    
}
