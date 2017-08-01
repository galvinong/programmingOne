package flashcard;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Galvin
 */

public class FlashCardReader {
    
    BufferedReader reader;
    ArrayList<FlashCard> cards = new ArrayList<FlashCard>();
    FlashCard flashCard;
    String sLines;
    String[] sSplit;
    
    //Retrieves questions from text file, uses a buffered and file reader
    public FlashCardReader() throws IOException{
        try{
            //Encountered a problem with file location, finally found that needed to move up folder to retrieve file
            reader = new BufferedReader(new FileReader("src/flashcard/Questions.txt"));
            
        }catch(FileNotFoundException e){
            System.err.println(e + " Please check the filename again"); 
        }
    }
       
    //Reads the whole line from reader
    public String getLine() throws IOException{
        //Need to read each line by line here
        sLines = reader.readLine();
        return sLines;
    }
    
    public boolean fileReady() throws IOException{ 
        return reader.ready();  
    }
    
    //Getting data from getLine and inputting the data into flashcard for arraylist of cards
    public ArrayList<FlashCard> getFlashCards() throws IOException{
        //Lots of problem encountered to get this to work, mistaken that split could be used to getLines seperately
        //Solved by using looping getLines
        //Stops when reader is closed
        do{
            this.getLine();
            sSplit = sLines.split(":");
            String output = sSplit[0];  
            String output2 = sSplit[1];
            flashCard = new FlashCard(output, output2);
            cards.add(flashCard);
        }while(fileReady() == true);
        return cards;
    }
        
}
