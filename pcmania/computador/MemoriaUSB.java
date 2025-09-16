package pcmania.computador;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostrarInfo() {
        System.out.println("Memória USB: " + nome + " - " + capacidade + "Gb");
    }
}
