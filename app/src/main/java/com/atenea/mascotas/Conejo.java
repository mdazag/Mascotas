package com.atenea.mascotas;

public class Conejo {

    String nombre;
    double altura;
    double peso;
    String colorPelaje;
    String genero;
    String raza;
    int edad;

    public Conejo(String nombre, double altura, double peso, String colorPelaje, String genero, String raza, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPelaje = colorPelaje;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;
    }

    public Conejo() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double calcularTamaño(double peso, double altura){
        return peso/altura;
    }


}
