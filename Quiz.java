import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("           Bem-vindo ao Quiz de " + 
                                    "Victor Fernandes Ferreira");
        System.out.println("             Faculdade: UNIFAN");
        System.out.println("                Professor: Brenno");
        System.out.println("            Tema: Life is Strange");
        System.out.println("==================================================");
        System.out.println();

        String[][] questions = {
            {"Qual é o nome da protagonista de Life is Strange?", "A", "A) Max Caulfield", "B) Chloe Price", "C) Rachel Amber", "D) Kate Marsh"},
            {"Em que cidade o jogo Life is Strange se passa?", "C", "A) Seattle", "B) Nova York", "C) Arcadia Bay", "D) Los Angeles"},
            {"Qual é o superpoder de Max em Life is Strange?", "D", "A) Telepatia", "B) Telecinese", "C) Invisibilidade", "D) Retrocognição"},
            {"Quem é o melhor amigo de Max em Life is Strange?", "B", "A) Warren Graham", "B) Chloe Price", "C) Nathan Prescott", "D) Frank Bowers"},
            {"Qual é o nome da escola em que Max estuda em Life is Strange?", "D", "A) Blackwell Academy", "B) Arcadia High School", "C) Jefferson High School", "D) Blackwell Academy"},
            {"Qual é o nome do farol onde ocorre um importante evento em Life is Strange?", "A", "A) Farol do Penhasco", "B) Farol de Arcadia Bay", "C) Farol da Tempestade", "D) Farol dos Sonhos"},
            {"Quem é o diretor de Blackwell Academy em Life is Strange?", "B", "A) Nathan Prescott", "B) Mark Jefferson", "C) David Madsen", "D) Frank Bowers"},
            {"Qual é o nome do grupo de música indie favorito de Chloe em Life is Strange?", "C", "A) The Vortex Club", "B) The Tempest", "C) Firewalk", "D) The Blackwell Rebels"},
            {"Qual é o nome do animal de estimação de Max em Life is Strange?", "A", "A) Peixe", "B) Gato", "C) Cachorro", "D) Coelho"},
            {"Qual é a música-tema de Life is Strange?", "B", "A) To All of You", "B) Obstacles", "C) Spanish Sahara", "D) Lua"},
            {"Qual é o nome do pai de Chloe em Life is Strange?", "C", "A) William Price", "B) Richard Marsh", "C) William Marsh", "D) Tom Caulfield"},
            {"Onde Max encontra pela primeira vez o diário de Rachel Amber em Life is Strange?", "A", "A) No banheiro da escola", "B) No quarto de Chloe", "C) Na sala de aula", "D) Na biblioteca da escola"},
            {"Qual é o nome da cidade fictícia em que se passa Life is Strange 2?", "C", "A) Arcadia Bay", "B) Seattle", "C) Beaver Creek", "D) Portland"},
            {"Qual é a habilidade especial de Daniel, o irmão mais novo de Sean, em Life is Strange 2?", "B", "A) Levitação", "B) Telecinese", "C) Clarividência", "D) Pirocinese"},
            {"Qual é o nome do protagonista de Life is Strange: Before the Storm?", "A", "A) Chloe Price", "B) Max Caulfield", "C) Rachel Amber", "D) Nathan Prescott"}
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
