package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */
public class pentagon implements polygon{
    //in order to get the area of a regular pentagon, we need the length and height since it is just 5 * the area of a triangle
    //also all sides are the same
    protected double length;
    protected double height;
    
    //setting the height and length
    public pentagon(double length,double height){
        this.height=height;
        this.length=length;
        
    }
    
    //setting the area equal to 5 * the area of a triangle
      @Override
    public double Area() {
        return 5 * ((length*height)/2);
    }

    //adding the length and wifht and multiplying it by 2 to get the perimeter
    @Override
    public double Perimeter() {
        return 5 * length;
    } 
    
}
