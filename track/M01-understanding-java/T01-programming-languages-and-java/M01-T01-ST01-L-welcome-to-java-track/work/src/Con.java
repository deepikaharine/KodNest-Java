public class Con {
    public static void main(String[] args) {
        // IF
        int a = 20;
        if (a > 10) {
            System.out.println("a is greater");
        }

        // IF - ELSE
        int num = -8;
        if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        // IF - ELSE IF
        int num1 = 0;
        if (num1 > 0) {
            System.out.println("positive");
        } else if (num1 < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }
}
