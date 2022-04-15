import java.util.Scanner;

public class LoopTask3 {
    public static void main(String[] args) {
        //task1
        int counter = 1;
        while (counter < 100) {
            System.out.println(counter);
            counter++;
        }

        //task2
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiplication = 1;
        int i = 1;
        while (i <= number) {
            multiplication *= i;
            i++;
        }
        System.out.println(number + "! = " + multiplication);
    }
}
