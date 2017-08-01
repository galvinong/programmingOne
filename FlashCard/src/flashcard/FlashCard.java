package flashcard;

/**
 *
 * @author Galvin
 */
public class FlashCard {
    
    String getQuestion, getAnswer;
    
    public FlashCard(String question, String answer){
        getQuestion = question;
        getAnswer = answer;
    }

    public String getQuestion() {
        return this.getQuestion;
    }

    public String getAnswer() {
        return this.getAnswer;
    }
    
    
    
    
}
