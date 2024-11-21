package it.epicode.veicoli;

public class MainVeicolo {
    public static void main(String[] args) {
        Veicolo v1 = new Veicolo( "GZ22",20000.0, TipoVeicolo.AUTO);
        Veicolo v2 = new Veicolo( "ZZ22",10000.0, TipoVeicolo.MOTO);
        Veicolo v3 = new Veicolo( "FZ22",50000.0, TipoVeicolo.CAMION);


        Veicolo[] veicoli = new Veicolo[3];

        veicoli[0] = v1;
        veicoli[1] = v2;
        veicoli[2] = v3;

        for (int i = 0; i < veicoli.length; i++) {
            Veicolo current = veicoli[i];
            System.out.println("targa: " + current.getTarga());
        }
    }
}
