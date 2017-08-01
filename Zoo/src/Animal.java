/**
 *
 * @author Galvin
 */
public abstract class Animal{
    String animalName;
    Integer animalAge;
    
    public Animal(String name, Integer age){
        animalName = name;
        animalAge = age;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Integer getAnimalAge() {
        return animalAge;
    }
    
    abstract void makeNoise();
    abstract void eat(Food foodItem) throws Exception;
   
    
}
