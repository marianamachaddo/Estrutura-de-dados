package dominio;

public class ListaGenerica<T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaGenerica(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public void adicionar(T elemento) {
        if (tamanho == elementos.length) {
            redimensionarArray();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public T obter(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return elementos[indice];
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null; // Remove a referência do último elemento
        tamanho--;
    }

    public void exibir() {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }

    private void redimensionarArray() {
        int novoTamanho = elementos.length * 2;
        @SuppressWarnings("unchecked")
        T[] novoArray = (T[]) new Object[novoTamanho];

        for (int i = 0; i < elementos.length; i++) {
            novoArray[i] = elementos[i];
        }
        elementos = novoArray;
    }

    public int getTamanho() {
        return tamanho;
    }
}
