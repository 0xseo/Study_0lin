import java.util.Scanner;

public class Main {
    public static int function(int a, int b, int c) {
        int min;
        if (a > b) {
            if (c > b) { min = b; }
            else { min = c; }
        }
        else {
            if (a > c) { min = c; }
            else { min = a; }
        }
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최대 공약수를 찾을 세 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + ", " + b + ", " + c + "의 최대 공약수: " + function(a, b, c));

    }
}
