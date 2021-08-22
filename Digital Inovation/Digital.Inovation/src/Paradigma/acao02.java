package Paradigma;

import java.util.Arrays;

public class acao02 {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4};
        Arrays.stream(valores)
                .filter(numero -> numero % 4 == 0)
                .map(numero -> numero * 4)
                .forEach(numero -> System.out.println(numero));

    }
}
