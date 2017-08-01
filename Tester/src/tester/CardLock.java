package tester;

public class CardLock
{

    private String lastCardName;
    private boolean lastStaffStatus = false;
    private boolean switchAccess = false;
    SmartCard lastCard = new SmartCard(lastCardName); //problems encountered, swipeCard returned null, realised that needed lastCard and lastCardName to make it work

    public CardLock(){
        
    }
    
    protected void swipeCard(SmartCard smartCard){ //takes down userName for using the lock
        //System.out.println(smartCard);
        
        lastCard = smartCard; //gets SmartCard, put in a variable usable for this class
        lastCardName = smartCard.userName; //gets the name for the card, uses it for the new smartcard
        lastStaffStatus = smartCard.staffStatus; //takes the staff status from SmartCard and uses it for isUnlocked
        
        //System.out.println("*lastStaffStatus is " + lastStaffStatus);
    }

    protected SmartCard getLastCardSeen(){  
        return lastCard; //returns the previous SmartCard used from swipeCard
    }
    
    
    protected boolean isUnlocked(){
        //need to change this to something else to allow toggleStudentAccess
        //System.out.println("*****lastStaffStatus is " +lastStaffStatus);
        //System.out.println("*****Switch Access is " + switchAccess);
     
        //Main logic is to allow students through when their lastStaffStatus is false, so switchAccess is linked to the toggleStudentAccess
        //numbers are to check whether the if statements are working properly.
        
        if (lastStaffStatus == false){ //asked postgrad, (NOTE) == is for comparison and = is for assignment
            if (switchAccess == true){ 
                
                //System.out.println("1");
                return true;
            }
            if(switchAccess == false){ // false
                //System.out.println("2");
                return false;
            }
            //System.out.println("3");
            return false;
        }
        
        if (lastStaffStatus == true){    
            //System.out.println("4");
            return true;
        }else{
            //System.out.println("5");
            return false;
        } 
    }
    
    protected void toggleStudentAccess(){
        //System.out.println("Switch Access is " + switchAccess);
        //turns on and off switchAccess, toggles it on and off depending on current switchAccess
        
        if(switchAccess == false){
            switchAccess = true;
        }else if(switchAccess == true){
            switchAccess = false;
        }
        
        
        
        //switchAccess!=true?switchAccess=true:switchAccess!=false?switchAccess=false;
        //use conditionals for one line code 
        
        //System.out.println("Switch Access is " + switchAccess);
    }
        
        
    
}
