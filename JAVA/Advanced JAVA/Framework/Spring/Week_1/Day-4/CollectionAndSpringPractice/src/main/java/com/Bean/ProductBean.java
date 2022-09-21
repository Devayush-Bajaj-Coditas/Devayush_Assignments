package com.Bean;

import java.util.List;

public class ProductBean {
    ProductBean product;
    List<String> companies;

    public ProductBean() {
    }

    public ProductBean getProduct() {
        return product;
    }

    public void setProduct(ProductBean product) {
        this.product = product;
    }

    public List<String> getCompanies() {
        return companies;
    }

    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "CartBean{" +
                "product=" + product +
                ", companies=" + companies +
                '}';
    }
}
