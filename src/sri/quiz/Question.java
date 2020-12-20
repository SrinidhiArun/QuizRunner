package sri.quiz;

public abstract class Question {
    private String question;

    public void setQuestion(String question) {
        this.question = question;
    }

    public void printQuestion(){
        System.out.println(question);
    }

    public abstract void printPossibleAnswers();

    public abstract boolean verifyAnswer();
}
