package it.epicode.veicoli_astratta;

import it.epicode.veicoli.TipoVeicolo;

public abstract class Veicolo implements  IDisponibile{
    private String targa;
    private double prezzo;

    @Override
    public void checkDisponibilita() {
        System.out.println("Veicolo non disponibile");
    }

    @Override
    public String caratteristiche() {
        return "targa: " + getTarga() + " costo: " + calcolaCosto() ;
    }

    private TipoVeicolo categoria ;

    public String getTarga() {
        return targa;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public TipoVeicolo getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoVeicolo categoria) {
        this.categoria = categoria;
    }

    public Veicolo(String targa, double prezzo, TipoVeicolo categoria) {
        this.targa = targa;
        this.prezzo = prezzo;
        this.categoria = categoria;
    }

    public abstract double calcolaCosto() ;
}
