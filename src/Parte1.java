import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        String nomesString = lerNomesDoUsuario();

        List<String> listaNomesOrdenados = ordenarLista(nomesString);

        System.out.println(listaNomesOrdenados);
    }

    private static List<String> ordenarLista(String nomesString) {

        String[] nomesArray = nomesString.split(",");

        List<String> listaNomes = Arrays.asList(nomesArray);

        Collections.sort(listaNomes);

        return listaNomes;
    }

    private static String lerNomesDoUsuario() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgula | ex: Joao,Maria,Ana");

        return s.nextLine();
    }


}