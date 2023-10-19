package com.yenifergomez.vehiculo;

public class Taxi extends Vehiculo {

    private String registroCirculacion;
    private String empresa;
    private int nroPasajeros;

    public String getRegistroCirculacion() {
        return registroCirculacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }

    public void setRegistroCirculacion(String registroCirculacion) {
        this.registroCirculacion = registroCirculacion;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setNroPasajeros(int nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }
}
