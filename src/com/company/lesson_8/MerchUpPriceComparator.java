package com.company.lesson_8;

import java.util.Comparator;

public class MerchUpPriceComparator implements Comparator<Merch> {
    @Override
    public int compare(Merch o1, Merch o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
