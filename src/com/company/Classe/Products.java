package com.company.Classe;

import com.company.Interface.IProducts;

import java.util.*;
import java.util.stream.Stream;

public class Products implements IProducts{

    private List<Product> listProduct = new ArrayList<>();

    public List<Product> getListProduct() {
        return listProduct;
    }

    Scanner sc = new Scanner((System.in));

    @Override
    public void AddProduct(String label, Double price) {
        listProduct.add(new Product(label, price));
    }

    @Override
    public void EditProduct(String choice, String label, Double price) {
        DeleteProduct(choice);
        AddProduct(label, price);
    }

    @Override
    public void DeleteProduct(String label) {
        listProduct.removeIf(p -> p.getLabel().equals(label));
    }

    @Override
    public void ShowProducts() {
        System.out.println("Voici la liste des produits :");
        Stream<Product> stream = listProduct.stream();
        stream.forEach((p) -> System.out.println("Label : " + p.getLabel() + " - Prix : " + p.getPrice()));
    }

    @Override
    public Product ReturnSpecificProduct(String label) {
        Product pro = new Product();
        for (Product p : listProduct){
            if (p.getLabel() .equals(label)){
                pro.setLabel(p.getLabel());
                pro.setPrice(p.getPrice());
            }
        }
        return pro;
    }
}
