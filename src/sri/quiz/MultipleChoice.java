package sri.quiz;

import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Question {
    private HashMap<Integer,String> possibleAnswers = new HashMap<>();
    private int chosenAnswer;
    private int correctAnswer;

    public HashMap<Integer, String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(HashMap<Integer, String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public int getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(int chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void printPossibleAnswers() {
      for (Map.Entry answer: possibleAnswers.entrySet()){
          System.out.println(answer.getKey()+": "+answer.getValue());
      }
    }

    @Override
    public boolean verifyAnswer() {
        if (this.chosenAnswer == this.correctAnswer) {
            return true;
        } else return false;
    }
}
