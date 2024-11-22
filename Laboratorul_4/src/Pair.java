class Pair<T> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public void swap() {
        T aux = first;
        first = second;
        second = aux;
    }

    public static <T extends Comparable<T>> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array-ul nu poate fi null sau gol.");
        }

        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(max) > 0) {
                max = a[i];
            }
            if (a[i].compareTo(min) < 0) {
                min = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}