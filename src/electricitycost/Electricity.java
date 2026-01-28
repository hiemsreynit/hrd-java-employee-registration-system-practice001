package electricitycost;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int electricityUsage;
        float electricityCost;

        System.out.println("=".repeat(40));
        System.out.println("ELECTRICITY COST PER MONTH");
        System.out.println("=".repeat(40));

        System.out.print("Enter your monthly electricity usage: ");
        electricityUsage = input.nextInt();

        electricityCost = (electricityUsage > 0 && electricityUsage <= 50) ? 1500.0f : 2000.0f;
        float total = electricityUsage * electricityCost;

        System.out.println("ELECTRICITY USAGE PER MONTH: " + electricityUsage);
        System.out.println("ELECTRICITY COST PER MONTH: " + total + "KHR");
        System.out.println("=".repeat(40));

    }
}

