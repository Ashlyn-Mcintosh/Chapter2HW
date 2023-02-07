/**
 * @Class Name: Paint
 * @Author: Ashlyn McIntosh
 * @Version: 2.0
 * @Date: 7 February 2023
 * Description: A program designed to calculate the amount of gallons and quarts are needed to paint a room.
 */

import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the height of the room: "); //user inputs the height of their room
        int h = input.nextInt();
        System.out.println("Please input the width of the room: "); //user inputs the height of their room
        int w = input.nextInt();
        System.out.println("Please input the length of the room: "); //user inputs the height of their room
        int l = input.nextInt();

        System.out.println("Number of doors in the room: "); //User inputs the numbers of doors in the room. (Ex:2 doors)
        int doors = input.nextInt();
        System.out.println("Number of windows in the room: "); //User inputs the number of windows in their room (2 windows)
        int windows = input.nextInt();
    }
//Got stuck here



    System.out.println( gallons + " Gallons and " " + quarts + Quarts are needed for the room.") //What would print out
}