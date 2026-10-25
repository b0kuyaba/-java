package class1;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("SU MO TU WE TH FR SA");

        System.out.print(" ".repeat(n*3));

        for (int day = 1; day <= d; day++ ) {
            if (day < 10) {
                System.out.print(" ");
            }
            System.out.print(day + " ");

            if ((n + day) % 7 == 0) {
                System.out.println();
            }
        }
        if ((n + d) % 7 != 0) {
            System.out.println();
        }
    }
}
