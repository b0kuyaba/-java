import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력:");
        int num1 = sc.nextInt();

        int sum = 0;
        while(num1 > 0) {
            sum += num1 % 10;
            num1 /= 10;
        }
        System.out.println("자릿수의 합: " + sum);
    }
}
