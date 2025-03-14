package com.example.ex1_surcharge_chap3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController implements Initializable {
   @FXML
   private Label lblNomArticle;
   @FXML
   private Label lblPrixCodeBarre;
   @FXML
   private Label lblDescription;
   @FXML
   private Label lblPrixFinal;
   @FXML
   private Label lblPrixUnite;
   Article i1;
   Article i2;
   Article i3;
   int articleCourant = 0;
   @FXML
   private TextField txtQuantite;

   @FXML
   public void btnPrixFinal(MouseEvent mouseEvent) {
      int q = Integer.parseInt(this.txtQuantite.getText());
      Double prixUnite1 = this.i1.getPrix();
      Double prixUnite2 = this.i2.getPrix();
      Double prixUnite3 = this.i3.getPrix();
      Double prixFinal1 = (double)q * prixUnite1;
      Double prixFinal2 = (double)q * prixUnite2;
      Double prixFinal3 = (double)q * prixUnite3;
      if (this.articleCourant == 1) {
         this.lblPrixFinal.setText(String.valueOf(prixFinal1));
         this.lblPrixUnite.setText(String.valueOf(prixUnite1));
         if (q >= 10) {
            prixFinal1 = this.i1.getPrix(q);
            this.lblPrixFinal.setText(String.valueOf(prixFinal1));
         }
      }

      if (this.articleCourant == 2) {
         this.lblPrixFinal.setText(String.valueOf(prixFinal2));
         this.lblPrixUnite.setText(String.valueOf(prixUnite2));
         if (q >= 10) {
            prixFinal1 = this.i2.getPrix(q);
            this.lblPrixFinal.setText(String.valueOf(prixFinal1));
         }
      }

      if (this.articleCourant == 3) {
         this.lblPrixFinal.setText(String.valueOf(prixFinal3));
         this.lblPrixUnite.setText(String.valueOf(prixUnite3));
         if (q >= 10) {
            prixFinal1 = this.i3.getPrix(q);
            this.lblPrixFinal.setText(String.valueOf(prixFinal1));
         }
      }

   }

   @FXML
   public void btnArticle1(MouseEvent mouseEvent) {
      this.lblNomArticle.setText(this.i1.getNom());
      this.lblDescription.setText(this.i1.getDescription());
      this.lblPrixCodeBarre.setText(this.i1.getCodeBarre());
      this.lblPrixUnite.setText(String.valueOf(this.i1.getPrix()));
      this.articleCourant = 1;
   }

   @FXML
   public void btnArticle2(MouseEvent mouseEvent) {
      this.lblNomArticle.setText(this.i2.getNom());
      this.lblPrixCodeBarre.setText(this.i2.getCodeBarre());
      this.lblPrixUnite.setText(String.valueOf(this.i2.getPrix()));
      this.lblDescription.setText("");
      this.articleCourant = 2;
   }

   @FXML
   public void btnArticle3(MouseEvent mouseEvent) {
      this.lblNomArticle.setText(this.i3.getNom());
      this.lblPrixCodeBarre.setText(this.i3.getCodeBarre());
      this.lblPrixUnite.setText(String.valueOf(this.i3.getPrix()));
      this.lblDescription.setText("");
      this.articleCourant = 3;
   }

   public void initialize(URL url, ResourceBundle resourceBundle) {
      this.i1 = new Article("Booster Pokemon", "Première édition du TCG", 275.5D, "5483918746738");
      this.i2 = new Article("Bavette d’Aloyau 100g", 3.25D, "5473664615361");
      this.i3 = new Article("Red Bull", 2.2D, "9002490205973");
   }

   public Double prixInitial(double prixInitial) {
      if (this.articleCourant == 1) {
         prixInitial = this.i1.getPrix();
         this.lblPrixUnite.setText(String.valueOf(prixInitial));
      }

      if (this.articleCourant == 2) {
         prixInitial = this.i2.getPrix();
         this.lblPrixUnite.setText(String.valueOf(prixInitial));
      }

      if (this.articleCourant == 1) {
         prixInitial = this.i3.getPrix();
         this.lblPrixUnite.setText(String.valueOf(prixInitial));
      }

      return prixInitial;
   }
}
