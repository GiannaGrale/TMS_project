package com.company.lesson_8;

public class Main {
    public static void main(String[] args) {
        // shop_menu
        ShopMenu shopRun = new ShopMenu();
        shopRun.start();

        // shop with methods
        Shop shop = new Shop();

        shop.addMerch(new Merch(1, "T-shirt", 300));
        shop.addMerch(new Merch(2, "Skirt", 500));
        shop.addMerch(new Merch(3, "Shoes", 900));
        shop.addMerch(new Merch(4, "Pullover", 600));
        shop.addMerch(new Merch(5, "Jacket", 800));
        shop.addMerch(new Merch(6, "Socks", 100));
        shop.listMerch();
        System.out.println("\n");
        shop.deleteMerch(3);
        shop.editMerch(new Merch(1, "Sport shoes", 700));
        shop.editMerch(new Merch(2, "Trousers", 800));

        shop.sortOrder(); //method for first added and first displayed
        System.out.println("\n");
        shop.priceDownSort();
        System.out.println("\n");
        shop.priceUpSort();
        System.out.println("\n");
        //  System.out.println(shop.displayMerch2()); //additional display method call
    }
}
