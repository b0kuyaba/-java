import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String result;

        for (int i = 1; i <= num1; i++) {
            int num2 = i;
            int count = 0;

            while(num2 > 0) {
                if (num2 % 10 == 3 || num2 % 10 == 6 || num2 % 10 == 9) {
                    System.out.print("짝");
                    count ++;
                }
                num2 /= 10;
            }

            if (count == 0) {
                System.out.print(i);
            }

            System.out.print(" ");
        }


    }
}
