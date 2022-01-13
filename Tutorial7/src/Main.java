import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수: ");
        int i = sc.nextInt();
        System.out.println(i);

        File file = new File("input.txt");
        try {
            Scanner sc2 = new Scanner(file);
            while (sc2.hasNextInt()) {
                System.out.println(sc.nextInt() * 100);
            }
            sc2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error No File");
        }

    }
}
