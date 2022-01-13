public class Main {

    final static int N = 30;

    public static void main(String[] args) {
        String a = "Man";
        if (a.equals("Man")) { System.out.println("Yes"); } // string 비교
        if (a.equalsIgnoreCase("man")) { System.out.println("Yes"); } // 대소문자 무시 string 비교

        int i = 1, sum = 0;
        while (i <= 1000) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        for (int j = N; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();


        for (int k = -15; k <= 15; k++) {
            for (int j = -15; j <= 15; j++) {
                if (k * k + j * j <= 15 * 15) {
                    System.out.print("*");
                }
                else { System.out.print(" "); }
            }
            System.out.println();
        }
    }
}
