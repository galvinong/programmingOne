/**
 *
 * @author Galvin
 */


public abstract class Animal implements Comparable<Animal>{
    String animalName;
    Integer animalAge;
    
    public Animal(String name, Integer age){
        animalName = name;
        animalAge = age;
    }
    
    public Animal(Integer age){
        animalName = "Polly";
        animalAge = age;
    }
    
    public Animal(){
        this("newborn",0);
    }

    public String getAnimalName() {
        return animalName;
    }

    public Integer getAnimalAge() {
        return animalAge;
    }
    
    //It is used as a reminder to declare this method in the subclasses such as wolf, parrot and goat
    abstract void makeNoise();
    abstract void eat(Food foodItem) throws Exception;
    
    //Lab 8 Overloading Part 1
    public void eat(Food foodItem, Integer numberTimes) throws Exception{
        for (int i = 0 ; i < numberTimes; i++){
            this.eat(foodItem);
        }
    }
    
    public int compareTo(Animal myAnimal){

        if(this.animalAge > myAnimal.animalAge){
            return 1;
        }
        else if(this.animalAge < myAnimal.animalAge){
            return -1;
        }
        else{
            return 0;
        }
        
    }


    
}
