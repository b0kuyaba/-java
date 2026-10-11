import java.util.Scanner;

public class Tnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 수 입력");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("가장 큰 수: " + a);
        System.out.println("중간 수: " + b);
        System.out.println("가장 작은 수: " + c);

        sc.close();

    }
}
