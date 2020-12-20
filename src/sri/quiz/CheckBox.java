package sri.quiz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckBox extends Question {
    private HashMap<Integer,String> possibleAnswers = new HashMap<>();
    private List<Integer> chosenAnswer;
    private List<Integer> correctAnswer;

    public HashMap<Integer, String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(HashMap<Integer, String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public List<Integer> getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(List<Integer> chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public List<Integer> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(List<Integer> correctAnswer) {
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
        return this.chosenAnswer.equals(this.correctAnswer);
    }
}
