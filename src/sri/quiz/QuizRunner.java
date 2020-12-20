package sri.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args){
       Quiz firstQuiz = new Quiz();
        Question question1 = new MultipleChoice();
        question1.setQuestion("How many legs are there in a cat?");
        HashMap<Integer, String> possibleAnswers = new HashMap<>();
        possibleAnswers.put(1,"1");
        possibleAnswers.put(2,"2");
        possibleAnswers.put(3,"3");
        possibleAnswers.put(4,"4");
        ((MultipleChoice)question1).setPossibleAnswers(possibleAnswers);
        ((MultipleChoice)question1).setCorrectAnswer(4);
        firstQuiz.addQuestions(question1);

        Question question2 = new CheckBox();
        question2.setQuestion("Which animals belong to a cat family?");
        HashMap<Integer, String> possibleAnswersForCheckBox = new HashMap<>();
        possibleAnswersForCheckBox.put(1,"Lion");
        possibleAnswersForCheckBox.put(2,"Tiger");
        possibleAnswersForCheckBox.put(3,"Rabbit");
        possibleAnswersForCheckBox.put(4,"Giraffe");
        ((CheckBox)question2).setPossibleAnswers(possibleAnswersForCheckBox);
        List<Integer> correctAnswer = new ArrayList<>();
        correctAnswer.add(1);
        correctAnswer.add(2);
        ((CheckBox)question2).setCorrectAnswer(correctAnswer);
       firstQuiz.addQuestions(question2);

       Question question3 = new TrueFalse();
       question3.setQuestion("Is cat a pet?");
        HashMap<Integer, Boolean> options = new HashMap<>();
        options.put(1,Boolean.TRUE);
        options.put(2,Boolean.FALSE);
        ((TrueFalse)question3).setPossibleAnswers(options);
        ((TrueFalse)question3).setCorrectAnswer(1);
       firstQuiz.addQuestions(question3);

       firstQuiz.runQuiz();
       double quizScore = firstQuiz.gradeQuiz();
        System.out.println("There were "+firstQuiz.numberOfQuestions()+" questions you answered "+firstQuiz.correctAnswers+" correctly");
        System.out.println("Your quiz score is "+quizScore+"%");


    }
}
