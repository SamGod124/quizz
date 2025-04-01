public class quizzgame import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        // Exibe as informações do cabeçalho
        System.out.println("=================================");
        System.out.println("Faculdade: Centro Universitario Alfredo Nasser");
        System.out.println("Aluno: Samuel Godinho Ferreira");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Tema do Quiz: quizz app");
        System.out.println("=================================");

        // Inicialização das perguntas
        Questao[] perguntas = new Questao[15];
        inicializarPerguntas(perguntas);

        // Início do quiz
        int pontos = 0;
        Scanner scanner = new Scanner(System.in);

        // Loop para percorrer as perguntas
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ": ");
            perguntas[i].escrevaQuestao();
            String resposta = perguntas[i].leiaResposta();
            if (perguntas[i].isCorreta(resposta)) {
                pontos++;
            }
        }

        // Resultado final
        System.out.println("Você obteve " + pontos + " pontos!");
        if (pontos == perguntas.length) {
            System.out.println("Parabéns, você acertou todas as questões!");
        } else {
            System.out.println("Tente novamente para melhorar sua pontuação.");
        }
    }

    // Método para inicializar as perguntas
    private static void inicializarPerguntas(Questao[] perguntas) {
        perguntas[0] = new Questao();
        perguntas[0].pergunta = "Qual é a capital do Brasil?";
        perguntas[0].opcaoA = "São Paulo";
        perguntas[0].opcaoB = "Brasília";
        perguntas[0].opcaoC = "Rio de Janeiro";
        perguntas[0].opcaoD = "Salvador";
        perguntas[0].opcaoE = "Porto Alegre";
        perguntas[0].correta = "B";

        perguntas[1] = new Questao();
        perguntas[1].pergunta = "Qual é o maior planeta do sistema solar?";
        perguntas[1].opcaoA = "Terra";
        perguntas[1].opcaoB = "Vênus";
        perguntas[1].opcaoC = "Júpiter";
        perguntas[1].opcaoD = "Saturno";
        perguntas[1].opcaoE = "Marte";
        perguntas[1].correta = "C";

        perguntas[2] = new Questao();
        perguntas[2].pergunta = "Em que ano o Brasil conquistou a independência?";
        perguntas[2].opcaoA = "1820";
        perguntas[2].opcaoB = "1822";
        perguntas[2].opcaoC = "1830";
        perguntas[2].opcaoD = "1810";
        perguntas[2].opcaoE = "1812";
        perguntas[2].correta = "B";

        perguntas[3] = new Questao();
        perguntas[3].pergunta = "Qual elemento químico tem o símbolo H?";
        perguntas[3].opcaoA = "Hélio";
        perguntas[3].opcaoB = "Hidrogênio";
        perguntas[3].opcaoC = "Hafnium";
        perguntas[3].opcaoD = "Holmium";
        perguntas[3].opcaoE = "Hidroglicérico";
        perguntas[3].correta = "B";

        perguntas[4] = new Questao();
        perguntas[4].pergunta = "Quem escreveu 'Dom Casmurro'?";
        perguntas[4].opcaoA = "Machado de Assis";
        perguntas[4].opcaoB = "José de Alencar";
        perguntas[4].opcaoC = "Carlos Drummond de Andrade";
        perguntas[4].opcaoD = "Clarice Lispector";
        perguntas[4].opcaoE = "Vinícius de Moraes";
        perguntas[4].correta = "A";

        perguntas[5] = new Questao();
        perguntas[5].pergunta = "Qual é o maior rio do mundo?";
        perguntas[5].opcaoA = "Amazonas";
        perguntas[5].opcaoB = "Nilo";
        perguntas[5].opcaoC = "Yangtzé";
        perguntas[5].opcaoD = "Ganges";
        perguntas[5].opcaoE = "Mississippi";
        perguntas[5].correta = "A";

        perguntas[6] = new Questao();
        perguntas[6].pergunta = "Quem pintou a Mona Lisa?";
        perguntas[6].opcaoA = "Vincent van Gogh";
        perguntas[6].opcaoB = "Pablo Picasso";
        perguntas[6].opcaoC = "Leonardo da Vinci";
        perguntas[6].opcaoD = "Claude Monet";
        perguntas[6].opcaoE = "Michelangelo";
        perguntas[6].correta = "C";

        perguntas[7] = new Questao();
        perguntas[7].pergunta = "Qual é o número atômico do carbono?";
        perguntas[7].opcaoA = "8";
        perguntas[7].opcaoB = "12";
        perguntas[7].opcaoC = "6";
        perguntas[7].opcaoD = "16";
        perguntas[7].opcaoE = "14";
        perguntas[7].correta = "C";

        perguntas[8] = new Questao();
        perguntas[8].pergunta = "Quem foi o primeiro presidente do Brasil?";
        perguntas[8].opcaoA = "Deodoro da Fonseca";
        perguntas[8].opcaoB = "Getúlio Vargas";
        perguntas[8].opcaoC = "Juscelino Kubitschek";
        perguntas[8].opcaoD = "Washington Luís";
        perguntas[8].opcaoE = "Dom Pedro II";
        perguntas[8].correta = "A";

        perguntas[9] = new Questao();
        perguntas[9].pergunta = "Qual é a principal função das raízes das plantas?";
        perguntas[9].opcaoA = "Fazer fotossíntese";
        perguntas[9].opcaoB = "Absorver água e nutrientes";
        perguntas[9].opcaoC = "Reproduzir-se";
        perguntas[9].opcaoD = "Produzir frutos";
        perguntas[9].opcaoE = "Gerar oxigênio";
        perguntas[9].correta = "B";

        perguntas[10] = new Questao();
        perguntas[10].pergunta = "Qual é o continente que possui o maior número de países?";
        perguntas[10].opcaoA = "África";
        perguntas[10].opcaoB = "Ásia";
        perguntas[10].opcaoC = "América";
        perguntas[10].opcaoD = "Europa";
        perguntas[10].opcaoE = "Oceania";
        perguntas[10].correta = "A";

        perguntas[11] = new Questao();
        perguntas[11].pergunta = "Qual é o maior oceano do mundo?";
        perguntas[11].opcaoA = "Atlântico";
        perguntas[11].opcaoB = "Índico";
        perguntas[11].opcaoC = "Pacífico";
        perguntas[11].opcaoD = "Ártico";
        perguntas[11].opcaoE = "Antártico";
        perguntas[11].correta = "C";

        perguntas[12] = new Questao();
        perguntas[12].pergunta = "Quem foi o autor da teoria da evolução das espécies?";
        perguntas[12].opcaoA = "Isaac Newton";
        perguntas[12].opcaoB = "Galileu Galilei";
        perguntas[12].opcaoC = "Charles Darwin";
        perguntas[12].opcaoD = "Albert Einstein";
        perguntas[12].opcaoE = "Marie Curie";
        perguntas[12].correta = "C";

        perguntas[13] = new Questao();
        perguntas[13].pergunta = "Qual a capital da França?";
        perguntas[13].opcaoA = "Paris";
        perguntas[13].opcaoB = "Londres";
        perguntas[13].opcaoC = "Berlim";
        perguntas[13].opcaoD = "Madri";
        perguntas[13].opcaoE = "Roma";
        perguntas[13].correta = "A";

        perguntas[14] = new Questao();
        perguntas[14].pergunta = "Qual é o maior animal terrestre?";
        perguntas[14].opcaoA = "Elefante africano";
        perguntas[14].opcaoB = "Girafa";
        perguntas[14].opcaoC = "Baleia azul";
        perguntas[14].opcaoD = "Tigre";
        perguntas[14].opcaoE = "Robalo";
        perguntas[14].correta = "A";
    }
}

class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns! Resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
        System.out.println("");
        return false;
    }

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.println();
    }
}
{
}
