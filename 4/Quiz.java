import java.util.Scanner;

public class Quiz {
    private String questionText;
    private String correctAnswer;

    public Quiz(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    public String getQuestionText() {
        return questionText;
    }
}

class QuizManager {
    private Quiz[] questions;
    private int score;

    public QuizManager(int maxSize) {
        questions = new Quiz[maxSize];
        score = 0;
    }

    public void addQuestion(Quiz question) {
        if (questions.length < 25) {
            questions[questions.length] = question;
        }
    }

    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Quiz question : questions) {
            System.out.println(question.getQuestionText());
            String userAnswer = scanner.nextLine();
            if (question.checkAnswer(userAnswer)) {
                score++;
            }
        }
    }

    public void printResults() {
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);
    }
}
