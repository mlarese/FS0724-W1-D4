package it.epicode.veicoli_astratta;

import java.util.ArrayList;

public class MainAstratta {
    public static void main(String[] args) {
        Veicolo peugeot305 = new Auto("GGHH77", 40000);
        Veicolo ducati = new Moto("DD4444", 10000);
        Veicolo camion = new Camion("TR56", 100000);

        ArrayList<Veicolo> veicoli = new ArrayList<>(3);

        veicoli.add(peugeot305);
        veicoli.add(ducati);
        veicoli.add(camion);

        for (int i = 0; i < veicoli.size(); i++) {
            Veicolo current = veicoli.get(i);
            System.out.println("Costo " + current.calcolaCosto()  + " targa: " + current.getTarga());
        }


    }
}
