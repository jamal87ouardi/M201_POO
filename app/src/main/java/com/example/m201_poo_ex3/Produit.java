package com.example.m201_poo_ex3;

public class Produit {
private String nom;
private double prixHT;
private int quantiteStock;


    public Produit(String nom, double prixHT, int quantiteStock) {
        this.nom = nom;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public double calculerTTC() {

        return prixHT*1.1;

    }

    public void provisionner(int q) {

        quantiteStock = quantiteStock + q;

    }

    public void sortie(int q) {
        if (q<=quantiteStock)  quantiteStock-=q;
        else System.out.println("Stock insuffisant");

    }


    public boolean disponible(){
        if(quantiteStock>0) return true;
        else return false;

    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prixHT=" + prixHT +
                ", quantiteStock=" + quantiteStock +
                '}';
    }
}
