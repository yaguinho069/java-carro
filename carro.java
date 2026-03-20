package com.sgp.modelos;

public class Carro {

    private String modelo;
    private int ano;
    private double altura;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.altura = 0.0;
    }

    public Carro() {
        this.modelo = "Fusca";
        this.ano = 2000;
        this.altura = 1.50;
    }

    public Carro(String modelo, int ano, double altura) {
        this.modelo = modelo;
        this.ano = ano;
        this.altura = altura;
    }

    public void saudacao() {
        System.out.println("Olá, este é o carro " + modelo + " do ano " + ano + ".");
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", ano=" + ano + ", altura=" + altura + "]";
    }
}