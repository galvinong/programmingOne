
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Galvin
 */
//PART 2 INTERFACES
public class Demo {
    //An interface is a group of related methods with empty bodies
    //It differs from an abstract class because it contains empty bodies where as abstract does not
    
    public static void main(String[] args){
        
        Animal myWolf = new Wolf("Wolfie",3);
        Animal babyWolf = new Wolf();
        Animal myParrot = new Parrot("Parrot",2);
        Animal myParrotTwo = new Parrot(2);
        Animal myGoat = new Goat("Goatie",1);
          
        ArrayList<Animal> zooAnimals = new ArrayList<Animal>();
        
        zooAnimals.add(myWolf);
        zooAnimals.add(babyWolf);
        zooAnimals.add(myParrot);
        zooAnimals.add(myParrotTwo);
        zooAnimals.add(myGoat);
        
        //Unsorted
        System.out.println("Unsorted");
        for(Animal outputAnimal : zooAnimals){
            System.out.println("Animal Age; " + outputAnimal.animalAge + ", Animal Name: " + outputAnimal.animalName);
        }
        
        //Sorted through age
        System.out.println("Sorted: Lowest to Highest");
        Collections.sort(zooAnimals);
        
        for (Animal outputAnimal : zooAnimals){
            System.out.println("Animal Age; " + outputAnimal.animalAge + ", Animal Name: " + outputAnimal.animalName);
        }
        
        //Sorted descending order
        System.out.println("Sorted: Highest to Lowest");
        Collections.reverse(zooAnimals);
                for (Animal outputAnimal : zooAnimals){
            System.out.println("Animal Age; " + outputAnimal.animalAge + ", Animal Name: " + outputAnimal.animalName);
        }
    }
}
