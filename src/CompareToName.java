import Product.Products;

import java.util.Comparator;

public class CompareToName implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return o1.getMarkName().compareTo(o2.getMarkName());
    }
}
