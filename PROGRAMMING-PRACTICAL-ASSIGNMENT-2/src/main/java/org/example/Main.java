package org.example;
public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[] {
                new EasyQuestion("What is the capital city of South Africa?", new String[]{"Cape Town", "Pretoria", "Johannesburg"}, 1),
                new HardQuestion("Who was the first democratically elected president of South Africa?", new String[]{"Nelson Mandela", "Thabo Mbeki", "Jacob Zuma"}, 0),
                new EasyQuestion("Which South African city is known as the 'Mother City'?", new String[]{"Durban", "Cape Town", "Bloemfontein"}, 1),
                new HardQuestion("What is the name of South Africa's national rugby team?", new String[]{"Bafana Bafana", "Proteas", "Springboks"}, 2),
                new EasyQuestion("Which language is most spoken in South Africa?", new String[]{"Zulu", "Afrikaans", "Xhosa"}, 0),
                new HardQuestion("What year did South Africa host the FIFA World Cup?", new String[]{"2006", "2010", "2014"}, 1)
        };

        Player player = new Player("Silindokuhle");
        Quiz quiz = new Quiz(questions, player);
        quiz.start();
    }
}
