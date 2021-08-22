package Java.Date;

import java.util.Date;

public class Exemplo04 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
        Date dataNoFuturo = new Date(1613124807691L);
        Date mesmaDataNoFuturo = new Date(1613124807691L);

        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEquals); //true

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);

    }
}
