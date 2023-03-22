import respondeai.Estudante;
import respondeai.Materia;
import respondeai.Questao;

public class App {
    public static void main(String[] args) {
        // Cria um estudante
        Estudante estudante = new Estudante("João", "joao123", null);

        // Cria uma matéria
        Materia matematica = new Materia("Matemática", null);

        // Adiciona a matéria para o estudante
        estudante.adicionarMateria(matematica);

        // Adiciona uma questão na matéria de matemática
        Questao questao1 = new Questao("Quanto é 2+2?", "4");
        matematica.adicionarQuestao(questao1);

        // Verifica se o estudante acertou a questão
        boolean acertou = estudante.responderQuestao(matematica, questao1, "4");

        // Imprime o resultado da resposta
        if (acertou) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Infelizmente, você errou. Tente novamente!");
        }
    }
}
