public class Year {
    public static void main(String[] args) {
        int year = 2100;
        String result = "";

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
           result = "윤년";
            } else {
            result = "평년";
        }
        System.out.println(result);
    }
}
