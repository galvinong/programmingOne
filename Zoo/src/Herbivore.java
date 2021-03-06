/**
 *
 * @author Galvin
 */
public abstract class Herbivore extends Animal{

    
    public Herbivore(String name, Integer age) {
        super(name, age);
    }
    
    public void eat(Food foodItem)throws Exception{
       //try catch whether food item contains object meat, throw exception if it does
       try{
                if (foodItem instanceof Meat){
                    throw new Exception (animalName + " can't eat " + foodItem.getAnimalFood());
                }else{
                    System.out.println(animalName + " is eating " + foodItem.getAnimalFood());
                }
                
       }catch(Exception e){
               //catches the exception and print it out in err
               System.err.println(e);
       }
       
    }
    

}
