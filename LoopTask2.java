import java.util.Scanner;

public class LoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiplication = 1;
        for (int i = 1; i <= number; i++) {
            multiplication *= i;
            // хотя и одно и то же, но детям понятнее так:
            // multiplication = multiplication * i;
        }
        System.out.println(number + "! = " + multiplication);
    }
}
