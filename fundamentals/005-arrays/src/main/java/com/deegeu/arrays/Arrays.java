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
package com.deegeu.arrays;

/**
 *
 * @author dspiess
 */
public class Arrays {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // via declaration
        int[] integerArray1 = new int[10];
        integerArray1[0] = 1;
        integerArray1[1] = 2;
        integerArray1[2] = 3;
        integerArray1[3] = 4;
        integerArray1[4] = 5;
        integerArray1[5] = 6;
        integerArray1[6] = 7;
        integerArray1[7] = 8;
        integerArray1[8] = 9;
        integerArray1[9] = 10;
        System.out.println("Array 1 is " + java.util.Arrays.toString(integerArray1));
        System.out.println("Element at position 4 is " + integerArray1[4]);
        
        // Array literals
        int[] integerArray2 = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println("Array 2 is " + java.util.Arrays.toString(integerArray2));
        System.out.println("Element at position 4 is " + integerArray2[4]);
        
        // copy array 
        integerArray2 = java.util.Arrays.copyOf(integerArray1, integerArray1.length);
        System.out.println("Array 2 is now " + java.util.Arrays.toString(integerArray2));
        
        // copy parts of array
        integerArray2 = java.util.Arrays.copyOf(integerArray1, 3);
        System.out.println("Array 2 is now " + java.util.Arrays.toString(integerArray2));
        
        integerArray2 = new int[integerArray1.length];
        System.arraycopy(integerArray1, 1, integerArray2, 2, 2);
        System.out.println("Array 2 is now " + java.util.Arrays.toString(integerArray2));
        
        // Multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix is " + java.util.Arrays.deepToString(matrix));
        System.out.println("Item at position (1, 1) is " + matrix[1][1]);
        
        // sorting arrays 
        int[] unsorted = {3, 45, 6, 123, 7, 1, 213};
        System.out.println("Unsorted array is " + 
                java.util.Arrays.toString(unsorted));
        java.util.Arrays.sort(unsorted);
        System.out.println("Sorted array is " + 
                java.util.Arrays.toString(unsorted));
        
        // fill an array
        int[] unfilled = new int[10];
        System.out.println("Unfilled array is " + 
                java.util.Arrays.toString(unfilled));
        java.util.Arrays.fill(unfilled, 1);
        System.out.println("Filled array is " + 
                java.util.Arrays.toString(unfilled));
        
        // Binary search
        int[] listToSearch = {3, 45, 6, 123, 7, 1, 213};
        System.out.println("Index of 7 is " 
                + java.util.Arrays.binarySearch(listToSearch, 7));
        java.util.Arrays.sort(listToSearch);
        System.out.println("Sorted array is " + 
                java.util.Arrays.toString(listToSearch));
        System.out.println("Index of 7 is " 
                + java.util.Arrays.binarySearch(listToSearch, 7));
    }
}
