package loops;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int couples = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int lastSum = 0;
        int counter = 0;
        int maxDiff = 1;

        for (int i = 1; i <= couples; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            sum = a + b;

            if (sum == lastSum) {
                counter++;
            }
            if (maxDiff < Math.abs(lastSum - sum) && i >= 2) {
                maxDiff = Math.abs(lastSum - sum);
            }
            if (sum != lastSum) {
                lastSum = sum;
            }
        }
        if (counter == couples - 1) {
            System.out.println("Yes, value=" + sum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }

    }
}
