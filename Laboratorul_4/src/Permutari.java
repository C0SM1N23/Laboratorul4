import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutari {
    public static <T> List<List<T>> genereazaPermutari(List<T> elemente) {
        List<List<T>> rezultat = new ArrayList<>();
        permuta(elemente, 0, rezultat);
        return rezultat;
    }

    private static <T> void permuta(List<T> elemente, int start, List<List<T>> rezultat) {
        if (start == elemente.size() - 1) {
            rezultat.add(new ArrayList<>(elemente));
        } else {
            for (int i = start; i < elemente.size(); i++) {
                schimba(elemente, start, i);
                permuta(elemente, start + 1, rezultat);
                schimba(elemente, start, i);
            }
        }
    }

    private static <T> void schimba(List<T> elemente, int i, int j) {
        T temp = elemente.get(i);
        elemente.set(i, elemente.get(j));
        elemente.set(j, temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("numarul de elemente din sir: ");
        int n = scanner.nextInt();
        Integer[] sir = new Integer[n];
        System.out.println("elementele sirului:");
        for (int i = 0; i < n; i++) {
            sir[i] = scanner.nextInt();
        }

        System.out.print("valoarea de cautat: ");
        int cheie = scanner.nextInt();
        int index = UtilSir.cauta(sir, cheie);
        if (index != -1) {
            System.out.println("se afla la pozitia: " + index);
        } else {
            System.out.println("nu a fost gasita.");
        }


        Pair<Integer> minimMaxim = UtilPereche.minimMaxim(sir);
        System.out.println("Minim: " + minimMaxim.getFirst() + ", Maxim: " + minimMaxim.getSecond());


        List<Integer> elemente = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            elemente.add(i);
        }
        List<List<Integer>> permutari = genereazaPermutari(elemente);
        System.out.println("Permutările elementelor:");
        for (List<Integer> perm : permutari) {
            System.out.println(perm);
        }

        scanner.close();
    }
}
