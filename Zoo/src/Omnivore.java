/**
 *
 * @author Galvin
 */
public abstract class Omnivore extends Animal{

    public Omnivore(String name, Integer age) {
        super(name, age);
    }
    
    public void eat(Food foodItem){
        System.out.println(animalName + " is eating " + foodItem.getAnimalFood());
    }
    
}
