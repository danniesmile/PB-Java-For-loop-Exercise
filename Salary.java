package loops;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openedTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int deduction = 0;

        for (int i = 1; i <= openedTabs; i++) {
            String website = scanner.nextLine();

            if (website.equals("Facebook")) {
                deduction = 150;
                salary -= deduction;
            } else if (website.equals("Instagram")) {
                deduction = 100;
                salary -= deduction;
            } else if (website.equals("Reddit")) {
                deduction = 50;
                salary -= deduction;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
