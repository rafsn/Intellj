package Java.Date;

import java.util.Date;

public class Exemplo03 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);

        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);
    }
}
