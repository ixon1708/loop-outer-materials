import java.util.Scanner;

public class LoopTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int power = 1;
        for (int i = 0; i < n; i++) {
            power *= x;
        }
        System.out.println(x + "^" + n + " = " + power);
    }
}
