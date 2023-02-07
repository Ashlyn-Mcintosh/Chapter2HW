/**
 * @Class Name: Cylinder
 * @Author: Ashlyn McIntosh
 * @Version: 3.0
 * @Date: 7 February 2023
 * Description: A program designed to calculate the base area and volume of a cylinder
 * given the radius of the base circle and length of the cylinder.
 */

import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseArea,volume,pi;
        System.out.print("Enter the radius and length of a cylinder: ");
        pi =  3.1416; //Pi for multiplying
        double radius = input.nextDouble();
        double length = input.nextDouble();

        baseArea = radius * radius * pi;
        volume = baseArea * length;
        System.out.println("The Base area is: " + baseArea); //Program will print out the Base area based on radius^2 time pi
        System.out.print("The Volume is: " + volume); //Program will print out the volume based on the area x length
    }

}