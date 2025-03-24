package controle;

import dominio.Aluno;
import dominio.ListaGenerica;

public class TesteListaGenerica {
    public static void main(String[] args) {
        // Lista de Inteiros
        ListaGenerica<Integer> listaInt = new ListaGenerica<>(3);
        listaInt.adicionar(10);
        listaInt.adicionar(20);
        listaInt.adicionar(30);
        System.out.println("Lista de Inteiros:");
        listaInt.exibir();

        // Lista de Strings
        ListaGenerica<String> listaStr = new ListaGenerica<>(3);
        listaStr.adicionar("Java");
        listaStr.adicionar("C++");
        listaStr.adicionar("Python");
        System.out.println("Lista de Strings:");
        listaStr.exibir();

        // Lista de Alunos
        ListaGenerica<Aluno> listaAluno = new ListaGenerica<>(3);
        listaAluno.adicionar(new Aluno(123, "Luiz"));
        listaAluno.adicionar(new Aluno(456, "Mariana"));
        listaAluno.adicionar(new Aluno(789, "Beatriz"));
        System.out.println("Lista de Alunos:");
        listaAluno.exibir();
    }
}
