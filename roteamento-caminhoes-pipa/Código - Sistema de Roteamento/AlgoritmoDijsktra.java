import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class AlgoritmoDijsktra {
    public static Map<String, Integer> Dijsktra (Grafo Grafo, Vertice origem, Vertice destino) {
        Map<String, Integer> distancia = new HashMap<>();
        Map<String, String> anterio = new HashMap<>();
        for (Vertice vertice : Grafo.grafo) {
            distancia.put(vertice.getNome(), Integer.MAX_VALUE);
        }
        distancia.put(origem.getNome(), 0);

        PriorityQueue<ArrayMisto> ListaPrioridade = new PriorityQueue<>(Comparator.comparing(a -> a.distancia));
        ListaPrioridade.offer(new ArrayMisto(origem, 0));

        while (!ListaPrioridade.isEmpty()) {
            ArrayMisto localAtual = ListaPrioridade.poll();
            Vertice verticeAtual = localAtual.vertice;
            Integer distAtual = localAtual.distancia;

            if (verticeAtual.getNome().equalsIgnoreCase(destino.getNome())) {
                break;
            }
            
            if (distAtual > distancia.get(verticeAtual.getNome())){
                continue;
            }
            
            for(Aresta caminho: verticeAtual.getArestas()) {
                Vertice vizinho = caminho.getDestino();
                Integer custo = caminho.getCusto();
                Integer novoCusto = distAtual + custo;

                if(novoCusto < distancia.get(vizinho.getNome())) {
                    distancia.put(vizinho.getNome(), novoCusto);
                    anterio.put(vizinho.getNome(), verticeAtual.getNome());
                    ListaPrioridade.offer(new ArrayMisto(vizinho, novoCusto));
                }
            }
        }
        System.out.println(reconstruirCaminho(anterio, destino.getNome()));
        return distancia;
    }
    public static String reconstruirCaminho(Map<String, String> anterior, String destino){
            String localAtual = destino;
            StringBuilder construtor = new StringBuilder();

            while (localAtual != null) {
                construtor.insert(0, localAtual);
                localAtual = anterior.get(localAtual);
                if (localAtual != null) {
                    construtor.insert(0, " --> ");
                }
            }
            return construtor.toString();
        }
}
