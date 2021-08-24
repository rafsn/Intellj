package Threads;

import java.util.Set;

public class acao01 {
    public static void main(String[] args) {
    BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();

    BarraDeCarregamento2 barraDeCarregamento22 = new BarraDeCarregamento2();

    BarraDeCarregamento2 barraDeCarregamento3 = new BarraDeCarregamento2();
    barraDeCarregamento2.start();
    barraDeCarregamento22.start();
    barraDeCarregamento3.start();



    }
}

class GerarPDF implements Runnable{
    @Override
    public void run(){
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable{
    @Override
    public void run(){
        System.out.println("Loading...");
    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("Rodei 02" + this.getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("Rodei 03 " + this.getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}