/**
 *
 * @author Galvin
 */

public class Goat extends Herbivore{
    public Goat(String name, Integer age){
        //Gets name and age from super class animal
        super(name,age);
    }
    
    public void makeNoise(){
        System.out.println("BAAAAA");
    }
}
