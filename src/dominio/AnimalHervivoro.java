
package dominio;

public class AnimalHervivoro extends Animal{
    @Override
    public void alimentarse() {
        System.out.println("Hervivoros");
        System.out.println("Los animales hervivoros se alimentan con pasto");
    }
}
