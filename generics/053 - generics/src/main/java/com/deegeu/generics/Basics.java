package com.deegeu.generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Basics {
    public static void main( String[] args ) {
        createArrayList();
        typeDifferences();
        typeErasure();
    }

    static public void createArrayList() {
        // This doesn't quite work because we're not telling Java the type our
        // array holds. So we can add anything. Behind the scenes, there is no
        // 
        ArrayList listOne = new ArrayList();
        listOne.add("some string");
        listOne.add(new Sprite());
        listOne.add(2.0f);           // This works because of autoboxing. It's really a Float
        System.out.println("List one: " + Arrays.toString(listOne.toArray()));
        
        // This only holds a list of sprites. This might show warnings in your
        // editor, since the second Sprite type is redundant.
        ArrayList<Sprite> listTwo = new ArrayList<Sprite>();
        // listTwo.add("some string");  // THIS WON'T COMPILE because it's not a Sprite
        listTwo.add(new Sprite());
        // listTwo.add(2.0f);           // THIS WON'T COMPILE because it's not a Sprite
        System.out.println("List two: " + Arrays.toString(listTwo.toArray()));
        
        // This only holds a list of sprites. It also uses the diamond operator (<>)
        // instead of listing Sprite again.
        ArrayList<Sprite> listThree = new ArrayList<>();
        listThree.add(new Sprite());
        System.out.println("List three: " + Arrays.toString(listThree.toArray()));
        
    }
    
    static public void typeDifferences() {
        ArrayList rawList = new ArrayList();
        ArrayList<Object> objectList = new ArrayList<>();
        ArrayList<Sprite> spriteList = new ArrayList<>();
        
        // Here we're adding a string to a raw list. We can add any instance to
        // a raw list. And we can pass the raw list to the method expecting a
        // sprite. That's bad. It will throw an exception in all three calls.
        rawList.add("test");
        draw(rawList);
        draw2(rawList);
        draw3(rawList);
        
        // Here we're adding a string to an object list. We can add a string, because
        // a string is an object. We cannot pass an object list to a method that
        // expects a sprite list, even though sprites are a child class of object.
        objectList.add("test");
        // draw(objectList);      // THIS WON'T COMPILE
        draw2(objectList);
        draw3(objectList);
        
        // Here we're adding a sprite to our sprite list, and sending it to
        // a method that expects a sprite list. We can pass the list to a method
        // expecting a raw list, but not an object list.
        spriteList.add(new Sprite());
        draw(spriteList);      
        draw2(spriteList);
        // draw3(spriteList);     // THIS WON'T COMPILE
        
        System.out.println("Rawlist class is " + rawList.getClass());
        System.out.println("ObjectList class is " + objectList.getClass());
        System.out.println("SpriteList class is " + spriteList.getClass());

        System.out.println("SpriteList class is equal to RawList: " 
                + (spriteList.getClass() == rawList.getClass()));
        System.out.println("SpriteList class is equal to ObjectList: " 
                + (spriteList.getClass() == objectList.getClass()));
    }
    
    static private void draw(ArrayList<Sprite> theList) {
        try {
            Sprite item = theList.get(0);
        } catch (Exception e) {
            System.out.println("draw() exception thrown: " + e);
        }
    }
    
    static private void draw2(ArrayList theList) {
        try {
            Sprite item = (Sprite) theList.get(0);
        } catch (Exception e) {
            System.out.println("draw2() exception thrown: " + e);
        }
    }
    
    static private void draw3(ArrayList<Object> theList) {
        try {
            Sprite item = (Sprite) theList.get(0);
        } catch (Exception e) {
            System.out.println("draw3() exception thrown: " + e);
        }
    }
    
    static private void typeErasure() {
        ArrayList<Sprite> spriteList = new ArrayList<>();
        ArrayList rawList = spriteList;   
        // ArrayList<Object> objectList = (ArrayList<Object>) spriteList; // THIS WON'T COMPILE
        
        rawList.add("Test"); 
        // Sprite spriteOne = spriteList.get(0); // RUNTIME EXCEPTION
        

        
    }

    public class A {} 
    public class B extends Sprite { }
}
