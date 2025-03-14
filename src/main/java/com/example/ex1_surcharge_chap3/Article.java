package com.example.ex1_surcharge_chap3;

public class Article {
    private String nom;
    private String description;
    private double prix;
    private String codeBarre;

    public Article(String nom, String description, double prix, String codeBarre) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.codeBarre = codeBarre;
    }

    public Article(String nom, double prix, String codeBarre) {
        this.nom = nom;
        this.prix = prix;
        this.codeBarre = codeBarre;
    }

    public double getPrix() {
        this.prix *= 1;
        return prix;
    }
    public double getPrix(int q) {
        this.prix *= q;
        if (q >= 10){
            this.prix *= 0.95;
        }

        return prix;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public String getDescription() {
        return description;
    }
}
