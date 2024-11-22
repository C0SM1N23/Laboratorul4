public class UtilSir {
    public static <T extends Comparable<T>> int cauta(T[] sir, T cheie) {
        for (int i = 0; i < sir.length; i++) {
            if (sir[i].compareTo(cheie) == 0) {
                return i;
            }
        }
        return -1;
    }
}