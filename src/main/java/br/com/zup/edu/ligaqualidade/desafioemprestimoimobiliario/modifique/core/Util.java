package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core;

public class Util {
    public static <T extends Comparable<T>> boolean isBetween(T value, T start, T end) {
        return value.compareTo(start) >= 0 && value.compareTo(end) <= 0;
    }
}
