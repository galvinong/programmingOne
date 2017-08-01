/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hash2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Galvin
 */
public class Main {
    public static void main(String[] args){
        
        //Part One String Arrays
        System.out.println("\nPART ONE\n");
        String[] arrayStringOne, arrayStringTwo;
        WordGroup phraseOne = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup phraseTwo = new WordGroup("When you play play hard when you work dont play at all");
        
        
        //Make two array of strings
        arrayStringOne = phraseOne.getWordArray();
        arrayStringTwo = phraseTwo.getWordArray();
        
        for(String stringOut : arrayStringOne){
            System.out.println(stringOut);
        }
        
        for(String stringOut : arrayStringTwo){
            System.out.println(stringOut);
        }
        
        
        //Part Two HashSet
        System.out.println("\nPART TWO\n");
        HashSet hashSet = new HashSet();
        hashSet = phraseOne.getWordSet(phraseTwo);
        Iterator hashItr = hashSet.iterator();
        
        while(hashItr.hasNext()){
            System.out.println(hashItr.next());
        }
        
        
        //Part Three HashMap
        System.out.println("\nPART THREE\n");
        HashMap<String,Integer> hashMapOne = new HashMap<>();
        HashMap<String,Integer> hashMapTwo = new HashMap<>();
        
        hashMapOne = phraseOne.getWordCounts();
        hashMapTwo = phraseTwo.getWordCounts();
        
        for(String wordOut : hashMapOne.keySet()){
            System.out.println(wordOut + " " + hashMapOne.get(wordOut));
        }
        
        for(String wordOut : hashMapTwo.keySet()){
            System.out.println(wordOut + " " + hashMapTwo.get(wordOut));
        }
        
        //Final Part WordGroup,WordSet
        System.out.println("\nFINAL PART\n");
        Integer wordCountOne, wordCountTwo;
        for(String wordOut : phraseOne.getWordSet(phraseTwo)){
            
            wordCountOne = hashMapOne.get(wordOut);
            if(wordCountOne == null){
                wordCountOne = 0;
            }
            
            wordCountTwo = hashMapTwo.get(wordOut);
            if(wordCountTwo == null){
                wordCountTwo = 0;
            }
            
            System.out.println(wordOut + " " + (wordCountOne.intValue() + wordCountTwo.intValue()));
        }
        
    }
    
}
