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
public class loan {
    private int accNum;
    private int accAmt;
    
    public loan(int accNum, int accAmt){
        this.accNum = accNum;
        this.accAmt = accAmt;
    }
    
    public int getAccNum(){
    return accNum;
    }
    
    public int getAccAmt(){
        return accAmt;
    }
}
