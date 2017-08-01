package flashcard;

import java.util.ArrayList;

/**
 *
 * @author Galvin
 */
import java.io.*;
public class Quiz {
    
    FlashCardReader fCardReader;
    ArrayList<FlashCard> arrayflashCard = new ArrayList<FlashCard>();
    Toolbox toolBox = new Toolbox();
    String sInput, sAnswer, outputAns="", sResults;
    double totalScore, numberQuestions, percentageScore;
    PrintStream pS;
    FileOutputStream fileWriter;
    File fileName = new File("src/flashcard/scorelist.txt");
    
    
    public Quiz() throws IOException{
        fCardReader = new FlashCardReader();
        arrayflashCard = fCardReader.getFlashCards();
        this.play();
        
        
    }
    
    public void play() throws IOException{
        //For each loop to go through the whole game
        //Has an if to check whether answer is correct or wrong
        //If wrong, answer will be displayed and move on to the next question until all the questions have finished
        //Has a string to keep track of progress, score and number of questions are tracked as well
        //Prompts user to save, which saves results into a file
        
        //NOTE TO SELF, method needs to be assigned to a variable, if not will execute another round
        //error encountered: fCardReader.getFlashCards was used instead of arrayflashCard causing to run an additional round
        
        
        for(FlashCard flashCard : arrayflashCard){
            outputAns += ("Question: " + flashCard.getQuestion + ", ");
            numberQuestions++;
            System.out.println("\nQ: " + flashCard.getQuestion);
            
            sAnswer = flashCard.getAnswer;
            sInput = toolBox.readStringFromCmd();
            outputAns +=("Input: " + sInput + ", ");
            
            if (sInput.equals(sAnswer)){    
                System.out.println("You are correct!");
                outputAns +=("You are correct!" + "\n");
                totalScore++;
                
            }else{
                System.err.println("You are wrong, the answer is " + sAnswer);
                outputAns +=("You are wrong, " + "The answer is " + sAnswer + "\n");
            }
        }
            percentageScore = (totalScore / numberQuestions) * 100;
            outputAns += ("Score: " + totalScore);
            outputAns += (", Number of questions asked: " + numberQuestions);
            outputAns += (", Percentage: " + percentageScore +"%");
            
            System.out.println("*******END OF QUIZ*********");
            System.out.println("\nDo you want to save your results? Y / N");
            sResults = toolBox.readStringFromCmd();
            if (sResults.equals("Y")){
                save();
                System.out.println("Results saved!");
            }else{
                System.exit(0);
            }
        
    }
    
    public void save() throws IOException{
        //Writes the question, the answer, the answer user gave and whether the answer is right or wrong seperated by commas
        //fileName.createNewFile();
        fileWriter = new FileOutputStream(fileName, true);
        pS = new PrintStream(fileWriter);
        pS.print(outputAns);
        if (pS != null) {
            pS.close();
        }
    }
        
     public static void main(String[] args) throws IOException{
         Quiz eQuiz = new Quiz();
     }   
    
}
