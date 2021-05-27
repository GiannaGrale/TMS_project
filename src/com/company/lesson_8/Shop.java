package com.company.lesson_8;

import java.util.*;

public class Shop {

    MerchUpPriceComparator merchUpPriceComparator = new MerchUpPriceComparator();
    MerchDownPriceComparator merchDownPriceComparator = new MerchDownPriceComparator();

    ArrayList<Merch> goods = new ArrayList<Merch>();

    void addMerch(Merch merch) {
        for (Merch item : goods) {
            if (item.getId() == merch.getId()) {
                System.out.println("The ID already exists. Choose another one.\n");
                return;
            }
        }
        goods.add(merch);
    }

    void listMerch() {
        for (Merch object : goods) {
            System.out.println(object.getId() + " " + object.getName() + " " + object.getPrice());
        }
    }

    //additional display merch method
    ArrayList<Merch> displayMerch2() {
        for (int i = 0; i < goods.size(); i++) {
            goods.get(i);
        }
        return goods;
    }

    void deleteMerch(int id) {
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getId() == id) {
                goods.remove(i);
                System.out.println("Deleted.\n");
                return;
            }
        }
        System.out.println("Wrong ID.\n");
    }

    void editMerch(Merch merch) {
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getId() == merch.getId()) {
                goods.set(i, merch);
                System.out.println("Edited.\n");
                return;
            }
        }
        System.out.println("Wrong ID.\n");
    }

    void sortOrder() {
        for (int i = goods.size() - 1; i >= 0; i--) {
            System.out.println(goods.get(i).getId() + " " + goods.get(i).getName() + " " + goods.get(i).getPrice());

        }
    }

    void priceUpSort() {
        goods.sort(merchUpPriceComparator);
        for (Merch item : goods) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice());
        }
    }

    void priceDownSort() {
        goods.sort(merchDownPriceComparator);
        for (Merch item : goods) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice());
        }
    }
}
