/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Galvin
 */
public class CardLock {
    
    SmartCard inputCard;
    boolean lockStatus, studentAccess = false;
    
    public CardLock(){

    }
    
    
    public void swipeCard(SmartCard cardSwiped){
        this.inputCard = cardSwiped;
    }
    
    
    public SmartCard getLastCardSeen(){
        return inputCard;
    }
    
    public boolean isUnlocked(){
        if (inputCard.staffStatus == true || studentAccess == true){
            return lockStatus = true;
        }else if(inputCard.staffStatus == false){
            return lockStatus = false;
        }else{
            return false;
        }
    }
    
    public void toggleStudentAccess(){      
        if (studentAccess == false){
            studentAccess = true;
        }else{
            studentAccess = false;
        }
        
    }
    
    
}
