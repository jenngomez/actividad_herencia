package com.yenifergomez.persona;

public class Persona {

    private int cedula;
    private String nombre;
    private int edad;
    private String genero;

    public void caminar(){
        System.out.println("La persona está caminando");
    }
    public void hablar(){
        System.out.println("La persona está hablado");
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
