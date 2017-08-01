/**
 *
 * @author Galvin
 */
public class Main {
    public static void main(String[] args) throws Exception{
        
         //Creates animal objects and gives the start with the parameters given
        Animal myWolf = new Wolf("Wolfie",3);
        Animal myParrot = new Parrot("Parrot",2);
        Animal myGoat = new Goat("Goatie",1);

        Food meatItem = new Meat("Chicken");
        Food plantItem = new Plant("Spinach");

        myWolf.makeNoise();
        myParrot.makeNoise();
        myGoat.makeNoise();
          
        try{
            myWolf.eat(plantItem);
            myGoat.eat(meatItem);
        }catch(Exception e){
            System.err.println(e);
        }
            myParrot.eat(meatItem);
    }
    
    
    
}
