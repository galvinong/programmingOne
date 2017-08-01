package tester;

public class SmartCard{
        
        public String userName;
        protected boolean staffStatus;
        
        protected SmartCard(String ownerName){
            userName = ownerName; //takes ownerName from tester.java and put returns it in getOwner
            //System.out.println(userName);
        }
  
        protected String getOwner(){
            return userName; //returns userName here when requested
        }
        
        protected boolean isStaff(){ //used to check Staff status, == is for comparison 
            if(staffStatus == false){
                return false;
            }else{
                return true;
            }  
        }
        
        protected void setStaff(boolean staffStatusB){ //used to set staff status, set it as an option in tester.java
            //System.out.println(staffStatus); //to check staffStatus boolean value
            staffStatus = staffStatusB;
        }
        
}

