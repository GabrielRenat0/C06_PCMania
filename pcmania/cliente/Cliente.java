package pcmania.cliente;

import pcmania.computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[10];
    private int qtdComputadores = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void comprar(Computador pc) {
        if (qtdComputadores < computadores.length) {
            computadores[qtdComputadores] = pc;
            qtdComputadores++;
        } else {
            System.out.println("Limite de compras atingido!");
        }
    }

public void mostrarInfo() {
    System.out.println("Cliente: " + nome + " | CPF: " + cpf);
    System.out.println("PCs adquiridos:");
    float total = 0;
    for (int i = 0; i < qtdComputadores; i++) {
        computadores[i].mostraPCConfigs();
        total += computadores[i].getPreco();
    }
    System.out.println("Total da compra: R$" + total);
}

    public Computador[] getComputadores() {
        return computadores;
    }
}
