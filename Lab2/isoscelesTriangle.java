package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */
public class isoscelesTriangle extends triangle{
    //an isosceles triangle has 2 equal sides(other than the base) so we give side2 and side3 the same side
     public isoscelesTriangle(double base, double sameSide, double height) {
        super(base, sameSide, sameSide, height);
    }
}
