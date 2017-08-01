package atm;

/**
 *
 * @author Galvin
 */
//import org.apache.commons.lang.StringUtils; Decided to omit this as may not work on iSolutions computer

public class ATM{

	public Integer balance;
	Toolbox myToolbox = new Toolbox();
        public Boolean running;
        public String lineOutput="";
        
        //Draws the symbols for title
        public String symbolDraw(String inputType){
            //input into a string
            for(int i = 0; i < 15;i++){
			lineOutput += "*";			
		}
            
            lineOutput += "\n    " + inputType + "\n";
            
            for(int j = 0; j < 15; j++){
			lineOutput += "*";			
		}
            
            lineOutput +="\n";
            
            return lineOutput;
            
        }
        
        //Method for withdrawing money
	public Integer withdraw(){
            Integer numberWithdraw;    
            //Shorten the code by offloading bulk of the loop to a method
            System.out.println(symbolDraw("Withdraw"));		
                
            System.out.println("How much would like to withdraw \n Enter your number");
            numberWithdraw =  myToolbox.readIntegerFromCmd();
                
            //Error checking, for input numbers lesser than one, prompt it constantly by using loop
            while(numberWithdraw < 1){
                if (numberWithdraw < 1){
                    System.out.println("Invalid amount, please enter it again");
                    numberWithdraw =  myToolbox.readIntegerFromCmd();
                }
            }

            //Error checking, checks for balance to be more than number wanting to withdraw
            if (balance >= numberWithdraw){
                balance -= numberWithdraw;
            }else{
                System.out.println("You do not have enough money to withdraw!");
            }
            //Returns balance if everything works out
            return balance;
	}
        
        //Method deposit declared 
	public Integer deposit(){
		Integer numberDeposit;
		
                System.out.println(symbolDraw("Deposit"));
                
                //Read input
		System.out.println("How much would like to deposit \n Enter your number");
		numberDeposit =  myToolbox.readIntegerFromCmd();
                
                //Error checking again, to check that you dont input anything below 1
                while(numberDeposit < 1){
                    if (numberDeposit < 1){
                        System.out.println("Invalid amount, please enter it again");
                        numberDeposit =  myToolbox.readIntegerFromCmd();
                    }
                }
                //Addds to balance
		balance += numberDeposit;
		return balance;
	}

	//Checks balance
	public void inquire(){
             System.out.println(symbolDraw("Inquire"));  
             System.out.println("Your current balance is " + balance);

	}
        
        //Exits program
        public void quit(){
                System.out.println(symbolDraw("Goodbye"));
                System.exit(0);
        }

        //Main execution program
	public Integer go(){
		//Toolbox myToolbox = new Toolbox();
		Integer choice;
                running = true;
		
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		System.out.println("Enter your balance");
                balance =  myToolbox.readIntegerFromCmd();
                
                //Starts by asking balance, and checks for invalid input
                while(balance < 1){ 
                    if (balance < 1){
                        System.out.println("Invalid amount, please enter it again");
                        balance =  myToolbox.readIntegerFromCmd();
                    }
                }
                
		System.out.println("Balance is " + balance);	
		
                //Option checking for menu choice
		while(running = true){
			System.out.println("\nWhat do you want to do? \n 1: Withdraw \n 2: Deposit \n 3: Inquire \n 4: Quit");
			choice =  myToolbox.readIntegerFromCmd();		

			if(choice.equals(1)){
				withdraw();
			}
			else if(choice.equals(2)){
				deposit();
			}
			else if(choice.equals(3)){
				inquire();
			}
                        else if(choice.equals(4)){
                               quit();          
                        }
		}
		return balance;
	}
		
	public static void main(String[] args){	
		ATM myATM = new ATM();
		myATM.go();
	}

}
