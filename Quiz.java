import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        String[][] questions = {
            {"Qual o nome da personagem principal do Life is Strange 1?", "Max Caulfield"},
            {"Quem possui o cabelo azul na franquia Life is Strange?", "Chloe Price"},
            {"Em que cidade se passa o Life is Strange 1?", "Arcadia Bay"},
            {"Qual a data (somente ano) de lançamento do prímeiro episódio de Life is Strange 1?", "2015"},
            {"Qual o nome do último jogo lançado pela franquia Life is Strange?", "True Colors"}
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

            System.out.print("Sua resposta: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(question[1])) {
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
