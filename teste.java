package com.sgp.testes;

import com.sgp.modelos.Carro;

public class Teste {

    public static void main(String[] args) {
        Carro carroNulo = null;
        imprimirCarro(carroNulo);

        Carro carro = new Carro("Civic", 2020);
        carro.setAltura(1.45);
        imprimirCarro(carro);

        Carro carroPadrao = new Carro();
        System.out.println("\nTestando construtor com valores padrão:");
        imprimirCarro(carroPadrao);

        Carro carroComAltura = new Carro("Corolla", 2022, 1.47);
        System.out.println("\nTestando construtor com altura:");
        imprimirCarro(carroComAltura);

        carro.saudacao();

        System.out.println("Modelo (público): " + carro.getModelo());

        carro.setModelo("HB20");
        System.out.println("Modelo modificado (setter): " + carro.getModelo());

        carro.setAno(2023);
        System.out.println("Carro após modificações: " + carro.toString());
    }

    public static void imprimirCarro(Carro carro) {
        if (carro == null) {
            System.out.println("Carro não inicializado!");
            return;
        }
        System.out.println(carro);
        carro.saudacao();
    }
}