package com.Bean;
import java.util.Map;


public class CartBean {

    private Map <String, Integer> product;

    public CartBean() {
    }

    public Map<String, Integer> getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "product=" + product +
                '}';
    }

    public void setProduct(Map<String, Integer> product) {
        this.product = product;
    }
}
