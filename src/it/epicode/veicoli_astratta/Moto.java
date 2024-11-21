package it.epicode.veicoli_astratta;

import it.epicode.veicoli.TipoVeicolo;

public class Moto extends Veicolo{
    public Moto(String targa, double prezzo) {
        super(targa, prezzo, TipoVeicolo.MOTO);
    }

    @Override
    public double calcolaCosto() {
        return getPrezzo() + 100.0;
    }
}
