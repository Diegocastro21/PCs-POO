package planetapc;

import mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 35);
        Teclado tecladoGamer = new Teclado("USB", "Gamer");
        Raton ratonGamer = new Raton("USB", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Monitor monitorMAC = new Monitor("MAC", 35);
        Teclado tecladoMAC = new Teclado("Bluetooth", "MAC");
        Raton ratonMAC = new Raton("Bluetooth", "MAC");
        Computadora computadoraMAC = new Computadora("Computadora MAC", monitorMAC, tecladoMAC, ratonMAC);

        Monitor monitorRAZER = new Monitor("RAZER", 35);
        Teclado tecladoRAZER = new Teclado("Bluetooth", "RAZER");
        Raton ratonRAZER = new Raton("USB", "RAZER");
        Computadora computadoraRAZER = new Computadora("Computadora RAZER", monitorRAZER, tecladoRAZER, ratonRAZER);



        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraRAZER);
        orden2.agregarComputadora(computadoraMAC);

        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadoraHP);
        orden3.agregarComputadora(computadoraMAC);

        orden1.mostarOrden();
        System.out.println("-----------------------------------------------\n");
        orden2.mostarOrden();
        System.out.println("-----------------------------------------------\n");
        orden3.mostarOrden();
    }
}
