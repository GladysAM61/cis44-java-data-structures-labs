package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */

public class hexagon implements polygon{
    //one side since they are all the same side
    protected double side;
    //setting the side
    public hexagon(double side){
        this.side=side;
    }
    //the area of a hexagon is (3sqrt3)/2 * side squared
    @Override
    public double Area(){
        return (3 * Math.sqrt(3) / 2) * side * side;
    }
    
    @Override
    public double Perimeter(){
        return 6 * side;
    }
    
}
