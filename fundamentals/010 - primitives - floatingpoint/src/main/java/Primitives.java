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

        float f = 1.5113662e-13f;
        System.out.println("float f = " + f);
        float f2 = 0.00000000000015113662f;
        System.out.println("float f = " + f2);
        
        double d = 1.5113662e-13d;
        System.out.println("double d = " + d);
        double d2 = 0.000000000000015113662d;
        System.out.println("double d2 = " + d2);
        
        
        int fh = Float.floatToRawIntBits(1.5113662e-13f);
        System.out.println(String.format("0x%8s", 
                Integer.toHexString(fh)).replace(' ', '0'));
        
        // Floating point numbers can be tricky
        float fe = 0.1f + 0.2f; 
        System.out.printf("%.16f\n", fe);
        double de = 0.1d + 0.2d;
        System.out.printf("%.17f\n", de);
        
        
        // Making numbers easier to read
        f = 1_000_000.000_000f;
        d = 1_000_000.000_000;
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
   }
    
}
