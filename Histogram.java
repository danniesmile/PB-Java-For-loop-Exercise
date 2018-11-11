package loops;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1++;
            }
            if (num >= 200 && num <= 399) {
                p2++;
            }
            if (num >= 400 && num <= 599) {
                p3++;
            }
            if (num >= 600 && num <= 799) {
                p4++;
            }
            if (num >= 800) {
                p5++;
            }
        }

        double p1Percent = p1 / n * 100;
        double p2Percent = p2 / n * 100;
        double p3Percent = p3 / n * 100;
        double p4Percent = p4 / n * 100;
        double p5Percent = p5 / n * 100;

        System.out.printf("%.2f%%\n", p1Percent);
        System.out.printf("%.2f%%\n", p2Percent);
        System.out.printf("%.2f%%\n", p3Percent);
        System.out.printf("%.2f%%\n", p4Percent);
        System.out.printf("%.2f%%", p5Percent);

    }
}
