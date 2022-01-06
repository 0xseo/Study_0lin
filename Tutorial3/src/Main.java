public class Main {
    public static void main(String[] args){

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        int a = 200;
        int b = 0;
        System.out.println("\n10진수: " + a);
        System.out.format("8진수: %o\n", a);
        System.out.format("16진수: %x\n", a);

        String name = "John Doe";
        System.out.println(name);
        System.out.println(name.substring(1, 3));

    }
}
