package it.epicode.veicoli_astratta;

import it.epicode.veicoli.TipoVeicolo;

public class Camion extends Veicolo{
    public Camion(String targa, double prezzo) {
        super(targa, prezzo, TipoVeicolo.CAMION);
    }

    @Override
    public double calcolaCosto() {
        return getPrezzo() + 10000;
    }
}
