/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.generics;

import java.util.List;

/**
 *
 * @author dspiess
 * @param <I>
 */
public class GameBoard<I extends Number & List & Runnable> {
    I xPos;
    I yPos;
    
    public I getXPos() {
        return this.xPos;
    }
    
    public I getYPos() {
        return this.yPos;
    }
}



