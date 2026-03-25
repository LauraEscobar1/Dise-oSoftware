public class Mammal extends Animal {

    // Constructor que llama al constructor de la clase padre con validación
    public Mammal(String name) {
        super(name);
    }

    // Método para mostrar información del mamífero
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }

    // Métodos equals y hashCode para comparar objetos Mammal por su nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mammal mammal = (Mammal) obj;
        return getName().equals(mammal.getName());
    }
   
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}