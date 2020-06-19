package com.company.Classe;

public class Product {

    private String label;
    private Double price;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(){

    }

    public Product(String label, Double price){
        this.label = label;
        this.price = price;
    }
}

