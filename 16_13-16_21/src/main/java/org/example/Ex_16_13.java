package org.example;

import java.util.Scanner;
import java.util.HashSet;


public class Ex_16_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> namesSet = new HashSet<>();

        System.out.println("Enter first names (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine().trim();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            if (!name.isEmpty()) {
                namesSet.add(name);
            }
        }

        System.out.println("Unique names: " + namesSet);

        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine().trim();
        if (namesSet.contains(searchName)) {
            System.out.println(searchName + " is in the list.");
        } else {
            System.out.println(searchName + " is not in the list.");
        }

        }
}
