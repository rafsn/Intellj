package Paradigma;

public class acao04 {
    public static void main(String[] args) {
    Calculo soma = (a,b) -> a+b;
    Calculo subtracao = (a,b) -> a+b;
    Calculo divisao = (a,b) -> a+b;
    Calculo multi = (a,b) -> a+b;

        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(subtracao, 4, 3));
        System.out.println(executarOperacao(divisao, 10, 3));
        System.out.println(executarOperacao(multi, 5, 3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }

    interface Calculo{
        public int calcular (int a, int b);
    }
}
