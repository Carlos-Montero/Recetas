package com.example.carlos.recetas;

//CLASE PASO PARA USAR EN SecondActivity

public class Paso {
    private String nombrePaso, duracion;

    public Paso(){
    }

    public Paso(String nombrePaso, String duracion){
        this.nombrePaso=nombrePaso;
        this.duracion=duracion;
    }

    public String getNombrePaso() {
        return nombrePaso;
    }

    public void setNombrePaso(String nombrePaso){
        this.nombrePaso=nombrePaso;
    }


    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion){
        this.duracion=duracion;
    }

}
