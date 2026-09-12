package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */
public class octagon implements polygon{
    //an octagon has all same sides so im making just one side
    private double side;

    public octagon(double side) {
        this.side = side;
    }

    //the area is 2(1+sqrt2)*the side squared
    @Override
    public double Area() {
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }

    //the perimeter is all sides added so i just multiplied it by 8
    @Override
    public double Perimeter() {
        return 8 * side;
    }
}
