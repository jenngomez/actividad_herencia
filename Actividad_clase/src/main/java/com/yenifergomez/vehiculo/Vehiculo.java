package com.yenifergomez.vehiculo;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String linea;
    private short anioModelo;

    private String color;

    public void acelerar(){
        System.out.println("El vehículo está acelerando");
    }

    public void frenar(){
        System.out.println("El vehículo está acelerando");
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public short getAnioModelo() {
        return anioModelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
