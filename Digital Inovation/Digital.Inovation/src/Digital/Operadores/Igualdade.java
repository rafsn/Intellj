package Digital.Operadores;

public class Igualdade {
    public static void main(String[] args) {
        final var numero = 11;

        if (numero == 10) {
            System.out.println("o número é 10");
        } else System.out.println("o número não é 10");

        if (numero != 10){
            System.out.println("O número não é 10");
        } else {
            System.out.println("O número é 10");
        }

        final var letra = "B";

        if ("A".equals(letra)){
            System.out.println("É a letraA");
        }
    }

}
