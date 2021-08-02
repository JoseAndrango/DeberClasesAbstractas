
package test;
import dominio.*;

public class Alimentacion {
    public static void main(String[] args) {
        Planta planta = new Planta();
        Animal animal = new Animal();
        AnimalCarnivoro animalcarnivoro = new AnimalCarnivoro();
        AnimalHervivoro animalhervivoro = new AnimalHervivoro();
        planta.alimentarse();
        animal.alimentarse();
        animalcarnivoro.alimentarse();
        animalhervivoro.alimentarse();
    }
}
