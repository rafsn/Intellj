package Paradigma;

import java.util.function.Consumer;

public class acao05 {
    public static void main(String[] args) {
    Consumer<String> imprimirUmaFrase = System.out::println;

        //Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Colé Rafa");
    }
}
