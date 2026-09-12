package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */
public class quadrilateral implements polygon{
    //making the length and width variable for the quadrilateral
     protected double length;
     protected double width;
     
   //setting the length into length and width into width
     public quadrilateral(double length,double width){
         this.length=length;
         this.width=width;
     }
   
     //setting the area equal to length times width
      @Override
    public double Area() {
        return length * width;
    }

    //adding the length and wifht and multiplying it by 2 to get the perimeter
    @Override
    public double Perimeter() {
        return 2 * (length + width);
    }
}
