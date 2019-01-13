package com.example.carlos.recetas;

//CLASE INGREDIENTE PARA USAR EN MainActivity y IngredienteActivity, DE MOMENTO NO AÑADIMOS IMAGEN


public class Ingrediente {
    private String nombre, cantidad;

    public Ingrediente(){
    }

    public Ingrediente(String nombre, String cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad){
        this.cantidad=cantidad;
    }


}
