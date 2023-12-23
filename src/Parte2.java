import java.util.*;

public class Parte2 {

    public static void main(String[] args) {
        String nomesString = lerNomesDoUsuario();

        ordenarLista(nomesString);
    }

    private static void ordenarLista(String nomesString) {
        String[] nomesArray = nomesString.split(",");

        List<String> listaMasculino = new ArrayList<>();
        List<String> listaFeminino = new ArrayList<>();
        List<String> listaSexoDesconhecido = new ArrayList<>();

        for (String nome : nomesArray) {
            String[] parte = nome.split("-");

            String nomeAtual = parte[0];
            String sexo = (parte.length > 1) ? parte[1] : "";

            if (sexo.equalsIgnoreCase("M")) {
                listaMasculino.add(nomeAtual);
            } else if (sexo.equalsIgnoreCase("F")) {
                listaFeminino.add(nomeAtual);
            } else {
                listaSexoDesconhecido.add(nomeAtual);
            }
        }
        exibirListas(listaMasculino, listaFeminino, listaSexoDesconhecido);
    }

    private static void exibirListas(List<String> listaMasculino, List<String> listaFeminino, List<String> listaSexoDesconhecido) {
        System.out.println("Lista de pessoas do sexo masculino");
        System.out.println(listaMasculino);

        System.out.println("Lista de pessoas do sexo feminino");
        System.out.println(listaFeminino);

        System.out.println("Lista de pessoas de sexo desconhecido");
        System.out.println(listaSexoDesconhecido);
    }

    private static String lerNomesDoUsuario() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes e sexos separados por hífen e vírgula, usando \"M\" para masculino e \"F\" para feminino. \nexemplo: \"João-M,Maria-F,Ana-F\".");

        return s.nextLine();
    }

}
