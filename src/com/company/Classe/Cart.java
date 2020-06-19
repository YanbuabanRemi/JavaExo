package com.company.Classe;

import com.company.Interface.ICart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Cart implements ICart{

    private List<Product> productsInCart = new ArrayList<>();
    private HashMap<String, List<Product>> listOfCart = new HashMap<>();
    Scanner sc = new Scanner((System.in));

    @Override
    public void AddToCart(Products products, String label) {
        Product p = products.ReturnSpecificProduct(label);
        productsInCart.add(p);
    }

    @Override
    public void DeleteFromCart(String label) {
        productsInCart.removeIf(p -> p.getLabel().equals(label));
    }

    @Override
    public void ShowCart() {
        System.out.println("Voici la liste des produits :");
        Stream<Product> stream = productsInCart.stream();
        stream.forEach((p) -> System.out.println("Label : " + p.getLabel() + " - Prix : " + p.getPrice()));
    }

    @Override
    public void ValidateCart(String name) {
        listOfCart.put(name, productsInCart);
        productsInCart.clear();
    }
}
