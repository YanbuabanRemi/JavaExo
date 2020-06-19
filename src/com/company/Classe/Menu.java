package com.company.Classe;

import java.util.Scanner;

public class Menu {

    private Cart cart = new Cart();
    private Products products = new Products();
    Scanner sc = new Scanner((System.in));

    public void ShowMenu(){
        System.out.println("1 - Menu de gestion des produits");
        System.out.println("2 - Menu de gestion du panier");
        System.out.println("3 - Quitter");
        int choiceMenu = Integer.parseInt(sc.nextLine());
        switch (choiceMenu){
            case 1 :
                Products();
                break;
            case 2:
                Cart();
                break;
            case 3:
                Stop();
                break;
            default:
                break;
        }
    }

    public void Products(){
        System.out.println("1 - Ajouter un produit");
        System.out.println("2 - Modifier un produit");
        System.out.println("3 - Supprimer un produit");
        System.out.println("4 - Afficher les produits");
        System.out.println("5 - Retour au menu principal");
        int choiceProducts = Integer.parseInt(sc.nextLine());
        switch (choiceProducts){
            case 1 :
                System.out.println("Quel est le nom du produit ?");
                String label = sc.nextLine();
                System.out.println("Quel est le Prix du produit ?");
                Double price = Double.parseDouble(sc.nextLine());
                products.AddProduct(label, price);
                System.out.println("Votre produit a bien été enregistré !");
                Products();
                break;
            case 2:
                System.out.println("Quel est le produit à modifier ? (Veuillez taper le label du produit)");
                products.ShowProducts();
                String choiceModify = sc.nextLine();
                System.out.println("Quel est le nouveau nom du produit ?");
                String labelModify = sc.nextLine();
                System.out.println("Quel est le nouveau Prix du produit ?");
                Double priceModify = Double.parseDouble(sc.nextLine());
                products.EditProduct(choiceModify, labelModify, priceModify);
                System.out.println("Le produit a bien été supprimé !");
                Products();
                break;
            case 3:
                System.out.println("Quel est le produit à supprimer ? (Veuillez taper le label du produit)");
                products.ShowProducts();
                String choiceDelete = sc.nextLine();
                products.DeleteProduct(choiceDelete);
                System.out.println("Le produit a bien été supprimé !");
                Products();
                break;
            case 4:
                products.ShowProducts();
                Products();
                break;
            case 5 :
                ShowMenu();
                break;
            default:
                break;
        }
    }

    public void Cart(){
        System.out.println("1 - Ajouter un produit au panier");
        System.out.println("2 - Supprimer un produit du panier");
        System.out.println("3 - Afficher le detail du panier");
        System.out.println("4 - Valider le panier");
        System.out.println("5 - Retour au menu principal");
        int choiceCart = Integer.parseInt(sc.nextLine());
        switch (choiceCart){
            case 1 :
                System.out.println("Quel est le produit à ajouter au panier ? (Veuillez taper le label du produit)");
                products.ShowProducts();
                String label = sc.nextLine();
                cart.AddToCart(products, label);
                System.out.println("Produit ajouté au panier");
                Cart();
                break;
            case 2:
                System.out.println("Quel est le produit à supprimer du panier ? (Veuillez taper le label du produit)");
                products.ShowProducts();
                String labelDelete = sc.nextLine();
                cart.DeleteFromCart(labelDelete);
                System.out.println("Produit supprimé du panier");
                Cart();
                break;
            case 3:
                cart.ShowCart();
                Cart();
                break;
            case 4:
                System.out.println("Quel est nom pour sauvegarder la liste ?");
                String listCart = sc.nextLine();
                cart.ValidateCart(listCart);
                System.out.println("Liste sauvegarder !");
                Cart();
                break;
            case 5:
                ShowMenu();
                break;
            default:
                break;
        }
    }

    public void Stop() {
        System.exit(0);
    }
}
