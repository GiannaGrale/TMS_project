package com.company.lesson_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopMenu {

    void start() {
        Shop shop = new Shop();

        shop.addMerch(new Merch(1, "T-shirt", 300));
        shop.addMerch(new Merch(2, "Skirt", 500));
        shop.addMerch(new Merch(3, "Shoes", 900));
        shop.addMerch(new Merch(4, "Pullover", 600));
        shop.addMerch(new Merch(5, "Jacket", 800));
        shop.addMerch(new Merch(6, "Socks", 100));

        boolean active = true;
        while(active) {
        System.out.println("Choose option:\n "
                + "-------------------------\n"
                + "1 - Display the merch\n"
                + "2 - Add item\n"
                + "3 - Delete item \n"
                + "4 - Edit item\n"
                + "5 - Exit\n");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shop.listMerch();
                    System.out.println("Insert 6 to choose prices in ascending order.\n"
                            + "Insert 7 to choose prices in descending order.\n"
                            + "Insert 8 to choose the latest items.");
                    choice = scanner.nextInt();
                    if (choice == 6) {
                        shop.priceUpSort();

                    } else if (choice == 7) {
                        shop.priceDownSort();

                    } else if (choice == 8) {
                        shop.sortOrder();
                    }
                    break;

                case 2:
                    System.out.println("Insert the ID, name and price of the added item: ");
                    try {
                        shop.addMerch(new Merch(scanner.nextInt(), scanner.next(), scanner.nextInt()));
                        shop.listMerch();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        System.out.println("Input error. Try again!");
                    }
                    break;

                case 3:
                    System.out.println("Insert the ID of the item to be deleted: ");
                    try {
                        shop.deleteMerch(scanner.nextInt());
                        shop.listMerch();

                    } catch (Exception ex) {
                        ex.printStackTrace();
                        System.out.println("Input error. Try again!");
                    }
                    break;

                case 4:
                    System.out.println("Insert the ID of the item to be edited: ");
                    try {
                        shop.editMerch(new Merch(scanner.nextInt(), scanner.next(), scanner.nextInt()));
                        shop.listMerch();
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Input error. Try again!");
                    }
                    break;

                case 5:
                    active = false;
                    System.out.println("Exit the system...");
                    break;

                default:
                    active = false;
                    System.out.println("Ops, something is wrong. Try again!");
                    break;
            }
        }
    }
}