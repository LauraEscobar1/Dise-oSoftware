import java.util.ArrayList;

public class Planta {
    private llanta  tipoLLanta;
    private chasis  tipoChasis;
    private ArrayList<String> colores;

    public Planta(llanta tipoLLanta, chasis tipoChasis, ArrayList<String> colores) {
        this.tipoLLanta = tipoLLanta;
        this.tipoChasis = tipoChasis;
        this.colores = colores;
    }

    public llanta getTipoLLanta() {
        return tipoLLanta;
    }

    public void setTipoLLanta(llanta tipoLLanta) {
        this.tipoLLanta = tipoLLanta;
    }

    public chasis getTipoChasis() {
        return tipoChasis;
    }

    public void setTipoChasis(chasis tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

    public ArrayList<String> getColores() {
        return colores;
    }

    public void setColores(ArrayList<String> colores) {
        this.colores = colores;
    }

    @Override
    public String toString() {
        return "planta{" +
                "tipoLLanta=" + tipoLLanta +
                ", tipoChasis=" + tipoChasis +
                ", colores=" + colores +
                '}';
    }
}
