package com.yenifergomez.app;

import com.yenifergomez.vehiculo.*;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Vehiculo vehiculo = new Vehiculo();
        Taxi taxi = new Taxi();
        Bicicleta bicicleta=new Bicicleta();
        BicicletaMontana mtb=new BicicletaMontana();
        BicicletaRuta rutera = new BicicletaRuta();

        vehiculos.add(taxi);
        vehiculos.add(bicicleta);
        vehiculos.add(mtb);
        vehiculos.add(rutera);

        Vehiculo vehiculo1 = mtb ;

        ((BicicletaMontana)vehiculo1).setTipoSuspension("basica");

        taxi.setColor("Morado");

        if ( vehiculo1 instanceof Bicicleta){
            System.out.println("Es un vehículo");
        }else{
            System.out.println("No es un vehículo");
        }
    }

//Actividad de clase, metodo para mostrar que tipo de vehiculo tiene
    public static void instanciar(List<Vehiculo>vehiculos){
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo instanceof Taxi){
                System.out.println("El vehiculo es un Taxi");
            }else if (vehiculo instanceof Bicicleta){
                System.out.println("El vehiculo es una Bicicleta");
            }
        }

    }

}

