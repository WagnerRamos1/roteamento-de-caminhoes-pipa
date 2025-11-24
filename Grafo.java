import java.util.ArrayList;
import java.util.List;
public class Grafo {
    List<Vertice> grafo;

    //Classe Grafo
    public Grafo() {
        grafo = new ArrayList<>();
    }
    public void adicionarVertice(Vertice vertice) {
        grafo.add(vertice);
    }
    public void exibirGrafo() {
        for (Vertice ronda : grafo) {
        ronda.imprimirAresta();
        }
    }
    public Vertice getVertice (String nome) {
        for (Vertice ronda : grafo) {
            if (ronda.getNome().equalsIgnoreCase(nome)) {
                return ronda;
            }
        }
        System.out.println("Vértice não encontrado");
        return null;
    }
}
