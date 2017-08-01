/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hash;

import java.util.*;

/**
 *
 * @author Galvin
 */
public class WordGroup {
    String words;
    
    public WordGroup (String lowerCase){
        words = lowerCase.toLowerCase(); 
    }
    
    //Detects the sentence by using " ", takes the word and inputs into the array
    public String[] getWordArray(){
        return words.split(" ");
    }
    
    public HashSet<String> getWordSet(WordGroup wordGroup){ //needs to declare <String> for loop in part 2
        HashSet<String> myHashSet = new HashSet<String>();
        
        //A different way of using for loop
//        for(int i = 0; i < wordGroup.getWordArray().length; i++){
//            myHashSet.add(wordGroup.getWordArray()[i]);
//        }
        
        //*Hashset is always different, there is no order*
        //For adding number two wordGroup
        //each for loop does most of the work by calculating size etc
        
        //Use WordSet to make complete set of all the words from both WordGroups 
        for (String string : wordGroup.getWordArray()){   
            myHashSet.add(string);
        }
        
        //For adding number one wordGroup
        for(String string : this.getWordArray()){
            myHashSet.add(string);
        }
        
        return myHashSet;

    }
    
    public HashMap<String,Integer> getWordCounts(){
        HashMap<String,Integer> myHashMap = new HashMap();
            
        //Loops over all the words returned by getWordArray()
        for(String outputWord : this.getWordArray()){  
            
            //Checks whether if it repeats
            if(myHashMap.containsKey(outputWord)) { //checks for repetition
                int repeatNum = myHashMap.get(outputWord);
                repeatNum++;
                myHashMap.put(outputWord,repeatNum); //inserts the data with word and number it repeats
            }
            else{
                myHashMap.put(outputWord, 1); //words without repeat will go into here
            }
        
        }        
            return myHashMap;   
    } 
}
