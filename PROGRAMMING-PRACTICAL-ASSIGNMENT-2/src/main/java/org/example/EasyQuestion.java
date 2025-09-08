package org.example;

public class EasyQuestion extends Question {
    public EasyQuestion(String questionText, String[] options, int correctAnswerIndex) {
        super(questionText, options, correctAnswerIndex);
    }

    @Override
    public int getPoints() {
        return 1;
    }
}
