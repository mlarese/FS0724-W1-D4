package it.epicode.veicoli_astratta;

public class Bicicletta implements IDisponibile{
    private String marca;
    private String modello;

    private String numeroSerie;

    public Bicicletta(String marca, String modello, String numeroSerie) {
        this.marca = marca;
        this.modello = modello;
        this.numeroSerie = numeroSerie;
    }


    @Override
    public void checkDisponibilita() {
        System.out.println("Bicicletta disponibile");
    }

    @Override
    public String caratteristiche() {
        return "marca: " + marca + " modello: " + modello + " numero serie: " + numeroSerie;
    }
}
