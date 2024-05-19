import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Sort sort = new Sort();
        List<int[]> list = new ArrayList<>();
        int[] len = { 10, 20, 100, 1000, 5000, 10000, 30000 };
        ArraysGeneration generation = new ArraysGeneration();
        for (int i : len) {
            list.add(generation.randomArray(i));
        }

        int op;
        do {
            System.out.println("\nTeoria de la complejidad computacional");
            System.out.println("1. Nueva generacion aleatoria");
            System.out.println("2. Ordenar por los 3 metodos");
            System.out.println("0. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    List<int[]> l = new ArrayList<>();

                    for (int i : len) {
                        l.add(generation.randomArray(i, true));
                    }
                    list = l;
                    break;
                case 2:
                    for (int[] i : list) {
                        System.out.println();
                        sort.sortBubblePro(i);
                        sort.sortInsertion(i);
                        sort.sortSelection(i);
                    }
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (op != 0);
        sc.close();

    }
}
