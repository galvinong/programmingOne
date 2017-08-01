/**
 *
 * @author Galvin
 */

public class Parrot extends Omnivore {
//    String parrotName;
//    Integer parrotAge;
    
    public Parrot(String name, Integer age){
//        parrotName = name;
//        parrotAge =  age;
        //Gets name and age from super class animal
         super(name,age);
    }

//    public String getParrotName() {
//        return parrotName;
//    }
//
//    public Integer getParrotAge() {
//        return parrotAge;
//    }
    
    public void makeNoise(){
        //parrot squawk
        System.out.println("SQUAWK!");
    }
    
    
}
