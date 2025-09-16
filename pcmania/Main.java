package pcmania;

import java.util.Scanner;

import pcmania.cliente.Cliente;
import pcmania.computador.*;
import pcmania.util.ProcessarPedido;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matricula = 391;  

        // Promoção 1 - Apple
        Computador promo1 = new Computador("Apple", matricula, new SistemaOperacional("macOS Sequoia", 64));
        promo1.addHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
        promo1.addHardware(new HardwareBasico("Memória RAM", 8), 1);
        promo1.addHardware(new HardwareBasico("HD", 500), 2);
        promo1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // Promoção 2 - Samsung
        Computador promo2 = new Computador("Samsung", matricula + 1234, new SistemaOperacional("Windows 8", 64));
        promo2.addHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
        promo2.addHardware(new HardwareBasico("Memória RAM", 16), 1);
        promo2.addHardware(new HardwareBasico("HD", 1000), 2);
        promo2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // Promoção 3 - Dell
        Computador promo3 = new Computador("Dell", matricula + 5678, new SistemaOperacional("Windows 10", 64));
        promo3.addHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
        promo3.addHardware(new HardwareBasico("Memória RAM", 32), 1);
        promo3.addHardware(new HardwareBasico("HD", 2000), 2);
        promo3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        Cliente cliente = new Cliente("João da Silva", "123.456.789-00");

        int opcao;
        do {
            System.out.println("Escolha uma promoção (1, 2, 3) ou 0 para finalizar:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cliente.comprar(promo1);
                    break;
                case 2:
                    cliente.comprar(promo2);
                    break;
                case 3:
                    cliente.comprar(promo3);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        cliente.mostrarInfo();

        ProcessarPedido.enviarPedido(cliente.getComputadores());

        sc.close();
    }
}
