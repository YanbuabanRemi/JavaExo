package com.company.Interface;

import com.company.Classe.Products;

public interface ICart {

    public void AddToCart(Products products, String label);
    public void DeleteFromCart(String label);
    public void ShowCart();
    public void ValidateCart(String name);
}
