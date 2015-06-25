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
package com.deegeu.classes;

/**
 * This is the code for lesson 23, Java class vs objects in the Free Java Online Course.
 * 
 * @author dspiess
 */
public class ObjectsApplication {
    public static void main(String args[]) {
        
       // Define a Duck
       Duck myDuck;
       
       // myDuck is initially set to null.  So we should
       // create a value for it. We can't use it otherwise
       myDuck = new Duck();
       
       // We can also create a raft of ducks (not a flock until they are 
       // airborne)
       Duck myDuck2 = new Duck();
       Duck myDuck3 = new Duck();
       Duck myDuck4 = new Duck();
       Duck myDuck5 = new Duck();
       
       // If we print out myDuck, we get the object id for the object
       System.out.println("The myDuck object equals " + myDuck);
       
       // Now if we create a new Duck, the last object is gone. 
       myDuck = new Duck();
       System.out.println("The myDuck object equals " + myDuck); 
    }
}
