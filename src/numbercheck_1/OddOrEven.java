/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbercheck_1;

/**
 *
 * @author Laksamana Zaidan
 */
import java.util.Scanner;

public class OddOrEven {

    public static void CheckOddOrEven() {
	System.out.println("Enter an Integer Number : ");
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("The number entered is an even number.");
        } else {
            System.out.println("The number entered is an odd number.");
        }
    }
}
