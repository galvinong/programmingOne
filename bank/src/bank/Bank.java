/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Galvin
 */
public class Bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        loan[] loans = new loan[10];
        deposit[] deposits = new deposit[10];
        int i=0,j=0,k=0,l=0;
        int totalLoans = 0, totalDeposits = 0;
        float per=0;
        do{
            try{
                System.out.println("Enter a  number, press 1 for registration for a \n1. Loan account \n2. Deposit account \n3. Check status of bank \n4. Quit");
                option = input.nextInt();

                if (option == 1){
                    System.out.println("You have chosen loan account, enter account number to be registered");
                    int accountNumber = input.nextInt();
                    System.out.println("Enter amount");
                    int accountBalance = input.nextInt();

                    loans[i] = new loan(accountNumber, accountBalance);

                    System.out.println("Account Number : " + loans[i].getAccNum() + " Amount: " +  loans[i].getAccAmt());
                    i++;
                }

                if(option == 2){
                    System.out.println("You have chosen deposit account, enter account number to be registered");
                    int accountNumber2 = input.nextInt();
                    System.out.println("Enter amount to be deposited in");
                    int accountBalance2 = input.nextInt();

                    deposits[j] = new deposit(accountNumber2, accountBalance2);
                    j++;
                }
                
                if(option == 3){
                    while(k < i){
                        totalLoans += loans[k].getAccAmt();
                        System.out.println("Total loans: " + totalLoans);
                        k++;
                    }
                    while(l < j){
                        totalDeposits += deposits[l].getAccAmt();
                        System.out.println("Total deposits: " + totalDeposits);
                        l++;
                    }
                    per = ((float)totalDeposits/(float)totalLoans)*100;
                    System.out.println("Percentage : " + (int)per+"%");
                    
                    if (per < 15){
                        System.out.println("***ALARM****");
                    }
                    
                }

            }catch( InputMismatchException inputMismatchException ) {
                System.err.println( "\nException: "+ inputMismatchException ); 
                input.nextLine();                                                    // discard input so user can try again !
                System.out.println("You must enter integers. Please try again.\n" );  
            }
        }while(option > 0 && option <= 3);
    }
    
}
