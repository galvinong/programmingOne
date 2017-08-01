/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hash2;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Galvin
 */
public class WordGroup {
    String words;
    
    
    public WordGroup(String lowerCase){
        words = lowerCase.toLowerCase();
    }
    
    
    public String[] getWordArray(){
        return words.split(" ");
    }
    
    public HashSet<String> getWordSet(WordGroup wordGroup){
        HashSet<String> hashSet = new HashSet<>();
       
        
        for(String words : wordGroup.getWordArray()){
            hashSet.add(words);
        }
        
        for(String words :this.getWordArray()){
            hashSet.add(words);
        }
        
        return hashSet;
    }
    
    public HashMap<String,Integer> getWordCounts(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        int repeatNum = 0;
        
        for(String words : this.getWordArray()){
            
            if(hashMap.containsKey(words)){
                //Retrieves the current number stored inside hashMap, meaning the number of repeats
                repeatNum = hashMap.get(words);
                repeatNum++;
                hashMap.put(words, repeatNum);
            }else{
                hashMap.put(words, 1);
            }
        }
               
        return hashMap;
    }
}
