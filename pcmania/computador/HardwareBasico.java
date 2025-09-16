package pcmania.computador;

public class HardwareBasico {
    private String nome;
    private int capacidade;

    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostrarInfo() {
        System.out.println(nome + " - " + capacidade);
    }
}
