package com.atenea.mascotas;

public class Leon {
    private String raza;
    private String color;
    private String sexo;
    private int edad;
    private double altura;
    private double peso;

    public Leon(String raza, String color, String sexo, int edad, double altura, double peso) {
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void info() {
        System.out.println("Gato: Raza - " + raza + ", Color - " + color + ", Sexo - " + sexo + ", Edad - " + edad +
                " año,Altura - " + altura + " cm, Peso - " + peso + " kg");
    }
}
