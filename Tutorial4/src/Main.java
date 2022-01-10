public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("최댓값은 " + max(x, y) + "입니다.");

        double A = Math.pow(3.0, 20.0);
        System.out.println("3의 20제곱은 " + (int) A + "입니다.");
    }

    static int max(int a, int b) {
        int result = (a > b) ? a : b; // 조건이 참이면 앞을, 거짓이면 뒤를 반환
        return result;
    }
}
