package com.example.ex1_surcharge_chap3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

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
        int q = Integer.parseInt(txtQuantite.getText());
        Double prixUnite1 = i1.getPrix();
       Double prixUnite2 = i2.getPrix();
       Double prixUnite3 = i3.getPrix();
       Double prixFinal1 = q * prixUnite1;
        Double prixFinal2 = q * prixUnite2;
        Double prixFinal3 = q * prixUnite3;



       if (articleCourant == 1){
           lblPrixFinal.setText(String.valueOf(prixFinal1));
           lblPrixUnite.setText(String.valueOf(prixUnite1));
           if (q >= 10){
               prixFinal1 =  i1.getPrix(q);
               lblPrixFinal.setText(String.valueOf(prixFinal1));

           }


       }
        if (articleCourant == 2){
            lblPrixFinal.setText(String.valueOf(prixFinal2));
            lblPrixUnite.setText(String.valueOf(prixUnite2));
            if (q >= 10){
                prixFinal1 =  i2.getPrix(q);
                lblPrixFinal.setText(String.valueOf(prixFinal1));

            }
        }
        if (articleCourant == 3){
            lblPrixFinal.setText(String.valueOf(prixFinal3));
            lblPrixUnite.setText(String.valueOf(prixUnite3));
            if (q >= 10){
                prixFinal1 = i3.getPrix(q);
                lblPrixFinal.setText(String.valueOf(prixFinal1));

            }
        }

    }

    @FXML
    public void btnArticle1(MouseEvent mouseEvent) {
        lblNomArticle.setText(i1.getNom());
        lblDescription.setText(i1.getDescription());
        lblPrixCodeBarre.setText(i1.getCodeBarre());
        lblPrixUnite.setText(String.valueOf(i1.getPrix()));
        articleCourant = 1;
    }

    @FXML
    public void btnArticle2(MouseEvent mouseEvent) {
        lblNomArticle.setText(i2.getNom());
        lblPrixCodeBarre.setText(i2.getCodeBarre());
        lblPrixUnite.setText(String.valueOf(i2.getPrix()));
        lblDescription.setText("");
        articleCourant = 2;
    }

    @FXML
    public void btnArticle3(MouseEvent mouseEvent) {
        lblNomArticle.setText(i3.getNom());
        lblPrixCodeBarre.setText(i3.getCodeBarre());
        lblPrixUnite.setText(String.valueOf(i3.getPrix()));
        lblDescription.setText("");
        articleCourant = 3;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       i1 = new Article("Booster Pokemon","Première édition du TCG",275.5,"5483918746738");
       i2 = new Article("Bavette d’Aloyau 100g",3.25,"5473664615361");
       i3 = new Article("Red Bull",2.20,"9002490205973");
    }
    public Double prixInitial(double prixInitial){
        if (articleCourant == 1){
            prixInitial = i1.getPrix();
            lblPrixUnite.setText(String.valueOf(prixInitial));
        }
        if (articleCourant == 2){
            prixInitial = i2.getPrix();
            lblPrixUnite.setText(String.valueOf(prixInitial));
        }
        if (articleCourant == 1){
            prixInitial = i3.getPrix();
            lblPrixUnite.setText(String.valueOf(prixInitial));
        }
        return prixInitial;
    }
}