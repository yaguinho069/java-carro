package com.sgp.util;

public class Validacoes {

    private Validacoes() {
    }

    public static boolean modeloValido(String modelo) {
        return !(modelo == null || modelo.trim().isEmpty() || modelo.matches(".*\\d+.*"));
    }

    public static String mensagemErroModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            return "Erro: O modelo não pode estar vazio!";
        } else if (modelo.matches(".*\\d+.*")) {
            return "Erro: O modelo não pode conter números!";
        }
        return "";
    }

    public static boolean anoValido(int ano) {
        return ano >= 1886 && ano <= 2100;
    }

    public static String mensagemErroAno(int ano) {
        if (ano < 1886) {
            return "Erro: Ano inválido!";
        } else if (ano > 2100) {
            return "Erro: Ano inválido!";
        }
        return "";
    }

    public static boolean alturaValida(double altura) {
        return altura >= 0.3 && altura <= 3.0;
    }

    public static String mensagemErroAltura(double altura) {
        if (altura < 0.3) {
            return "Erro: Altura muito baixa!";
        } else if (altura > 3.0) {
            return "Erro: Altura inválida!";
        }
        return "";
    }
}