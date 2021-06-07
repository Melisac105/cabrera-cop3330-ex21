package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getNum() {
        System.out.print("Please enter the number of the month: ");
        return input.nextInt();
    }
}
