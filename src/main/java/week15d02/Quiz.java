package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {
    List<Question> questions = new ArrayList<>();

    public List<Question> getQuestions() {
        return questions;
    }

    public Quiz(Path path) {
        loadFile(path);
    }

    public void loadFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String question = line;
                line = br.readLine();
                String answer = line.split(" ")[0];
                int score = Integer.parseInt(line.split(" ")[1]);
                String subject = line.split(" ")[2];
                questions.add(new Question(question, answer, score, subject));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

    public List<String> getQuestionBySubject(String subject) {
        List<String> result = new ArrayList<>();
        for (Question question : questions) {
            if (question.getSubject().equals(subject)) {
                result.add(question.getQuestion());
            }
        }
        return result;
    }

    public Question returnRandomQuestion() {
        Random rnd = new Random();
        int index = rnd.nextInt(questions.size());
        return questions.get(index);
    }

    public Map<String, List<String>> getAllQuestionsBySubject() {
        Map<String, List<String>> result = new HashMap<>();
        for (Question question : questions) {
            if (!result.containsKey(question.getSubject())) {
                result.put(question.getSubject(), new ArrayList<>());
            }
            result.get(question.getSubject()).add(question.getQuestion());
        }
        return result;
    }

    private Map<String, Integer> getScoreBySubject() {
        Map<String, Integer> temp = new HashMap<>();
        for (Question question : questions) {
            if (!temp.containsKey(question.getSubject())) {
                temp.put(question.getSubject(), 0);
            }
            temp.put(question.getSubject(), temp.get(question.getSubject()) + question.getScore());
        }
        return temp;
    }

    public String getHighScoreBySubject() {
        Map<String, Integer> tempMap = this.getScoreBySubject();
        int max = 0;
        Map.Entry<String, Integer> tempEntry = null;
        for (Map.Entry<String, Integer> m : tempMap.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                tempEntry = m;
            }
        }
        return tempEntry.getKey();
    }

    public static void main(String[] args) {

        Path path = Path.of("kerdesek.txt");

        Quiz quiz = new Quiz(path);
        //System.out.println(quiz.questions.size());
        //System.out.println(quiz.getQuestionBySubject("tortenelem").size());
        //System.out.println(quiz.returnRandomQuestion());
        System.out.println(quiz.getAllQuestionsBySubject());
        System.out.println(quiz.getScoreBySubject());
        System.out.println(quiz.getHighScoreBySubject());


    }
}
