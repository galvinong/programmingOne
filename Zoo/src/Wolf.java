/**
 *
 * @author Galvin
 */

public class Wolf extends Carnivore {
    
//    String wolfName;
//    Integer wolfAge;
    
    public Wolf(String name, Integer age){
//        wolfName = name;
//        wolfAge = age;
          //Gets name and age from super class animal
          super(name,age);
    }   

//    public String getWolfName() {
//        return wolfName;
//    }
//
//    public Integer getWolfAge() {
//        return wolfAge;
//    }
    
    public void makeNoise(){
        //wolf make noise
        System.out.println("HOOOOOOWL!");
    }
    
}

