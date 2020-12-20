package sri.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questionList = new ArrayList<>();
    int correctAnswers= 0;

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int numberOfQuestions(){
        return this.questionList.size();
    }

    public void addQuestions(Question question){
        this.questionList.add(question);
    }

    public void runQuiz(){
        System.out.println("Enter the answer with choice number");

        Scanner input = new Scanner(System.in);
        for(Question question: this.questionList){
            question.printQuestion();
            question.printPossibleAnswers();
            if(question.getClass().equals(MultipleChoice.class)){
                ((MultipleChoice)question).setChosenAnswer(input.nextInt());
                if((question).verifyAnswer()) correctAnswers++;
            }else if(question.getClass().equals(CheckBox.class)){
                List<Integer> chosenAnswer = new ArrayList<>();
                chosenAnswer.add(input.nextInt());
                chosenAnswer.add(input.nextInt());
                ((CheckBox)question).setChosenAnswer(chosenAnswer);
                if((question).verifyAnswer()) correctAnswers++;
            }else{
                ((TrueFalse)question).setChosenAnswer(input.nextInt());
                if((question).verifyAnswer()) correctAnswers++;

            }
        }
        input.close();
    }

    public double gradeQuiz(){
        int totalQuestions = this.questionList.size();
        return (this.correctAnswers * 100)/totalQuestions;
    }
}
