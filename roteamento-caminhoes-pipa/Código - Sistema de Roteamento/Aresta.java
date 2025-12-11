public class Aresta {
    private Vertice destino;
    private Vertice origem;
    private Integer custo;

    public Aresta (Vertice destino, Integer custo) {
        this.destino = destino;
        this.custo = custo;
    }
    public Vertice getDestino() {
        return destino;
    }
    public Vertice getOrigem() {
        return origem;
    }
    public Integer getCusto() {
        return custo;
    }
}
