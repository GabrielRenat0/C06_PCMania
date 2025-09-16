package pcmania.computador;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistema;
    private HardwareBasico[] hardwares = new HardwareBasico[3];
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional sistema) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
    }

    public void addHardware(HardwareBasico hw, int index) {
        if (index >= 0 && index < hardwares.length) {
            hardwares[index] = hw;
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca + " | Preço: R$" + preco);
        for (HardwareBasico hw : hardwares) {
            if (hw != null) hw.mostrarInfo();
        }
        if (sistema != null) sistema.mostrarInfo();
        if (memoriaUSB != null) memoriaUSB.mostrarInfo();
        System.out.println("------------------------");
    }

    public float getPreco() {
        return preco;
    }
}
