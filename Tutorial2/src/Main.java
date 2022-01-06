public class Main {

    final static double PI = 3.141592;
    final static int INT_MAX = 2147483647;

    public static void main(String[] args) {
        int a = 100;
        double b = 150.5;
        String c = "김영서";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("a = " + a);

        int r = 30;
        System.out.println(r * r * PI);

        int A = INT_MAX;
        A++;
        System.out.println(A);
    }
}
