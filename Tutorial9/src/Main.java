public class Main {

    public static int function(int number, int k) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static char word(String input) {
        return input.charAt(input.length() - 1);
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max3(int a, int b, int c) {
        return(max(max(a, b), c));
    }
    public static void main(String[] args) {
        int result = function(3050, 10);
        System.out.println(result);
        System.out.println(word("Hello World"));
        System.out.println(max3(10, 20, 5));
    }
}
