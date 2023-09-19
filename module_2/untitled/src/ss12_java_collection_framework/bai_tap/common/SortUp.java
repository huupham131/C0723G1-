package ss12_java_collection_framework.bai_tap.common;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.Comparator;

public class SortUp implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
