package tsk_rto;

import java.util.Scanner;

public class Rto_Eligiblity {
    void check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if (age < 18 || age > 75) {
            if (age > 75) {
                System.out.println("Your age is above 75, you are not eligible for licence");
            } else {
                System.out.println("Wait for " + (18 - age) + " years for licence");
            }
        } else {
            System.out.println("You are eligible for licence");
        }
        sc.close();
    }
}
