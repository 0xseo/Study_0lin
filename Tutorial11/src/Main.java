import java.util.Scanner;

public class Main {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("생성할 배열의 크기를 입력하세요.");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for(int i = 0; i < number; i++) {
            System.out.print("정수 입력");
            array[i] = scanner.nextInt();
        }
    }
}
