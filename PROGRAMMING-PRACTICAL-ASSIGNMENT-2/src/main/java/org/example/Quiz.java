package org.example;

import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private Player player;

    public Quiz(Question[] questions, Player player) {
        this.questions = questions;
        this.player = player;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the South African Quiz, " + player.getName()+ "!");

        for (Question q : questions) {
            System.out.println("\n" + q.getQuestionText());
            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Your answer (1-" + options.length + "): ");
            int answer = scanner.nextInt() - 1;
            if (q.isCorrect(answer)) {
                System.out.println("Correct!");
                player.addScore(q.getPoints());
            } else {
                System.out.println("Incorrect. The correct answer was: " + options[q.getCorrectAnswerIndex()]);
            }
        }

        System.out.println("\nQuiz Over! " + player.getName() + ", your final score is: " + player.getScore());
        scanner.close();
    }
}
