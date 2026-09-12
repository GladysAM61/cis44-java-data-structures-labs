
package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */
public class triangle implements polygon{
    // creating variables 
    //getting the sides and height because to get the area of a triangle you need the height times the base
    protected double base;
    protected double side2;
    protected double side3;
    protected double height; 
    
    public triangle(double base, double side2, double side3,double height){
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }
   @Override
   //calculating the area of a normal triangle by doing (base * height) divided by 2
    public double Area() {
        return (base * height)/2;
    }

    @Override
    //getting the perimeter by adding all 3 sides 
    public double Perimeter() {
        return base + side2 + side3;
    }
            
    
}
