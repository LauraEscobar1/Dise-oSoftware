public class Cat extends Mammal {

    // Constructor que llama al constructor de la clase padre con validación
    public Cat(String name) {
        super(name);
    }

    // Método para que el gato salude
    public void greet() {
        System.out.println("Meow");
    }

    // Método para mostrar información del gato
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }

    // Métodos equals y hashCode para comparar objetos Cat por su nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return getName().equals(cat.getName());
    }
   
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}