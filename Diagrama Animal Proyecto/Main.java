public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes tipos de animales
        Animal animal = new Animal("Generic");
        Mammal mammal = new Mammal("Mammal1");
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Buddy");

        // Imprimir la información de cada animal usando toString
        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog);

        // Hacer que el gato salude
        cat.greet();               // Imprime "Meow"
        // Hacer que el perro salude
        dog.greet();               // Imprime "Woof"
        // Hacer que el perro salude a otro perro
        dog.greet(new Dog("Max")); // Imprime "Woooo!"
    }
}