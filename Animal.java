public class Animal {
    private String name;

    // Constructor con validación para asegurar que el nombre no sea null o vacío
    public Animal(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del animal no puede ser null o vacío.");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }
    // Método para cambiar el nombre del animal con validación
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del animal no puede ser null o vacío.");
        }
        this.name = name.trim();
    }
    // Método para mostrar información del animal
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }

    // Métodos equals y hashCode para comparar objetos Animal por su nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return name.equals(animal.name);
    }
   
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}