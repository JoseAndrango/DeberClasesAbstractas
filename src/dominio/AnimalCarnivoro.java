
package dominio;

public class AnimalCarnivoro extends Animal{
    @Override
    public void alimentarse() {
        System.out.println("Carnivoros:");
        System.out.println("Los animales carnivoros se alimentan con carne");
    }
}
