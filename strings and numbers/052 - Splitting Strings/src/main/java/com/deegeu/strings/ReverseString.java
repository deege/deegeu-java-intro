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
public class ReverseString {

    /**
     * Driver to test two string reverse methods
     * 
     * @param args 
     */
    public static void main(String... args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("This is test"));
        System.out.println(rs.reverseString("aba"));
        System.out.println(rs.reverseString("a"));
        System.out.println(rs.reverseString("aabb"));
        
        System.out.println(rs.reverseString2("This is test"));
        System.out.println(rs.reverseString2("aba"));
        System.out.println(rs.reverseString2("a"));
        System.out.println(rs.reverseString2("aabb"));
    }
    
    /**
     * Reverses a string in place using a character array.
     * 
     * @param s
     * @return 
     */
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int half = s.length() / 2;
        int last = s.length() - 1;
        for (int i=0; i<half; i++) {
            char temp = chars[i];
            chars[i] = chars[last - i];
            chars[last - i] = temp;
        }
        return new String(chars);
    }
       
    /**
     * Reverses a string by iterating over the string in reverse order
     * 
     * @param s
     * @return 
     */
    public String reverseString2(String s) {
        char[] chars = new char[s.length()];
        for(int index=s.length()-1; index>=0; index--) {
            chars[(s.length()-1) - index] = s.charAt(index);
        }
        return new String(chars);
    }
}
