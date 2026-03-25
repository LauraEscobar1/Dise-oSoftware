public class Dog extends Mammal {

    // Constructor que llama al constructor de la clase padre con validación
    public Dog(String name) {
        super(name);
    }

    // Método para que el perro salude
    public void greet() {
        System.out.println("Woof");
    }

    // Método para que el perro salude a otro perro
    public void greet(Dog another) {
        System.out.println("Woooo!");
    }

    // Método para mostrar información del perro
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }

    // Métodos equals y hashCode para comparar objetos Dog por su nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return getName().equals(dog.getName());
    }
   
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}