package exercise09;

import java.util.Scanner;

public class solution09 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double sqFGP = 350;

            System.out.print("Ent'r length: ");
            double l = sc.nextDouble();

            System.out.print("Ent'r width: ");
            double w = sc.nextDouble();

            double totalSq = l*w;

            int gallon = (int)Math.ceil(totalSq/sqFGP); //round to whole number

            System.out.println("Thee shall needeth to purchaseth "+gallon+" of painteth to cov'r "+totalSq+" squre feet");
        }
    }

/*psuedocode bb: first we import the scanner function, after creating the main function an instance of the scanner
function is made. next, we make a double set to 350 under the name "sqFPG" for the amount of sq feet a gallon of
paint covers. next the code output a statement and reads in length and does the same thing with the width. these
are saved in doubles "l" and "w" respectively. after that the total sq feet is stored in a double called "totalSq"
which multiplies the numbers given from the user. finally, we get the value for how many gallons will be needed
by dividing totalSq and sqFPG and then use the math.ceil function to round the final answer to the closest whole
number. the system then prints out all the numbers in Shakespearean.
 */