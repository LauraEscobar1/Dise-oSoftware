import java.util.List;

public class Carro {
    private String color;
    private Chasis chasis;
    private List<Llanta> llantas;

    public Carro(String color, Chasis chasis, List<Llanta> llantas) {
        this.color = color;
        this.chasis = chasis;
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public List<Llanta> getLlantas() {
        return llantas;
    }

    public void setLlantas(List<Llanta> llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", chasis=" + chasis +
                ", llantas=" + llantas +
                '}';
    }
}