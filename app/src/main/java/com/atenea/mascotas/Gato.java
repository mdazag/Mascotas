package com.atenea.mascotas;

public class Gato {
        private String raza;
        private String color;
        private String sexo;
        private int edad;
        private double altura;
        private double peso;

        // Constructor
        public Gato(String raza, String color, String sexo, int edad, double altura, double peso) {
            this.raza = raza;
            this.color = color;
            this.sexo = sexo;
            this.edad = edad;
            this.altura = altura;
            this.peso = peso;
        }

        // Getter and Setter methods
        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
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

        public void info() {
            System.out.println("Gato: Raza - " + raza + ", Color - " + color + ", Sexo - " + sexo + ", Edad - " + edad +
                    " años, Altura - " + altura + " cm, Peso - " + peso + " kg");
        }

    }


