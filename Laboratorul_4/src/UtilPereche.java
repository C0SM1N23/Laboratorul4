import java.util.Arrays;

public class UtilPereche {
    public static <T extends Comparable<T>> Pair<T> minimMaxim(T[] sir) {
        if (sir == null || sir.length == 0) {
            throw new IllegalArgumentException("Șirul nu poate fi null sau gol.");
        }
        T minim = Arrays.stream(sir).min(Comparable::compareTo).orElseThrow();
        T maxim = Arrays.stream(sir).max(Comparable::compareTo).orElseThrow();
        return new Pair<>(minim, maxim);
    }
}