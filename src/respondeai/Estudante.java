package respondeai;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private String email;
    private String senha;
    private List<Materia> materias;

    public Estudante(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.materias = new ArrayList<>();
    }

    public void adicionarMateria(Materia materia) {
        this.materias.add(materia);
    }

    public boolean responderQuestao(Materia matematica, Questao questao1, String string) {
        return false;
    }

    // getters e setters para as propriedades
}
