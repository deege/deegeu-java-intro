/*
 * The MIT License
 *
 * Copyright 2016 DJ Spiess and DeegeU.com.
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
package com.deegeu.strings;

/**
 * Demonstrates reversing a string using character arrays, and the 
 * charAt method. This code accompanies the DeegeU.com video tutorial 
 * 052 - Splitting Strings.
 * 
 * @author deege
 */
public class StopWords {
    
    /**
     * Driver to test two string remove stop word methods
     * 
     * @param args 
     */
    public static void main(String... args) {
        String full = "The quick brown fox jumped over the lazy dog";
        StopWords stops = new StopWords();
        System.out.println(stops.removeStops(full.toLowerCase()));
        System.out.println(stops.removeStops2(full.toLowerCase()));
    }
    
    /**
     * Removes the stop word "the" from the string.
     * 
     * Splits the string into words. Then rebuilds the string, skipping the 
     * word "the".
     * 
     * @param s
     * @return 
     */
    public String removeStops(String s) {
        String[] array = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String current : array) {
            if (!"the".equals(current)) {
                builder.append(current).append(" ");
            }
        }
        return builder.toString();
    }
    
    /**
     * Removes the stop word "the" from the string.
     * 
     * Splits the string into words. Breaks on the word "the", and then just 
     * reassembles the string.
     * 
     * @param s
     * @return 
     */
    public String removeStops2(String s) {
        String[] array = s.split("the");
        StringBuilder builder = new StringBuilder();
        for (String current : array) {        
            builder.append(current).append(" ");
        }
        return builder.toString();
    }
}
