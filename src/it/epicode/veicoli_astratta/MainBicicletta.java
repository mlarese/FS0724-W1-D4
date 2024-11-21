package it.epicode.veicoli_astratta;

import java.util.ArrayList;

public class MainBicicletta {

    public static void main(String[] args) {
        Veicolo pg = new Auto("HHHHHH",200000);
        Bicicletta b = new Bicicletta("bianchina","001", "3322");


        ArrayList<IDisponibile> disponibili = new ArrayList<>();

        disponibili.add(pg);
        disponibili.add(b);

        for (int i = 0; i < disponibili.size(); i++) {

            IDisponibile corrente = disponibili.get(i);
            System.out.println(corrente.caratteristiche());
            corrente.checkDisponibilita();
        }
    }

}
