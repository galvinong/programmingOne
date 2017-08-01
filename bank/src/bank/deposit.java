/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Galvin
 */
public class deposit {
    private int accNum;
    private int accAmt;
    
    public deposit(int accNum, int accAmt){
        this.accAmt = accAmt;
        this.accNum = accNum;
    }
    
    public int getAccAmt(){
        return accAmt;
    }
    
    public int getAccNum(){
        return accNum;
    }
      
}
