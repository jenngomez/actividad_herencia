package com.yenifergomez.vehiculo;

public class Bicicleta extends Vehiculo{

    private int nroPinones;
    private double tamanoRueda;
    private String tipoFreno;

    public int getNroPinones() {
        return nroPinones;
    }

    public double getTamanoRueda() {
        return tamanoRueda;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setNroPinones(int nroPinones) {
        this.nroPinones = nroPinones;
    }

    public void setTamanoRueda(double tamanoRueda) {
        this.tamanoRueda = tamanoRueda;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }
}
