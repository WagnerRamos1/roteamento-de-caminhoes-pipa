public class GrafoCidades {

    public static Grafo criarGrafo(){

        Grafo grafo = new Grafo();

    // Declaração dos vertíces do grafo
        Vertice monteiro = new Vertice("Monteiro");
        Vertice sume = new Vertice("Sume");
        Vertice congo = new Vertice("Congo");
        Vertice zabele = new Vertice("Zabele");
        Vertice camalau = new Vertice("Camalau");
        Vertice taperoa = new Vertice("Taperoa");
        Vertice cabaceiras = new Vertice("Cabaceiras");
        Vertice prata = new Vertice("Prata");
        Vertice itaporanga = new Vertice("Itaporanga");
        Vertice boaVentura = new Vertice("Boa Ventura");
        Vertice diamante = new Vertice("Diamante");
        Vertice cajazeiras = new Vertice("Cajazeiras");
        Vertice serraBranca = new Vertice("Serra Branca");
        Vertice boaVista = new Vertice("Boa Vista");
        Vertice patos = new Vertice("Patos");
        Vertice sousa = new Vertice("Sousa");
        Vertice guarabira = new Vertice("Guarabira");

        monteiro.adicionarAresta(sume, 100);
        sume.adicionarAresta(monteiro, 100);

        monteiro.adicionarAresta(congo, 50);
        congo.adicionarAresta(monteiro, 50);

        monteiro.adicionarAresta(zabele, 150);
        zabele.adicionarAresta(monteiro, 150);

        monteiro.adicionarAresta(prata, 80);
        prata.adicionarAresta(monteiro, 80);

        sume.adicionarAresta(zabele, 50);
        zabele.adicionarAresta(sume, 50);

        sume.adicionarAresta(camalau, 30);
        camalau.adicionarAresta(sume, 30);

        congo.adicionarAresta(taperoa, 200);
        taperoa.adicionarAresta(congo, 200);

        congo.adicionarAresta(cabaceiras, 125);
        cabaceiras.adicionarAresta(congo, 125);

        congo.adicionarAresta(boaVista, 75);
        boaVista.adicionarAresta(congo, 75);

        zabele.adicionarAresta(prata, 80);
        prata.adicionarAresta(zabele, 80);

        camalau.adicionarAresta(itaporanga, 65);
        itaporanga.adicionarAresta(camalau, 65);

        camalau.adicionarAresta(boaVentura, 140);
        boaVentura.adicionarAresta(camalau, 140);

        taperoa.adicionarAresta(patos, 70);
        patos.adicionarAresta(taperoa, 70);

        cabaceiras.adicionarAresta(diamante, 120);
        diamante.adicionarAresta(cabaceiras, 120);

        cabaceiras.adicionarAresta(monteiro, 85);
        monteiro.adicionarAresta(cabaceiras, 85);

        prata.adicionarAresta(guarabira, 90);
        guarabira.adicionarAresta(prata, 90);

        prata.adicionarAresta(serraBranca, 150);
        serraBranca.adicionarAresta(prata, 150);

        itaporanga.adicionarAresta(cajazeiras, 75);
        cajazeiras.adicionarAresta(itaporanga, 75);

        itaporanga.adicionarAresta(sousa, 40);
        sousa.adicionarAresta(itaporanga, 40);

        boaVentura.adicionarAresta(boaVista, 80);
        boaVista.adicionarAresta(boaVentura, 80);

        diamante.adicionarAresta(patos, 50);
        patos.adicionarAresta(diamante, 50);

        diamante.adicionarAresta(sousa, 180);
        sousa.adicionarAresta(diamante, 180);

        cajazeiras.adicionarAresta(zabele, 20);
        zabele.adicionarAresta(cajazeiras, 20);

        serraBranca.adicionarAresta(prata, 55);
        prata.adicionarAresta(serraBranca, 55);

        serraBranca.adicionarAresta(taperoa, 90);
        taperoa.adicionarAresta(serraBranca, 90);

        boaVista.adicionarAresta(sousa, 75);
        sousa.adicionarAresta(boaVista, 75);

        patos.adicionarAresta(guarabira, 25);
        guarabira.adicionarAresta(patos, 25);

        sousa.adicionarAresta(congo, 300);
        congo.adicionarAresta(sousa, 300);

        guarabira.adicionarAresta(serraBranca, 40);
        serraBranca.adicionarAresta(guarabira, 40);


        grafo.adicionarVertice(monteiro);
        grafo.adicionarVertice(sume);
        grafo.adicionarVertice(congo);
        grafo.adicionarVertice(zabele);
        grafo.adicionarVertice(camalau);
        grafo.adicionarVertice(taperoa);
        grafo.adicionarVertice(cabaceiras);
        grafo.adicionarVertice(prata);
        grafo.adicionarVertice(itaporanga);
        grafo.adicionarVertice(boaVentura);
        grafo.adicionarVertice(diamante);
        grafo.adicionarVertice(cajazeiras);
        grafo.adicionarVertice(serraBranca);
        grafo.adicionarVertice(boaVista);
        grafo.adicionarVertice(patos);
        grafo.adicionarVertice(sousa);
        grafo.adicionarVertice(guarabira);

        return grafo;

    }

    public double  custoCombustivel(double valorCombustivel, Integer distancia){
        return valorCombustivel * distancia;
    }

}
