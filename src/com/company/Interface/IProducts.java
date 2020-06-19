package com.company.Interface;

import com.company.Classe.Product;

public interface IProducts {

    public void AddProduct(String label, Double price);
    public void EditProduct(String choice, String label, Double price);
    public void DeleteProduct(String label);
    public void ShowProducts();
    public Product ReturnSpecificProduct(String label);
}
