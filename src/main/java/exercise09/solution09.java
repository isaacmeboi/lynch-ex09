/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Isaac Lynch
 */

package exercise09;
import java.util.Scanner;

class Paint {
    double l;
    double w;

    public void scn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ent'r length: ");
        this.w = sc.nextDouble();

        System.out.print("Ent'r width: ");
        this.l = sc.nextDouble();
    }

    public void prt() {
        double sqFGP = 350;
        double totalSq = l*w;
        int gallon = (int)Math.ceil(totalSq/sqFGP); //round to whole number

        System.out.println("Thee shall needeth to purchaseth "+gallon+" of painteth to cov'r "+totalSq+" square feet");
    }
}
public class solution09 {
        public static void main(String[] args) {

            Paint ca = new Paint();
            ca.scn();
            ca.prt();
        }
    }
/*if one is getting reformatted, they all are. this one was far easier to fix admittedly. first the
scanner function was imported. after that  a class called Dimensions is made  to store the prt and
scn public voids as well as the doubles "l" and "w" for the length and width. the "scn" void reads
in the data given by the user and then the "prt" void does the math and prints out the answers. the
final answer is rounded to the closest whole number using the math ceil function. the main function
simply calls these two public voids to run the program.

 */