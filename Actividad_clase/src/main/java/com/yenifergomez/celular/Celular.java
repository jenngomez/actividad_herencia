package com.yenifergomez.celular;

public class Celular {

    private int nroSerial;
    private String marca;
    private String modelo;
    private String color;

    public void llamar(){
        System.out.println("Llamando");
    }

    public void enviarMensaje(){
        System.out.println("Mensaje enviado");
    }

    public int getNroSerial() {
        return nroSerial;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
