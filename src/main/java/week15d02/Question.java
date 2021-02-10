package week15d02;

public class Question {
    private String question;
    private String answer;
    private int score;
    private String subject;

    public Question(String question, String answer, int score, String subject) {
        this.question = question;
        this.answer = answer;
        this.score = score;
        this.subject = subject;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                ", subject='" + subject + '\'' +
                '}';
    }
}
