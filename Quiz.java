import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        String[][] questions = {
            {"Qual o nome da personagem principal do Life is Strange 1?", "B", "A) Chloe Price", "B) Max Caulfield", "C) Rachel Amber", "D) Nathan Prescott"},
            {"Quem possui o cabelo azul na franquia Life is Strange?", "A", "A) Chloe Price", "B) Max Caulfield", "C) Rachel Amber", "D) Nathan Prescott"},
            {"Em que cidade se passa o Life is Strange 1?", "C", "A) San Francisco", "B) Los Angeles", "C) Arcadia Bay", "D) Nevada"},
            {"Qual a data (somente ano) de lançamento do prímeiro episódio de Life is Strange 1?", "C", "A) 2013", "B) 2018", "C) 2015", "D) 2016"},
            {"Qual o nome do último jogo lançado pela franquia Life is Strange?", "A", "A) True Colors", "B) Before the Storm", "C) After the Storm", "D) The Awesome Adventures of Captain Spirit"}
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfQuestions = 5;
        int score = 0;

        boolean[] questionsAsked = new boolean[questions.length];

        for (int i = 0; i < numberOfQuestions; i++) {
            int index;
            do {
                index = random.nextInt(questions.length);
            } while (questionsAsked[index]);

            questionsAsked[index] = true;

            String[] question = questions[index];

            System.out.println("Pergunta " + (i + 1) + ": " + question[0]);
            for (int j = 2; j < question.length; j++) {
                System.out.println(question[j]);
            }

            System.out.print("Sua resposta (A, B, C ou D): ");
            String answer = scanner.nextLine().toUpperCase();

            if (answer.equals(question[1])) {
                System.out.println("Resposta correta!");
                score++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta é: " + question[1]);
            }

            System.out.println();
        }

        System.out.println("Pontuação final: " + score + "/" + numberOfQuestions);

        scanner.close();
    }
}
