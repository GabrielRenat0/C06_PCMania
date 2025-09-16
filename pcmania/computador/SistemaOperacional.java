package pcmania.computador;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("SO: " + nome + " - " + tipo + " bits");
    }
}
