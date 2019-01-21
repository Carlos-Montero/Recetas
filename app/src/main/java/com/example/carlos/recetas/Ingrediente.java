package com.example.carlos.recetas;

//CLASE INGREDIENTE PARA USAR EN MainActivity y IngredienteActivity, DE MOMENTO NO AÑADIMOS IMAGEN


public class Ingrediente {
    private String nombre, cantidad, descripcion;

    public Ingrediente(){
    }

    public Ingrediente(String nombre, String cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.descripcion=descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
}
