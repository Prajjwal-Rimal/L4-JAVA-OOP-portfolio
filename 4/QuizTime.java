public class QuizTime {
    public static void main(String[] args) {
        QuizManager quizManager = new QuizManager(25);

        // Add questions to the quiz
        quizManager.addQuestion(new Quiz("What is the capital of France?", "Paris"));
        quizManager.addQuestion(new Quiz("Who wrote 'Romeo and Juliet'?", "Shakespeare"));
        // Add more questions here...

        // Present the quiz to the user
        quizManager.giveQuiz();

        // Print the final results
        quizManager.printResults();
    }
}
