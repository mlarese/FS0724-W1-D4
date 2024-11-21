package it.epicode.veicoli_astratta;

import it.epicode.veicoli.TipoVeicolo;

public class Auto extends  Veicolo{
    public Auto(String targa, double prezzo) {
        super(targa,prezzo, TipoVeicolo.AUTO);
    }

    @Override
    public double calcolaCosto() {
        return this.getPrezzo() + 1000.0;
    }
}
