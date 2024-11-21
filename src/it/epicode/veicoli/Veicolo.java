package it.epicode.veicoli;

public class Veicolo {
    private String targa;
    private double prezzo;

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
}
