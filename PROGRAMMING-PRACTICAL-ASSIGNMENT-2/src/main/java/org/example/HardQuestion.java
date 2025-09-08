package org.example;

public class HardQuestion extends Question {
    public HardQuestion(String questionText, String[] options, int correctAnswerIndex) {
        super(questionText, options, correctAnswerIndex);
    }

    @Override
    public int getPoints() {
        return 2;
    }
}
