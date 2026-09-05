/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author gladysarias
 */

// importing java.util.Random;
import java.util.Random;
import java.util.Arrays;

public class dotProduct {
  
    public static void main(String[] args) {
        System.out.println("I AM RUNNING DOT PRODUCT");
        Random random = new Random();
        //creating n
        int n = 5;
        
        
     //creating array a that will be of length n
       int[] a = new int [n];
        //for loop that makes numbers inside a array random and 1-50
     for (int i = 0; i < a.length; i++) {
           a[i] = random.nextInt(50);
        }
        //creating array b that is also length b 
       int[] b = new int[n];
        //for loop that makes numbers inside b array random and 1-50
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(50);
        }
        
        //third array that will multiply a[i]xb[i]
        int[] c = new int[n];
        //for loop that multiplies a[i] by b[i] and stores it in c[i]
        for (int i = 0; i < c.length; i++) {
           c[i]= a[i]*b[i];
        }
        //printing out all arrays usings Arrays and toString
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println("Array c: " + Arrays.toString(c));

    }
}
