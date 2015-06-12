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
package com.deegeu.whileloops;

/**
 * This is the code for lesson 19, Java while loops in the Free Java Online Course.
 * 
 * @author dspiess
 */
public class WhileStatements {
    public static void main(String args[]) {
        
        // Simple while loop
        System.out.println("--------------- Simple while loop -----------------");
        int temperature = 21;
        while (temperature < 30) {         
            temperature = temperature + 1;           
            System.out.println("Temperature is a cool " + temperature);
        }
        System.out.println("Temperature is not comfortable");
        
        // Simple do while loop
        System.out.println("--------------- Simple do while loop --------------");
        temperature = 21;
        do {           
            temperature = temperature + 1;           
            System.out.println("Temperature is a cool " + temperature);
        } while (temperature < 30);
        System.out.println("Temperature is not comfortable");
        
        // while with break at 23.
        System.out.println("----------- Simple while loop w/ break ------------");
        temperature = 21;
        while (temperature < 30) {
            
            temperature = temperature + 1;           
            if (temperature == 23) {
                break;
            }
            System.out.println("Temperature is a cool " + temperature);
          
        }
        System.out.println("Temperature is not comfortable");
        
        // While with continue at 23. This will print all temperatures except
        // 23.
        System.out.println("--------- Simple while loop w/ continue -----------");
        temperature = 21;
        while (temperature < 30) {            
            temperature = temperature + 1;           
            if (temperature == 23) {
                continue;
            }
            System.out.println("Temperature is a cool " + temperature);          
        }
        System.out.println("Temperature is not comfortable");
        
    }
}
