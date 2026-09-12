package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */
public class equilateralTriangle extends triangle{
    //an equilateral triagle has all 3 sides the same, however it has a different area than a normal triangle 
     public equilateralTriangle(double sides,double height) {
        super(sides, sides, sides, height);
    }
     //since the area is different, we change it by overriding it
     @Override
    public double Area() {
        return (Math.sqrt(3) / 4) * base * base;
    }

}
