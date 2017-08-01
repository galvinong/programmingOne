/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Galvin
 */
public class SmartCard {
    
    String ownerName;
    boolean staffStatus;
    
    public SmartCard(String inputName){
        ownerName = inputName;
    }

    public String getOwner() {
        return ownerName;
    }
    
    public boolean isStaff(){
        if(staffStatus == true){
            return true;
        }else{
            return false;
        }
    }

    public void setStaff(boolean staffStatus) {
        this.staffStatus = staffStatus;
    }
    
}
