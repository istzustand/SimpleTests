/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldenapple.simpletests;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author istzustand
 */
public class SimpleTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer max = 1000;
        List<Object> Liste = new ArrayList<Object>();
        String test;
        for (int x = 0; x<max; x++) {
            Liste.add(new Object());
            if(x%2 == 0) {
                test = x  + " : " + Liste.get(x).Value;
                System.out.println(test);
            }
        }
        
        
        
                
        
                ;
    }
    
}
