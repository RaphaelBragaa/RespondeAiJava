package respondeai;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nome;
    private String descricao;
    private List<Questao> questoes;

    public Materia(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao questao) {
        this.questoes.add(questao);
    }

    // getters e setters para as propriedades
}

