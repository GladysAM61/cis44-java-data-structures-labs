package com.mycompany.lab2;

/**
 *
 * @author gladysarias
 */
import java.util.Scanner;

public class userCreation {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     //prompting the user to pick what polygon they want
     System.out.println("Hello! Please choose a number to pick a polygon:");
     System.out.println("Triangle : 1 ");
     System.out.println("Isosceles Triangle: 2");
     System.out.println("Equilateral Triangle: 3");
     System.out.println("Quadrilateral: 4");
     System.out.println("Rectangle: 5");
     System.out.println("Square: 6");
     System.out.println("Pentagon: 7");
     System.out.println("Hexagon: 8");
     System.out.println("Octagon: 9");
     
    int userChoice = input.nextInt();
 
    polygon polygon = null;
    
     //if the user picks 1,then asking the, for a base and length and side 2 and 3
     if (userChoice == 1) {
         System.out.print("Enter base: ");
         double base = input.nextDouble();
         System.out.print("Enter side 2: ");
         double side2 = input.nextDouble(); 
         System.out.print("Enter side 3: ");
         double side3 = input.nextDouble();
         System.out.print("Enter height: ");
         double height = input.nextDouble(); 
         polygon = new triangle(base, side2, side3, height);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
     }
     //if their choice is 2,then creating a Isosceles Triangle
     else if(userChoice == 2){
         System.out.print("Enter base: ");
         double base = input.nextDouble();
         System.out.print("Enter side: ");
         double side = input.nextDouble(); 
         System.out.print("Enter height: ");
         double height = input.nextDouble();
         polygon = new isoscelesTriangle(base, side, height);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
     }
    
     //if their choice is 3, then creating an equilateral triangle
     else if(userChoice == 3){
         System.out.print("Enter side: ");
         double side = input.nextDouble();
         System.out.print("Enter height: ");
         double height = input.nextDouble();
         polygon = new equilateralTriangle(side, height);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
     }
     
     //if their choice is 4, then creating an Quadrilateral
      else if(userChoice == 4){
         System.out.print("Enter length: ");
         double length = input.nextDouble();
         System.out.print("Enter width: ");
         double width = input.nextDouble();
         polygon = new quadrilateral(length, width);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
      }
     
     //if their choice is 5, then creating a rectangle
      else if(userChoice == 5){
         System.out.print("Enter length: ");
         double length = input.nextDouble();
         System.out.print("Enter width: ");
         double width = input.nextDouble();
         polygon = new rectangle(length, width);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
      }
     //if their choice is 6, then creating a square
      else if(userChoice == 6){
         System.out.print("Enter a side: ");
         double side = input.nextDouble();
         polygon = new square(side);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
      }
     //if their choice is 7, then creating a pentagon
      else if(userChoice == 7){
         System.out.print("Enter a length: ");
         double length = input.nextDouble();
         System.out.print("Enter a widht: ");
         double width = input.nextDouble();
         polygon = new pentagon(length,width);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
      }
      //if their choice is 8, then creating a hexagon
      else if(userChoice == 8){
         System.out.print("Enter a side: ");
         double side = input.nextDouble();
         polygon = new hexagon(side);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
      }
      else{
         System.out.print("Enter a side: ");
         double side = input.nextDouble();
         polygon = new octagon(side);
         //printing out the area and perimeter
        System.out.println("Area: " + polygon.Area());
        System.out.println("Perimeter: " + polygon.Perimeter());
      }
     
    }
    
}
