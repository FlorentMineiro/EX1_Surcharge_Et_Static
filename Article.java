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
      this.prix *= 1.0D;
      return this.prix;
   }

   public double getPrix(int q) {
      this.prix *= (double)q;
      if (q >= 10) {
         this.prix *= 0.95D;
      }

      return this.prix;
   }

   public String getNom() {
      return this.nom;
   }

   public String getCodeBarre() {
      return this.codeBarre;
   }

   public String getDescription() {
      return this.description;
   }
}
