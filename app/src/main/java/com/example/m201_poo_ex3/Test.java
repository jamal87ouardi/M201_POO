package com.example.m201_poo_ex3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Produit pr = new Produit("HP200",2900,10);

        System.out.println(pr);

        ArrayList<Produit> list = new ArrayList<Produit>();

        list.add(pr);

        Produit pr2 = new Produit("Dell300",3200,15);

        list.add(pr2);

        double prixTotalHT = 0;

        for(int i = 0; i<list.size();i++) {

            prixTotalHT = prixTotalHT + list.get(i).getPrixHT()*list.get(i).getQuantiteStock();
        }
        System.out.println(prixTotalHT);

        System.out.println(list);




    }

}
