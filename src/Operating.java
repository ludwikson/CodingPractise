public class Operating {

    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        int c = 0;
        int d = 4;

        System.out.println(division(a, b));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {

        if (b == 0) {
            System.out.println("Never divide by 0, you moron.");
            return -1;
        }

        else
            return a / b;


    }

}

