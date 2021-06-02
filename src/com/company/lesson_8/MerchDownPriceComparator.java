package com.company.lesson_8;

import java.util.Comparator;

public class MerchDownPriceComparator implements Comparator<Merch> {
    @Override
    public int compare(Merch o1, Merch o2) {
        return Integer.compare(o2.getPrice(), o1.getPrice());
    }
}
