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
public class Hash {

    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        WordGroup firstQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup secondQuote = new WordGroup("When you play play hard when you work dont play at all");
        

        //Creates a string array, and puts the string into it
        String[] first = firstQuote.getWordArray();
        String[] second = secondQuote.getWordArray();
        
        //Part 1 Arrays and String API
        System.out.println("PART 1 \n");
        //Prints out quote with each word seperated
        for (int i =0; i < first.length; i++){
            System.out.println(first[i]);
        }
        
        for (int j = 0; j < second.length; j++){
            System.out.println(second[j]);
        }

        
        //Part 2 Hashset and Hashset API
        System.out.println("\nPART 2 \n");
        //Uses the firstQuote to print out secondQupte
        for(String output : firstQuote.getWordSet(secondQuote)){
            System.out.println(output);
        }
        //Uses the secondQuote to print out firstQuote
        for(String output2 : secondQuote.getWordSet(firstQuote)){
            System.out.println(output2);
        }
        
        //Part 3 HashMap and HashMap API
        System.out.println("\nPART 3 \n");
        //Creates HashMap with reference to WordGroup
        HashMap<String, Integer> hashMap1 = firstQuote.getWordCounts();
        HashMap<String, Integer> hashMap2 = secondQuote.getWordCounts();
        
        //Prints it out, with the keySet being the "keyword"/codomain
        for(String hashString1 :hashMap1.keySet()){
            System.out.println(hashString1 + " " + hashMap1.get(hashString1));
        }
        
        for(String hashString2 : hashMap2.keySet()){
            System.out.println(hashString2 + " " + hashMap2.get(hashString2));
        }
        
        
        //Last Part
        //Creates another wordSet containing two quotes
        System.out.println("\n Last Part \n");
        for(String output3:firstQuote.getWordSet(secondQuote)){
        
            //Gets the occurence of each word from each hashmap and adds them together
            Integer count1, count2; 
                    count1 = hashMap1.get(output3);
                    if (count1 == null){
                        count1 = 0;
                    }
                    count2 = hashMap2.get(output3);
                    if (count2 == null){
                        count2 = 0;
                    }
                   System.out.println(output3 + ": " + (count1.intValue() + count2.intValue()));
        }

    }
    */
    
}
