
import java.util.Map;
import java.util.Scanner;

public class Principal {

    private static final double consumoGasolina = 2.00;
    private static final double consumoDiesel = 5.00;

    public static void main(String[] args) {

        Grafo grafo = GrafoCidades.criarGrafo();

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Bem Vindo ao Sistema de Roteamanto-----");

        
        boolean continuar = true;

        while (continuar == true) {
            mostrarMenu();
            int opcao = lerOpcao(sc);
  
            switch (opcao) {
                case 1 -> {

                    consultarRota(grafo, sc);
                    break;

                }
                        
                case 2 -> {
                    System.out.print("\nPrograma finalizado");
                    continuar = false;
                }

                default -> {
                    System.out.print("\nOpção inválida");
                    continuar = false;
                }
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nQual ação deseja realizar?\n" +
            "\n1 - Consultar melhor caminho e distancia entre duas cidades;\n" +
             "2- Sair.");
    }

    private static int lerOpcao(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Digite uma opção válida");
            return -1;
        }

    }

    private static void consultarRota(Grafo grafo, Scanner sc) {

        System.out.println("\nCidades:\n");
        for (Vertice e : grafo.getVertices()) {
            System.out.println(e.getNome());
        }

        System.out.print("\nDe onde você está saindo? ");
        Vertice cidadeOrigem = grafo.getVertice(sc.nextLine());

        System.out.print("Para qual cidade você quer ir? ");
        Vertice cidadeDestino = grafo.getVertice(sc.nextLine());

        if (cidadeOrigem == null || cidadeDestino == null) {

            System.out.println("\nCidade inválida!");
            return;
        }

        System.out.println("Valor dos combustíveis: ");
        double valorGasolina = lerPreco(sc, "Gasolina: ");
        double valorDiesel = lerPreco(sc, "Diesel: ");

        System.out.println("\nA melhor rota entre as cidades é:");

        Map<String, Integer> uso = AlgoritmoDijsktra.Dijsktra(grafo, cidadeOrigem, cidadeDestino);
        Integer distancia = uso.get(cidadeDestino.getNome());

        if (distancia == null) {
            System.out.println("Não há rota entre as cidades");
            return;
        }

        resultados(distancia, valorGasolina, valorDiesel);
    }

    private static double lerPreco(Scanner sc, String tipo){

        System.out.println(tipo);

        try {
            return Double.parseDouble(sc.nextLine().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido!");
            return 0;
        }

    }

    private static void resultados(int distancia, double valorGasolina, double valorDiesel) {

        System.out.println("Distancia: " + distancia + "KM");

        double litrosGasolina = distancia / consumoGasolina;
        double litrosDiesel = distancia / consumoDiesel;

        Double custoGasolina = litrosGasolina * valorGasolina;
        Double custoDiesel = litrosDiesel * valorDiesel;

        System.out.printf(
                "\nA média de consumo de combustivel é:\nGasolina: R$ %.2f%nLitros: %.2f L%n\nDiesel: R$ %.2f%nLitros: %.2f L %n\n",
                custoGasolina, litrosGasolina, custoDiesel, litrosDiesel);

        System.out.println("Combustivel mais eficiente: " + (custoGasolina < custoDiesel ? "Gasolina" : "Diesel"));

    }

}
